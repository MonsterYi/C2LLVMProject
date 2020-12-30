from antlr4 import *

from Parser.simpleCParser import simpleCParser
from Parser.simpleCVisitor import simpleCVisitor
from Parser.simpleCLexer import simpleCLexer
from llvmlite import ir
from Generator.SymbolTable import SymbolTable

single = ir.DoubleType()
double = ir.DoubleType()
bool = ir.IntType(1)
int32 = ir.IntType(32)
int8 = ir.IntType(8)
void = ir.VoidType()


class MyVisitor(simpleCVisitor):

    def __init__(self):
        super(simpleCVisitor, self).__init__()

        # 控制llvm生成
        self.module = ir.Module()
        self.module.triple = "x86_64-pc-linux-gnu"  # llvm.Target.from_default_triple()
        self.module.data_layout = "e-m:e-i64:64-f80:128-n8:16:32:64-S128"  # llvm.create_mcjit_compiler(backing_mod, target_machine)

        self.block_list = []
        self.builder_list = []
        self.func_list = dict()
        self.cur_func = ''
        self.cur_endif_block = None
        self.symbol_table = SymbolTable()
        self.need_load = True
        self.constants = 0

    def visitProgram(self, ctx:simpleCParser.ProgramContext):
        '''
        program: (include)* ( initialBlock | mFunction)*;
        '''
        for i in range(0, ctx.getChildCount()):
            self.visit(ctx.getChild(i))

    # 函数相关函数
    def visitMFunction(self, ctx:simpleCParser.MFunctionContext):

        '''
        mFunction: (myTYPE | myVOID) myID '(' params ')' '{' funcBody '}';
        '''
        # 获取函数名 todo
        func_name = ctx.getChild(1).getText()  # func name

        # 获取参数列表
        para_list = self.visit(ctx.getChild(3))  # func params

        # 根据返回值，函数名称和参数生成llvm函数
        type_list = []
        for i in range(len(para_list)):
            type_list.append(para_list[i]['type'])
        llvm_type = ir.FunctionType(self.visit(ctx.getChild(0)), type_list)
        llvm_func = ir.Function(self.module, llvm_type, name = func_name)

        # 存储函数的变量
        for i in range(len(para_list)):
            llvm_func.args[i].name = para_list[i]['name']

        #存储函数的block
        block = llvm_func.append_basic_block(name = func_name + '.entry')

        # 判断重定义，存储函数
        if func_name in self.func_list:
            # raise SemanticError(ctx=ctx,msg="函数重定义错误！")
            pass
        else:
            self.func_list[func_name] = llvm_func

        builder = ir.IRBuilder(block)
        self.block_list.append(block)
        self.builder_list.append(builder)

        # 进一层
        self.cur_func = func_name
        self.symbol_table.func_enter()

        # 存储函数的变量
        for i in range(len(para_list)):
            mvar = builder.alloca(para_list[i]['type'])
            builder.store(llvm_func.args[i], mvar)
            self.symbol_table.insert_item(para_list[i]['name'], {'Type': para_list[i]['type'], 'Name': mvar})

        # 处理函数body
        self.visit(ctx.getChild(6))  # func body

        # 处理完毕，退一层
        self.cur_func = ''
        self.block_list.pop()
        self.builder_list.pop()
        self.symbol_table.func_quit()
        return

    def visitMyTYPE(self, ctx:simpleCParser.MyTYPEContext):
        '''
        myTYPE: 'int' | 'double' | 'char' | 'string';
        '''
        if ctx.getText() == 'int':
            return int32
        if ctx.getText() == 'char':
            return int8
        if ctx.getText() == 'float':
            return single
        if ctx.getText() == 'double':
            return single
        return void

    def visitParams(self, ctx:simpleCParser.ParamsContext):
        '''
        params: param (',' param)* |;
        '''
        length = ctx.getChildCount()
        para_list = []
        for i in range(0, length, 2):
            para_list.append(self.visit(ctx.getChild(i)))
        return para_list

    def visitParam(self, ctx:simpleCParser.ParamContext):
        '''
        param: myTYPE myID;
        '''
        return {
            'type': self.visit(ctx.getChild(0)),
            'name': ctx.getChild(1).getText()
        }

    def visitFuncBody(self, ctx: simpleCParser.FuncBodyContext):
        '''
        funcBody: body returnBlock;
        '''
        self.symbol_table.func_enter()
        for i in range(ctx.getChildCount()):
            self.visit(ctx.getChild(i))
        self.symbol_table.func_quit()
        return

    def visitBody(self, ctx: simpleCParser.BodyContext):
        '''
        body: (block | func ';')*;
        '''
        for i in range(ctx.getChildCount()):
            self.visit(ctx.getChild(i))
            if self.block_list[-1].is_terminated:
                break
        return

    #语句块相关函数
    def visitBlock(self, ctx:simpleCParser.BlockContext):
        '''
        block:
            initialBlock
            | assignBlock
            | ifBlocks
            | whileBlock
            | forBlock
            | returnBlock;
        '''
        for i in range(ctx.getChildCount()):
            self.visit(ctx.getChild(i))
        return

    def visitInitialBlock(self, ctx:simpleCParser.InitialBlockContext):
        '''
        initialBlock: baseInitialBlock | arrayInitialBlock;
        '''
        self.visit(ctx.getChild(0))
    
    def visitBaseInitialBlock(self, ctx:simpleCParser.BaseInitialBlockContext):
        '''
        baseInitialBlock: (myTYPE) myID ('=' expr)? (
                ',' myID ('=' expr)?
            )* ';';
        '''
        #初始化全局变量
        var_type = self.visit(ctx.getChild(0))
        length = ctx.getChildCount()
        i = 1
        while i < length:
            id = ctx.getChild(i).getText()
            if self.symbol_table.is_global() == True:   
                mvar = ir.GlobalVariable(self.module, var_type, name = id)
                mvar.linkage = 'internal'
            else:
                mvar = self.builder_list[-1].alloca(var_type, name = id)
            self.symbol_table.insert_item(id, {'Type': var_type, 'Name': mvar})
            if ctx.getChild(i + 1).getText() != '=':
                i += 2
            else:
                #初始化
                val = self.visit(ctx.getChild(i + 2))
                if self.symbol_table.is_global() == True:
                    #全局变量
                    mvar.initializer = ir.Constant(val['type'], val['name'].constant)
                else:
                    #局部变量，可能有强制类型转换
                    val = self.assignConvert(val, var_type)
                    self.builder_list[-1].store(val['name'], mvar)
                i += 4
        return

    def visitArrayInitialBlock(self, ctx:simpleCParser.ArrayInitialBlockContext):
        '''
        arrayInitialBlock: myTYPE myID '[' myINT ']' ';';
        '''
        Type = self.visit(ctx.getChild(0))
        id = ctx.getChild(1).getText()
        length = int(ctx.getChild(3).getText())
        if self.symbol_table.is_global() == True:   
            #全局变量
            mvar = ir.GlobalVariable(self.module, ir.ArrayType(Type, length), name = id)
            mvar.linkage = 'internal'
        else:
            mvar = self.builder_list[-1].alloca(ir.ArrayType(Type, length), name = id)
        self.symbol_table.insert_item(id, {'Type': ir.ArrayType(Type, length), 'Name': mvar})
        return

    def visitAssignBlock(self, ctx:simpleCParser.AssignBlockContext):
        '''
        assignBlock: ((myID | myARRAYITEM) '=')+ expr ';';
        '''
        builder = self.builder_list[-1]
        length = ctx.getChildCount()
        id = ctx.getChild(0).getText()
        if not '[' in id and self.symbol_table.has_item(id) == False:
            # raise SemanticError(ctx=ctx,msg="变量未定义！")
            pass
        
        #待赋值结果
        val = self.visit(ctx.getChild(length - 2))
        
        #遍历全部左边变量赋值
        tmp = self.need_load
        self.need_load = False
        mvar = self.visit(ctx.getChild(0))
        self.need_load = tmp
        builder.store(self.assignConvert(val, mvar['type'])['name'], mvar['name'])
        return {'type': mvar['type'], 'name': builder.load(mvar['name'])}

    def visitReturnBlock(self, ctx: simpleCParser.ReturnBlockContext):
        '''
        returnBlock: 'return' (INT | ID)? ';';
        '''
        # 返回空
        if ctx.getChildCount() == 2:
            ret = self.builder_list[-1].ret_void()
        else:
            ret = self.builder_list[-1].ret(self.visit(ctx.getChild(1))['name'])
        return {
            'type': void,
            'const': False,
            'name': ret
        }

    # 调用函数相关函数
    def visitFunction(self, ctx:simpleCParser.FunctionContext):
        '''
        func: (printfFunction | scanfFunction | selfDefinedFunction);
        '''
        return self.visit(ctx.getChild(0))

    def visitPrintfFunction(self, ctx:simpleCParser.PrintfFunctionContext):
        '''
        printfFunction: 'printf' '(' STRING (',' expr)* ')';
        '''
        if 'printf' in self.func_list:
            printf = self.func_list['printf']
        else:
            printf_type = ir.FunctionType(int32, [ir.PointerType(int8)], var_arg = True)
            printf = ir.Function(self.module, printf_type, name = "printf")
            self.func_list['printf'] = printf
        builder = self.builder_list[-1]
        zero = ir.Constant(int32, 0)
        arg_list = [builder.gep(self.visit(ctx.getChild(2))['name'], [zero, zero], inbounds = True)]
        length = ctx.getChildCount()
        for i in range(4, length - 1, 2):
            arg_list.append(self.visit(ctx.getChild(i))['name'])
        return {
            'type': int32,
            'name': builder.call(printf, arg_list)
        }

    def visitScanfFunction(self, ctx:simpleCParser.ScanfFunctionContext):
        '''
        scanfFunction: 'scanf' '(' STRING (',' ('&')? (ID))* ')';
        '''        
        if 'scanf' in self.func_list:
            scanf = self.func_list['scanf']
        else:
            scanf_type = ir.FunctionType(int32, [ir.PointerType(int8)], var_arg = True)
            scanf = ir.Function(self.module, scanf_type, name="scanf")
            self.func_list['scanf'] = scanf
        builder = self.builder_list[-1]
        zero = ir.Constant(int32, 0)
        arg_list = [builder.gep(self.visit(ctx.getChild(2))['name'], [zero, zero], inbounds = True)]
        length = ctx.getChildCount()
        i = 4
        while i < length - 1:
            tmp = self.need_load
            if ctx.getChild(i).getText() == '&':
                #读取变量
                self.need_load = False
                arg_list.append(self.visit(ctx.getChild(i + 1))['name'])
                i += 3
            else:
                self.need_load = True
                arg_list.append(self.visit(ctx.getChild(i))['name'])
                i += 2
            self.need_load = tmp
        return {
            'type': int32,
            'name': builder.call(scanf, arg_list)
        }

    def visitSelfDefinedFunction(self, ctx:simpleCParser.SelfDefinedFunctionContext):
        '''
        selfDefinedFunction:
	        ID '(' ((argument | ID) (',' (argument | ID))*)? ')';
        '''
        builder = self.builder_list[-1]
        name = ctx.getChild(0).getText() # func name
        if name in self.func_list:
            func = self.func_list[name]
            length = ctx.getChildCount()
            para_list = []
            for i in range(2, length - 1, 2):
                para_list.append(self.assignConvert(self.visit(ctx.getChild(i)), func.args[i // 2 - 1].type)['name'])
            return {
                'type': func.function_type.return_type,
                'name': builder.call(func, para_list)
            }

    def visitMyINT(self, ctx:simpleCParser.MyINTContext):
        '''
        myINT: INT;
        '''
        return {
            'type': int32,
            'const': True,
            'name': ir.Constant(int32, int(ctx.getText()))
        }

    def visitMySTRING(self, ctx:simpleCParser.MySTRINGContext):
        """
        mySTRING: STRING;
        """
        mstr = ctx.getText().replace('\\n', '\n')
        mstr = mstr[1:-1]
        mstr += '\0'
        length = len(bytearray(mstr, 'utf-8'))
        ret = ir.GlobalVariable(self.module, ir.ArrayType(int8, length), ".str%d" % self.constants)
        self.constants += 1
        ret.global_constant = True
        ret.initializer = ir.Constant(ir.ArrayType(int8, length), bytearray(mstr, 'utf-8'))
        return {
            'type': ir.ArrayType(int8, length),
            'const': False,
            'name': ret
        }

    # 每人在自己线下面写
    ####### MHY #############
    # Visit a parse tree produced by simpleCParser#condition.
    def prepareBlock(self, block):
        self.block_list.pop()
        self.block_list.append(block)
        self.builder_list.pop()
        self.builder_list.append(ir.IRBuilder(block))

    def visitCondition(self, ctx: simpleCParser.ConditionContext):
        return self.toBoolean(self.visit(ctx.getChild(0)), False)

    # Visit a parse tree produced by simpleCParser#ifBlocks.
    def visitIfBlocks(self, ctx: simpleCParser.IfBlocksContext):
        # If 逻辑代码块的入口，包括If Elif Else代码块
        cur_builder = self.builder_list[-1]
        if_block = cur_builder.append_basic_block()
        endif_block = cur_builder.append_basic_block()

        cache = self.cur_endif_block
        self.cur_endif_block = endif_block

        cur_builder.branch(if_block)
        self.prepareBlock(if_block)

        for _ in range(ctx.getChildCount()):
            self.visit(ctx.getChild(_))

        if not self.block_list[-1].is_terminated:
            self.builder_list[-1].branch(endif_block)
        self.cur_endif_block = cache
        self.prepareBlock(endif_block)

    # Visit a parse tree produced by simpleCParser#ifBlock.
    def visitIfBlock(self, ctx: simpleCParser.IfBlockContext):
        self.symbol_table.func_enter()
        cur_builder = self.builder_list[-1]
        true_block = cur_builder.append_basic_block()
        false_block = cur_builder.append_basic_block()

        cur_builder.cbranch(self.visit(ctx.getChild(2))['name'], true_block, false_block)
        self.prepareBlock(true_block)
        self.visit(ctx.getChild(5))

        if not self.block_list[-1].is_terminated:
            self.builder_list[-1].branch(self.cur_endif_block)
        self.prepareBlock(false_block)
        self.symbol_table.func_quit()

    # Visit a parse tree produced by simpleCParser#elifBlock.
    def visitElifBlock(self, ctx: simpleCParser.ElifBlockContext):
        self.symbol_table.func_enter()
        cur_builder = self.builder_list[-1]
        true_block = cur_builder.append_basic_block()
        false_block = cur_builder.append_basic_block()

        cur_builder.cbranch(self.visit(ctx.getChild(3))['name'], true_block, false_block)
        self.prepareBlock(true_block)
        self.visit(ctx.getChild(6))

        if not self.block_list[-1].is_terminated:
            self.builder_list[-1].branch(self.cur_endif_block)
        self.prepareBlock(false_block)
        self.symbol_table.func_quit()

    # Visit a parse tree produced by simpleCParser#elseBlock.
    def visitElseBlock(self, ctx: simpleCParser.ElseBlockContext):
        self.symbol_table.func_enter()
        self.visit(ctx.getChild(2))
        self.symbol_table.func_quit()

    # Visit a parse tree produced by simpleCParser#whileBlock.
    def visitWhileBlock(self, ctx: simpleCParser.WhileBlockContext):
        self.symbol_table.func_enter()
        cur_builder = self.builder_list[-1]
        cond_block = cur_builder.append_basic_block()
        body_block = cur_builder.append_basic_block()
        endwhile_block = cur_builder.append_basic_block()

        cur_builder.branch(cond_block)
        self.prepareBlock(cond_block)
        cond=self.visit(ctx.getChild(2))

        self.builder_list[-1].cbranch(cond['name'], body_block, endwhile_block)
        self.prepareBlock(body_block)
        self.visit(ctx.getChild(5))

        self.builder_list[-1].branch(cond_block)

        self.prepareBlock(endwhile_block)
        self.symbol_table.func_quit()

    # Visit a parse tree produced by simpleCParser#forBlock.
    def visitForBlock(self, ctx: simpleCParser.ForBlockContext):
        self.symbol_table.func_enter()
        self.visit(ctx.getChild(2))
        cur_builder = self.builder_list[-1]
        cond_block = cur_builder.append_basic_block()
        body_block = cur_builder.append_basic_block()
        endfor_block = cur_builder.append_basic_block()

        # visit condition
        cur_builder.branch(cond_block)
        self.prepareBlock(cond_block)
        cond = self.visit(ctx.getChild(4))

        self.builder_list[-1].cbranch(cond['name'], body_block, endfor_block)
        self.prepareBlock(body_block)
        # visit body
        self.visit(ctx.getChild(9))

        # visit step
        self.visit(ctx.getChild(6))

        self.builder_list[-1].branch(cond_block)
        self.prepareBlock(endfor_block)
        self.symbol_table.func_quit()

    # Visit a parse tree produced by simpleCParser#for1Block.
    def visitFor1Block(self, ctx: simpleCParser.For1BlockContext):
        if ctx.getChildCount() == 0:
            return
        cache = self.need_load
        self.need_load = False
        ID = self.visit(ctx.getChild(0))
        self.need_load = cache
        expr = self.visit(ctx.getChild(2))
        expr = self.assignConvert(expr, ID['name'])
        self.builder_list[-1].store(expr['name'], ID['name'])
        # handle nested assignments
        if ctx.getChildCount() >= 4:
            self.visit(ctx.getChild(4))

    # Visit a parse tree produced by simpleCParser#for3Block.
    def visitFor3Block(self, ctx: simpleCParser.For3BlockContext):
        if ctx.getChildCount() == 0:
            return
        cache = self.need_load
        self.need_load = False
        var = self.visit(ctx.getChild(0))
        self.need_load = cache
        expr = self.visit(ctx.getChild(2))
        expr = self.assignConvert(expr, var['name'])
        self.builder_list[-1].store(expr['name'], var['name'])
        # handle nested assignments
        if ctx.getChildCount() >= 4:
            self.visit(ctx.getChild(4))

    def assignConvert(self, src, dest_type):
        print(src["type"],dest_type)
        if src['type'] == dest_type:
            pass
        elif src['type'] == bool and self.isInteger(dest_type):
            src = self.bool2int(src, dest_type)
        elif self.isInteger(src['type']) and self.isInteger(dest_type):
            src = self.int2int(src, dest_type)
        elif src['type'] == single and self.isInteger(dest_type):
            src = self.single2int(src, dest_type)
        elif self.isInteger(src['type']) and dest_type == single:
            src = self.int2single(src, dest_type)
        return src

    def bool2int(self, src, dest_type):
        return {'type': dest_type, 'const': False, 'name': self.builder_list[-1].zext(src['name'], dest_type)}

    def int2int(self, src, dest_type):
        return {'type': dest_type, 'const': False, 'name': self.builder_list[-1].sext(src['name'], dest_type)}

    def single2int(self, src, dest_type):
        return {'type': dest_type, 'const': False, 'name': self.builder_list[-1].fptosi(src['name'], dest_type)}

    def int2single(self, src, dest_type):
        return {'type': dest_type, 'const': False, 'name': self.builder_list[-1].sitofp(src['name'], dest_type)}


    ####### HYL #############
    # 类型转换至布尔型
    def toBoolean(self, manipulate_index, not_equal=True):
        builder = self.builder_list[-1]
        operator = "==" if not_equal else "!="
        return_dict = {
            'type': bool,
            'const': False
        }
        if manipulate_index['type'] == int8 or manipulate_index['type'] == int32:
            return_dict["name"] = builder.icmp_signed(operator, manipulate_index['name'],
                                                      ir.Constant(manipulate_index['type'], 0))
            return return_dict
        elif manipulate_index['type'] == single:
            return_dict["name"] = builder.fcmp_ordered(operator, manipulate_index['name'], ir.Constant(single, 0))
            return return_dict
        return manipulate_index

    def visitNeg(self, ctx: simpleCParser.NegContext):
        """
        expr : op = '!' expr
        """
        # TODO
        #RealReturnValue = self.visit(ctx.getChild(1))
        #RealReturnValue = self.toBoolean(RealReturnValue, True)
        # res 未返回
        return self.visitChildren(ctx)

    def visitOR(self, ctx: simpleCParser.ORContext):
        """
        expr : expr '||' expr
        """
        index1 = self.toBoolean(self.visit(ctx.getChild(0)), False)
        index2 = self.toBoolean(self.visit(ctx.getChild(2)), False)
        builder = self.builder_list[-1]
        return {
            'type': index1['type'],
            'const': False,
            'name': builder.or_(index1['name'], index2['name'])
        }

    def visitAND(self, ctx: simpleCParser.ANDContext):
        """
        expr : expr '&&' expr
        """
        index1 = self.toBoolean(self.visit(ctx.getChild(0)), False)
        index2 = self.toBoolean(self.visit(ctx.getChild(2)), False)
        builder = self.builder_list[-1]
        return {
            'type': index1['type'],
            'const': False,
            'name': builder.and_(index1['name'], index2['name'])
        }

    def visitIdentifier(self, ctx: simpleCParser.IdentifierContext):
        """
        expr : identifier
        """
        return self.visit(ctx.getChild(0))

    def visitParens(self, ctx: simpleCParser.ParensContext):
        """
        expr : '(' expr ')'
        """
        return self.visit(ctx.getChild(1))

    def visitArrayitem(self, ctx: simpleCParser.ArrayitemContext):
        """
        expr : Array_item
        """
        return self.visit(ctx.getChild(0))

    def visitString(self, ctx: simpleCParser.StringContext):
        """
        expr : string
        """
        return self.visit(ctx.getChild(0))

    def isInteger(self, v_type):
        return hasattr(v_type, 'width')

    def exprConvert(self, index1, index2):
        if index1['type'] == index2['type']:
            return index1, index2
        if self.isInteger(index1['type']) and self.isInteger(index2['type']):
            if index1['type'].width < index2['type'].width:
                if index1['type'].width == 1:
                    index1 = self.bool2int(index1, index2['type'])
                else:
                    index1 = self.int2int(index1, index2['type'])
            else:
                if index2['type'].width == 1:
                    index2 = self.bool2int(index2, index1['type'])
                else:
                    index2 = self.int2int(index2, index1['type'])
        elif self.isInteger(index1['type']) and index2['type'] == single:
            index1 = self.int2single(index1, index2['type'])
        elif self.isInteger(index2['type']) and index1['type'] == single:
            index2 = self.int2single(index2, index1['type'])
        else:
            # TODO
            pass
            # raise SemanticError(ctx=ctx, msg="类型不匹配")
        return index1, index2

    def get_return_dict(self, ctx):
        index1, index2 = self.exprConvert(self.visit(ctx.getChild(0)), self.visit(ctx.getChild(2)))
        return_dict = {
            'type': index1['type'],
            'const': False
        }
        return index1, index2, return_dict

    def visitMulDiv(self, ctx: simpleCParser.MulDivContext):
        """
        expr : expr op=('*' | '/' | '%') expr
        """
        builder = self.builder_list[-1]
        index1, index2, return_dict = self.get_return_dict(ctx)
        operator = ctx.getChild(1).getText()
        if operator == '*':
            return_dict["name"] = builder.mul(index1['name'], index2['name'])
        elif operator == '/':
            return_dict["name"] = builder.sdiv(index1['name'], index2['name'])
        elif operator == '%':
            return_dict["name"] = builder.srem(index1['name'], index2['name'])
        return return_dict

    def visitAddSub(self, ctx: simpleCParser.AddSubContext):
        """
        expr op=('+' | '-') expr
        """
        builder = self.builder_list[-1]
        index1, index2, return_dict = self.get_return_dict(ctx)
        operator = ctx.getChild(1).getText()
        if operator == '+':
            return_dict["name"] = builder.add(index1['name'], index2['name'])
        elif operator == '-':
            return_dict["name"] = builder.sub(index1['name'], index2['name'])
        return return_dict

    def visitDouble(self, ctx: simpleCParser.DoubleContext):
        """
        expr : (op='-')? single
        """
        if ctx.getChild(0).getText() == '-':
            mid_index = self.visit(ctx.getChild(1))
            builder = self.builder_list[-1]
            return {
                'type': mid_index['type'],
                'name': builder.neg(mid_index['name'])
            }
        return self.visit(ctx.getChild(0))

    def visitFunction(self, ctx: simpleCParser.FunctionContext):
        """
        expr : func
        """
        return self.visit(ctx.getChild(0))

    def visitChar(self, ctx: simpleCParser.CharContext):
        """
        expr : char
        """
        return self.visit(ctx.getChild(0))

    def visitInt(self, ctx: simpleCParser.IntContext):
        """
        (op='-')? int
        """
        if ctx.getChild(0).getText() == '-':
            mid_index = self.visit(ctx.getChild(1))
            builder = self.builder_list[-1]
            return {
                'type': mid_index['type'],
                'name': builder.neg(mid_index['name'])
            }
        return self.visit(ctx.getChild(0))

    def visitMVoid(self, ctx: simpleCParser.MVoidContext):
        """
        Void : 'void';
        """
        return void

    def visitMArray(self, ctx: simpleCParser.MArrayContext):
        """
        Array : identifier '[' int ']';
        """
        return {
            'IDname': ctx.getChild(0).getText(),
            'length': int(ctx.getChild(2).getText())
        }

    def visitJudge(self, ctx: simpleCParser.JudgeContext):
        """
        expr : expr op=('==' | '!=' | '<' | '<=' | '>' | '>=') expr
        """
        builder = self.builder_list[-1]
        index1, index2 = self.exprConvert(self.visit(ctx.getChild(0)), self.visit(ctx.getChild(2)))
        return_dict = {
            'type': index1['type'],
            'const': False
        }
        operator = ctx.getChild(1).getText()
        if index1['type'] == single:
            return_dict["name"] = builder.fcmp_ordered(operator, index1['name'], index2['name'])
        elif self.isInteger(index1['type']):
            return_dict["name"] = builder.icmp_signed(operator, index1['name'], index2['name'])
        return return_dict

    # 变量和变量类型相关函数
    def visitArrayItem(self, ctx: simpleCParser.ArrayItemContext):
        """
        expr : Array_Item
        """
        require_load = self.need_load
        self.need_load = False
        res = self.visit(ctx.getChild(0))  # mID
        self.need_load = require_load

        if isinstance(res['type'], ir.types.ArrayType):
            builder = self.builder_list[-1]

            require_load = self.need_load
            self.need_load = True
            index = self.visit(ctx.getChild(2))  # subscript
            self.need_load = require_load
            return_dict = {
                'type': res['type'].element,
                'const': False
            }
            zero = ir.Constant(int32, 0)
            return_dict["name"] = builder.gep(res['name'], [zero, index['name']], inbounds=True)
            if self.need_load:
                return_dict["name"] = builder.load(return_dict["name"])
            return return_dict
        else:  # error!
            pass  # TODO
            # raise SemanticError(ctx=ctx, msg="类型错误")

    def visitArgument(self, ctx: simpleCParser.ArgumentContext):
        """
        argument : int | single | char | string;
        """
        return self.visit(ctx.getChild(0))

    def visitMID(self, ctx: simpleCParser.MIDContext):
        """
        identifier : ID;
        """
        identifier = ctx.getText()
        if not self.symbol_table.has_item(identifier):
            return {
                'type': int32,
                'const': False,
                'name': ir.Constant(int32, None)
            }
        builder = self.builder_list[-1]
        item = self.symbol_table.get_item(identifier)
        if item is not None:
            if self.need_load:
                return {
                    "type": item["Type"],
                    "const": False,
                    "name": builder.load(item["Name"]),
                }
            else:
                return {
                    "type": item["Type"],
                    "const": False,
                    "name": item["Name"],
                }
        else:
            return {
                'type': void,
                'const': False,
                'name': ir.Constant(void, None)
            }

    def visitMDOUBLE(self, ctx: simpleCParser.MDOUBLEContext):
        """
        double : double;
        """
        return {
            'type': single,
            'const': True,
            'name': ir.Constant(single, float(ctx.getText()))
        }

    def visitMCHAR(self, ctx: simpleCParser.MCHARContext):
        """
        char : char;
        """
        return {
            'type': int8,
            'const': True,
            'name': ir.Constant(int8, ord(ctx.getText()[1]))
        }

    def save(self, filename):
        """
        保存到文件
        描述：文件名含后缀
        返回：无
        """
        with open(filename, "w") as f:
            f.write(repr(self.module))


def generate(input_filename, output_filename):
    """
    将C代码文件转成IR代码文件
    :param input_filename: C代码文件
    :param output_filename: IR代码文件
    :return: 生成是否成功
    """
    lexer = simpleCLexer(FileStream(input_filename))
    stream = CommonTokenStream(lexer)
    parser = simpleCParser(stream)
    parser.removeErrorListeners()
    # errorListener = syntaxErrorListener()
    # parser.addErrorListener(errorListener)

    tree = parser.prog()
    v = MyVisitor()
    v.visit(tree)
    v.save(output_filename)
