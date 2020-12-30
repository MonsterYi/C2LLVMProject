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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, LIB=44, ID=45, INT=46, 
		DOUBLE=47, CHAR=48, STRING=49, OPERATOR=50, CONJUNCTION=51, INLINECOMMENT=52, 
		BLOCKCOMMENT=53, SPACE=54;
	public static final int
		RULE_program = 0, RULE_include = 1, RULE_structDef = 2, RULE_structBodyDef = 3, 
		RULE_structItemDef = 4, RULE_functionDef = 5, RULE_functionHeaderDef = 6, 
		RULE_functionParamsDef = 7, RULE_functionParamDef = 8, RULE_functionBodyDef = 9, 
		RULE_block = 10, RULE_sentence = 11, RULE_defineSentence = 12, RULE_baseDefineSentence = 13, 
		RULE_arrayDefineSentence = 14, RULE_structDefineSentence = 15, RULE_assignSentence = 16, 
		RULE_ifSentenceBlock = 17, RULE_ifSentence = 18, RULE_elifSentence = 19, 
		RULE_elseSentence = 20, RULE_condition = 21, RULE_whileSentence = 22, 
		RULE_forSentence = 23, RULE_forDefineSentence = 24, RULE_forIteratorSentence = 25, 
		RULE_returnSentence = 26, RULE_continueSentence = 27, RULE_breakSentence = 28, 
		RULE_expr = 29, RULE_lib = 30, RULE_myID = 31, RULE_myInt = 32, RULE_myDouble = 33, 
		RULE_myChar = 34, RULE_myString = 35, RULE_operator = 36, RULE_conjunction = 37, 
		RULE_inLineComment = 38, RULE_blockComment = 39, RULE_space = 40, RULE_struct = 41, 
		RULE_myType = 42, RULE_array = 43, RULE_arrayItem = 44, RULE_myVoid = 45, 
		RULE_structItem = 46, RULE_argument = 47, RULE_function = 48, RULE_selfDefinedFunc = 49, 
		RULE_printFunc = 50, RULE_scanfFunc = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "include", "structDef", "structBodyDef", "structItemDef", 
			"functionDef", "functionHeaderDef", "functionParamsDef", "functionParamDef", 
			"functionBodyDef", "block", "sentence", "defineSentence", "baseDefineSentence", 
			"arrayDefineSentence", "structDefineSentence", "assignSentence", "ifSentenceBlock", 
			"ifSentence", "elifSentence", "elseSentence", "condition", "whileSentence", 
			"forSentence", "forDefineSentence", "forIteratorSentence", "returnSentence", 
			"continueSentence", "breakSentence", "expr", "lib", "myID", "myInt", 
			"myDouble", "myChar", "myString", "operator", "conjunction", "inLineComment", 
			"blockComment", "space", "struct", "myType", "array", "arrayItem", "myVoid", 
			"structItem", "argument", "function", "selfDefinedFunc", "printFunc", 
			"scanfFunc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'include'", "'<'", "'>'", "'{'", "'};'", "','", "';'", "'='", 
			"'[]'", "'('", "')'", "'}'", "'['", "']'", "'if'", "'else'", "'while'", 
			"'for'", "'return'", "'continue;'", "'break;'", "'!'", "'&&'", "'||'", 
			"'*'", "'/'", "'%'", "'+'", "'-'", "'=='", "'!='", "'<='", "'>='", "'struct'", 
			"'int'", "'double'", "'char'", "'string'", "'void'", "'.'", "'printf'", 
			"'scanf'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "LIB", "ID", "INT", "DOUBLE", 
			"CHAR", "STRING", "OPERATOR", "CONJUNCTION", "INLINECOMMENT", "BLOCKCOMMENT", 
			"SPACE"
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
		public DefineSentenceContext defineSentence() {
			return getRuleContext(DefineSentenceContext.class,0);
		}
		public StructDefContext structDef() {
			return getRuleContext(StructDefContext.class,0);
		}
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
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
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(104);
				include();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(110);
				defineSentence();
				}
				break;
			case 2:
				{
				setState(111);
				structDef();
				}
				break;
			case 3:
				{
				setState(112);
				functionDef();
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
			setState(115);
			match(T__0);
			setState(116);
			match(T__1);
			setState(117);
			lib();
			setState(118);
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

	public static class StructDefContext extends ParserRuleContext {
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public List<StructBodyDefContext> structBodyDef() {
			return getRuleContexts(StructBodyDefContext.class);
		}
		public StructBodyDefContext structBodyDef(int i) {
			return getRuleContext(StructBodyDefContext.class,i);
		}
		public StructDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDef; }
	}

	public final StructDefContext structDef() throws RecognitionException {
		StructDefContext _localctx = new StructDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_structDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			struct();
			setState(121);
			match(T__3);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				structBodyDef();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0) );
			setState(127);
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

	public static class StructBodyDefContext extends ParserRuleContext {
		public MyTypeContext myType() {
			return getRuleContext(MyTypeContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public List<StructItemDefContext> structItemDef() {
			return getRuleContexts(StructItemDefContext.class);
		}
		public StructItemDefContext structItemDef(int i) {
			return getRuleContext(StructItemDefContext.class,i);
		}
		public StructBodyDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBodyDef; }
	}

	public final StructBodyDefContext structBodyDef() throws RecognitionException {
		StructBodyDefContext _localctx = new StructBodyDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structBodyDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				{
				setState(129);
				myType();
				}
				break;
			case T__33:
				{
				setState(130);
				struct();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(133);
				structItemDef();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(134);
					match(T__5);
					{
					setState(135);
					structItemDef();
					}
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(143);
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

	public static class StructItemDefContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MyIntContext myInt() {
			return getRuleContext(MyIntContext.class,0);
		}
		public MyDoubleContext myDouble() {
			return getRuleContext(MyDoubleContext.class,0);
		}
		public MyStringContext myString() {
			return getRuleContext(MyStringContext.class,0);
		}
		public MyCharContext myChar() {
			return getRuleContext(MyCharContext.class,0);
		}
		public StructItemDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structItemDef; }
	}

	public final StructItemDefContext structItemDef() throws RecognitionException {
		StructItemDefContext _localctx = new StructItemDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_structItemDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(145);
				myID();
				}
				break;
			case 2:
				{
				setState(146);
				array();
				}
				break;
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(149);
				match(T__7);
				setState(155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(150);
					match(T__8);
					}
					break;
				case INT:
					{
					setState(151);
					myInt();
					}
					break;
				case DOUBLE:
					{
					setState(152);
					myDouble();
					}
					break;
				case STRING:
					{
					setState(153);
					myString();
					}
					break;
				case CHAR:
					{
					setState(154);
					myChar();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		enterRule(_localctx, 10, RULE_functionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			functionHeaderDef();
			setState(160);
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
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public FunctionHeaderDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHeaderDef; }
	}

	public final FunctionHeaderDefContext functionHeaderDef() throws RecognitionException {
		FunctionHeaderDefContext _localctx = new FunctionHeaderDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionHeaderDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				{
				setState(162);
				myType();
				}
				break;
			case T__38:
				{
				setState(163);
				myVoid();
				}
				break;
			case T__33:
				{
				setState(164);
				struct();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(167);
			myID();
			setState(168);
			match(T__9);
			setState(169);
			functionParamsDef();
			setState(170);
			match(T__10);
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
		enterRule(_localctx, 14, RULE_functionParamsDef);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				functionParamDef();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(173);
					match(T__5);
					setState(174);
					functionParamDef();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
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

	public static class FunctionParamDefContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public MyTypeContext myType() {
			return getRuleContext(MyTypeContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public FunctionParamDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParamDef; }
	}

	public final FunctionParamDefContext functionParamDef() throws RecognitionException {
		FunctionParamDefContext _localctx = new FunctionParamDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionParamDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				{
				setState(183);
				myType();
				}
				break;
			case T__33:
				{
				setState(184);
				struct();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(187);
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
		enterRule(_localctx, 18, RULE_functionBodyDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__3);
			setState(190);
			block();
			setState(191);
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
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				sentence();
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__40) | (1L << T__41) | (1L << ID))) != 0) );
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
		enterRule(_localctx, 22, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(198);
				defineSentence();
				}
				break;
			case 2:
				{
				setState(199);
				assignSentence();
				}
				break;
			case 3:
				{
				setState(200);
				ifSentenceBlock();
				}
				break;
			case 4:
				{
				setState(201);
				whileSentence();
				}
				break;
			case 5:
				{
				setState(202);
				forSentence();
				}
				break;
			case 6:
				{
				setState(203);
				returnSentence();
				}
				break;
			case 7:
				{
				setState(204);
				continueSentence();
				}
				break;
			case 8:
				{
				setState(205);
				breakSentence();
				}
				break;
			case 9:
				{
				setState(206);
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
		public StructDefineSentenceContext structDefineSentence() {
			return getRuleContext(StructDefineSentenceContext.class,0);
		}
		public DefineSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineSentence; }
	}

	public final DefineSentenceContext defineSentence() throws RecognitionException {
		DefineSentenceContext _localctx = new DefineSentenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defineSentence);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				baseDefineSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				arrayDefineSentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				structDefineSentence();
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
		enterRule(_localctx, 26, RULE_baseDefineSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			myType();
			setState(215);
			myID();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(216);
				match(T__7);
				setState(217);
				expr(0);
				}
			}

			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(220);
				match(T__5);
				setState(221);
				myID();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(222);
					match(T__7);
					setState(223);
					expr(0);
					}
				}

				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
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
		enterRule(_localctx, 28, RULE_arrayDefineSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			myType();
			setState(234);
			myID();
			setState(235);
			match(T__12);
			setState(236);
			myInt();
			setState(237);
			match(T__13);
			setState(238);
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

	public static class StructDefineSentenceContext extends ParserRuleContext {
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StructDefineSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefineSentence; }
	}

	public final StructDefineSentenceContext structDefineSentence() throws RecognitionException {
		StructDefineSentenceContext _localctx = new StructDefineSentenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_structDefineSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			struct();
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(241);
				myID();
				}
				break;
			case 2:
				{
				setState(242);
				array();
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
		public List<StructItemContext> structItem() {
			return getRuleContexts(StructItemContext.class);
		}
		public StructItemContext structItem(int i) {
			return getRuleContext(StructItemContext.class,i);
		}
		public AssignSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignSentence; }
	}

	public final AssignSentenceContext assignSentence() throws RecognitionException {
		AssignSentenceContext _localctx = new AssignSentenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignSentence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(245);
						arrayItem();
						}
						break;
					case 2:
						{
						setState(246);
						myID();
						}
						break;
					case 3:
						{
						setState(247);
						structItem();
						}
						break;
					}
					setState(250);
					match(T__7);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(254); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(256);
			expr(0);
			setState(257);
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
		enterRule(_localctx, 34, RULE_ifSentenceBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			ifSentence();
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					elifSentence();
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(266);
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
		enterRule(_localctx, 36, RULE_ifSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__14);
			setState(270);
			match(T__9);
			setState(271);
			condition();
			setState(272);
			match(T__10);
			setState(273);
			match(T__3);
			setState(274);
			block();
			setState(275);
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
		enterRule(_localctx, 38, RULE_elifSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__15);
			setState(278);
			match(T__14);
			setState(279);
			match(T__9);
			setState(280);
			condition();
			setState(281);
			match(T__10);
			setState(282);
			match(T__3);
			setState(283);
			block();
			setState(284);
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
		enterRule(_localctx, 40, RULE_elseSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__15);
			setState(287);
			match(T__3);
			setState(288);
			block();
			setState(289);
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
		enterRule(_localctx, 42, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		enterRule(_localctx, 44, RULE_whileSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__16);
			setState(294);
			match(T__9);
			setState(295);
			condition();
			setState(296);
			match(T__10);
			setState(297);
			match(T__3);
			setState(298);
			block();
			setState(299);
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
		enterRule(_localctx, 46, RULE_forSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__17);
			setState(302);
			match(T__9);
			setState(303);
			forDefineSentence();
			setState(304);
			match(T__6);
			setState(305);
			condition();
			setState(306);
			match(T__6);
			setState(307);
			forIteratorSentence();
			setState(308);
			match(T__10);
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(309);
				match(T__3);
				setState(310);
				block();
				setState(311);
				match(T__11);
				}
				break;
			case T__6:
				{
				setState(313);
				match(T__6);
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
		enterRule(_localctx, 48, RULE_forDefineSentence);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
					{
					setState(316);
					myType();
					}
				}

				setState(319);
				myID();
				setState(320);
				match(T__7);
				setState(321);
				expr(0);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(322);
					match(T__5);
					setState(323);
					forDefineSentence();
					}
				}

				}
				break;
			case T__6:
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
		enterRule(_localctx, 50, RULE_forIteratorSentence);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				myID();
				setState(330);
				match(T__7);
				setState(331);
				expr(0);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(332);
					match(T__5);
					setState(333);
					forIteratorSentence();
					}
				}

				}
				break;
			case T__10:
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
		enterRule(_localctx, 52, RULE_returnSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__18);
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(340);
				myInt();
				}
				break;
			case ID:
				{
				setState(341);
				myID();
				}
				break;
			case DOUBLE:
				{
				setState(342);
				myDouble();
				}
				break;
			case T__6:
				break;
			default:
				break;
			}
			setState(345);
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

	public static class ContinueSentenceContext extends ParserRuleContext {
		public ContinueSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueSentence; }
	}

	public final ContinueSentenceContext continueSentence() throws RecognitionException {
		ContinueSentenceContext _localctx = new ContinueSentenceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_continueSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__19);
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
		enterRule(_localctx, 56, RULE_breakSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__20);
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
	public static class Expr_structitemContext extends ExprContext {
		public StructItemContext structItem() {
			return getRuleContext(StructItemContext.class,0);
		}
		public Expr_structitemContext(ExprContext ctx) { copyFrom(ctx); }
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new Expr_parensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(352);
				match(T__9);
				setState(353);
				expr(0);
				setState(354);
				match(T__10);
				}
				break;
			case 2:
				{
				_localctx = new Expr_negContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				((Expr_negContext)_localctx).op = match(T__21);
				setState(357);
				expr(14);
				}
				break;
			case 3:
				{
				_localctx = new Expr_identifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(358);
				myID();
				}
				break;
			case 4:
				{
				_localctx = new Expr_structitemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				structItem();
				}
				break;
			case 5:
				{
				_localctx = new Expr_arrayitemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(360);
				arrayItem();
				}
				break;
			case 6:
				{
				_localctx = new Expr_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(361);
					((Expr_intContext)_localctx).op = match(T__28);
					}
				}

				setState(364);
				myInt();
				}
				break;
			case 7:
				{
				_localctx = new Expr_doubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(365);
					((Expr_doubleContext)_localctx).op = match(T__28);
					}
				}

				setState(368);
				myDouble();
				}
				break;
			case 8:
				{
				_localctx = new Expr_charContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(369);
				myChar();
				}
				break;
			case 9:
				{
				_localctx = new Expr_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(370);
				myString();
				}
				break;
			case 10:
				{
				_localctx = new Expr_functionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(371);
				function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(388);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_andContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(374);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(375);
						match(T__22);
						setState(376);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new Expr_orContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(377);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(378);
						match(T__23);
						setState(379);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new Expr_mulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(380);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(381);
						((Expr_mulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
							((Expr_mulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(382);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new Expr_addContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(383);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(384);
						((Expr_addContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((Expr_addContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(385);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new Expr_judgeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(386);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(387);
						((Expr_judgeContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
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
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 60, RULE_lib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
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
		enterRule(_localctx, 62, RULE_myID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
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
		enterRule(_localctx, 64, RULE_myInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
		enterRule(_localctx, 66, RULE_myDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
		enterRule(_localctx, 68, RULE_myChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		enterRule(_localctx, 70, RULE_myString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		enterRule(_localctx, 72, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		enterRule(_localctx, 74, RULE_conjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		enterRule(_localctx, 76, RULE_inLineComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
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
		enterRule(_localctx, 78, RULE_blockComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
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
		enterRule(_localctx, 80, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
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

	public static class StructContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(simpleCParser.ID, 0); }
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(T__33);
			setState(416);
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

	public static class MyTypeContext extends ParserRuleContext {
		public MyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myType; }
	}

	public final MyTypeContext myType() throws RecognitionException {
		MyTypeContext _localctx = new MyTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_myType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
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
		enterRule(_localctx, 86, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			myID();
			setState(421);
			match(T__12);
			setState(422);
			myInt();
			setState(423);
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
		enterRule(_localctx, 88, RULE_arrayItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			myID();
			setState(426);
			match(T__12);
			setState(427);
			expr(0);
			setState(428);
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

	public static class MyVoidContext extends ParserRuleContext {
		public MyVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myVoid; }
	}

	public final MyVoidContext myVoid() throws RecognitionException {
		MyVoidContext _localctx = new MyVoidContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_myVoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(T__38);
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

	public static class StructItemContext extends ParserRuleContext {
		public List<MyIDContext> myID() {
			return getRuleContexts(MyIDContext.class);
		}
		public MyIDContext myID(int i) {
			return getRuleContext(MyIDContext.class,i);
		}
		public List<ArrayItemContext> arrayItem() {
			return getRuleContexts(ArrayItemContext.class);
		}
		public ArrayItemContext arrayItem(int i) {
			return getRuleContext(ArrayItemContext.class,i);
		}
		public StructItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structItem; }
	}

	public final StructItemContext structItem() throws RecognitionException {
		StructItemContext _localctx = new StructItemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_structItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(432);
				myID();
				}
				break;
			case 2:
				{
				setState(433);
				arrayItem();
				}
				break;
			}
			setState(436);
			match(T__39);
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(437);
				myID();
				}
				break;
			case 2:
				{
				setState(438);
				arrayItem();
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
		enterRule(_localctx, 94, RULE_argument);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				myInt();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				myDouble();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				myChar();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
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
		enterRule(_localctx, 96, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				{
				setState(447);
				printFunc();
				}
				break;
			case T__41:
				{
				setState(448);
				scanfFunc();
				}
				break;
			case ID:
				{
				setState(449);
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
		enterRule(_localctx, 98, RULE_selfDefinedFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			myID();
			setState(453);
			match(T__9);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(456);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DOUBLE:
				case CHAR:
				case STRING:
					{
					setState(454);
					argument();
					}
					break;
				case ID:
					{
					setState(455);
					myID();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(458);
					match(T__5);
					setState(461);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case DOUBLE:
					case CHAR:
					case STRING:
						{
						setState(459);
						argument();
						}
						break;
					case ID:
						{
						setState(460);
						myID();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(470);
			match(T__10);
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
		enterRule(_localctx, 100, RULE_printFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(T__40);
			setState(473);
			match(T__9);
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(474);
				myString();
				}
				break;
			case ID:
				{
				setState(475);
				myID();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(478);
				match(T__5);
				setState(479);
				expr(0);
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			match(T__10);
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
		public StructItemContext structItem() {
			return getRuleContext(StructItemContext.class,0);
		}
		public ScanfFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanfFunc; }
	}

	public final ScanfFuncContext scanfFunc() throws RecognitionException {
		ScanfFuncContext _localctx = new ScanfFuncContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_scanfFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(T__41);
			setState(488);
			match(T__9);
			setState(489);
			myString();
			{
			setState(490);
			match(T__5);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(491);
				match(T__42);
				}
			}

			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(494);
				myID();
				}
				break;
			case 2:
				{
				setState(495);
				arrayItem();
				}
				break;
			case 3:
				{
				setState(496);
				structItem();
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\3\2\5\2t\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\6\4~\n\4\r\4\16\4\177\3\4\3\4\3\5\3\5\5\5\u0086"+
		"\n\5\3\5\3\5\3\5\7\5\u008b\n\5\f\5\16\5\u008e\13\5\5\5\u0090\n\5\3\5\3"+
		"\5\3\6\3\6\5\6\u0096\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009e\n\6\5\6\u00a0"+
		"\n\6\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u00a8\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\t\5\t\u00b8\n\t\3\n\3\n\5\n\u00bc"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\f\u00c5\n\f\r\f\16\f\u00c6\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d2\n\r\3\16\3\16\3\16\5\16\u00d7"+
		"\n\16\3\17\3\17\3\17\3\17\5\17\u00dd\n\17\3\17\3\17\3\17\3\17\5\17\u00e3"+
		"\n\17\7\17\u00e5\n\17\f\17\16\17\u00e8\13\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00f6\n\21\3\22\3\22\3\22\5\22"+
		"\u00fb\n\22\3\22\3\22\6\22\u00ff\n\22\r\22\16\22\u0100\3\22\3\22\3\22"+
		"\3\23\3\23\7\23\u0108\n\23\f\23\16\23\u010b\13\23\3\23\5\23\u010e\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u013d\n\31\3\32\5\32\u0140\n\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u0147\n\32\3\32\5\32\u014a\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0151\n\33\3\33\5\33\u0154\n\33\3\34\3\34\3\34\3\34\5\34\u015a\n"+
		"\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u016d\n\37\3\37\3\37\5\37\u0171\n\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0177\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u0187\n\37\f\37\16\37\u018a\13\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3+\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\5\60\u01b5\n"+
		"\60\3\60\3\60\3\60\5\60\u01ba\n\60\3\61\3\61\3\61\3\61\5\61\u01c0\n\61"+
		"\3\62\3\62\3\62\5\62\u01c5\n\62\3\63\3\63\3\63\3\63\5\63\u01cb\n\63\3"+
		"\63\3\63\3\63\5\63\u01d0\n\63\7\63\u01d2\n\63\f\63\16\63\u01d5\13\63\5"+
		"\63\u01d7\n\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u01df\n\64\3\64\3\64"+
		"\7\64\u01e3\n\64\f\64\16\64\u01e6\13\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u01ef\n\65\3\65\3\65\3\65\5\65\u01f4\n\65\3\65\2\3<\66\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfh\2\6\3\2\33\35\3\2\36\37\4\2\4\5 #\3\2%(\2\u0210\2m\3\2\2"+
		"\2\4u\3\2\2\2\6z\3\2\2\2\b\u0085\3\2\2\2\n\u0095\3\2\2\2\f\u00a1\3\2\2"+
		"\2\16\u00a7\3\2\2\2\20\u00b7\3\2\2\2\22\u00bb\3\2\2\2\24\u00bf\3\2\2\2"+
		"\26\u00c4\3\2\2\2\30\u00d1\3\2\2\2\32\u00d6\3\2\2\2\34\u00d8\3\2\2\2\36"+
		"\u00eb\3\2\2\2 \u00f2\3\2\2\2\"\u00fe\3\2\2\2$\u0105\3\2\2\2&\u010f\3"+
		"\2\2\2(\u0117\3\2\2\2*\u0120\3\2\2\2,\u0125\3\2\2\2.\u0127\3\2\2\2\60"+
		"\u012f\3\2\2\2\62\u0149\3\2\2\2\64\u0153\3\2\2\2\66\u0155\3\2\2\28\u015d"+
		"\3\2\2\2:\u015f\3\2\2\2<\u0176\3\2\2\2>\u018b\3\2\2\2@\u018d\3\2\2\2B"+
		"\u018f\3\2\2\2D\u0191\3\2\2\2F\u0193\3\2\2\2H\u0195\3\2\2\2J\u0197\3\2"+
		"\2\2L\u0199\3\2\2\2N\u019b\3\2\2\2P\u019d\3\2\2\2R\u019f\3\2\2\2T\u01a1"+
		"\3\2\2\2V\u01a4\3\2\2\2X\u01a6\3\2\2\2Z\u01ab\3\2\2\2\\\u01b0\3\2\2\2"+
		"^\u01b4\3\2\2\2`\u01bf\3\2\2\2b\u01c4\3\2\2\2d\u01c6\3\2\2\2f\u01da\3"+
		"\2\2\2h\u01e9\3\2\2\2jl\5\4\3\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2"+
		"\2ns\3\2\2\2om\3\2\2\2pt\5\32\16\2qt\5\6\4\2rt\5\f\7\2sp\3\2\2\2sq\3\2"+
		"\2\2sr\3\2\2\2t\3\3\2\2\2uv\7\3\2\2vw\7\4\2\2wx\5> \2xy\7\5\2\2y\5\3\2"+
		"\2\2z{\5T+\2{}\7\6\2\2|~\5\b\5\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\7\2\2\u0082\7\3\2\2\2"+
		"\u0083\u0086\5V,\2\u0084\u0086\5T+\2\u0085\u0083\3\2\2\2\u0085\u0084\3"+
		"\2\2\2\u0086\u008f\3\2\2\2\u0087\u008c\5\n\6\2\u0088\u0089\7\b\2\2\u0089"+
		"\u008b\5\n\6\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0087\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\t"+
		"\2\2\u0092\t\3\2\2\2\u0093\u0096\5@!\2\u0094\u0096\5X-\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0094\3\2\2\2\u0096\u009f\3\2\2\2\u0097\u009d\7\n\2\2\u0098"+
		"\u009e\7\13\2\2\u0099\u009e\5B\"\2\u009a\u009e\5D#\2\u009b\u009e\5H%\2"+
		"\u009c\u009e\5F$\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009a"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u0097\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\13\3\2\2\2\u00a1\u00a2\5\16\b"+
		"\2\u00a2\u00a3\5\24\13\2\u00a3\r\3\2\2\2\u00a4\u00a8\5V,\2\u00a5\u00a8"+
		"\5\\/\2\u00a6\u00a8\5T+\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5@!\2\u00aa\u00ab\7\f\2"+
		"\2\u00ab\u00ac\5\20\t\2\u00ac\u00ad\7\r\2\2\u00ad\17\3\2\2\2\u00ae\u00b3"+
		"\5\22\n\2\u00af\u00b0\7\b\2\2\u00b0\u00b2\5\22\n\2\u00b1\u00af\3\2\2\2"+
		"\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b8"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00ae\3\2\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\21\3\2\2\2\u00b9\u00bc\5V,\2\u00ba\u00bc\5T+\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\5@"+
		"!\2\u00be\23\3\2\2\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1\5\26\f\2\u00c1\u00c2"+
		"\7\16\2\2\u00c2\25\3\2\2\2\u00c3\u00c5\5\30\r\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\27\3\2\2"+
		"\2\u00c8\u00d2\5\32\16\2\u00c9\u00d2\5\"\22\2\u00ca\u00d2\5$\23\2\u00cb"+
		"\u00d2\5.\30\2\u00cc\u00d2\5\60\31\2\u00cd\u00d2\5\66\34\2\u00ce\u00d2"+
		"\58\35\2\u00cf\u00d2\5:\36\2\u00d0\u00d2\5b\62\2\u00d1\u00c8\3\2\2\2\u00d1"+
		"\u00c9\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00cc\3\2"+
		"\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\31\3\2\2\2\u00d3\u00d7\5\34\17\2\u00d4\u00d7\5\36"+
		"\20\2\u00d5\u00d7\5 \21\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\33\3\2\2\2\u00d8\u00d9\5V,\2\u00d9\u00dc\5@!\2\u00da"+
		"\u00db\7\n\2\2\u00db\u00dd\5<\37\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00e6\3\2\2\2\u00de\u00df\7\b\2\2\u00df\u00e2\5@!\2\u00e0\u00e1"+
		"\7\n\2\2\u00e1\u00e3\5<\37\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00de\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ea\7\t\2\2\u00ea\35\3\2\2\2\u00eb\u00ec\5V,\2\u00ec\u00ed\5@!\2\u00ed"+
		"\u00ee\7\17\2\2\u00ee\u00ef\5B\"\2\u00ef\u00f0\7\20\2\2\u00f0\u00f1\7"+
		"\t\2\2\u00f1\37\3\2\2\2\u00f2\u00f5\5T+\2\u00f3\u00f6\5@!\2\u00f4\u00f6"+
		"\5X-\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6!\3\2\2\2\u00f7\u00fb"+
		"\5Z.\2\u00f8\u00fb\5@!\2\u00f9\u00fb\5^\60\2\u00fa\u00f7\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\n"+
		"\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\5<"+
		"\37\2\u0103\u0104\7\t\2\2\u0104#\3\2\2\2\u0105\u0109\5&\24\2\u0106\u0108"+
		"\5(\25\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\5*"+
		"\26\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e%\3\2\2\2\u010f\u0110"+
		"\7\21\2\2\u0110\u0111\7\f\2\2\u0111\u0112\5,\27\2\u0112\u0113\7\r\2\2"+
		"\u0113\u0114\7\6\2\2\u0114\u0115\5\26\f\2\u0115\u0116\7\16\2\2\u0116\'"+
		"\3\2\2\2\u0117\u0118\7\22\2\2\u0118\u0119\7\21\2\2\u0119\u011a\7\f\2\2"+
		"\u011a\u011b\5,\27\2\u011b\u011c\7\r\2\2\u011c\u011d\7\6\2\2\u011d\u011e"+
		"\5\26\f\2\u011e\u011f\7\16\2\2\u011f)\3\2\2\2\u0120\u0121\7\22\2\2\u0121"+
		"\u0122\7\6\2\2\u0122\u0123\5\26\f\2\u0123\u0124\7\16\2\2\u0124+\3\2\2"+
		"\2\u0125\u0126\5<\37\2\u0126-\3\2\2\2\u0127\u0128\7\23\2\2\u0128\u0129"+
		"\7\f\2\2\u0129\u012a\5,\27\2\u012a\u012b\7\r\2\2\u012b\u012c\7\6\2\2\u012c"+
		"\u012d\5\26\f\2\u012d\u012e\7\16\2\2\u012e/\3\2\2\2\u012f\u0130\7\24\2"+
		"\2\u0130\u0131\7\f\2\2\u0131\u0132\5\62\32\2\u0132\u0133\7\t\2\2\u0133"+
		"\u0134\5,\27\2\u0134\u0135\7\t\2\2\u0135\u0136\5\64\33\2\u0136\u013c\7"+
		"\r\2\2\u0137\u0138\7\6\2\2\u0138\u0139\5\26\f\2\u0139\u013a\7\16\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u013d\7\t\2\2\u013c\u0137\3\2\2\2\u013c\u013b\3\2"+
		"\2\2\u013d\61\3\2\2\2\u013e\u0140\5V,\2\u013f\u013e\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\5@!\2\u0142\u0143\7\n\2\2\u0143"+
		"\u0146\5<\37\2\u0144\u0145\7\b\2\2\u0145\u0147\5\62\32\2\u0146\u0144\3"+
		"\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u013f\3\2\2\2\u0149\u0148\3\2\2\2\u014a\63\3\2\2\2\u014b\u014c\5@!\2"+
		"\u014c\u014d\7\n\2\2\u014d\u0150\5<\37\2\u014e\u014f\7\b\2\2\u014f\u0151"+
		"\5\64\33\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154\3\2\2\2"+
		"\u0152\u0154\3\2\2\2\u0153\u014b\3\2\2\2\u0153\u0152\3\2\2\2\u0154\65"+
		"\3\2\2\2\u0155\u0159\7\25\2\2\u0156\u015a\5B\"\2\u0157\u015a\5@!\2\u0158"+
		"\u015a\5D#\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2"+
		"\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7\t\2\2\u015c\67"+
		"\3\2\2\2\u015d\u015e\7\26\2\2\u015e9\3\2\2\2\u015f\u0160\7\27\2\2\u0160"+
		";\3\2\2\2\u0161\u0162\b\37\1\2\u0162\u0163\7\f\2\2\u0163\u0164\5<\37\2"+
		"\u0164\u0165\7\r\2\2\u0165\u0177\3\2\2\2\u0166\u0167\7\30\2\2\u0167\u0177"+
		"\5<\37\20\u0168\u0177\5@!\2\u0169\u0177\5^\60\2\u016a\u0177\5Z.\2\u016b"+
		"\u016d\7\37\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3"+
		"\2\2\2\u016e\u0177\5B\"\2\u016f\u0171\7\37\2\2\u0170\u016f\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0177\5D#\2\u0173\u0177\5F$\2"+
		"\u0174\u0177\5H%\2\u0175\u0177\5b\62\2\u0176\u0161\3\2\2\2\u0176\u0166"+
		"\3\2\2\2\u0176\u0168\3\2\2\2\u0176\u0169\3\2\2\2\u0176\u016a\3\2\2\2\u0176"+
		"\u016c\3\2\2\2\u0176\u0170\3\2\2\2\u0176\u0173\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0176\u0175\3\2\2\2\u0177\u0188\3\2\2\2\u0178\u0179\f\17\2\2\u0179"+
		"\u017a\7\31\2\2\u017a\u0187\5<\37\20\u017b\u017c\f\16\2\2\u017c\u017d"+
		"\7\32\2\2\u017d\u0187\5<\37\17\u017e\u017f\f\r\2\2\u017f\u0180\t\2\2\2"+
		"\u0180\u0187\5<\37\16\u0181\u0182\f\f\2\2\u0182\u0183\t\3\2\2\u0183\u0187"+
		"\5<\37\r\u0184\u0185\f\13\2\2\u0185\u0187\t\4\2\2\u0186\u0178\3\2\2\2"+
		"\u0186\u017b\3\2\2\2\u0186\u017e\3\2\2\2\u0186\u0181\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"=\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7.\2\2\u018c?\3\2\2\2\u018d"+
		"\u018e\7/\2\2\u018eA\3\2\2\2\u018f\u0190\7\60\2\2\u0190C\3\2\2\2\u0191"+
		"\u0192\7\61\2\2\u0192E\3\2\2\2\u0193\u0194\7\62\2\2\u0194G\3\2\2\2\u0195"+
		"\u0196\7\63\2\2\u0196I\3\2\2\2\u0197\u0198\7\64\2\2\u0198K\3\2\2\2\u0199"+
		"\u019a\7\65\2\2\u019aM\3\2\2\2\u019b\u019c\7\66\2\2\u019cO\3\2\2\2\u019d"+
		"\u019e\7\67\2\2\u019eQ\3\2\2\2\u019f\u01a0\78\2\2\u01a0S\3\2\2\2\u01a1"+
		"\u01a2\7$\2\2\u01a2\u01a3\7/\2\2\u01a3U\3\2\2\2\u01a4\u01a5\t\5\2\2\u01a5"+
		"W\3\2\2\2\u01a6\u01a7\5@!\2\u01a7\u01a8\7\17\2\2\u01a8\u01a9\5B\"\2\u01a9"+
		"\u01aa\7\20\2\2\u01aaY\3\2\2\2\u01ab\u01ac\5@!\2\u01ac\u01ad\7\17\2\2"+
		"\u01ad\u01ae\5<\37\2\u01ae\u01af\7\20\2\2\u01af[\3\2\2\2\u01b0\u01b1\7"+
		")\2\2\u01b1]\3\2\2\2\u01b2\u01b5\5@!\2\u01b3\u01b5\5Z.\2\u01b4\u01b2\3"+
		"\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\7*\2\2\u01b7"+
		"\u01ba\5@!\2\u01b8\u01ba\5Z.\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2"+
		"\u01ba_\3\2\2\2\u01bb\u01c0\5B\"\2\u01bc\u01c0\5D#\2\u01bd\u01c0\5F$\2"+
		"\u01be\u01c0\5H%\2\u01bf\u01bb\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0a\3\2\2\2\u01c1\u01c5\5f\64\2\u01c2"+
		"\u01c5\5h\65\2\u01c3\u01c5\5d\63\2\u01c4\u01c1\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c4\u01c3\3\2\2\2\u01c5c\3\2\2\2\u01c6\u01c7\5@!\2\u01c7\u01d6"+
		"\7\f\2\2\u01c8\u01cb\5`\61\2\u01c9\u01cb\5@!\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01c9\3\2\2\2\u01cb\u01d3\3\2\2\2\u01cc\u01cf\7\b\2\2\u01cd\u01d0\5`"+
		"\61\2\u01ce\u01d0\5@!\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0"+
		"\u01d2\3\2\2\2\u01d1\u01cc\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6"+
		"\u01ca\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7\r"+
		"\2\2\u01d9e\3\2\2\2\u01da\u01db\7+\2\2\u01db\u01de\7\f\2\2\u01dc\u01df"+
		"\5H%\2\u01dd\u01df\5@!\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df"+
		"\u01e4\3\2\2\2\u01e0\u01e1\7\b\2\2\u01e1\u01e3\5<\37\2\u01e2\u01e0\3\2"+
		"\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\7\r\2\2\u01e8g\3\2\2\2"+
		"\u01e9\u01ea\7,\2\2\u01ea\u01eb\7\f\2\2\u01eb\u01ec\5H%\2\u01ec\u01ee"+
		"\7\b\2\2\u01ed\u01ef\7-\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f3\3\2\2\2\u01f0\u01f4\5@!\2\u01f1\u01f4\5Z.\2\u01f2\u01f4\5^\60\2"+
		"\u01f3\u01f0\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4i\3"+
		"\2\2\2\62ms\177\u0085\u008c\u008f\u0095\u009d\u009f\u00a7\u00b3\u00b7"+
		"\u00bb\u00c6\u00d1\u00d6\u00dc\u00e2\u00e6\u00f5\u00fa\u0100\u0109\u010d"+
		"\u013c\u013f\u0146\u0149\u0150\u0153\u0159\u016c\u0170\u0176\u0186\u0188"+
		"\u01b4\u01b9\u01bf\u01c4\u01ca\u01cf\u01d3\u01d6\u01de\u01e4\u01ee\u01f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}