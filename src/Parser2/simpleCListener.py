# Generated from simpleC.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .simpleCParser import simpleCParser
else:
    from simpleCParser import simpleCParser

# This class defines a complete listener for a parse tree produced by simpleCParser.
class simpleCListener(ParseTreeListener):

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


    # Enter a parse tree produced by simpleCParser#structDef.
    def enterStructDef(self, ctx:simpleCParser.StructDefContext):
        pass

    # Exit a parse tree produced by simpleCParser#structDef.
    def exitStructDef(self, ctx:simpleCParser.StructDefContext):
        pass


    # Enter a parse tree produced by simpleCParser#structBodyDef.
    def enterStructBodyDef(self, ctx:simpleCParser.StructBodyDefContext):
        pass

    # Exit a parse tree produced by simpleCParser#structBodyDef.
    def exitStructBodyDef(self, ctx:simpleCParser.StructBodyDefContext):
        pass


    # Enter a parse tree produced by simpleCParser#structItemDef.
    def enterStructItemDef(self, ctx:simpleCParser.StructItemDefContext):
        pass

    # Exit a parse tree produced by simpleCParser#structItemDef.
    def exitStructItemDef(self, ctx:simpleCParser.StructItemDefContext):
        pass


    # Enter a parse tree produced by simpleCParser#functionDef.
    def enterFunctionDef(self, ctx:simpleCParser.FunctionDefContext):
        pass

    # Exit a parse tree produced by simpleCParser#functionDef.
    def exitFunctionDef(self, ctx:simpleCParser.FunctionDefContext):
        pass


    # Enter a parse tree produced by simpleCParser#functionHeaderDef.
    def enterFunctionHeaderDef(self, ctx:simpleCParser.FunctionHeaderDefContext):
        pass

    # Exit a parse tree produced by simpleCParser#functionHeaderDef.
    def exitFunctionHeaderDef(self, ctx:simpleCParser.FunctionHeaderDefContext):
        pass


    # Enter a parse tree produced by simpleCParser#functionParamsDef.
    def enterFunctionParamsDef(self, ctx:simpleCParser.FunctionParamsDefContext):
        pass

    # Exit a parse tree produced by simpleCParser#functionParamsDef.
    def exitFunctionParamsDef(self, ctx:simpleCParser.FunctionParamsDefContext):
        pass


    # Enter a parse tree produced by simpleCParser#functionParamDef.
    def enterFunctionParamDef(self, ctx:simpleCParser.FunctionParamDefContext):
        pass

    # Exit a parse tree produced by simpleCParser#functionParamDef.
    def exitFunctionParamDef(self, ctx:simpleCParser.FunctionParamDefContext):
        pass


    # Enter a parse tree produced by simpleCParser#functionBodyDef.
    def enterFunctionBodyDef(self, ctx:simpleCParser.FunctionBodyDefContext):
        pass

    # Exit a parse tree produced by simpleCParser#functionBodyDef.
    def exitFunctionBodyDef(self, ctx:simpleCParser.FunctionBodyDefContext):
        pass


    # Enter a parse tree produced by simpleCParser#block.
    def enterBlock(self, ctx:simpleCParser.BlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#block.
    def exitBlock(self, ctx:simpleCParser.BlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#sentence.
    def enterSentence(self, ctx:simpleCParser.SentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#sentence.
    def exitSentence(self, ctx:simpleCParser.SentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#defineSentence.
    def enterDefineSentence(self, ctx:simpleCParser.DefineSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#defineSentence.
    def exitDefineSentence(self, ctx:simpleCParser.DefineSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#baseDefineSentence.
    def enterBaseDefineSentence(self, ctx:simpleCParser.BaseDefineSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#baseDefineSentence.
    def exitBaseDefineSentence(self, ctx:simpleCParser.BaseDefineSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#arrayDefineSentence.
    def enterArrayDefineSentence(self, ctx:simpleCParser.ArrayDefineSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#arrayDefineSentence.
    def exitArrayDefineSentence(self, ctx:simpleCParser.ArrayDefineSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#structDefineSentence.
    def enterStructDefineSentence(self, ctx:simpleCParser.StructDefineSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#structDefineSentence.
    def exitStructDefineSentence(self, ctx:simpleCParser.StructDefineSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#assignSentence.
    def enterAssignSentence(self, ctx:simpleCParser.AssignSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#assignSentence.
    def exitAssignSentence(self, ctx:simpleCParser.AssignSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#ifSentenceBlock.
    def enterIfSentenceBlock(self, ctx:simpleCParser.IfSentenceBlockContext):
        pass

    # Exit a parse tree produced by simpleCParser#ifSentenceBlock.
    def exitIfSentenceBlock(self, ctx:simpleCParser.IfSentenceBlockContext):
        pass


    # Enter a parse tree produced by simpleCParser#ifSentence.
    def enterIfSentence(self, ctx:simpleCParser.IfSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#ifSentence.
    def exitIfSentence(self, ctx:simpleCParser.IfSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#elifSentence.
    def enterElifSentence(self, ctx:simpleCParser.ElifSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#elifSentence.
    def exitElifSentence(self, ctx:simpleCParser.ElifSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#elseSentence.
    def enterElseSentence(self, ctx:simpleCParser.ElseSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#elseSentence.
    def exitElseSentence(self, ctx:simpleCParser.ElseSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#condition.
    def enterCondition(self, ctx:simpleCParser.ConditionContext):
        pass

    # Exit a parse tree produced by simpleCParser#condition.
    def exitCondition(self, ctx:simpleCParser.ConditionContext):
        pass


    # Enter a parse tree produced by simpleCParser#whileSentence.
    def enterWhileSentence(self, ctx:simpleCParser.WhileSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#whileSentence.
    def exitWhileSentence(self, ctx:simpleCParser.WhileSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#forSentence.
    def enterForSentence(self, ctx:simpleCParser.ForSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#forSentence.
    def exitForSentence(self, ctx:simpleCParser.ForSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#forDefineSentence.
    def enterForDefineSentence(self, ctx:simpleCParser.ForDefineSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#forDefineSentence.
    def exitForDefineSentence(self, ctx:simpleCParser.ForDefineSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#forIteratorSentence.
    def enterForIteratorSentence(self, ctx:simpleCParser.ForIteratorSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#forIteratorSentence.
    def exitForIteratorSentence(self, ctx:simpleCParser.ForIteratorSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#returnSentence.
    def enterReturnSentence(self, ctx:simpleCParser.ReturnSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#returnSentence.
    def exitReturnSentence(self, ctx:simpleCParser.ReturnSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#continueSentence.
    def enterContinueSentence(self, ctx:simpleCParser.ContinueSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#continueSentence.
    def exitContinueSentence(self, ctx:simpleCParser.ContinueSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#breakSentence.
    def enterBreakSentence(self, ctx:simpleCParser.BreakSentenceContext):
        pass

    # Exit a parse tree produced by simpleCParser#breakSentence.
    def exitBreakSentence(self, ctx:simpleCParser.BreakSentenceContext):
        pass


    # Enter a parse tree produced by simpleCParser#expr.
    def enterExpr(self, ctx:simpleCParser.ExprContext):
        pass

    # Exit a parse tree produced by simpleCParser#expr.
    def exitExpr(self, ctx:simpleCParser.ExprContext):
        pass


    # Enter a parse tree produced by simpleCParser#lib.
    def enterLib(self, ctx:simpleCParser.LibContext):
        pass

    # Exit a parse tree produced by simpleCParser#lib.
    def exitLib(self, ctx:simpleCParser.LibContext):
        pass


    # Enter a parse tree produced by simpleCParser#myID.
    def enterMyID(self, ctx:simpleCParser.MyIDContext):
        pass

    # Exit a parse tree produced by simpleCParser#myID.
    def exitMyID(self, ctx:simpleCParser.MyIDContext):
        pass


    # Enter a parse tree produced by simpleCParser#myInt.
    def enterMyInt(self, ctx:simpleCParser.MyIntContext):
        pass

    # Exit a parse tree produced by simpleCParser#myInt.
    def exitMyInt(self, ctx:simpleCParser.MyIntContext):
        pass


    # Enter a parse tree produced by simpleCParser#myDouble.
    def enterMyDouble(self, ctx:simpleCParser.MyDoubleContext):
        pass

    # Exit a parse tree produced by simpleCParser#myDouble.
    def exitMyDouble(self, ctx:simpleCParser.MyDoubleContext):
        pass


    # Enter a parse tree produced by simpleCParser#myChar.
    def enterMyChar(self, ctx:simpleCParser.MyCharContext):
        pass

    # Exit a parse tree produced by simpleCParser#myChar.
    def exitMyChar(self, ctx:simpleCParser.MyCharContext):
        pass


    # Enter a parse tree produced by simpleCParser#myString.
    def enterMyString(self, ctx:simpleCParser.MyStringContext):
        pass

    # Exit a parse tree produced by simpleCParser#myString.
    def exitMyString(self, ctx:simpleCParser.MyStringContext):
        pass


    # Enter a parse tree produced by simpleCParser#operator.
    def enterOperator(self, ctx:simpleCParser.OperatorContext):
        pass

    # Exit a parse tree produced by simpleCParser#operator.
    def exitOperator(self, ctx:simpleCParser.OperatorContext):
        pass


    # Enter a parse tree produced by simpleCParser#conjunction.
    def enterConjunction(self, ctx:simpleCParser.ConjunctionContext):
        pass

    # Exit a parse tree produced by simpleCParser#conjunction.
    def exitConjunction(self, ctx:simpleCParser.ConjunctionContext):
        pass


    # Enter a parse tree produced by simpleCParser#inLineComment.
    def enterInLineComment(self, ctx:simpleCParser.InLineCommentContext):
        pass

    # Exit a parse tree produced by simpleCParser#inLineComment.
    def exitInLineComment(self, ctx:simpleCParser.InLineCommentContext):
        pass


    # Enter a parse tree produced by simpleCParser#blockComment.
    def enterBlockComment(self, ctx:simpleCParser.BlockCommentContext):
        pass

    # Exit a parse tree produced by simpleCParser#blockComment.
    def exitBlockComment(self, ctx:simpleCParser.BlockCommentContext):
        pass


    # Enter a parse tree produced by simpleCParser#space.
    def enterSpace(self, ctx:simpleCParser.SpaceContext):
        pass

    # Exit a parse tree produced by simpleCParser#space.
    def exitSpace(self, ctx:simpleCParser.SpaceContext):
        pass


    # Enter a parse tree produced by simpleCParser#struct.
    def enterStruct(self, ctx:simpleCParser.StructContext):
        pass

    # Exit a parse tree produced by simpleCParser#struct.
    def exitStruct(self, ctx:simpleCParser.StructContext):
        pass


    # Enter a parse tree produced by simpleCParser#myType.
    def enterMyType(self, ctx:simpleCParser.MyTypeContext):
        pass

    # Exit a parse tree produced by simpleCParser#myType.
    def exitMyType(self, ctx:simpleCParser.MyTypeContext):
        pass


    # Enter a parse tree produced by simpleCParser#array.
    def enterArray(self, ctx:simpleCParser.ArrayContext):
        pass

    # Exit a parse tree produced by simpleCParser#array.
    def exitArray(self, ctx:simpleCParser.ArrayContext):
        pass


    # Enter a parse tree produced by simpleCParser#arrayItem.
    def enterArrayItem(self, ctx:simpleCParser.ArrayItemContext):
        pass

    # Exit a parse tree produced by simpleCParser#arrayItem.
    def exitArrayItem(self, ctx:simpleCParser.ArrayItemContext):
        pass


    # Enter a parse tree produced by simpleCParser#myVoid.
    def enterMyVoid(self, ctx:simpleCParser.MyVoidContext):
        pass

    # Exit a parse tree produced by simpleCParser#myVoid.
    def exitMyVoid(self, ctx:simpleCParser.MyVoidContext):
        pass


    # Enter a parse tree produced by simpleCParser#structItem.
    def enterStructItem(self, ctx:simpleCParser.StructItemContext):
        pass

    # Exit a parse tree produced by simpleCParser#structItem.
    def exitStructItem(self, ctx:simpleCParser.StructItemContext):
        pass


    # Enter a parse tree produced by simpleCParser#argument.
    def enterArgument(self, ctx:simpleCParser.ArgumentContext):
        pass

    # Exit a parse tree produced by simpleCParser#argument.
    def exitArgument(self, ctx:simpleCParser.ArgumentContext):
        pass


    # Enter a parse tree produced by simpleCParser#function.
    def enterFunction(self, ctx:simpleCParser.FunctionContext):
        pass

    # Exit a parse tree produced by simpleCParser#function.
    def exitFunction(self, ctx:simpleCParser.FunctionContext):
        pass


    # Enter a parse tree produced by simpleCParser#selfDefinedFunc.
    def enterSelfDefinedFunc(self, ctx:simpleCParser.SelfDefinedFuncContext):
        pass

    # Exit a parse tree produced by simpleCParser#selfDefinedFunc.
    def exitSelfDefinedFunc(self, ctx:simpleCParser.SelfDefinedFuncContext):
        pass


    # Enter a parse tree produced by simpleCParser#printFunc.
    def enterPrintFunc(self, ctx:simpleCParser.PrintFuncContext):
        pass

    # Exit a parse tree produced by simpleCParser#printFunc.
    def exitPrintFunc(self, ctx:simpleCParser.PrintFuncContext):
        pass


    # Enter a parse tree produced by simpleCParser#scanfFunc.
    def enterScanfFunc(self, ctx:simpleCParser.ScanfFuncContext):
        pass

    # Exit a parse tree produced by simpleCParser#scanfFunc.
    def exitScanfFunc(self, ctx:simpleCParser.ScanfFuncContext):
        pass


    # Enter a parse tree produced by simpleCParser#getsFunc.
    def enterGetsFunc(self, ctx:simpleCParser.GetsFuncContext):
        pass

    # Exit a parse tree produced by simpleCParser#getsFunc.
    def exitGetsFunc(self, ctx:simpleCParser.GetsFuncContext):
        pass


    # Enter a parse tree produced by simpleCParser#strlenFunc.
    def enterStrlenFunc(self, ctx:simpleCParser.StrlenFuncContext):
        pass

    # Exit a parse tree produced by simpleCParser#strlenFunc.
    def exitStrlenFunc(self, ctx:simpleCParser.StrlenFuncContext):
        pass


    # Enter a parse tree produced by simpleCParser#atoiFunc.
    def enterAtoiFunc(self, ctx:simpleCParser.AtoiFuncContext):
        pass

    # Exit a parse tree produced by simpleCParser#atoiFunc.
    def exitAtoiFunc(self, ctx:simpleCParser.AtoiFuncContext):
        pass


