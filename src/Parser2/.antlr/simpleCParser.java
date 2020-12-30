// Generated from c:\Users\75993\Desktop\±‡“Î‘≠¿Ì\project\C2LLVMProject\src\Parser2\simpleC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, INT=39, 
		DOUBLE=40, CHAR=41, STRING=42, LIB=43, CONJUNCTION=44, OPERATOR=45, INLINECOMMENT=46, 
		BLOCKCOMMENT=47, WS=48;
	public static final int
		RULE_myID = 0, RULE_myINT = 1, RULE_myDOUBLE = 2, RULE_myCHAR = 3, RULE_mySTRING = 4, 
		RULE_myLIB = 5, RULE_myTYPE = 6, RULE_myARRAY = 7, RULE_myARRAYITEM = 8, 
		RULE_myVOID = 9, RULE_program = 10, RULE_include = 11, RULE_myFunction = 12, 
		RULE_defineParams = 13, RULE_defineParam = 14, RULE_functionBody = 15, 
		RULE_body = 16, RULE_block = 17, RULE_defineBlock = 18, RULE_baseInitialBlock = 19, 
		RULE_arrayInitialBlock = 20, RULE_assignBlock = 21, RULE_ifBlocks = 22, 
		RULE_ifBlock = 23, RULE_elifBlock = 24, RULE_elseBlock = 25, RULE_condition = 26, 
		RULE_whileBlock = 27, RULE_forBlock = 28, RULE_forDefineBlock = 29, RULE_forIteratorBlock = 30, 
		RULE_returnBlock = 31, RULE_expr = 32, RULE_func = 33, RULE_printfFunction = 34, 
		RULE_scanfFunction = 35, RULE_selfDefinedFunction = 36, RULE_argument = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"myID", "myINT", "myDOUBLE", "myCHAR", "mySTRING", "myLIB", "myTYPE", 
			"myARRAY", "myARRAYITEM", "myVOID", "program", "include", "myFunction", 
			"defineParams", "defineParam", "functionBody", "body", "block", "defineBlock", 
			"baseInitialBlock", "arrayInitialBlock", "assignBlock", "ifBlocks", "ifBlock", 
			"elifBlock", "elseBlock", "condition", "whileBlock", "forBlock", "forDefineBlock", 
			"forIteratorBlock", "returnBlock", "expr", "func", "printfFunction", 
			"scanfFunction", "selfDefinedFunction", "argument"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'double'", "'char'", "'string'", "'['", "']'", "'void'", 
			"'#include'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "','", "';'", 
			"'='", "'if'", "'else'", "'while'", "'for'", "'return'", "'!'", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", 
			"'printf'", "'scanf'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "INT", "DOUBLE", "CHAR", "STRING", "LIB", "CONJUNCTION", 
			"OPERATOR", "INLINECOMMENT", "BLOCKCOMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "simpleC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MyIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(simpleCParser.ID, 0); }
		public MyIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myID; }
	}

	public final MyIDContext myID() throws RecognitionException {
		MyIDContext _localctx = new MyIDContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MyINTContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(simpleCParser.INT, 0); }
		public MyINTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myINT; }
	}

	public final MyINTContext myINT() throws RecognitionException {
		MyINTContext _localctx = new MyINTContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_myINT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MyDOUBLEContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(simpleCParser.DOUBLE, 0); }
		public MyDOUBLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myDOUBLE; }
	}

	public final MyDOUBLEContext myDOUBLE() throws RecognitionException {
		MyDOUBLEContext _localctx = new MyDOUBLEContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_myDOUBLE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(DOUBLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MyCHARContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(simpleCParser.CHAR, 0); }
		public MyCHARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myCHAR; }
	}

	public final MyCHARContext myCHAR() throws RecognitionException {
		MyCHARContext _localctx = new MyCHARContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_myCHAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MySTRINGContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(simpleCParser.STRING, 0); }
		public MySTRINGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mySTRING; }
	}

	public final MySTRINGContext mySTRING() throws RecognitionException {
		MySTRINGContext _localctx = new MySTRINGContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mySTRING);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MyLIBContext extends ParserRuleContext {
		public TerminalNode LIB() { return getToken(simpleCParser.LIB, 0); }
		public MyLIBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myLIB; }
	}

	public final MyLIBContext myLIB() throws RecognitionException {
		MyLIBContext _localctx = new MyLIBContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_myLIB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(LIB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MyTYPEContext extends ParserRuleContext {
		public MyTYPEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myTYPE; }
	}

	public final MyTYPEContext myTYPE() throws RecognitionException {
		MyTYPEContext _localctx = new MyTYPEContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_myTYPE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MyARRAYContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public MyINTContext myINT() {
			return getRuleContext(MyINTContext.class,0);
		}
		public MyARRAYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myARRAY; }
	}

	public final MyARRAYContext myARRAY() throws RecognitionException {
		MyARRAYContext _localctx = new MyARRAYContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_myARRAY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			myID();
			setState(91);
			match(T__4);
			setState(92);
			myINT();
			setState(93);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MyARRAYITEMContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MyARRAYITEMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myARRAYITEM; }
	}

	public final MyARRAYITEMContext myARRAYITEM() throws RecognitionException {
		MyARRAYITEMContext _localctx = new MyARRAYITEMContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_myARRAYITEM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			myID();
			setState(96);
			match(T__4);
			setState(97);
			expr(0);
			setState(98);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MyVOIDContext extends ParserRuleContext {
		public MyVOIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myVOID; }
	}

	public final MyVOIDContext myVOID() throws RecognitionException {
		MyVOIDContext _localctx = new MyVOIDContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_myVOID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<DefineBlockContext> defineBlock() {
			return getRuleContexts(DefineBlockContext.class);
		}
		public DefineBlockContext defineBlock(int i) {
			return getRuleContext(DefineBlockContext.class,i);
		}
		public List<MyFunctionContext> myFunction() {
			return getRuleContexts(MyFunctionContext.class);
		}
		public MyFunctionContext myFunction(int i) {
			return getRuleContext(MyFunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(102);
				include();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
				{
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(108);
					defineBlock();
					}
					break;
				case 2:
					{
					setState(109);
					myFunction();
					}
					break;
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeContext extends ParserRuleContext {
		public MyLIBContext myLIB() {
			return getRuleContext(MyLIBContext.class,0);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__7);
			setState(116);
			match(T__8);
			setState(117);
			myLIB();
			setState(118);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MyFunctionContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public DefineParamsContext defineParams() {
			return getRuleContext(DefineParamsContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public MyTYPEContext myTYPE() {
			return getRuleContext(MyTYPEContext.class,0);
		}
		public MyVOIDContext myVOID() {
			return getRuleContext(MyVOIDContext.class,0);
		}
		public MyFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myFunction; }
	}

	public final MyFunctionContext myFunction() throws RecognitionException {
		MyFunctionContext _localctx = new MyFunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_myFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
				{
				setState(120);
				myTYPE();
				}
				break;
			case T__6:
				{
				setState(121);
				myVOID();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124);
			myID();
			setState(125);
			match(T__10);
			setState(126);
			defineParams();
			setState(127);
			match(T__11);
			setState(128);
			match(T__12);
			setState(129);
			functionBody();
			setState(130);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineParamsContext extends ParserRuleContext {
		public List<DefineParamContext> defineParam() {
			return getRuleContexts(DefineParamContext.class);
		}
		public DefineParamContext defineParam(int i) {
			return getRuleContext(DefineParamContext.class,i);
		}
		public DefineParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineParams; }
	}

	public final DefineParamsContext defineParams() throws RecognitionException {
		DefineParamsContext _localctx = new DefineParamsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defineParams);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				defineParam();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(133);
					match(T__14);
					setState(134);
					defineParam();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineParamContext extends ParserRuleContext {
		public MyTYPEContext myTYPE() {
			return getRuleContext(MyTYPEContext.class,0);
		}
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public DefineParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineParam; }
	}

	public final DefineParamContext defineParam() throws RecognitionException {
		DefineParamContext _localctx = new DefineParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_defineParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			myTYPE();
			setState(144);
			myID();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			body();
			setState(147);
			returnBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(149);
						block();
						}
						break;
					case 2:
						{
						setState(150);
						func();
						setState(151);
						match(T__15);
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public DefineBlockContext defineBlock() {
			return getRuleContext(DefineBlockContext.class,0);
		}
		public AssignBlockContext assignBlock() {
			return getRuleContext(AssignBlockContext.class,0);
		}
		public IfBlocksContext ifBlocks() {
			return getRuleContext(IfBlocksContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				defineBlock();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				assignBlock();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				ifBlocks();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				whileBlock();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				forBlock();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				returnBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineBlockContext extends ParserRuleContext {
		public BaseInitialBlockContext baseInitialBlock() {
			return getRuleContext(BaseInitialBlockContext.class,0);
		}
		public ArrayInitialBlockContext arrayInitialBlock() {
			return getRuleContext(ArrayInitialBlockContext.class,0);
		}
		public DefineBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineBlock; }
	}

	public final DefineBlockContext defineBlock() throws RecognitionException {
		DefineBlockContext _localctx = new DefineBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_defineBlock);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				baseInitialBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				arrayInitialBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseInitialBlockContext extends ParserRuleContext {
		public List<MyIDContext> myID() {
			return getRuleContexts(MyIDContext.class);
		}
		public MyIDContext myID(int i) {
			return getRuleContext(MyIDContext.class,i);
		}
		public MyTYPEContext myTYPE() {
			return getRuleContext(MyTYPEContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BaseInitialBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseInitialBlock; }
	}

	public final BaseInitialBlockContext baseInitialBlock() throws RecognitionException {
		BaseInitialBlockContext _localctx = new BaseInitialBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_baseInitialBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170);
			myTYPE();
			}
			setState(171);
			myID();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(172);
				match(T__16);
				setState(173);
				expr(0);
				}
			}

			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(176);
				match(T__14);
				setState(177);
				myID();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(178);
					match(T__16);
					setState(179);
					expr(0);
					}
				}

				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitialBlockContext extends ParserRuleContext {
		public MyTYPEContext myTYPE() {
			return getRuleContext(MyTYPEContext.class,0);
		}
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public MyINTContext myINT() {
			return getRuleContext(MyINTContext.class,0);
		}
		public ArrayInitialBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitialBlock; }
	}

	public final ArrayInitialBlockContext arrayInitialBlock() throws RecognitionException {
		ArrayInitialBlockContext _localctx = new ArrayInitialBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayInitialBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			myTYPE();
			setState(190);
			myID();
			setState(191);
			match(T__4);
			setState(192);
			myINT();
			setState(193);
			match(T__5);
			setState(194);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignBlockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<MyIDContext> myID() {
			return getRuleContexts(MyIDContext.class);
		}
		public MyIDContext myID(int i) {
			return getRuleContext(MyIDContext.class,i);
		}
		public List<MyARRAYITEMContext> myARRAYITEM() {
			return getRuleContexts(MyARRAYITEMContext.class);
		}
		public MyARRAYITEMContext myARRAYITEM(int i) {
			return getRuleContext(MyARRAYITEMContext.class,i);
		}
		public AssignBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignBlock; }
	}

	public final AssignBlockContext assignBlock() throws RecognitionException {
		AssignBlockContext _localctx = new AssignBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(196);
						myID();
						}
						break;
					case 2:
						{
						setState(197);
						myARRAYITEM();
						}
						break;
					}
					setState(200);
					match(T__16);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(204); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(206);
			expr(0);
			setState(207);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlocksContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public List<ElifBlockContext> elifBlock() {
			return getRuleContexts(ElifBlockContext.class);
		}
		public ElifBlockContext elifBlock(int i) {
			return getRuleContext(ElifBlockContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlocks; }
	}

	public final IfBlocksContext ifBlocks() throws RecognitionException {
		IfBlocksContext _localctx = new IfBlocksContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifBlocks);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			ifBlock();
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					elifBlock();
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(216);
				elseBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__17);
			setState(220);
			match(T__10);
			setState(221);
			condition();
			setState(222);
			match(T__11);
			setState(223);
			match(T__12);
			setState(224);
			body();
			setState(225);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElifBlockContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifBlock; }
	}

	public final ElifBlockContext elifBlock() throws RecognitionException {
		ElifBlockContext _localctx = new ElifBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__18);
			setState(228);
			match(T__17);
			setState(229);
			match(T__10);
			setState(230);
			condition();
			setState(231);
			match(T__11);
			setState(232);
			match(T__12);
			setState(233);
			body();
			setState(234);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBlockContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__18);
			setState(237);
			match(T__12);
			setState(238);
			body();
			setState(239);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBlockContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__19);
			setState(244);
			match(T__10);
			setState(245);
			condition();
			setState(246);
			match(T__11);
			setState(247);
			match(T__12);
			setState(248);
			body();
			setState(249);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForBlockContext extends ParserRuleContext {
		public ForDefineBlockContext forDefineBlock() {
			return getRuleContext(ForDefineBlockContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForIteratorBlockContext forIteratorBlock() {
			return getRuleContext(ForIteratorBlockContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__20);
			setState(252);
			match(T__10);
			setState(253);
			forDefineBlock();
			setState(254);
			match(T__15);
			setState(255);
			condition();
			setState(256);
			match(T__15);
			setState(257);
			forIteratorBlock();
			setState(258);
			match(T__11);
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(259);
				match(T__12);
				setState(260);
				body();
				setState(261);
				match(T__13);
				}
				break;
			case T__15:
				{
				setState(263);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDefineBlockContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForDefineBlockContext forDefineBlock() {
			return getRuleContext(ForDefineBlockContext.class,0);
		}
		public ForDefineBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDefineBlock; }
	}

	public final ForDefineBlockContext forDefineBlock() throws RecognitionException {
		ForDefineBlockContext _localctx = new ForDefineBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forDefineBlock);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				myID();
				setState(267);
				match(T__16);
				setState(268);
				expr(0);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(269);
					match(T__14);
					setState(270);
					forDefineBlock();
					}
				}

				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForIteratorBlockContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForIteratorBlockContext forIteratorBlock() {
			return getRuleContext(ForIteratorBlockContext.class,0);
		}
		public ForIteratorBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIteratorBlock; }
	}

	public final ForIteratorBlockContext forIteratorBlock() throws RecognitionException {
		ForIteratorBlockContext _localctx = new ForIteratorBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forIteratorBlock);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				myID();
				setState(277);
				match(T__16);
				setState(278);
				expr(0);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(279);
					match(T__14);
					setState(280);
					forIteratorBlock();
					}
				}

				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnBlockContext extends ParserRuleContext {
		public MyINTContext myINT() {
			return getRuleContext(MyINTContext.class,0);
		}
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public ReturnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBlock; }
	}

	public final ReturnBlockContext returnBlock() throws RecognitionException {
		ReturnBlockContext _localctx = new ReturnBlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_returnBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__21);
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(287);
				myINT();
				}
				break;
			case ID:
				{
				setState(288);
				myID();
				}
				break;
			case T__15:
				break;
			default:
				break;
			}
			setState(291);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends ExprContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_addContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_addContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class StringContext extends ExprContext {
		public MySTRINGContext mySTRING() {
			return getRuleContext(MySTRINGContext.class,0);
		}
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DoubleContext extends ExprContext {
		public Token op;
		public MyDOUBLEContext myDOUBLE() {
			return getRuleContext(MyDOUBLEContext.class,0);
		}
		public DoubleContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_parensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_parensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_judgeContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_judgeContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntContext extends ExprContext {
		public Token op;
		public MyINTContext myINT() {
			return getRuleContext(MyINTContext.class,0);
		}
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_mulContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_mulContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_negContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_negContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_arrayitemContext extends ExprContext {
		public MyARRAYITEMContext myARRAYITEM() {
			return getRuleContext(MyARRAYITEMContext.class,0);
		}
		public Expr_arrayitemContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionContext extends ExprContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public FunctionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_orContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_orContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CharContext extends ExprContext {
		public MyCHARContext myCHAR() {
			return getRuleContext(MyCHARContext.class,0);
		}
		public CharContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_andContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_andContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new Expr_parensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(294);
				match(T__10);
				setState(295);
				expr(0);
				setState(296);
				match(T__11);
				}
				break;
			case 2:
				{
				_localctx = new Expr_negContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				((Expr_negContext)_localctx).op = match(T__22);
				setState(299);
				expr(13);
				}
				break;
			case 3:
				{
				_localctx = new Expr_arrayitemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				myARRAYITEM();
				}
				break;
			case 4:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(301);
					((IntContext)_localctx).op = match(T__27);
					}
				}

				setState(304);
				myINT();
				}
				break;
			case 5:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(305);
					((DoubleContext)_localctx).op = match(T__27);
					}
				}

				setState(308);
				myDOUBLE();
				}
				break;
			case 6:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				myCHAR();
				}
				break;
			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				mySTRING();
				}
				break;
			case 8:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311);
				myID();
				}
				break;
			case 9:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312);
				func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(330);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_mulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(316);
						((Expr_mulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
							((Expr_mulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(317);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new Expr_addContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(319);
						((Expr_addContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((Expr_addContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new Expr_judgeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(322);
						((Expr_judgeContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
							((Expr_judgeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new Expr_andContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(325);
						match(T__32);
						setState(326);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new Expr_orContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(327);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(328);
						match(T__33);
						setState(329);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public PrintfFunctionContext printfFunction() {
			return getRuleContext(PrintfFunctionContext.class,0);
		}
		public ScanfFunctionContext scanfFunction() {
			return getRuleContext(ScanfFunctionContext.class,0);
		}
		public SelfDefinedFunctionContext selfDefinedFunction() {
			return getRuleContext(SelfDefinedFunctionContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				{
				setState(335);
				printfFunction();
				}
				break;
			case T__35:
				{
				setState(336);
				scanfFunction();
				}
				break;
			case ID:
				{
				setState(337);
				selfDefinedFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintfFunctionContext extends ParserRuleContext {
		public MySTRINGContext mySTRING() {
			return getRuleContext(MySTRINGContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PrintfFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printfFunction; }
	}

	public final PrintfFunctionContext printfFunction() throws RecognitionException {
		PrintfFunctionContext _localctx = new PrintfFunctionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_printfFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__34);
			setState(341);
			match(T__10);
			setState(342);
			mySTRING();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(343);
				match(T__14);
				setState(344);
				expr(0);
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanfFunctionContext extends ParserRuleContext {
		public MySTRINGContext mySTRING() {
			return getRuleContext(MySTRINGContext.class,0);
		}
		public List<MyIDContext> myID() {
			return getRuleContexts(MyIDContext.class);
		}
		public MyIDContext myID(int i) {
			return getRuleContext(MyIDContext.class,i);
		}
		public ScanfFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanfFunction; }
	}

	public final ScanfFunctionContext scanfFunction() throws RecognitionException {
		ScanfFunctionContext _localctx = new ScanfFunctionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_scanfFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__35);
			setState(353);
			match(T__10);
			setState(354);
			mySTRING();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(355);
				match(T__14);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__36) {
					{
					setState(356);
					match(T__36);
					}
				}

				{
				setState(359);
				myID();
				}
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfDefinedFunctionContext extends ParserRuleContext {
		public List<MyIDContext> myID() {
			return getRuleContexts(MyIDContext.class);
		}
		public MyIDContext myID(int i) {
			return getRuleContext(MyIDContext.class,i);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public SelfDefinedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfDefinedFunction; }
	}

	public final SelfDefinedFunctionContext selfDefinedFunction() throws RecognitionException {
		SelfDefinedFunctionContext _localctx = new SelfDefinedFunctionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_selfDefinedFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			myID();
			setState(368);
			match(T__10);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(371);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DOUBLE:
				case CHAR:
				case STRING:
					{
					setState(369);
					argument();
					}
					break;
				case ID:
					{
					setState(370);
					myID();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(373);
					match(T__14);
					setState(376);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case DOUBLE:
					case CHAR:
					case STRING:
						{
						setState(374);
						argument();
						}
						break;
					case ID:
						{
						setState(375);
						myID();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(385);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public MyINTContext myINT() {
			return getRuleContext(MyINTContext.class,0);
		}
		public MyDOUBLEContext myDOUBLE() {
			return getRuleContext(MyDOUBLEContext.class,0);
		}
		public MyCHARContext myCHAR() {
			return getRuleContext(MyCHARContext.class,0);
		}
		public MySTRINGContext mySTRING() {
			return getRuleContext(MySTRINGContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_argument);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				myINT();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				myDOUBLE();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				myCHAR();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				mySTRING();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u018c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\7\fj\n\f\f\f\16\fm\13\f\3\f\3\f\7\fq\n\f\f\f\16\ft\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16}\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\7\17\u008a\n\17\f\17\16\17\u008d\13\17\3\17"+
		"\5\17\u0090\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22"+
		"\u009c\n\22\f\22\16\22\u009f\13\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00a7\n\23\3\24\3\24\5\24\u00ab\n\24\3\25\3\25\3\25\3\25\5\25\u00b1\n"+
		"\25\3\25\3\25\3\25\3\25\5\25\u00b7\n\25\7\25\u00b9\n\25\f\25\16\25\u00bc"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00c9"+
		"\n\27\3\27\3\27\6\27\u00cd\n\27\r\27\16\27\u00ce\3\27\3\27\3\27\3\30\3"+
		"\30\7\30\u00d6\n\30\f\30\16\30\u00d9\13\30\3\30\5\30\u00dc\n\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\5\36\u010b\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u0112\n\37\3\37"+
		"\5\37\u0115\n\37\3 \3 \3 \3 \3 \5 \u011c\n \3 \5 \u011f\n \3!\3!\3!\5"+
		"!\u0124\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0131\n\"\3\""+
		"\3\"\5\"\u0135\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u013c\n\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u014d\n\"\f\"\16\"\u0150"+
		"\13\"\3#\3#\3#\5#\u0155\n#\3$\3$\3$\3$\3$\7$\u015c\n$\f$\16$\u015f\13"+
		"$\3$\3$\3%\3%\3%\3%\3%\5%\u0168\n%\3%\7%\u016b\n%\f%\16%\u016e\13%\3%"+
		"\3%\3&\3&\3&\3&\5&\u0176\n&\3&\3&\3&\5&\u017b\n&\7&\u017d\n&\f&\16&\u0180"+
		"\13&\5&\u0182\n&\3&\3&\3\'\3\'\3\'\3\'\5\'\u018a\n\'\3\'\2\3B(\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\6\3"+
		"\2\3\6\3\2\32\34\3\2\35\36\4\2\13\f\37\"\2\u019c\2N\3\2\2\2\4P\3\2\2\2"+
		"\6R\3\2\2\2\bT\3\2\2\2\nV\3\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20\\\3\2\2\2"+
		"\22a\3\2\2\2\24f\3\2\2\2\26k\3\2\2\2\30u\3\2\2\2\32|\3\2\2\2\34\u008f"+
		"\3\2\2\2\36\u0091\3\2\2\2 \u0094\3\2\2\2\"\u009d\3\2\2\2$\u00a6\3\2\2"+
		"\2&\u00aa\3\2\2\2(\u00ac\3\2\2\2*\u00bf\3\2\2\2,\u00cc\3\2\2\2.\u00d3"+
		"\3\2\2\2\60\u00dd\3\2\2\2\62\u00e5\3\2\2\2\64\u00ee\3\2\2\2\66\u00f3\3"+
		"\2\2\28\u00f5\3\2\2\2:\u00fd\3\2\2\2<\u0114\3\2\2\2>\u011e\3\2\2\2@\u0120"+
		"\3\2\2\2B\u013b\3\2\2\2D\u0154\3\2\2\2F\u0156\3\2\2\2H\u0162\3\2\2\2J"+
		"\u0171\3\2\2\2L\u0189\3\2\2\2NO\7(\2\2O\3\3\2\2\2PQ\7)\2\2Q\5\3\2\2\2"+
		"RS\7*\2\2S\7\3\2\2\2TU\7+\2\2U\t\3\2\2\2VW\7,\2\2W\13\3\2\2\2XY\7-\2\2"+
		"Y\r\3\2\2\2Z[\t\2\2\2[\17\3\2\2\2\\]\5\2\2\2]^\7\7\2\2^_\5\4\3\2_`\7\b"+
		"\2\2`\21\3\2\2\2ab\5\2\2\2bc\7\7\2\2cd\5B\"\2de\7\b\2\2e\23\3\2\2\2fg"+
		"\7\t\2\2g\25\3\2\2\2hj\5\30\r\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2"+
		"\2lr\3\2\2\2mk\3\2\2\2nq\5&\24\2oq\5\32\16\2pn\3\2\2\2po\3\2\2\2qt\3\2"+
		"\2\2rp\3\2\2\2rs\3\2\2\2s\27\3\2\2\2tr\3\2\2\2uv\7\n\2\2vw\7\13\2\2wx"+
		"\5\f\7\2xy\7\f\2\2y\31\3\2\2\2z}\5\16\b\2{}\5\24\13\2|z\3\2\2\2|{\3\2"+
		"\2\2}~\3\2\2\2~\177\5\2\2\2\177\u0080\7\r\2\2\u0080\u0081\5\34\17\2\u0081"+
		"\u0082\7\16\2\2\u0082\u0083\7\17\2\2\u0083\u0084\5 \21\2\u0084\u0085\7"+
		"\20\2\2\u0085\33\3\2\2\2\u0086\u008b\5\36\20\2\u0087\u0088\7\21\2\2\u0088"+
		"\u008a\5\36\20\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u0090\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u008e\3\2\2\2\u0090\35\3\2\2"+
		"\2\u0091\u0092\5\16\b\2\u0092\u0093\5\2\2\2\u0093\37\3\2\2\2\u0094\u0095"+
		"\5\"\22\2\u0095\u0096\5@!\2\u0096!\3\2\2\2\u0097\u009c\5$\23\2\u0098\u0099"+
		"\5D#\2\u0099\u009a\7\22\2\2\u009a\u009c\3\2\2\2\u009b\u0097\3\2\2\2\u009b"+
		"\u0098\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e#\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a7\5&\24\2\u00a1\u00a7"+
		"\5,\27\2\u00a2\u00a7\5.\30\2\u00a3\u00a7\58\35\2\u00a4\u00a7\5:\36\2\u00a5"+
		"\u00a7\5@!\2\u00a6\u00a0\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2"+
		"\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7%"+
		"\3\2\2\2\u00a8\u00ab\5(\25\2\u00a9\u00ab\5*\26\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\'\3\2\2\2\u00ac\u00ad\5\16\b\2\u00ad\u00b0\5\2\2"+
		"\2\u00ae\u00af\7\23\2\2\u00af\u00b1\5B\"\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00ba\3\2\2\2\u00b2\u00b3\7\21\2\2\u00b3\u00b6\5\2\2\2"+
		"\u00b4\u00b5\7\23\2\2\u00b5\u00b7\5B\"\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00be\7\22\2\2\u00be)\3\2\2\2\u00bf\u00c0\5\16\b\2\u00c0\u00c1"+
		"\5\2\2\2\u00c1\u00c2\7\7\2\2\u00c2\u00c3\5\4\3\2\u00c3\u00c4\7\b\2\2\u00c4"+
		"\u00c5\7\22\2\2\u00c5+\3\2\2\2\u00c6\u00c9\5\2\2\2\u00c7\u00c9\5\22\n"+
		"\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb"+
		"\7\23\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\u00ce\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\5B\"\2\u00d1\u00d2\7\22\2\2\u00d2-\3\2\2\2\u00d3\u00d7\5\60\31\2\u00d4"+
		"\u00d6\5\62\32\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00dc\5\64\33\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc/\3\2\2"+
		"\2\u00dd\u00de\7\24\2\2\u00de\u00df\7\r\2\2\u00df\u00e0\5\66\34\2\u00e0"+
		"\u00e1\7\16\2\2\u00e1\u00e2\7\17\2\2\u00e2\u00e3\5\"\22\2\u00e3\u00e4"+
		"\7\20\2\2\u00e4\61\3\2\2\2\u00e5\u00e6\7\25\2\2\u00e6\u00e7\7\24\2\2\u00e7"+
		"\u00e8\7\r\2\2\u00e8\u00e9\5\66\34\2\u00e9\u00ea\7\16\2\2\u00ea\u00eb"+
		"\7\17\2\2\u00eb\u00ec\5\"\22\2\u00ec\u00ed\7\20\2\2\u00ed\63\3\2\2\2\u00ee"+
		"\u00ef\7\25\2\2\u00ef\u00f0\7\17\2\2\u00f0\u00f1\5\"\22\2\u00f1\u00f2"+
		"\7\20\2\2\u00f2\65\3\2\2\2\u00f3\u00f4\5B\"\2\u00f4\67\3\2\2\2\u00f5\u00f6"+
		"\7\26\2\2\u00f6\u00f7\7\r\2\2\u00f7\u00f8\5\66\34\2\u00f8\u00f9\7\16\2"+
		"\2\u00f9\u00fa\7\17\2\2\u00fa\u00fb\5\"\22\2\u00fb\u00fc\7\20\2\2\u00fc"+
		"9\3\2\2\2\u00fd\u00fe\7\27\2\2\u00fe\u00ff\7\r\2\2\u00ff\u0100\5<\37\2"+
		"\u0100\u0101\7\22\2\2\u0101\u0102\5\66\34\2\u0102\u0103\7\22\2\2\u0103"+
		"\u0104\5> \2\u0104\u010a\7\16\2\2\u0105\u0106\7\17\2\2\u0106\u0107\5\""+
		"\22\2\u0107\u0108\7\20\2\2\u0108\u010b\3\2\2\2\u0109\u010b\7\22\2\2\u010a"+
		"\u0105\3\2\2\2\u010a\u0109\3\2\2\2\u010b;\3\2\2\2\u010c\u010d\5\2\2\2"+
		"\u010d\u010e\7\23\2\2\u010e\u0111\5B\"\2\u010f\u0110\7\21\2\2\u0110\u0112"+
		"\5<\37\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u010c\3\2\2\2\u0114\u0113\3\2\2\2\u0115=\3\2\2\2"+
		"\u0116\u0117\5\2\2\2\u0117\u0118\7\23\2\2\u0118\u011b\5B\"\2\u0119\u011a"+
		"\7\21\2\2\u011a\u011c\5> \2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0116\3\2\2\2\u011e\u011d\3\2"+
		"\2\2\u011f?\3\2\2\2\u0120\u0123\7\30\2\2\u0121\u0124\5\4\3\2\u0122\u0124"+
		"\5\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\7\22\2\2\u0126A\3\2\2\2\u0127\u0128\b\"\1\2"+
		"\u0128\u0129\7\r\2\2\u0129\u012a\5B\"\2\u012a\u012b\7\16\2\2\u012b\u013c"+
		"\3\2\2\2\u012c\u012d\7\31\2\2\u012d\u013c\5B\"\17\u012e\u013c\5\22\n\2"+
		"\u012f\u0131\7\36\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u013c\5\4\3\2\u0133\u0135\7\36\2\2\u0134\u0133\3\2\2\2"+
		"\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013c\5\6\4\2\u0137\u013c"+
		"\5\b\5\2\u0138\u013c\5\n\6\2\u0139\u013c\5\2\2\2\u013a\u013c\5D#\2\u013b"+
		"\u0127\3\2\2\2\u013b\u012c\3\2\2\2\u013b\u012e\3\2\2\2\u013b\u0130\3\2"+
		"\2\2\u013b\u0134\3\2\2\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u014e\3\2\2\2\u013d\u013e\f\16"+
		"\2\2\u013e\u013f\t\3\2\2\u013f\u014d\5B\"\17\u0140\u0141\f\r\2\2\u0141"+
		"\u0142\t\4\2\2\u0142\u014d\5B\"\16\u0143\u0144\f\f\2\2\u0144\u0145\t\5"+
		"\2\2\u0145\u014d\5B\"\r\u0146\u0147\f\13\2\2\u0147\u0148\7#\2\2\u0148"+
		"\u014d\5B\"\f\u0149\u014a\f\n\2\2\u014a\u014b\7$\2\2\u014b\u014d\5B\""+
		"\13\u014c\u013d\3\2\2\2\u014c\u0140\3\2\2\2\u014c\u0143\3\2\2\2\u014c"+
		"\u0146\3\2\2\2\u014c\u0149\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014fC\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0155"+
		"\5F$\2\u0152\u0155\5H%\2\u0153\u0155\5J&\2\u0154\u0151\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0153\3\2\2\2\u0155E\3\2\2\2\u0156\u0157\7%\2\2\u0157\u0158"+
		"\7\r\2\2\u0158\u015d\5\n\6\2\u0159\u015a\7\21\2\2\u015a\u015c\5B\"\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7\16\2\2\u0161"+
		"G\3\2\2\2\u0162\u0163\7&\2\2\u0163\u0164\7\r\2\2\u0164\u016c\5\n\6\2\u0165"+
		"\u0167\7\21\2\2\u0166\u0168\7\'\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3"+
		"\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\5\2\2\2\u016a\u0165\3\2\2\2\u016b"+
		"\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7\16\2\2\u0170I\3\2\2\2\u0171\u0172"+
		"\5\2\2\2\u0172\u0181\7\r\2\2\u0173\u0176\5L\'\2\u0174\u0176\5\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176\u017e\3\2\2\2\u0177\u017a\7\21"+
		"\2\2\u0178\u017b\5L\'\2\u0179\u017b\5\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u0177\3\2\2\2\u017d\u0180\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0175\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0184\7\16\2\2\u0184K\3\2\2\2\u0185\u018a\5\4\3\2\u0186\u018a"+
		"\5\6\4\2\u0187\u018a\5\b\5\2\u0188\u018a\5\n\6\2\u0189\u0185\3\2\2\2\u0189"+
		"\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018aM\3\2\2\2"+
		"\'kpr|\u008b\u008f\u009b\u009d\u00a6\u00aa\u00b0\u00b6\u00ba\u00c8\u00ce"+
		"\u00d7\u00db\u010a\u0111\u0114\u011b\u011e\u0123\u0130\u0134\u013b\u014c"+
		"\u014e\u0154\u015d\u0167\u016c\u0175\u017a\u017e\u0181\u0189";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}