from antlr4 import *

from Parser.simpleCParser import simpleCParser
from Parser.simpleCVisitor import simpleCVisitor
from Parser.simpleCLexer import simpleCLexer
from llvmlite import ir
from Generator.SymbolTable import SymbolTable

single = ir.FloatType()
int1 = ir.IntType(1)
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
        self.constant = 0
        self.need_load = True
        self.symbol_table = SymbolTable()

    def visitProg(self, ctx: simpleCParser.ProgContext):
        '''
        语法规则：prog :(include)* (initialBlock|arrayInitBlock|structInitBlock|mStructDef|mFunction)*;
        描述：代码主文件
        返回：无
        '''
        for i in range(0, ctx.getChildCount()):
            self.visit(ctx.getChild(i))

    # 函数相关函数
    def visitMFunction(self, ctx: simpleCParser.MFunctionContext):

        '''
        语法规则：mFunction : (mType|mVoid|mStruct) mID '(' params ')' '{' funcBody '}';
        描述：函数的定义
        返回：无
        '''
        # 获取函数名 todo
        func_name = ctx.getChild(1).getText()  # func name

        # 获取参数列表
        para_list = self.visit(ctx.getChild(3))  # func params

        # 根据返回值，函数名称和参数生成llvm函数
        ParameterTypeList = []
        for i in range(len(para_list)):
            ParameterTypeList.append(para_list[i]['type'])
        llvm_type = ir.FunctionType(self.visit(ctx.getChild(0)), ParameterTypeList)
        llvm_func = ir.Function(self.module, llvm_type, name = func_name)

        # 存储函数的变量
        for i in range(len(para_list)):
            llvm_func.args[i].name = para_list[i]['IDname']

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
            NewVariable = builder.alloca(para_list[i]['type'])
            builder.store(llvm_func.args[i], NewVariable)
            TheVariable = {}
            TheVariable["Type"] = para_list[i]['type']
            TheVariable["Name"] = NewVariable
            TheResult = self.SymbolTable.AddItem(para_list[i]['IDname'], TheVariable)
            if TheResult["result"] != "success":
                # raise SemanticError(ctx=ctx,msg=TheResult["reason"])
                pass

        # 处理函数body
        self.visit(ctx.getChild(6))  # func body

        # 处理完毕，退一层
        self.cur_func = ''
        self.block_list.pop()
        self.builder_list.pop()
        self.symbol_table.func_quit()
        return

    def visitMType(self, ctx: simpleCParser.MTypeContext):
        '''
        语法规则：mType : 'int'| 'double'| 'char'| 'string';
        描述：类型主函数
        返回：无
        '''
        if ctx.getText() == 'int':
            return int32
        if ctx.getText() == 'char':
            return int8
        if ctx.getText() == 'float':
            return single
        return void

    def visitParams(self, ctx: simpleCParser.ParamsContext):
        '''
        语法规则：params : param (','param)* |;
        描述：函数的参数列表
        返回：处理后的函数参数列表
        '''
        length = ctx.getChildCount()
        para_list = []
        for i in range(0, length, 2):
            para_list.append(self.visit(ctx.getChild(i)))
        return para_list

    def visitParam(self, ctx:simpleCParser.ParamContext):
        '''
        语法规则：param : mType mID;
        描述：返回函数参数
        返回：一个字典，字典的Type是类型，Name是参数名
        '''
        return {
            'type': self.visit(ctx.getChild(0)),
            'IDname': ctx.getChild(1).getText()
        }

    def visitFuncBody(self, ctx: simpleCParser.FuncBodyContext):
        '''
        语法规则：funcBody : body returnBlock;
        描述：函数体
        返回：无
        '''
        self.symbol_table.func_enter()
        for i in range(ctx.getChildCount()):
            self.visit(ctx.getChild(i))
        self.symbol_table.func_quit()
        return

    def visitBody(self, ctx: simpleCParser.BodyContext):
        '''
        语法规则：body : (block | func';')*;
        描述：语句块/函数块
        返回：无
        '''
        for i in range(ctx.getChildCount()):
            self.visit(ctx.getChild(i))
            if self.block_list[-1].is_terminated:
                break
        return

    #语句块相关函数
    def visitBlock(self, ctx:simpleCParser.BlockContext):
        '''
        语法规则：block : initialBlock | arrayInitBlock | structInitBlock | assignBlock | ifBlocks | whileBlock | forBlock | returnBlock;
        描述：语句块
        返回：无
        '''
        for i in range(ctx.getChildCount()):
            self.visit(ctx.getChild(i))
        return

    def visitInitialBlock(self, ctx:simpleCParser.InitialBlockContext):
        '''
        语法规则：initialBlock : (mType) mID ('=' expr)? (',' mID ('=' expr)?)* ';';
        描述：初始化语句块
        返回：无
        '''
        #初始化全局变量
        ParameterType = self.visit(ctx.getChild(0))
        Length = ctx.getChildCount()
        
        i = 1
        while i < Length:
            IDname = ctx.getChild(i).getText()
            if self.SymbolTable.JudgeWhetherGlobal() == True:   
                NewVariable = ir.GlobalVariable(self.Module, ParameterType, name = IDname)
                NewVariable.linkage = 'internal'
            else:
                TheBuilder = self.Builders[-1]
                NewVariable = TheBuilder.alloca(ParameterType, name = IDname)
            TheVariable = {}
            TheVariable["Type"] = ParameterType
            TheVariable["Name"] = NewVariable
            TheResult = self.SymbolTable.AddItem(IDname, TheVariable)
            if TheResult["result"] != "success":
                #raise SemanticError(ctx=ctx,msg=TheResult["reason"])
                pass

            if ctx.getChild(i + 1).getText() != '=':
                i += 2
            else:
                #初始化
                Value = self.visit(ctx.getChild(i + 2))
                if self.SymbolTable.JudgeWhetherGlobal() == True:   
                    #全局变量
                    NewVariable.initializer = ir.Constant(Value['type'], Value['name'].constant)
                    #print(Value['name'].constant)
                else:
                    #局部变量，可能有强制类型转换
                    Value = self.assignConvert(Value, ParameterType)
                    TheBuilder = self.Builders[-1]
                    TheBuilder.store(Value['name'], NewVariable)
                i += 4
        return

    def visitArrayInitBlock(self, ctx:simpleCParser.ArrayInitBlockContext):
        '''
        语法规则：arrayInitBlock : mType mID '[' mINT ']'';'; 
        描述：数组初始化块
        返回：无
        '''
        Type = self.visit(ctx.getChild(0))
        IDname = ctx.getChild(1).getText()
        Length = int(ctx.getChild(3).getText())

        if self.SymbolTable.JudgeWhetherGlobal() == True:   
            #全局变量
            NewVariable = ir.GlobalVariable(self.Module, ir.ArrayType(Type, Length), name = IDname)
            NewVariable.linkage = 'internal'
        else:
            TheBuilder = self.Builders[-1]
            NewVariable = TheBuilder.alloca(ir.ArrayType(Type, Length), name = IDname)

        TheVariable = {}
        TheVariable["Type"] = ir.ArrayType(Type, Length)
        TheVariable["Name"] = NewVariable
        TheResult = self.SymbolTable.AddItem(IDname, TheVariable)
        if TheResult["result"] != "success":
            #raise SemanticError(ctx=ctx,msg=TheResult["reason"])
            pass
        return

    def visitAssignBlock(self, ctx:simpleCParser.AssignBlockContext):
        '''
        语法规则：assignBlock : ((arrayItem|mID|structMember) '=')+  expr ';';
        描述：赋值语句块
        返回：无
        '''
        TheBuilder = self.Builders[-1]
        Length = ctx.getChildCount()
        IDname = ctx.getChild(0).getText()
        if not '[' in IDname and self.SymbolTable.JudgeExist(IDname) == False:
            #raise SemanticError(ctx=ctx,msg="变量未定义！")
            pass

        #待赋值结果 
        ValueToBeAssigned = self.visit(ctx.getChild(Length - 2))

        i = 0
        Result = {'type': ValueToBeAssigned['type'], 'name': ValueToBeAssigned['name']}
        #遍历全部左边变量赋值
        while i < Length - 2:
            tmp = self.need_load
            self.need_load = False
            TheVariable = self.visit(ctx.getChild(i))
            self.need_load = tmp

            TheValueToBeAssigned = ValueToBeAssigned
            TheValueToBeAssigned = self.assignConvert(TheValueToBeAssigned, TheVariable['type'])
            TheBuilder.store(TheValueToBeAssigned['name'], TheVariable['name'])
            if i > 0:
                ReturnVariable = TheBuilder.load(TheVariable['name'])
                Result = {'type': TheVariable['type'], 'name': ReturnVariable}
            i += 2
        return Result

    def visitReturnBlock(self, ctx: simpleCParser.ReturnBlockContext):
        '''
        语法规则：returnBlock : 'return' (mINT|mID)? ';';
        描述：return语句块
        返回：无
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
    def visitFunc(self, ctx: simpleCParser.FuncContext):
        '''
        语法规则：func : (strlenFunc | atoiFunc | printfFunc | scanfFunc | getsFunc | selfDefinedFunc);
        描述：函数
        返回：无
        '''
        return self.visit(ctx.getChild(0))

    def visitPrintfFunc(self, ctx: simpleCParser.PrintfFuncContext):
        '''
        语法规则：printfFunc : 'printf' '(' (mSTRING | mID) (','expr)* ')';
        描述：printf函数
        返回：函数返回值
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

    def visitScanfFunc(self, ctx:simpleCParser.ScanfFuncContext):
        '''
        语法规则：scanfFunc : 'scanf' '(' mSTRING (','('&')?(mID|arrayItem|structMember))* ')';
        描述：scanf函数
        返回：函数返回值
        '''        
        if 'scanf' in self.Functions:
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

    def visitMINT(self, ctx:simpleCParser.MINTContext):
        '''
        语法规则：mINT : INT;
        描述：int
        返回：无
        '''
        return {
            'type': int32,
            'const': True,
            'name': ir.Constant(int32, int(ctx.getText()))
        }

    def visitMSTRING(self, ctx: simpleCParser.MSTRINGContext):
        '''
        语法规则：mSTRING : STRING;
        描述：string
        返回：无
        '''
        mstr = ctx.getText().replace('\\n', '\n')
        mstr = mstr[1:-1]
        mstr += '\0'
        length = len(bytearray(mstr, 'utf-8'))
        ret = ir.GlobalVariable(self.module, ir.ArrayType(int8, length), ".str%d" % self.constant)
        self.constant += 1
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
    def visitCondition(self, ctx: simpleCParser.ConditionContext):

        return self.visitChildren(ctx)

    ####### HYL #############
    # 类型转换至布尔型
    def toBoolean(self, manipulate_index, not_equal=True):
        builder = self.builder_list[-1]
        operator = "==" if not_equal else "!="
        return_dict = {
            'type': int1,
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
        '''
        expr : string
        '''
        return self.visit(ctx.getChild(0))

    def isInteger(self, v_type):
        return hasattr(v_type, 'width')
    
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
