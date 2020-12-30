# Generated from simpleC.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .simpleCParser import simpleCParser
else:
    from simpleCParser import simpleCParser

# This class defines a complete generic visitor for a parse tree produced by simpleCParser.

class simpleCVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by simpleCParser#myID.
    def visitMyID(self, ctx:simpleCParser.MyIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myINT.
    def visitMyINT(self, ctx:simpleCParser.MyINTContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myDOUBLE.
    def visitMyDOUBLE(self, ctx:simpleCParser.MyDOUBLEContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myCHAR.
    def visitMyCHAR(self, ctx:simpleCParser.MyCHARContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#mySTRING.
    def visitMySTRING(self, ctx:simpleCParser.MySTRINGContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myLIB.
    def visitMyLIB(self, ctx:simpleCParser.MyLIBContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myTYPE.
    def visitMyTYPE(self, ctx:simpleCParser.MyTYPEContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myARRAY.
    def visitMyARRAY(self, ctx:simpleCParser.MyARRAYContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myARRAYITEM.
    def visitMyARRAYITEM(self, ctx:simpleCParser.MyARRAYITEMContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myVOID.
    def visitMyVOID(self, ctx:simpleCParser.MyVOIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#program.
    def visitProgram(self, ctx:simpleCParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#include.
    def visitInclude(self, ctx:simpleCParser.IncludeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myFunction.
    def visitMyFunction(self, ctx:simpleCParser.MyFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#defineParams.
    def visitDefineParams(self, ctx:simpleCParser.DefineParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#defineParam.
    def visitDefineParam(self, ctx:simpleCParser.DefineParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#functionBody.
    def visitFunctionBody(self, ctx:simpleCParser.FunctionBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#body.
    def visitBody(self, ctx:simpleCParser.BodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#block.
    def visitBlock(self, ctx:simpleCParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#defineBlock.
    def visitDefineBlock(self, ctx:simpleCParser.DefineBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#baseInitialBlock.
    def visitBaseInitialBlock(self, ctx:simpleCParser.BaseInitialBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#arrayInitialBlock.
    def visitArrayInitialBlock(self, ctx:simpleCParser.ArrayInitialBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#assignBlock.
    def visitAssignBlock(self, ctx:simpleCParser.AssignBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#ifBlocks.
    def visitIfBlocks(self, ctx:simpleCParser.IfBlocksContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#ifBlock.
    def visitIfBlock(self, ctx:simpleCParser.IfBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#elifBlock.
    def visitElifBlock(self, ctx:simpleCParser.ElifBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#elseBlock.
    def visitElseBlock(self, ctx:simpleCParser.ElseBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#condition.
    def visitCondition(self, ctx:simpleCParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#whileBlock.
    def visitWhileBlock(self, ctx:simpleCParser.WhileBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#forBlock.
    def visitForBlock(self, ctx:simpleCParser.ForBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#forDefineBlock.
    def visitForDefineBlock(self, ctx:simpleCParser.ForDefineBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#forIteratorBlock.
    def visitForIteratorBlock(self, ctx:simpleCParser.ForIteratorBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#returnBlock.
    def visitReturnBlock(self, ctx:simpleCParser.ReturnBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#identifier.
    def visitIdentifier(self, ctx:simpleCParser.IdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#expr_add.
    def visitExpr_add(self, ctx:simpleCParser.Expr_addContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#string.
    def visitString(self, ctx:simpleCParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#double.
    def visitDouble(self, ctx:simpleCParser.DoubleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#expr_parens.
    def visitExpr_parens(self, ctx:simpleCParser.Expr_parensContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#expr_judge.
    def visitExpr_judge(self, ctx:simpleCParser.Expr_judgeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#int.
    def visitInt(self, ctx:simpleCParser.IntContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#expr_mul.
    def visitExpr_mul(self, ctx:simpleCParser.Expr_mulContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#expr_neg.
    def visitExpr_neg(self, ctx:simpleCParser.Expr_negContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#expr_arrayitem.
    def visitExpr_arrayitem(self, ctx:simpleCParser.Expr_arrayitemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#function.
    def visitFunction(self, ctx:simpleCParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#expr_or.
    def visitExpr_or(self, ctx:simpleCParser.Expr_orContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#char.
    def visitChar(self, ctx:simpleCParser.CharContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#expr_and.
    def visitExpr_and(self, ctx:simpleCParser.Expr_andContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#func.
    def visitFunc(self, ctx:simpleCParser.FuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#printfFunction.
    def visitPrintfFunction(self, ctx:simpleCParser.PrintfFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#scanfFunction.
    def visitScanfFunction(self, ctx:simpleCParser.ScanfFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#selfDefinedFunction.
    def visitSelfDefinedFunction(self, ctx:simpleCParser.SelfDefinedFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#argument.
    def visitArgument(self, ctx:simpleCParser.ArgumentContext):
        return self.visitChildren(ctx)



del simpleCParser