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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, LIB=40, ID=41, INT=42, DOUBLE=43, CHAR=44, STRING=45, OPERATOR=46, 
		CONJUNCTION=47, INLINECOMMENT=48, BLOCKCOMMENT=49, SPACE=50;
	public static final int
		RULE_program = 0, RULE_include = 1, RULE_functionDef = 2, RULE_functionHeaderDef = 3, 
		RULE_functionParamsDef = 4, RULE_functionParamDef = 5, RULE_functionBodyDef = 6, 
		RULE_block = 7, RULE_sentence = 8, RULE_defineSentence = 9, RULE_baseDefineSentence = 10, 
		RULE_arrayDefineSentence = 11, RULE_assignSentence = 12, RULE_ifSentenceBlock = 13, 
		RULE_ifSentence = 14, RULE_elifSentence = 15, RULE_elseSentence = 16, 
		RULE_condition = 17, RULE_whileSentence = 18, RULE_forSentence = 19, RULE_forDefineSentence = 20, 
		RULE_forIteratorSentence = 21, RULE_returnSentence = 22, RULE_continueSentence = 23, 
		RULE_breakSentence = 24, RULE_expr = 25, RULE_lib = 26, RULE_myID = 27, 
		RULE_myInt = 28, RULE_myDouble = 29, RULE_myChar = 30, RULE_myString = 31, 
		RULE_operator = 32, RULE_conjunction = 33, RULE_inLineComment = 34, RULE_blockComment = 35, 
		RULE_space = 36, RULE_myType = 37, RULE_array = 38, RULE_arrayItem = 39, 
		RULE_myVoid = 40, RULE_argument = 41, RULE_function = 42, RULE_selfDefinedFunc = 43, 
		RULE_printFunc = 44, RULE_scanfFunc = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "include", "functionDef", "functionHeaderDef", "functionParamsDef", 
			"functionParamDef", "functionBodyDef", "block", "sentence", "defineSentence", 
			"baseDefineSentence", "arrayDefineSentence", "assignSentence", "ifSentenceBlock", 
			"ifSentence", "elifSentence", "elseSentence", "condition", "whileSentence", 
			"forSentence", "forDefineSentence", "forIteratorSentence", "returnSentence", 
			"continueSentence", "breakSentence", "expr", "lib", "myID", "myInt", 
			"myDouble", "myChar", "myString", "operator", "conjunction", "inLineComment", 
			"blockComment", "space", "myType", "array", "arrayItem", "myVoid", "argument", 
			"function", "selfDefinedFunc", "printFunc", "scanfFunc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'>'", "'('", "')'", "','", "'{'", "'}'", 
			"'='", "';'", "'['", "']'", "'if'", "'else'", "'while'", "'for'", "'return'", 
			"'continue;'", "'break;'", "'!'", "'&&'", "'||'", "'*'", "'/'", "'%'", 
			"'+'", "'-'", "'=='", "'!='", "'<='", "'>='", "'int'", "'double'", "'char'", 
			"'string'", "'void'", "'printf'", "'scanf'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "LIB", "ID", "INT", "DOUBLE", "CHAR", "STRING", 
			"OPERATOR", "CONJUNCTION", "INLINECOMMENT", "BLOCKCOMMENT", "SPACE"
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

	public static class ProgramContext extends ParserRuleContext {
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<DefineSentenceContext> defineSentence() {
			return getRuleContexts(DefineSentenceContext.class);
		}
		public DefineSentenceContext defineSentence(int i) {
			return getRuleContext(DefineSentenceContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(92);
				include();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(98);
					defineSentence();
					}
					break;
				case 2:
					{
					setState(99);
					functionDef();
					}
					break;
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0) );
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
		public LibContext lib() {
			return getRuleContext(LibContext.class,0);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__0);
			setState(105);
			match(T__1);
			setState(106);
			lib();
			setState(107);
			match(T__2);
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

	public static class FunctionDefContext extends ParserRuleContext {
		public FunctionHeaderDefContext functionHeaderDef() {
			return getRuleContext(FunctionHeaderDefContext.class,0);
		}
		public FunctionBodyDefContext functionBodyDef() {
			return getRuleContext(FunctionBodyDefContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			functionHeaderDef();
			setState(110);
			functionBodyDef();
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

	public static class FunctionHeaderDefContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public FunctionParamsDefContext functionParamsDef() {
			return getRuleContext(FunctionParamsDefContext.class,0);
		}
		public MyTypeContext myType() {
			return getRuleContext(MyTypeContext.class,0);
		}
		public MyVoidContext myVoid() {
			return getRuleContext(MyVoidContext.class,0);
		}
		public FunctionHeaderDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHeaderDef; }
	}

	public final FunctionHeaderDefContext functionHeaderDef() throws RecognitionException {
		FunctionHeaderDefContext _localctx = new FunctionHeaderDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionHeaderDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
				{
				setState(112);
				myType();
				}
				break;
			case T__35:
				{
				setState(113);
				myVoid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(116);
			myID();
			setState(117);
			match(T__3);
			setState(118);
			functionParamsDef();
			setState(119);
			match(T__4);
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

	public static class FunctionParamsDefContext extends ParserRuleContext {
		public List<FunctionParamDefContext> functionParamDef() {
			return getRuleContexts(FunctionParamDefContext.class);
		}
		public FunctionParamDefContext functionParamDef(int i) {
			return getRuleContext(FunctionParamDefContext.class,i);
		}
		public FunctionParamsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParamsDef; }
	}

	public final FunctionParamsDefContext functionParamsDef() throws RecognitionException {
		FunctionParamsDefContext _localctx = new FunctionParamsDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionParamsDef);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
					{
					{
					setState(121);
					functionParamDef();
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(122);
						match(T__5);
						setState(123);
						functionParamDef();
						}
						}
						setState(128);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FunctionParamDefContext extends ParserRuleContext {
		public MyTypeContext myType() {
			return getRuleContext(MyTypeContext.class,0);
		}
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public FunctionParamDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParamDef; }
	}

	public final FunctionParamDefContext functionParamDef() throws RecognitionException {
		FunctionParamDefContext _localctx = new FunctionParamDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionParamDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			myType();
			setState(138);
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

	public static class FunctionBodyDefContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionBodyDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBodyDef; }
	}

	public final FunctionBodyDefContext functionBodyDef() throws RecognitionException {
		FunctionBodyDefContext _localctx = new FunctionBodyDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionBodyDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__6);
			setState(141);
			block();
			setState(142);
			match(T__7);
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
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << ID))) != 0)) {
				{
				{
				setState(144);
				sentence();
				}
				}
				setState(149);
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

	public static class SentenceContext extends ParserRuleContext {
		public DefineSentenceContext defineSentence() {
			return getRuleContext(DefineSentenceContext.class,0);
		}
		public AssignSentenceContext assignSentence() {
			return getRuleContext(AssignSentenceContext.class,0);
		}
		public IfSentenceBlockContext ifSentenceBlock() {
			return getRuleContext(IfSentenceBlockContext.class,0);
		}
		public WhileSentenceContext whileSentence() {
			return getRuleContext(WhileSentenceContext.class,0);
		}
		public ForSentenceContext forSentence() {
			return getRuleContext(ForSentenceContext.class,0);
		}
		public ReturnSentenceContext returnSentence() {
			return getRuleContext(ReturnSentenceContext.class,0);
		}
		public ContinueSentenceContext continueSentence() {
			return getRuleContext(ContinueSentenceContext.class,0);
		}
		public BreakSentenceContext breakSentence() {
			return getRuleContext(BreakSentenceContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(150);
				defineSentence();
				}
				break;
			case 2:
				{
				setState(151);
				assignSentence();
				}
				break;
			case 3:
				{
				setState(152);
				ifSentenceBlock();
				}
				break;
			case 4:
				{
				setState(153);
				whileSentence();
				}
				break;
			case 5:
				{
				setState(154);
				forSentence();
				}
				break;
			case 6:
				{
				setState(155);
				returnSentence();
				}
				break;
			case 7:
				{
				setState(156);
				continueSentence();
				}
				break;
			case 8:
				{
				setState(157);
				breakSentence();
				}
				break;
			case 9:
				{
				setState(158);
				function();
				}
				break;
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

	public static class DefineSentenceContext extends ParserRuleContext {
		public BaseDefineSentenceContext baseDefineSentence() {
			return getRuleContext(BaseDefineSentenceContext.class,0);
		}
		public ArrayDefineSentenceContext arrayDefineSentence() {
			return getRuleContext(ArrayDefineSentenceContext.class,0);
		}
		public DefineSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineSentence; }
	}

	public final DefineSentenceContext defineSentence() throws RecognitionException {
		DefineSentenceContext _localctx = new DefineSentenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defineSentence);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				baseDefineSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				arrayDefineSentence();
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

	public static class BaseDefineSentenceContext extends ParserRuleContext {
		public MyTypeContext myType() {
			return getRuleContext(MyTypeContext.class,0);
		}
		public List<MyIDContext> myID() {
			return getRuleContexts(MyIDContext.class);
		}
		public MyIDContext myID(int i) {
			return getRuleContext(MyIDContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BaseDefineSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseDefineSentence; }
	}

	public final BaseDefineSentenceContext baseDefineSentence() throws RecognitionException {
		BaseDefineSentenceContext _localctx = new BaseDefineSentenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_baseDefineSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			myType();
			setState(166);
			myID();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(167);
				match(T__8);
				setState(168);
				expr(0);
				}
			}

			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(171);
				match(T__5);
				setState(172);
				myID();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(173);
					match(T__8);
					setState(174);
					expr(0);
					}
				}

				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
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

	public static class ArrayDefineSentenceContext extends ParserRuleContext {
		public MyTypeContext myType() {
			return getRuleContext(MyTypeContext.class,0);
		}
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public MyIntContext myInt() {
			return getRuleContext(MyIntContext.class,0);
		}
		public ArrayDefineSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDefineSentence; }
	}

	public final ArrayDefineSentenceContext arrayDefineSentence() throws RecognitionException {
		ArrayDefineSentenceContext _localctx = new ArrayDefineSentenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayDefineSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			myType();
			setState(185);
			myID();
			setState(186);
			match(T__10);
			setState(187);
			myInt();
			setState(188);
			match(T__11);
			setState(189);
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

	public static class AssignSentenceContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ArrayItemContext> arrayItem() {
			return getRuleContexts(ArrayItemContext.class);
		}
		public ArrayItemContext arrayItem(int i) {
			return getRuleContext(ArrayItemContext.class,i);
		}
		public List<MyIDContext> myID() {
			return getRuleContexts(MyIDContext.class);
		}
		public MyIDContext myID(int i) {
			return getRuleContext(MyIDContext.class,i);
		}
		public AssignSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignSentence; }
	}

	public final AssignSentenceContext assignSentence() throws RecognitionException {
		AssignSentenceContext _localctx = new AssignSentenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignSentence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(191);
						arrayItem();
						}
						break;
					case 2:
						{
						setState(192);
						myID();
						}
						break;
					}
					setState(195);
					match(T__8);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(199); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(201);
			expr(0);
			setState(202);
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

	public static class IfSentenceBlockContext extends ParserRuleContext {
		public IfSentenceContext ifSentence() {
			return getRuleContext(IfSentenceContext.class,0);
		}
		public List<ElifSentenceContext> elifSentence() {
			return getRuleContexts(ElifSentenceContext.class);
		}
		public ElifSentenceContext elifSentence(int i) {
			return getRuleContext(ElifSentenceContext.class,i);
		}
		public ElseSentenceContext elseSentence() {
			return getRuleContext(ElseSentenceContext.class,0);
		}
		public IfSentenceBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSentenceBlock; }
	}

	public final IfSentenceBlockContext ifSentenceBlock() throws RecognitionException {
		IfSentenceBlockContext _localctx = new IfSentenceBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifSentenceBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			ifSentence();
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					elifSentence();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(211);
				elseSentence();
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

	public static class IfSentenceContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSentence; }
	}

	public final IfSentenceContext ifSentence() throws RecognitionException {
		IfSentenceContext _localctx = new IfSentenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__12);
			setState(215);
			match(T__3);
			setState(216);
			condition();
			setState(217);
			match(T__4);
			setState(218);
			match(T__6);
			setState(219);
			block();
			setState(220);
			match(T__7);
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

	public static class ElifSentenceContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElifSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifSentence; }
	}

	public final ElifSentenceContext elifSentence() throws RecognitionException {
		ElifSentenceContext _localctx = new ElifSentenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elifSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__13);
			setState(223);
			match(T__12);
			setState(224);
			match(T__3);
			setState(225);
			condition();
			setState(226);
			match(T__4);
			setState(227);
			match(T__6);
			setState(228);
			block();
			setState(229);
			match(T__7);
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

	public static class ElseSentenceContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseSentence; }
	}

	public final ElseSentenceContext elseSentence() throws RecognitionException {
		ElseSentenceContext _localctx = new ElseSentenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__13);
			setState(232);
			match(T__6);
			setState(233);
			block();
			setState(234);
			match(T__7);
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
		enterRule(_localctx, 34, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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

	public static class WhileSentenceContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileSentence; }
	}

	public final WhileSentenceContext whileSentence() throws RecognitionException {
		WhileSentenceContext _localctx = new WhileSentenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__14);
			setState(239);
			match(T__3);
			setState(240);
			condition();
			setState(241);
			match(T__4);
			setState(242);
			match(T__6);
			setState(243);
			block();
			setState(244);
			match(T__7);
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

	public static class ForSentenceContext extends ParserRuleContext {
		public ForDefineSentenceContext forDefineSentence() {
			return getRuleContext(ForDefineSentenceContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForIteratorSentenceContext forIteratorSentence() {
			return getRuleContext(ForIteratorSentenceContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forSentence; }
	}

	public final ForSentenceContext forSentence() throws RecognitionException {
		ForSentenceContext _localctx = new ForSentenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__15);
			setState(247);
			match(T__3);
			setState(248);
			forDefineSentence();
			setState(249);
			match(T__9);
			setState(250);
			condition();
			setState(251);
			match(T__9);
			setState(252);
			forIteratorSentence();
			setState(253);
			match(T__4);
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(254);
				match(T__6);
				setState(255);
				block();
				setState(256);
				match(T__7);
				}
				break;
			case T__9:
				{
				setState(258);
				match(T__9);
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

	public static class ForDefineSentenceContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MyTypeContext myType() {
			return getRuleContext(MyTypeContext.class,0);
		}
		public ForDefineSentenceContext forDefineSentence() {
			return getRuleContext(ForDefineSentenceContext.class,0);
		}
		public ForDefineSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDefineSentence; }
	}

	public final ForDefineSentenceContext forDefineSentence() throws RecognitionException {
		ForDefineSentenceContext _localctx = new ForDefineSentenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forDefineSentence);
		int _la;
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
					{
					setState(261);
					myType();
					}
				}

				setState(264);
				myID();
				setState(265);
				match(T__8);
				setState(266);
				expr(0);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(267);
					match(T__5);
					setState(268);
					forDefineSentence();
					}
				}

				}
				break;
			case T__9:
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

	public static class ForIteratorSentenceContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForIteratorSentenceContext forIteratorSentence() {
			return getRuleContext(ForIteratorSentenceContext.class,0);
		}
		public ForIteratorSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIteratorSentence; }
	}

	public final ForIteratorSentenceContext forIteratorSentence() throws RecognitionException {
		ForIteratorSentenceContext _localctx = new ForIteratorSentenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forIteratorSentence);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				myID();
				setState(275);
				match(T__8);
				setState(276);
				expr(0);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(277);
					match(T__5);
					setState(278);
					forIteratorSentence();
					}
				}

				}
				break;
			case T__4:
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

	public static class ReturnSentenceContext extends ParserRuleContext {
		public MyIntContext myInt() {
			return getRuleContext(MyIntContext.class,0);
		}
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public MyDoubleContext myDouble() {
			return getRuleContext(MyDoubleContext.class,0);
		}
		public ReturnSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSentence; }
	}

	public final ReturnSentenceContext returnSentence() throws RecognitionException {
		ReturnSentenceContext _localctx = new ReturnSentenceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__16);
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(285);
				myInt();
				}
				break;
			case ID:
				{
				setState(286);
				myID();
				}
				break;
			case DOUBLE:
				{
				setState(287);
				myDouble();
				}
				break;
			case T__9:
				break;
			default:
				break;
			}
			setState(290);
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

	public static class ContinueSentenceContext extends ParserRuleContext {
		public ContinueSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueSentence; }
	}

	public final ContinueSentenceContext continueSentence() throws RecognitionException {
		ContinueSentenceContext _localctx = new ContinueSentenceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_continueSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__17);
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

	public static class BreakSentenceContext extends ParserRuleContext {
		public BreakSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakSentence; }
	}

	public final BreakSentenceContext breakSentence() throws RecognitionException {
		BreakSentenceContext _localctx = new BreakSentenceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_breakSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__18);
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
	public static class Expr_parensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_parensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_functionContext extends ExprContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Expr_functionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_judgeContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_judgeContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class Expr_identifierContext extends ExprContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public Expr_identifierContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_intContext extends ExprContext {
		public Token op;
		public MyIntContext myInt() {
			return getRuleContext(MyIntContext.class,0);
		}
		public Expr_intContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_negContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_negContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_arrayitemContext extends ExprContext {
		public ArrayItemContext arrayItem() {
			return getRuleContext(ArrayItemContext.class,0);
		}
		public Expr_arrayitemContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class Expr_charContext extends ExprContext {
		public MyCharContext myChar() {
			return getRuleContext(MyCharContext.class,0);
		}
		public Expr_charContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_stringContext extends ExprContext {
		public MyStringContext myString() {
			return getRuleContext(MyStringContext.class,0);
		}
		public Expr_stringContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class Expr_doubleContext extends ExprContext {
		public Token op;
		public MyDoubleContext myDouble() {
			return getRuleContext(MyDoubleContext.class,0);
		}
		public Expr_doubleContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new Expr_parensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(297);
				match(T__3);
				setState(298);
				expr(0);
				setState(299);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new Expr_negContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				((Expr_negContext)_localctx).op = match(T__19);
				setState(302);
				expr(13);
				}
				break;
			case 3:
				{
				_localctx = new Expr_identifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				myID();
				}
				break;
			case 4:
				{
				_localctx = new Expr_arrayitemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				arrayItem();
				}
				break;
			case 5:
				{
				_localctx = new Expr_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(305);
					((Expr_intContext)_localctx).op = match(T__26);
					}
				}

				setState(308);
				myInt();
				}
				break;
			case 6:
				{
				_localctx = new Expr_doubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(309);
					((Expr_doubleContext)_localctx).op = match(T__26);
					}
				}

				setState(312);
				myDouble();
				}
				break;
			case 7:
				{
				_localctx = new Expr_charContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				myChar();
				}
				break;
			case 8:
				{
				_localctx = new Expr_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				myString();
				}
				break;
			case 9:
				{
				_localctx = new Expr_functionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(332);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_andContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(319);
						match(T__20);
						setState(320);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new Expr_orContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(322);
						match(T__21);
						setState(323);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new Expr_mulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(325);
						((Expr_mulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
							((Expr_mulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(326);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new Expr_addContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(327);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(328);
						((Expr_addContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((Expr_addContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(329);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new Expr_judgeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(330);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(331);
						((Expr_judgeContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
							((Expr_judgeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class LibContext extends ParserRuleContext {
		public TerminalNode LIB() { return getToken(simpleCParser.LIB, 0); }
		public LibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lib; }
	}

	public final LibContext lib() throws RecognitionException {
		LibContext _localctx = new LibContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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

	public static class MyIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(simpleCParser.ID, 0); }
		public MyIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myID; }
	}

	public final MyIDContext myID() throws RecognitionException {
		MyIDContext _localctx = new MyIDContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_myID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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

	public static class MyIntContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(simpleCParser.INT, 0); }
		public MyIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myInt; }
	}

	public final MyIntContext myInt() throws RecognitionException {
		MyIntContext _localctx = new MyIntContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_myInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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

	public static class MyDoubleContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(simpleCParser.DOUBLE, 0); }
		public MyDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myDouble; }
	}

	public final MyDoubleContext myDouble() throws RecognitionException {
		MyDoubleContext _localctx = new MyDoubleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_myDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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

	public static class MyCharContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(simpleCParser.CHAR, 0); }
		public MyCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myChar; }
	}

	public final MyCharContext myChar() throws RecognitionException {
		MyCharContext _localctx = new MyCharContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_myChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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

	public static class MyStringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(simpleCParser.STRING, 0); }
		public MyStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myString; }
	}

	public final MyStringContext myString() throws RecognitionException {
		MyStringContext _localctx = new MyStringContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_myString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(simpleCParser.OPERATOR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(OPERATOR);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public TerminalNode CONJUNCTION() { return getToken(simpleCParser.CONJUNCTION, 0); }
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(CONJUNCTION);
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

	public static class InLineCommentContext extends ParserRuleContext {
		public TerminalNode INLINECOMMENT() { return getToken(simpleCParser.INLINECOMMENT, 0); }
		public InLineCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inLineComment; }
	}

	public final InLineCommentContext inLineComment() throws RecognitionException {
		InLineCommentContext _localctx = new InLineCommentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_inLineComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(INLINECOMMENT);
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

	public static class BlockCommentContext extends ParserRuleContext {
		public TerminalNode BLOCKCOMMENT() { return getToken(simpleCParser.BLOCKCOMMENT, 0); }
		public BlockCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockComment; }
	}

	public final BlockCommentContext blockComment() throws RecognitionException {
		BlockCommentContext _localctx = new BlockCommentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_blockComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(BLOCKCOMMENT);
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

	public static class SpaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(simpleCParser.SPACE, 0); }
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(SPACE);
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

	public static class MyTypeContext extends ParserRuleContext {
		public MyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myType; }
	}

	public final MyTypeContext myType() throws RecognitionException {
		MyTypeContext _localctx = new MyTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_myType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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

	public static class ArrayContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public MyIntContext myInt() {
			return getRuleContext(MyIntContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			myID();
			setState(362);
			match(T__10);
			setState(363);
			myInt();
			setState(364);
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

	public static class ArrayItemContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItem; }
	}

	public final ArrayItemContext arrayItem() throws RecognitionException {
		ArrayItemContext _localctx = new ArrayItemContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			myID();
			setState(367);
			match(T__10);
			setState(368);
			expr(0);
			setState(369);
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

	public static class MyVoidContext extends ParserRuleContext {
		public MyVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myVoid; }
	}

	public final MyVoidContext myVoid() throws RecognitionException {
		MyVoidContext _localctx = new MyVoidContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_myVoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__35);
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
		public MyIntContext myInt() {
			return getRuleContext(MyIntContext.class,0);
		}
		public MyDoubleContext myDouble() {
			return getRuleContext(MyDoubleContext.class,0);
		}
		public MyCharContext myChar() {
			return getRuleContext(MyCharContext.class,0);
		}
		public MyStringContext myString() {
			return getRuleContext(MyStringContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_argument);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				myInt();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				myDouble();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				myChar();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				myString();
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

	public static class FunctionContext extends ParserRuleContext {
		public PrintFuncContext printFunc() {
			return getRuleContext(PrintFuncContext.class,0);
		}
		public ScanfFuncContext scanfFunc() {
			return getRuleContext(ScanfFuncContext.class,0);
		}
		public SelfDefinedFuncContext selfDefinedFunc() {
			return getRuleContext(SelfDefinedFuncContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				{
				setState(379);
				printFunc();
				}
				break;
			case T__37:
				{
				setState(380);
				scanfFunc();
				}
				break;
			case ID:
				{
				setState(381);
				selfDefinedFunc();
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

	public static class SelfDefinedFuncContext extends ParserRuleContext {
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
		public SelfDefinedFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfDefinedFunc; }
	}

	public final SelfDefinedFuncContext selfDefinedFunc() throws RecognitionException {
		SelfDefinedFuncContext _localctx = new SelfDefinedFuncContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_selfDefinedFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			myID();
			setState(385);
			match(T__3);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(388);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DOUBLE:
				case CHAR:
				case STRING:
					{
					setState(386);
					argument();
					}
					break;
				case ID:
					{
					setState(387);
					myID();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(390);
					match(T__5);
					setState(393);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case DOUBLE:
					case CHAR:
					case STRING:
						{
						setState(391);
						argument();
						}
						break;
					case ID:
						{
						setState(392);
						myID();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(402);
			match(T__4);
			setState(403);
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

	public static class PrintFuncContext extends ParserRuleContext {
		public MyStringContext myString() {
			return getRuleContext(MyStringContext.class,0);
		}
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PrintFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunc; }
	}

	public final PrintFuncContext printFunc() throws RecognitionException {
		PrintFuncContext _localctx = new PrintFuncContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_printFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(T__36);
			setState(406);
			match(T__3);
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(407);
				myString();
				}
				break;
			case ID:
				{
				setState(408);
				myID();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(411);
				match(T__5);
				setState(412);
				expr(0);
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
			match(T__4);
			setState(419);
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

	public static class ScanfFuncContext extends ParserRuleContext {
		public MyStringContext myString() {
			return getRuleContext(MyStringContext.class,0);
		}
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public ArrayItemContext arrayItem() {
			return getRuleContext(ArrayItemContext.class,0);
		}
		public ScanfFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanfFunc; }
	}

	public final ScanfFuncContext scanfFunc() throws RecognitionException {
		ScanfFuncContext _localctx = new ScanfFuncContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_scanfFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(T__37);
			setState(422);
			match(T__3);
			setState(423);
			myString();
			{
			setState(424);
			match(T__5);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(425);
				match(T__38);
				}
			}

			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(428);
				myID();
				}
				break;
			case 2:
				{
				setState(429);
				arrayItem();
				}
				break;
			}
			}
			setState(432);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u01b5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\3\2\6\2g\n\2\r"+
		"\2\16\2h\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\5\5u\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\7\6\177\n\6\f\6\16\6\u0082\13\6\7\6\u0084\n\6\f\6"+
		"\16\6\u0087\13\6\3\6\5\6\u008a\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\7\t"+
		"\u0094\n\t\f\t\16\t\u0097\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00a2\n\n\3\13\3\13\5\13\u00a6\n\13\3\f\3\f\3\f\3\f\5\f\u00ac\n\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00b2\n\f\7\f\u00b4\n\f\f\f\16\f\u00b7\13\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00c4\n\16\3\16\3\16\6\16\u00c8"+
		"\n\16\r\16\16\16\u00c9\3\16\3\16\3\16\3\17\3\17\7\17\u00d1\n\17\f\17\16"+
		"\17\u00d4\13\17\3\17\5\17\u00d7\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0106\n\25\3\26"+
		"\5\26\u0109\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u0110\n\26\3\26\5\26\u0113"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u011a\n\27\3\27\5\27\u011d\n\27\3"+
		"\30\3\30\3\30\3\30\5\30\u0123\n\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0135\n\33\3\33\3\33"+
		"\5\33\u0139\n\33\3\33\3\33\3\33\3\33\5\33\u013f\n\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u014f\n\33"+
		"\f\33\16\33\u0152\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3*\3*\3+\3+\3+\3+\5+\u017c\n+\3,\3,\3,\5,\u0181\n,\3-\3-\3-\3"+
		"-\5-\u0187\n-\3-\3-\3-\5-\u018c\n-\7-\u018e\n-\f-\16-\u0191\13-\5-\u0193"+
		"\n-\3-\3-\3-\3.\3.\3.\3.\5.\u019c\n.\3.\3.\7.\u01a0\n.\f.\16.\u01a3\13"+
		".\3.\3.\3.\3/\3/\3/\3/\3/\5/\u01ad\n/\3/\3/\5/\u01b1\n/\3/\3/\3/\2\3\64"+
		"\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\\2\6\3\2\31\33\3\2\34\35\4\2\4\5\36!\3\2\"%\2\u01c3\2a\3"+
		"\2\2\2\4j\3\2\2\2\6o\3\2\2\2\bt\3\2\2\2\n\u0089\3\2\2\2\f\u008b\3\2\2"+
		"\2\16\u008e\3\2\2\2\20\u0095\3\2\2\2\22\u00a1\3\2\2\2\24\u00a5\3\2\2\2"+
		"\26\u00a7\3\2\2\2\30\u00ba\3\2\2\2\32\u00c7\3\2\2\2\34\u00ce\3\2\2\2\36"+
		"\u00d8\3\2\2\2 \u00e0\3\2\2\2\"\u00e9\3\2\2\2$\u00ee\3\2\2\2&\u00f0\3"+
		"\2\2\2(\u00f8\3\2\2\2*\u0112\3\2\2\2,\u011c\3\2\2\2.\u011e\3\2\2\2\60"+
		"\u0126\3\2\2\2\62\u0128\3\2\2\2\64\u013e\3\2\2\2\66\u0153\3\2\2\28\u0155"+
		"\3\2\2\2:\u0157\3\2\2\2<\u0159\3\2\2\2>\u015b\3\2\2\2@\u015d\3\2\2\2B"+
		"\u015f\3\2\2\2D\u0161\3\2\2\2F\u0163\3\2\2\2H\u0165\3\2\2\2J\u0167\3\2"+
		"\2\2L\u0169\3\2\2\2N\u016b\3\2\2\2P\u0170\3\2\2\2R\u0175\3\2\2\2T\u017b"+
		"\3\2\2\2V\u0180\3\2\2\2X\u0182\3\2\2\2Z\u0197\3\2\2\2\\\u01a7\3\2\2\2"+
		"^`\5\4\3\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bf\3\2\2\2ca\3\2\2\2"+
		"dg\5\24\13\2eg\5\6\4\2fd\3\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2i\3\3\2\2\2jk\7\3\2\2kl\7\4\2\2lm\5\66\34\2mn\7\5\2\2n\5\3\2\2\2op\5"+
		"\b\5\2pq\5\16\b\2q\7\3\2\2\2ru\5L\'\2su\5R*\2tr\3\2\2\2ts\3\2\2\2uv\3"+
		"\2\2\2vw\58\35\2wx\7\6\2\2xy\5\n\6\2yz\7\7\2\2z\t\3\2\2\2{\u0080\5\f\7"+
		"\2|}\7\b\2\2}\177\5\f\7\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083{\3\2\2\2"+
		"\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008a"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\13\3\2\2\2\u008b\u008c\5L\'\2\u008c\u008d\58\35\2"+
		"\u008d\r\3\2\2\2\u008e\u008f\7\t\2\2\u008f\u0090\5\20\t\2\u0090\u0091"+
		"\7\n\2\2\u0091\17\3\2\2\2\u0092\u0094\5\22\n\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\21\3\2\2"+
		"\2\u0097\u0095\3\2\2\2\u0098\u00a2\5\24\13\2\u0099\u00a2\5\32\16\2\u009a"+
		"\u00a2\5\34\17\2\u009b\u00a2\5&\24\2\u009c\u00a2\5(\25\2\u009d\u00a2\5"+
		".\30\2\u009e\u00a2\5\60\31\2\u009f\u00a2\5\62\32\2\u00a0\u00a2\5V,\2\u00a1"+
		"\u0098\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009a\3\2\2\2\u00a1\u009b\3\2"+
		"\2\2\u00a1\u009c\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\23\3\2\2\2\u00a3\u00a6\5\26\f"+
		"\2\u00a4\u00a6\5\30\r\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\25\3\2\2\2\u00a7\u00a8\5L\'\2\u00a8\u00ab\58\35\2\u00a9\u00aa\7\13\2"+
		"\2\u00aa\u00ac\5\64\33\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00b5\3\2\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00b1\58\35\2\u00af\u00b0\7\13"+
		"\2\2\u00b0\u00b2\5\64\33\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00b9\7\f\2\2\u00b9\27\3\2\2\2\u00ba\u00bb\5L\'\2\u00bb\u00bc\58\35\2"+
		"\u00bc\u00bd\7\r\2\2\u00bd\u00be\5:\36\2\u00be\u00bf\7\16\2\2\u00bf\u00c0"+
		"\7\f\2\2\u00c0\31\3\2\2\2\u00c1\u00c4\5P)\2\u00c2\u00c4\58\35\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\13"+
		"\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\5\64"+
		"\33\2\u00cc\u00cd\7\f\2\2\u00cd\33\3\2\2\2\u00ce\u00d2\5\36\20\2\u00cf"+
		"\u00d1\5 \21\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d7\5\"\22\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\35\3\2\2"+
		"\2\u00d8\u00d9\7\17\2\2\u00d9\u00da\7\6\2\2\u00da\u00db\5$\23\2\u00db"+
		"\u00dc\7\7\2\2\u00dc\u00dd\7\t\2\2\u00dd\u00de\5\20\t\2\u00de\u00df\7"+
		"\n\2\2\u00df\37\3\2\2\2\u00e0\u00e1\7\20\2\2\u00e1\u00e2\7\17\2\2\u00e2"+
		"\u00e3\7\6\2\2\u00e3\u00e4\5$\23\2\u00e4\u00e5\7\7\2\2\u00e5\u00e6\7\t"+
		"\2\2\u00e6\u00e7\5\20\t\2\u00e7\u00e8\7\n\2\2\u00e8!\3\2\2\2\u00e9\u00ea"+
		"\7\20\2\2\u00ea\u00eb\7\t\2\2\u00eb\u00ec\5\20\t\2\u00ec\u00ed\7\n\2\2"+
		"\u00ed#\3\2\2\2\u00ee\u00ef\5\64\33\2\u00ef%\3\2\2\2\u00f0\u00f1\7\21"+
		"\2\2\u00f1\u00f2\7\6\2\2\u00f2\u00f3\5$\23\2\u00f3\u00f4\7\7\2\2\u00f4"+
		"\u00f5\7\t\2\2\u00f5\u00f6\5\20\t\2\u00f6\u00f7\7\n\2\2\u00f7\'\3\2\2"+
		"\2\u00f8\u00f9\7\22\2\2\u00f9\u00fa\7\6\2\2\u00fa\u00fb\5*\26\2\u00fb"+
		"\u00fc\7\f\2\2\u00fc\u00fd\5$\23\2\u00fd\u00fe\7\f\2\2\u00fe\u00ff\5,"+
		"\27\2\u00ff\u0105\7\7\2\2\u0100\u0101\7\t\2\2\u0101\u0102\5\20\t\2\u0102"+
		"\u0103\7\n\2\2\u0103\u0106\3\2\2\2\u0104\u0106\7\f\2\2\u0105\u0100\3\2"+
		"\2\2\u0105\u0104\3\2\2\2\u0106)\3\2\2\2\u0107\u0109\5L\'\2\u0108\u0107"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\58\35\2\u010b"+
		"\u010c\7\13\2\2\u010c\u010f\5\64\33\2\u010d\u010e\7\b\2\2\u010e\u0110"+
		"\5*\26\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u0113\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u0111\3\2\2\2\u0113+\3\2\2\2"+
		"\u0114\u0115\58\35\2\u0115\u0116\7\13\2\2\u0116\u0119\5\64\33\2\u0117"+
		"\u0118\7\b\2\2\u0118\u011a\5,\27\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0114\3\2\2\2\u011c"+
		"\u011b\3\2\2\2\u011d-\3\2\2\2\u011e\u0122\7\23\2\2\u011f\u0123\5:\36\2"+
		"\u0120\u0123\58\35\2\u0121\u0123\5<\37\2\u0122\u011f\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\7\f\2\2\u0125/\3\2\2\2\u0126\u0127\7\24\2\2\u0127\61\3\2\2\2\u0128"+
		"\u0129\7\25\2\2\u0129\63\3\2\2\2\u012a\u012b\b\33\1\2\u012b\u012c\7\6"+
		"\2\2\u012c\u012d\5\64\33\2\u012d\u012e\7\7\2\2\u012e\u013f\3\2\2\2\u012f"+
		"\u0130\7\26\2\2\u0130\u013f\5\64\33\17\u0131\u013f\58\35\2\u0132\u013f"+
		"\5P)\2\u0133\u0135\7\35\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u013f\5:\36\2\u0137\u0139\7\35\2\2\u0138\u0137\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013f\5<\37\2\u013b"+
		"\u013f\5> \2\u013c\u013f\5@!\2\u013d\u013f\5V,\2\u013e\u012a\3\2\2\2\u013e"+
		"\u012f\3\2\2\2\u013e\u0131\3\2\2\2\u013e\u0132\3\2\2\2\u013e\u0134\3\2"+
		"\2\2\u013e\u0138\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013d\3\2\2\2\u013f\u0150\3\2\2\2\u0140\u0141\f\16\2\2\u0141\u0142\7"+
		"\27\2\2\u0142\u014f\5\64\33\17\u0143\u0144\f\r\2\2\u0144\u0145\7\30\2"+
		"\2\u0145\u014f\5\64\33\16\u0146\u0147\f\f\2\2\u0147\u0148\t\2\2\2\u0148"+
		"\u014f\5\64\33\r\u0149\u014a\f\13\2\2\u014a\u014b\t\3\2\2\u014b\u014f"+
		"\5\64\33\f\u014c\u014d\f\n\2\2\u014d\u014f\t\4\2\2\u014e\u0140\3\2\2\2"+
		"\u014e\u0143\3\2\2\2\u014e\u0146\3\2\2\2\u014e\u0149\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\65\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7*\2\2\u0154\67\3\2\2\2\u0155"+
		"\u0156\7+\2\2\u01569\3\2\2\2\u0157\u0158\7,\2\2\u0158;\3\2\2\2\u0159\u015a"+
		"\7-\2\2\u015a=\3\2\2\2\u015b\u015c\7.\2\2\u015c?\3\2\2\2\u015d\u015e\7"+
		"/\2\2\u015eA\3\2\2\2\u015f\u0160\7\60\2\2\u0160C\3\2\2\2\u0161\u0162\7"+
		"\61\2\2\u0162E\3\2\2\2\u0163\u0164\7\62\2\2\u0164G\3\2\2\2\u0165\u0166"+
		"\7\63\2\2\u0166I\3\2\2\2\u0167\u0168\7\64\2\2\u0168K\3\2\2\2\u0169\u016a"+
		"\t\5\2\2\u016aM\3\2\2\2\u016b\u016c\58\35\2\u016c\u016d\7\r\2\2\u016d"+
		"\u016e\5:\36\2\u016e\u016f\7\16\2\2\u016fO\3\2\2\2\u0170\u0171\58\35\2"+
		"\u0171\u0172\7\r\2\2\u0172\u0173\5\64\33\2\u0173\u0174\7\16\2\2\u0174"+
		"Q\3\2\2\2\u0175\u0176\7&\2\2\u0176S\3\2\2\2\u0177\u017c\5:\36\2\u0178"+
		"\u017c\5<\37\2\u0179\u017c\5> \2\u017a\u017c\5@!\2\u017b\u0177\3\2\2\2"+
		"\u017b\u0178\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017cU\3"+
		"\2\2\2\u017d\u0181\5Z.\2\u017e\u0181\5\\/\2\u017f\u0181\5X-\2\u0180\u017d"+
		"\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181W\3\2\2\2\u0182"+
		"\u0183\58\35\2\u0183\u0192\7\6\2\2\u0184\u0187\5T+\2\u0185\u0187\58\35"+
		"\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187\u018f\3\2\2\2\u0188\u018b"+
		"\7\b\2\2\u0189\u018c\5T+\2\u018a\u018c\58\35\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018a\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u0188\3\2\2\2\u018e\u0191\3\2"+
		"\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0193\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0192\u0186\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0195\7\7\2\2\u0195\u0196\7\f\2\2\u0196Y\3\2\2\2\u0197\u0198"+
		"\7\'\2\2\u0198\u019b\7\6\2\2\u0199\u019c\5@!\2\u019a\u019c\58\35\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c\u01a1\3\2\2\2\u019d\u019e\7\b"+
		"\2\2\u019e\u01a0\5\64\33\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4\u01a5\7\7\2\2\u01a5\u01a6\7\f\2\2\u01a6[\3\2\2\2\u01a7\u01a8"+
		"\7(\2\2\u01a8\u01a9\7\6\2\2\u01a9\u01aa\5@!\2\u01aa\u01ac\7\b\2\2\u01ab"+
		"\u01ad\7)\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b0\3\2"+
		"\2\2\u01ae\u01b1\58\35\2\u01af\u01b1\5P)\2\u01b0\u01ae\3\2\2\2\u01b0\u01af"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\7\f\2\2\u01b3]\3\2\2\2)afht\u0080"+
		"\u0085\u0089\u0095\u00a1\u00a5\u00ab\u00b1\u00b5\u00c3\u00c9\u00d2\u00d6"+
		"\u0105\u0108\u010f\u0112\u0119\u011c\u0122\u0134\u0138\u013e\u014e\u0150"+
		"\u017b\u0180\u0186\u018b\u018f\u0192\u019b\u01a1\u01ac\u01b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}