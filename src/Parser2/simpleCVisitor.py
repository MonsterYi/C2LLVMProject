# Generated from simpleC.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .simpleCParser import simpleCParser
else:
    from simpleCParser import simpleCParser

# This class defines a complete generic visitor for a parse tree produced by simpleCParser.

class simpleCVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by simpleCParser#program.
    def visitProgram(self, ctx:simpleCParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#include.
    def visitInclude(self, ctx:simpleCParser.IncludeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#structDef.
    def visitStructDef(self, ctx:simpleCParser.StructDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#structBodyDef.
    def visitStructBodyDef(self, ctx:simpleCParser.StructBodyDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#structItemDef.
    def visitStructItemDef(self, ctx:simpleCParser.StructItemDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#functionDef.
    def visitFunctionDef(self, ctx:simpleCParser.FunctionDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#functionHeaderDef.
    def visitFunctionHeaderDef(self, ctx:simpleCParser.FunctionHeaderDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#functionParamsDef.
    def visitFunctionParamsDef(self, ctx:simpleCParser.FunctionParamsDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#functionParamDef.
    def visitFunctionParamDef(self, ctx:simpleCParser.FunctionParamDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#functionBodyDef.
    def visitFunctionBodyDef(self, ctx:simpleCParser.FunctionBodyDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#block.
    def visitBlock(self, ctx:simpleCParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#sentence.
    def visitSentence(self, ctx:simpleCParser.SentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#defineSentence.
    def visitDefineSentence(self, ctx:simpleCParser.DefineSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#baseDefineSentence.
    def visitBaseDefineSentence(self, ctx:simpleCParser.BaseDefineSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#arrayDefineSentence.
    def visitArrayDefineSentence(self, ctx:simpleCParser.ArrayDefineSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#structDefineSentence.
    def visitStructDefineSentence(self, ctx:simpleCParser.StructDefineSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#assignSentence.
    def visitAssignSentence(self, ctx:simpleCParser.AssignSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#ifSentenceBlock.
    def visitIfSentenceBlock(self, ctx:simpleCParser.IfSentenceBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#ifSentence.
    def visitIfSentence(self, ctx:simpleCParser.IfSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#elifSentence.
    def visitElifSentence(self, ctx:simpleCParser.ElifSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#elseSentence.
    def visitElseSentence(self, ctx:simpleCParser.ElseSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#condition.
    def visitCondition(self, ctx:simpleCParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#whileSentence.
    def visitWhileSentence(self, ctx:simpleCParser.WhileSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#forSentence.
    def visitForSentence(self, ctx:simpleCParser.ForSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#forDefineSentence.
    def visitForDefineSentence(self, ctx:simpleCParser.ForDefineSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#forIteratorSentence.
    def visitForIteratorSentence(self, ctx:simpleCParser.ForIteratorSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#returnSentence.
    def visitReturnSentence(self, ctx:simpleCParser.ReturnSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#continueSentence.
    def visitContinueSentence(self, ctx:simpleCParser.ContinueSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#breakSentence.
    def visitBreakSentence(self, ctx:simpleCParser.BreakSentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#expr.
    def visitExpr(self, ctx:simpleCParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#lib.
    def visitLib(self, ctx:simpleCParser.LibContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myID.
    def visitMyID(self, ctx:simpleCParser.MyIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myInt.
    def visitMyInt(self, ctx:simpleCParser.MyIntContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myDouble.
    def visitMyDouble(self, ctx:simpleCParser.MyDoubleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myChar.
    def visitMyChar(self, ctx:simpleCParser.MyCharContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myString.
    def visitMyString(self, ctx:simpleCParser.MyStringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#operator.
    def visitOperator(self, ctx:simpleCParser.OperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#conjunction.
    def visitConjunction(self, ctx:simpleCParser.ConjunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#inLineComment.
    def visitInLineComment(self, ctx:simpleCParser.InLineCommentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#blockComment.
    def visitBlockComment(self, ctx:simpleCParser.BlockCommentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#space.
    def visitSpace(self, ctx:simpleCParser.SpaceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#struct.
    def visitStruct(self, ctx:simpleCParser.StructContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myType.
    def visitMyType(self, ctx:simpleCParser.MyTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#array.
    def visitArray(self, ctx:simpleCParser.ArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#arrayItem.
    def visitArrayItem(self, ctx:simpleCParser.ArrayItemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#myVoid.
    def visitMyVoid(self, ctx:simpleCParser.MyVoidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#structItem.
    def visitStructItem(self, ctx:simpleCParser.StructItemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#argument.
    def visitArgument(self, ctx:simpleCParser.ArgumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#function.
    def visitFunction(self, ctx:simpleCParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#selfDefinedFunc.
    def visitSelfDefinedFunc(self, ctx:simpleCParser.SelfDefinedFuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#printFunc.
    def visitPrintFunc(self, ctx:simpleCParser.PrintFuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#scanfFunc.
    def visitScanfFunc(self, ctx:simpleCParser.ScanfFuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#getsFunc.
    def visitGetsFunc(self, ctx:simpleCParser.GetsFuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#strlenFunc.
    def visitStrlenFunc(self, ctx:simpleCParser.StrlenFuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simpleCParser#atoiFunc.
    def visitAtoiFunc(self, ctx:simpleCParser.AtoiFuncContext):
        return self.visitChildren(ctx)



del simpleCParser