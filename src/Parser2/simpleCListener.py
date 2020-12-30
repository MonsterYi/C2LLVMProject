# Generated from simpleC.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .simpleCParser import simpleCParser
else:
    from simpleCParser import simpleCParser

# This class defines a complete listener for a parse tree produced by simpleCParser.
class simpleCListener(ParseTreeListener):

    # Enter a parse tree produced by simpleCParser#myID.
    def enterMyID(self, ctx:simpleCParser.MyIDContext):
        pass

    # Exit a parse tree produced by simpleCParser#myID.
    def exitMyID(self, ctx:simpleCParser.MyIDContext):
        pass


    # Enter a parse tree produced by simpleCParser#myINT.
    def enterMyINT(self, ctx:simpleCParser.MyINTContext):
        pass

    # Exit a parse tree produced by simpleCParser#myINT.
    def exitMyINT(self, ctx:simpleCParser.MyINTContext):
        pass


    # Enter a parse tree produced by simpleCParser#myDOUBLE.
    def enterMyDOUBLE(self, ctx:simpleCParser.MyDOUBLEContext):
        pass

    # Exit a parse tree produced by simpleCParser#myDOUBLE.
    def exitMyDOUBLE(self, ctx:simpleCParser.MyDOUBLEContext):
        pass


    # Enter a parse tree produced by simpleCParser#myCHAR.
    def enterMyCHAR(self, ctx:simpleCParser.MyCHARContext):
        pass

    # Exit a parse tree produced by simpleCParser#myCHAR.
    def exitMyCHAR(self, ctx:simpleCParser.MyCHARContext):
        pass


    # Enter a parse tree produced by simpleCParser#mySTRING.
    def enterMySTRING(self, ctx:simpleCParser.MySTRINGContext):
        pass

    # Exit a parse tree produced by simpleCParser#mySTRING.
    def exitMySTRING(self, ctx:simpleCParser.MySTRINGContext):
        pass


    # Enter a parse tree produced by simpleCParser#myLIB.
    def enterMyLIB(self, ctx:simpleCParser.MyLIBContext):
        pass

    # Exit a parse tree produced by simpleCParser#myLIB.
    def exitMyLIB(self, ctx:simpleCParser.MyLIBContext):
        pass


    # Enter a parse tree produced by simpleCParser#myTYPE.
    def enterMyTYPE(self, ctx:simpleCParser.MyTYPEContext):
        pass

    # Exit a parse tree produced by simpleCParser#myTYPE.
    def exitMyTYPE(self, ctx:simpleCParser.MyTYPEContext):
        pass


    # Enter a parse tree produced by simpleCParser#myARRAY.
    def enterMyARRAY(self, ctx:simpleCParser.MyARRAYContext):
        pass

    # Exit a parse tree produced by simpleCParser#myARRAY.
    def exitMyARRAY(self, ctx:simpleCParser.MyARRAYContext):
        pass


    # Enter a parse tree produced by simpleCParser#myARRAYITEM.
    def enterMyARRAYITEM(self, ctx:simpleCParser.MyARRAYITEMContext):
        pass

    # Exit a parse tree produced by simpleCParser#myARRAYITEM.
    def exitMyARRAYITEM(self, ctx:simpleCParser.MyARRAYITEMContext):
        pass


    # Enter a parse tree produced by simpleCParser#myVOID.
    def enterMyVOID(self, ctx:simpleCParser.MyVOIDContext):
        pass

    # Exit a parse tree produced by simpleCParser#myVOID.
    def exitMyVOID(self, ctx:simpleCParser.MyVOIDContext):
        pass


    # Enter a parse tree produced by simpleCParser#program.
    def enterProgram(self, ctx:simpleCParser.ProgramContext):
        pass

    # Exit a parse tree produced by simpleCParser#program.
    def exitProgram(self, ctx:simpleCParser.ProgramContext):
        pass


    # Enter a parse tree produced by simpleCParser#include.
    def enterInclude(self, ctx:simpleCParser.IncludeContext):
        pass

    # Exit a parse tree produced by simpleCParser#include.
    def exitInclude(self, ctx:simpleCParser.IncludeContext):
        pass


    # Enter a parse tree produced by simpleCParser#mFunction.
    def enterMFunction(self, ctx:simpleCParser.MFunctionContext):
        pass

    # Exit a parse tree produced by simpleCParser#mFunction.
    def exitMFunction(self, ctx:simpleCParser.MFunctionContext):
        pass


    # Enter a parse tree produced by simpleCParser#params.
    def enterParams(self, ctx:simpleCParser.ParamsContext):
        pass

    # Exit a parse tree produced by simpleCParser#params.
    def exitParams(self, ctx:simpleCParser.ParamsContext):
        pass


    # Enter a parse tree produced by simpleCParser#param.
    def enterParam(self, ctx:simpleCParser.ParamContext):
        pass

    # Exit a parse tree produced by simpleCParser#param.
    def exitParam(self, ctx:simpleCParser.ParamContext):
        pass


    # Enter a parse tree produced by simpleCParser#funcBody.
    def enterFuncBody(self, ctx:simpleCParser.FuncBodyContext):
        pass

    # Exit a parse tree produced by simpleCParser#funcBody.
    def exitFuncBody(self, ctx:simpleCParser.FuncBodyContext):
        pass


    # Enter a parse tree produced by simpleCParser#body.
    def enterBody(self, ctx:simpleCParser.BodyContext):
        pass

    # Exit a parse tree produced by simpleCParser#body.
    def exitBody(self, ctx:simpleCParser.BodyContext):
        pass


    # Enter a parse tree produced by simpleCParser#block.
    def enterBlock(self, ctx:simpleCParser.BlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#block.
    def exitBlock(self, ctx:simpleCParser.BlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#initialBlock.
    def enterInitialBlock(self, ctx:simpleCParser.InitialBlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#initialBlock.
    def exitInitialBlock(self, ctx:simpleCParser.InitialBlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#baseInitialBlock.
    def enterBaseInitialBlock(self, ctx:simpleCParser.BaseInitialBlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#baseInitialBlock.
    def exitBaseInitialBlock(self, ctx:simpleCParser.BaseInitialBlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#arrayInitialBlock.
    def enterArrayInitialBlock(self, ctx:simpleCParser.ArrayInitialBlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#arrayInitialBlock.
    def exitArrayInitialBlock(self, ctx:simpleCParser.ArrayInitialBlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#assignBlock.
    def enterAssignBlock(self, ctx:simpleCParser.AssignBlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#assignBlock.
    def exitAssignBlock(self, ctx:simpleCParser.AssignBlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#ifBlocks.
    def enterIfBlocks(self, ctx:simpleCParser.IfBlocksContext):
        pass

    # Exit a parse tree produced by simpleCParser#ifBlocks.
    def exitIfBlocks(self, ctx:simpleCParser.IfBlocksContext):
        pass


    # Enter a parse tree produced by simpleCParser#ifBlock.
    def enterIfBlock(self, ctx:simpleCParser.IfBlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#ifBlock.
    def exitIfBlock(self, ctx:simpleCParser.IfBlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#elifBlock.
    def enterElifBlock(self, ctx:simpleCParser.ElifBlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#elifBlock.
    def exitElifBlock(self, ctx:simpleCParser.ElifBlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#elseBlock.
    def enterElseBlock(self, ctx:simpleCParser.ElseBlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#elseBlock.
    def exitElseBlock(self, ctx:simpleCParser.ElseBlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#condition.
    def enterCondition(self, ctx:simpleCParser.ConditionContext):
        pass

    # Exit a parse tree produced by simpleCParser#condition.
    def exitCondition(self, ctx:simpleCParser.ConditionContext):
        pass


    # Enter a parse tree produced by simpleCParser#whileBlock.
    def enterWhileBlock(self, ctx:simpleCParser.WhileBlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#whileBlock.
    def exitWhileBlock(self, ctx:simpleCParser.WhileBlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#forBlock.
    def enterForBlock(self, ctx:simpleCParser.ForBlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#forBlock.
    def exitForBlock(self, ctx:simpleCParser.ForBlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#forDefineBlock.
    def enterForDefineBlock(self, ctx:simpleCParser.ForDefineBlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#forDefineBlock.
    def exitForDefineBlock(self, ctx:simpleCParser.ForDefineBlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#forIteratorBlock.
    def enterForIteratorBlock(self, ctx:simpleCParser.ForIteratorBlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#forIteratorBlock.
    def exitForIteratorBlock(self, ctx:simpleCParser.ForIteratorBlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#returnBlock.
    def enterReturnBlock(self, ctx:simpleCParser.ReturnBlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#returnBlock.
    def exitReturnBlock(self, ctx:simpleCParser.ReturnBlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#identifier.
    def enterIdentifier(self, ctx:simpleCParser.IdentifierContext):
        pass

    # Exit a parse tree produced by simpleCParser#identifier.
    def exitIdentifier(self, ctx:simpleCParser.IdentifierContext):
        pass


    # Enter a parse tree produced by simpleCParser#expr_add.
    def enterExpr_add(self, ctx:simpleCParser.Expr_addContext):
        pass

    # Exit a parse tree produced by simpleCParser#expr_add.
    def exitExpr_add(self, ctx:simpleCParser.Expr_addContext):
        pass


    # Enter a parse tree produced by simpleCParser#string.
    def enterString(self, ctx:simpleCParser.StringContext):
        pass

    # Exit a parse tree produced by simpleCParser#string.
    def exitString(self, ctx:simpleCParser.StringContext):
        pass


    # Enter a parse tree produced by simpleCParser#double.
    def enterDouble(self, ctx:simpleCParser.DoubleContext):
        pass

    # Exit a parse tree produced by simpleCParser#double.
    def exitDouble(self, ctx:simpleCParser.DoubleContext):
        pass


    # Enter a parse tree produced by simpleCParser#expr_parens.
    def enterExpr_parens(self, ctx:simpleCParser.Expr_parensContext):
        pass

    # Exit a parse tree produced by simpleCParser#expr_parens.
    def exitExpr_parens(self, ctx:simpleCParser.Expr_parensContext):
        pass


    # Enter a parse tree produced by simpleCParser#expr_judge.
    def enterExpr_judge(self, ctx:simpleCParser.Expr_judgeContext):
        pass

    # Exit a parse tree produced by simpleCParser#expr_judge.
    def exitExpr_judge(self, ctx:simpleCParser.Expr_judgeContext):
        pass


    # Enter a parse tree produced by simpleCParser#int.
    def enterInt(self, ctx:simpleCParser.IntContext):
        pass

    # Exit a parse tree produced by simpleCParser#int.
    def exitInt(self, ctx:simpleCParser.IntContext):
        pass


    # Enter a parse tree produced by simpleCParser#expr_mul.
    def enterExpr_mul(self, ctx:simpleCParser.Expr_mulContext):
        pass

    # Exit a parse tree produced by simpleCParser#expr_mul.
    def exitExpr_mul(self, ctx:simpleCParser.Expr_mulContext):
        pass


    # Enter a parse tree produced by simpleCParser#expr_neg.
    def enterExpr_neg(self, ctx:simpleCParser.Expr_negContext):
        pass

    # Exit a parse tree produced by simpleCParser#expr_neg.
    def exitExpr_neg(self, ctx:simpleCParser.Expr_negContext):
        pass


    # Enter a parse tree produced by simpleCParser#expr_arrayitem.
    def enterExpr_arrayitem(self, ctx:simpleCParser.Expr_arrayitemContext):
        pass

    # Exit a parse tree produced by simpleCParser#expr_arrayitem.
    def exitExpr_arrayitem(self, ctx:simpleCParser.Expr_arrayitemContext):
        pass


    # Enter a parse tree produced by simpleCParser#function.
    def enterFunction(self, ctx:simpleCParser.FunctionContext):
        pass

    # Exit a parse tree produced by simpleCParser#function.
    def exitFunction(self, ctx:simpleCParser.FunctionContext):
        pass


    # Enter a parse tree produced by simpleCParser#expr_or.
    def enterExpr_or(self, ctx:simpleCParser.Expr_orContext):
        pass

    # Exit a parse tree produced by simpleCParser#expr_or.
    def exitExpr_or(self, ctx:simpleCParser.Expr_orContext):
        pass


    # Enter a parse tree produced by simpleCParser#char.
    def enterChar(self, ctx:simpleCParser.CharContext):
        pass

    # Exit a parse tree produced by simpleCParser#char.
    def exitChar(self, ctx:simpleCParser.CharContext):
        pass


    # Enter a parse tree produced by simpleCParser#expr_and.
    def enterExpr_and(self, ctx:simpleCParser.Expr_andContext):
        pass

    # Exit a parse tree produced by simpleCParser#expr_and.
    def exitExpr_and(self, ctx:simpleCParser.Expr_andContext):
        pass


    # Enter a parse tree produced by simpleCParser#func.
    def enterFunc(self, ctx:simpleCParser.FuncContext):
        pass

    # Exit a parse tree produced by simpleCParser#func.
    def exitFunc(self, ctx:simpleCParser.FuncContext):
        pass


    # Enter a parse tree produced by simpleCParser#printfFunction.
    def enterPrintfFunction(self, ctx:simpleCParser.PrintfFunctionContext):
        pass

    # Exit a parse tree produced by simpleCParser#printfFunction.
    def exitPrintfFunction(self, ctx:simpleCParser.PrintfFunctionContext):
        pass


    # Enter a parse tree produced by simpleCParser#scanfFunction.
    def enterScanfFunction(self, ctx:simpleCParser.ScanfFunctionContext):
        pass

    # Exit a parse tree produced by simpleCParser#scanfFunction.
    def exitScanfFunction(self, ctx:simpleCParser.ScanfFunctionContext):
        pass


    # Enter a parse tree produced by simpleCParser#selfDefinedFunction.
    def enterSelfDefinedFunction(self, ctx:simpleCParser.SelfDefinedFunctionContext):
        pass

    # Exit a parse tree produced by simpleCParser#selfDefinedFunction.
    def exitSelfDefinedFunction(self, ctx:simpleCParser.SelfDefinedFunctionContext):
        pass


    # Enter a parse tree produced by simpleCParser#argument.
    def enterArgument(self, ctx:simpleCParser.ArgumentContext):
        pass

    # Exit a parse tree produced by simpleCParser#argument.
    def exitArgument(self, ctx:simpleCParser.ArgumentContext):
        pass


