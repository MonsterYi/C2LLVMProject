from antlr4 import *

from Parser.simpleCParser import simpleCParser
from Parser.simpleCVisitor import simpleCVisitor
from Parser.simpleCLexer import simpleCLexer
from llvmlite import ir

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
        LLVMFunctionType = ir.FunctionType(self.visit(ctx.getChild(0)), ParameterTypeList)
        LLVMFunction = ir.Function(self.module, LLVMFunctionType, name=func_name)

        # 存储函数的变量
        for i in range(len(para_list)):
            LLVMFunction.args[i].name = para_list[i]['IDname']

        # 存储函数的block
        TheBlock = LLVMFunction.append_basic_block(name=func_name + '.entry')

        # 判断重定义，存储函数
        if func_name in self.func_list:
            # raise SemanticError(ctx=ctx,msg="函数重定义错误！")
            pass
        else:
            self.func_list[func_name] = LLVMFunction

        TheBuilder = ir.IRBuilder(TheBlock)
        self.block_list.append(TheBlock)
        self.builder_list.append(TheBuilder)

        # 进一层
        self.cur_func = func_name
        # self.SymbolTable.EnterScope()

        # 存储函数的变量
        for i in range(len(para_list)):
            NewVariable = TheBuilder.alloca(para_list[i]['type'])
            TheBuilder.store(LLVMFunction.args[i], NewVariable)
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
        # self.SymbolTable.QuitScope()
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
        if ctx.getText() == 'double':
            return double
        return void

    def visitParams(self, ctx: simpleCParser.ParamsContext):
        '''
        语法规则：params : param (','param)* |;
        描述：函数的参数列表
        返回：处理后的函数参数列表
        '''
        Length = ctx.getChildCount()
        if (Length == 0):
            return []
        ParameterList = []
        i = 0
        while i < Length:
            NewParameter = self.visit(ctx.getChild(i))
            ParameterList.append(NewParameter)
            i += 2
        return ParameterList

    def visitFuncBody(self, ctx: simpleCParser.FuncBodyContext):
        '''
        语法规则：funcBody : body returnBlock;
        描述：函数体
        返回：无
        '''
        # self.SymbolTable.EnterScope()
        for index in range(ctx.getChildCount()):
            self.visit(ctx.getChild(index))
        # self.SymbolTable.QuitScope()
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

    def visitReturnBlock(self, ctx: simpleCParser.ReturnBlockContext):
        '''
        语法规则：returnBlock : 'return' (mINT|mID)? ';';
        描述：return语句块
        返回：无
        '''
        # 返回空
        if ctx.getChildCount() == 2:
            RealReturnValue = self.builder_list[-1].ret_void()
            JudgeTruth = False
            return {
                'type': void,
                'const': JudgeTruth,
                'name': RealReturnValue
            }

        # 访问返回值
        ReturnIndex = self.visit(ctx.getChild(1))
        RealReturnValue = self.builder_list[-1].ret(ReturnIndex['name'])
        JudgeTruth = False
        return {
            'type': void,
            'const': JudgeTruth,
            'name': RealReturnValue
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
            printfType = ir.FunctionType(int32, [ir.PointerType(int8)], var_arg=True)
            printf = ir.Function(self.module, printfType, name="printf")
            self.func_list['printf'] = printf

        TheBuilder = self.builder_list[-1]
        zero = ir.Constant(int32, 0)

        # 就一个变量
        if ctx.getChildCount() == 4:
            ParameterInfo = self.visit(ctx.getChild(2))
            Argument = TheBuilder.gep(ParameterInfo['name'], [zero, zero], inbounds=True)
            ReturnVariableName = TheBuilder.call(printf, [Argument])
        else:
            ParameterInfo = self.visit(ctx.getChild(2))
            Arguments = [TheBuilder.gep(ParameterInfo['name'], [zero, zero], inbounds=True)]

            Length = ctx.getChildCount()
            i = 4
            while i < Length - 1:
                OneParameter = self.visit(ctx.getChild(i))
                Arguments.append(OneParameter['name'])
                i += 2
            ReturnVariableName = TheBuilder.call(printf, Arguments)
        Result = {'type': int32, 'name': ReturnVariableName}
        return Result

    def visitMINT(self, ctx: simpleCParser.MINTContext):
        '''
        语法规则：mINT : INT;
        描述：int
        返回：无
        '''
        JudgeReg = True
        return {
            'type': int32,
            'const': JudgeReg,
            'name': ir.Constant(int32, int(ctx.getText()))
        }

    def visitMSTRING(self, ctx: simpleCParser.MSTRINGContext):
        '''
        语法规则：mSTRING : STRING;
        描述：string
        返回：无
        '''
        MarkIndex = self.constant
        self.constant += 1
        ProcessIndex = ctx.getText().replace('\\n', '\n')
        ProcessIndex = ProcessIndex[1:-1]
        ProcessIndex += '\0'
        Len = len(bytearray(ProcessIndex, 'utf-8'))
        JudgeReg = False
        RealReturnValue = ir.GlobalVariable(self.module, ir.ArrayType(int8, Len), ".str%d" % MarkIndex)
        RealReturnValue.global_constant = True
        RealReturnValue.initializer = ir.Constant(ir.ArrayType(int8, Len), bytearray(ProcessIndex, 'utf-8'))
        return {
            'type': ir.ArrayType(int8, Len),
            'const': JudgeReg,
            'name': RealReturnValue
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
