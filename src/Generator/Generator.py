from antlr4 import *

from Parser.simpleCParser import simpleCParser
from Parser.simpleCVisitor import simpleCVisitor
from Parser.simpleCLexer import simpleCLexer
from llvmlite import ir

double = ir.DoubleType()
int1 = ir.IntType(1)
int32 = ir.IntType(32)
int8 = ir.IntType(8)
void = ir.VoidType()


class MyVisitor(simpleCVisitor):

    def __init__(self):
        super(simpleCVisitor, self).__init__()

        #控制llvm生成
        self.module = ir.Module()
        self.module.triple = "x86_64-pc-linux-gnu" # llvm.Target.from_default_triple()
        self.module.data_layout = "e-m:e-i64:64-f80:128-n8:16:32:64-S128" # llvm.create_mcjit_compiler(backing_mod, target_machine)
        
        self.block_list = []
        self.builder_list = []
        self.func_list = dict()
        self.cur_func = ''


    def visitProg(self, ctx:simpleCParser.ProgContext):
        '''
        语法规则：prog :(include)* (initialBlock|arrayInitBlock|structInitBlock|mStructDef|mFunction)*;
        描述：代码主文件
        返回：无
        '''
        for i in range(0, ctx.getChildCount()):
            self.visit(ctx.getChild(i))

    #函数相关函数
    def visitMFunction(self, ctx:simpleCParser.MFunctionContext):

        '''
        语法规则：mFunction : (mType|mVoid|mStruct) mID '(' params ')' '{' funcBody '}';
        描述：函数的定义
        返回：无
        '''
        #获取函数名 todo
        func_name = ctx.getChild(1).getText() # func name
        
        #获取参数列表
        para_list = self.visit(ctx.getChild(3)) # func params

        #根据返回值，函数名称和参数生成llvm函数
        ParameterTypeList = []
        for i in range(len(para_list)):
            ParameterTypeList.append(para_list[i]['type'])
        LLVMFunctionType = ir.FunctionType(self.visit(ctx.getChild(0)), ParameterTypeList)
        LLVMFunction = ir.Function(self.module, LLVMFunctionType, name = func_name)

        #存储函数的变量        
        for i in range(len(para_list)):
            LLVMFunction.args[i].name = para_list[i]['IDname']

        #存储函数的block
        TheBlock = LLVMFunction.append_basic_block(name = func_name + '.entry')

        #判断重定义，存储函数
        if func_name in self.func_list:
            #raise SemanticError(ctx=ctx,msg="函数重定义错误！")
            pass
        else:
            self.func_list[func_name] = LLVMFunction

        TheBuilder = ir.IRBuilder(TheBlock)
        self.block_list.append(TheBlock)
        self.builder_list.append(TheBuilder)

        #进一层
        self.cur_func = func_name
        #self.SymbolTable.EnterScope()

        #存储函数的变量
        for i in range(len(para_list)):
            NewVariable = TheBuilder.alloca(para_list[i]['type'])
            TheBuilder.store(LLVMFunction.args[i], NewVariable)
            TheVariable = {}
            TheVariable["Type"] = para_list[i]['type']
            TheVariable["Name"] = NewVariable
            TheResult = self.SymbolTable.AddItem(para_list[i]['IDname'], TheVariable)
            if TheResult["result"] != "success":
                #raise SemanticError(ctx=ctx,msg=TheResult["reason"])
                pass

        #处理函数body
        self.visit(ctx.getChild(6)) # func body

        #处理完毕，退一层
        self.cur_func = ''
        self.block_list.pop()
        self.builder_list.pop()
        #self.SymbolTable.QuitScope()
        return

    
    def visitPrintfFunc(self, ctx:simpleCParser.PrintfFuncContext):
        '''
        语法规则：printfFunc : 'printf' '(' (mSTRING | mID) (','expr)* ')';
        描述：printf函数
        返回：函数返回值
        '''        
        if 'printf' in self.func_list:
            printf = self.func_list['printf']
        else:
            printfType = ir.FunctionType(int32, [ir.PointerType(int8)], var_arg = True)
            printf = ir.Function(self.module, printfType, name = "printf")
            self.func_list['printf'] = printf

        TheBuilder = self.builder_list[-1]
        zero = ir.Constant(int32, 0)

        #就一个变量
        if ctx.getChildCount() == 4:
            ParameterInfo = self.visit(ctx.getChild(2)) 
            Argument = TheBuilder.gep(ParameterInfo['name'], [zero, zero], inbounds = True)
            ReturnVariableName = TheBuilder.call(printf, [Argument])
        else:
            ParameterInfo = self.visit(ctx.getChild(2))
            Arguments = [TheBuilder.gep(ParameterInfo['name'], [zero, zero], inbounds = True)]

            Length = ctx.getChildCount()
            i = 4
            while i < Length - 1:
                OneParameter = self.visit(ctx.getChild(i))
                Arguments.append(OneParameter['name'])
                i += 2
            ReturnVariableName = TheBuilder.call(printf, Arguments)
        Result = {'type': int32, 'name': ReturnVariableName}
        return Result


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
    errorListener = syntaxErrorListener()
    parser.addErrorListener(errorListener)

    tree = parser.prog()
    v = Visitor()
    v.visit(tree)
    v.save(output_filename)