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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, LIB=47, ID=48, INT=49, DOUBLE=50, CHAR=51, STRING=52, OPERATOR=53, 
		CONJUNCTION=54, INLINECOMMENT=55, BLOCKCOMMENT=56, SPACE=57;
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
		RULE_printFunc = 50, RULE_scanfFunc = 51, RULE_getsFunc = 52, RULE_strlenFunc = 53, 
		RULE_atoiFunc = 54;
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
			"scanfFunc", "getsFunc", "strlenFunc", "atoiFunc"
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
			"'scanf'", "'&'", "'gets'", "'strlen'", "'atoi'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "LIB", 
			"ID", "INT", "DOUBLE", "CHAR", "STRING", "OPERATOR", "CONJUNCTION", "INLINECOMMENT", 
			"BLOCKCOMMENT", "SPACE"
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(110);
				include();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(116);
				defineSentence();
				}
				break;
			case 2:
				{
				setState(117);
				structDef();
				}
				break;
			case 3:
				{
				setState(118);
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
			setState(121);
			match(T__0);
			setState(122);
			match(T__1);
			setState(123);
			lib();
			setState(124);
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
			setState(126);
			struct();
			setState(127);
			match(T__3);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				structBodyDef();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0) );
			setState(133);
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				{
				setState(135);
				myType();
				}
				break;
			case T__33:
				{
				setState(136);
				struct();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(139);
				structItemDef();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(140);
					match(T__5);
					{
					setState(141);
					structItemDef();
					}
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(149);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(151);
				myID();
				}
				break;
			case 2:
				{
				setState(152);
				array();
				}
				break;
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(155);
				match(T__7);
				setState(161);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(156);
					match(T__8);
					}
					break;
				case INT:
					{
					setState(157);
					myInt();
					}
					break;
				case DOUBLE:
					{
					setState(158);
					myDouble();
					}
					break;
				case STRING:
					{
					setState(159);
					myString();
					}
					break;
				case CHAR:
					{
					setState(160);
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
			setState(165);
			functionHeaderDef();
			setState(166);
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
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				{
				setState(168);
				myType();
				}
				break;
			case T__38:
				{
				setState(169);
				myVoid();
				}
				break;
			case T__33:
				{
				setState(170);
				struct();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(173);
			myID();
			setState(174);
			match(T__9);
			setState(175);
			functionParamsDef();
			setState(176);
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
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				functionParamDef();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(179);
					match(T__5);
					setState(180);
					functionParamDef();
					}
					}
					setState(185);
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
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				{
				setState(189);
				myType();
				}
				break;
			case T__33:
				{
				setState(190);
				struct();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(193);
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
			setState(195);
			match(T__3);
			setState(196);
			block();
			setState(197);
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
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				sentence();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << ID))) != 0) );
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
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				{
				setState(204);
				defineSentence();
				}
				break;
			case ID:
				{
				setState(205);
				assignSentence();
				}
				break;
			case T__14:
				{
				setState(206);
				ifSentenceBlock();
				}
				break;
			case T__16:
				{
				setState(207);
				whileSentence();
				}
				break;
			case T__17:
				{
				setState(208);
				forSentence();
				}
				break;
			case T__18:
				{
				setState(209);
				returnSentence();
				}
				break;
			case T__19:
				{
				setState(210);
				continueSentence();
				}
				break;
			case T__20:
				{
				setState(211);
				breakSentence();
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
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				baseDefineSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				arrayDefineSentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
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
			setState(219);
			myType();
			setState(220);
			myID();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(221);
				match(T__7);
				setState(222);
				expr(0);
				}
			}

			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(225);
				match(T__5);
				setState(226);
				myID();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(227);
					match(T__7);
					setState(228);
					expr(0);
					}
				}

				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
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
			setState(238);
			myType();
			setState(239);
			myID();
			setState(240);
			match(T__12);
			setState(241);
			myInt();
			setState(242);
			match(T__13);
			setState(243);
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
			setState(245);
			struct();
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(246);
				myID();
				}
				break;
			case 2:
				{
				setState(247);
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
			setState(257); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(253);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(250);
						arrayItem();
						}
						break;
					case 2:
						{
						setState(251);
						myID();
						}
						break;
					case 3:
						{
						setState(252);
						structItem();
						}
						break;
					}
					setState(255);
					match(T__7);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(259); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(261);
			expr(0);
			setState(262);
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
			setState(264);
			ifSentence();
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					elifSentence();
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(271);
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
			setState(274);
			match(T__14);
			setState(275);
			match(T__9);
			setState(276);
			condition();
			setState(277);
			match(T__10);
			setState(278);
			match(T__3);
			setState(279);
			block();
			setState(280);
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
			setState(282);
			match(T__15);
			setState(283);
			match(T__14);
			setState(284);
			match(T__9);
			setState(285);
			condition();
			setState(286);
			match(T__10);
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
			setState(291);
			match(T__15);
			setState(292);
			match(T__3);
			setState(293);
			block();
			setState(294);
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
			setState(296);
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
			setState(298);
			match(T__16);
			setState(299);
			match(T__9);
			setState(300);
			condition();
			setState(301);
			match(T__10);
			setState(302);
			match(T__3);
			setState(303);
			block();
			setState(304);
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
			setState(306);
			match(T__17);
			setState(307);
			match(T__9);
			setState(308);
			forDefineSentence();
			setState(309);
			match(T__6);
			setState(310);
			condition();
			setState(311);
			match(T__6);
			setState(312);
			forIteratorSentence();
			setState(313);
			match(T__10);
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(314);
				match(T__3);
				setState(315);
				block();
				setState(316);
				match(T__11);
				}
				break;
			case T__6:
				{
				setState(318);
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
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
					{
					setState(321);
					myType();
					}
				}

				setState(324);
				myID();
				setState(325);
				match(T__7);
				setState(326);
				expr(0);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(327);
					match(T__5);
					setState(328);
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
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				myID();
				setState(335);
				match(T__7);
				setState(336);
				expr(0);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(337);
					match(T__5);
					setState(338);
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
			setState(344);
			match(T__18);
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(345);
				myInt();
				}
				break;
			case ID:
				{
				setState(346);
				myID();
				}
				break;
			case DOUBLE:
				{
				setState(347);
				myDouble();
				}
				break;
			case T__6:
				break;
			default:
				break;
			}
			setState(350);
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
			setState(352);
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
			setState(354);
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
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new Expr_parensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(357);
				match(T__9);
				setState(358);
				expr(0);
				setState(359);
				match(T__10);
				}
				break;
			case 2:
				{
				_localctx = new Expr_negContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361);
				((Expr_negContext)_localctx).op = match(T__21);
				setState(362);
				expr(14);
				}
				break;
			case 3:
				{
				_localctx = new Expr_identifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(363);
				myID();
				}
				break;
			case 4:
				{
				_localctx = new Expr_structitemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(364);
				structItem();
				}
				break;
			case 5:
				{
				_localctx = new Expr_arrayitemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(365);
				arrayItem();
				}
				break;
			case 6:
				{
				_localctx = new Expr_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(366);
					((Expr_intContext)_localctx).op = match(T__28);
					}
				}

				setState(369);
				myInt();
				}
				break;
			case 7:
				{
				_localctx = new Expr_doubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(370);
					((Expr_doubleContext)_localctx).op = match(T__28);
					}
				}

				setState(373);
				myDouble();
				}
				break;
			case 8:
				{
				_localctx = new Expr_charContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(374);
				myChar();
				}
				break;
			case 9:
				{
				_localctx = new Expr_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(375);
				myString();
				}
				break;
			case 10:
				{
				_localctx = new Expr_functionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(376);
				function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(393);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_andContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(379);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(380);
						match(T__22);
						setState(381);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new Expr_orContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(382);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(383);
						match(T__23);
						setState(384);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new Expr_mulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(385);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(386);
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
						setState(387);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new Expr_addContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(388);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(389);
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
						setState(390);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new Expr_judgeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(391);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(392);
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
				setState(397);
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
			setState(398);
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
			setState(400);
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
			setState(402);
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
			setState(404);
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
			setState(406);
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
			setState(408);
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
			setState(410);
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
			setState(412);
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
			setState(414);
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
			setState(416);
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
			setState(418);
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
			setState(420);
			match(T__33);
			setState(421);
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
			setState(423);
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
			setState(425);
			myID();
			setState(426);
			match(T__12);
			setState(427);
			myInt();
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
			setState(430);
			myID();
			setState(431);
			match(T__12);
			setState(432);
			expr(0);
			setState(433);
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
			setState(435);
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
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
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
			setState(441);
			match(T__39);
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(442);
				myID();
				}
				break;
			case 2:
				{
				setState(443);
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
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				myInt();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				myDouble();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				myChar();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
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
		public GetsFuncContext getsFunc() {
			return getRuleContext(GetsFuncContext.class,0);
		}
		public StrlenFuncContext strlenFunc() {
			return getRuleContext(StrlenFuncContext.class,0);
		}
		public AtoiFuncContext atoiFunc() {
			return getRuleContext(AtoiFuncContext.class,0);
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
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				{
				setState(452);
				printFunc();
				}
				break;
			case T__41:
				{
				setState(453);
				scanfFunc();
				}
				break;
			case T__43:
				{
				setState(454);
				getsFunc();
				}
				break;
			case T__44:
				{
				setState(455);
				strlenFunc();
				}
				break;
			case T__45:
				{
				setState(456);
				atoiFunc();
				}
				break;
			case ID:
				{
				setState(457);
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
			setState(460);
			myID();
			setState(461);
			match(T__9);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(464);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DOUBLE:
				case CHAR:
				case STRING:
					{
					setState(462);
					argument();
					}
					break;
				case ID:
					{
					setState(463);
					myID();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(466);
					match(T__5);
					setState(469);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case DOUBLE:
					case CHAR:
					case STRING:
						{
						setState(467);
						argument();
						}
						break;
					case ID:
						{
						setState(468);
						myID();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(478);
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
			setState(480);
			match(T__40);
			setState(481);
			match(T__9);
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(482);
				myString();
				}
				break;
			case ID:
				{
				setState(483);
				myID();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(486);
				match(T__5);
				setState(487);
				expr(0);
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
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
			setState(495);
			match(T__41);
			setState(496);
			match(T__9);
			setState(497);
			myString();
			{
			setState(498);
			match(T__5);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(499);
				match(T__42);
				}
			}

			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(502);
				myID();
				}
				break;
			case 2:
				{
				setState(503);
				arrayItem();
				}
				break;
			case 3:
				{
				setState(504);
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

	public static class GetsFuncContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public StructItemContext structItem() {
			return getRuleContext(StructItemContext.class,0);
		}
		public GetsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getsFunc; }
	}

	public final GetsFuncContext getsFunc() throws RecognitionException {
		GetsFuncContext _localctx = new GetsFuncContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_getsFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(T__43);
			setState(508);
			match(T__9);
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(509);
				myID();
				}
				break;
			case 2:
				{
				setState(510);
				structItem();
				}
				break;
			}
			setState(513);
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

	public static class StrlenFuncContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public StrlenFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strlenFunc; }
	}

	public final StrlenFuncContext strlenFunc() throws RecognitionException {
		StrlenFuncContext _localctx = new StrlenFuncContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_strlenFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__44);
			setState(516);
			match(T__9);
			setState(517);
			myID();
			setState(518);
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

	public static class AtoiFuncContext extends ParserRuleContext {
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public AtoiFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atoiFunc; }
	}

	public final AtoiFuncContext atoiFunc() throws RecognitionException {
		AtoiFuncContext _localctx = new AtoiFuncContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_atoiFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(T__45);
			setState(521);
			match(T__9);
			setState(522);
			myID();
			setState(523);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0210\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\7\2r\n\2\f\2\16\2u\13\2\3"+
		"\2\3\2\3\2\5\2z\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4\u0084\n\4\r\4"+
		"\16\4\u0085\3\4\3\4\3\5\3\5\5\5\u008c\n\5\3\5\3\5\3\5\7\5\u0091\n\5\f"+
		"\5\16\5\u0094\13\5\5\5\u0096\n\5\3\5\3\5\3\6\3\6\5\6\u009c\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u00a4\n\6\5\6\u00a6\n\6\3\7\3\7\3\7\3\b\3\b\3\b\5"+
		"\b\u00ae\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00b8\n\t\f\t\16\t\u00bb"+
		"\13\t\3\t\5\t\u00be\n\t\3\n\3\n\5\n\u00c2\n\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\6\f\u00cb\n\f\r\f\16\f\u00cc\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00d7\n\r\3\16\3\16\3\16\5\16\u00dc\n\16\3\17\3\17\3\17\3\17\5\17\u00e2"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u00e8\n\17\7\17\u00ea\n\17\f\17\16\17\u00ed"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21"+
		"\u00fb\n\21\3\22\3\22\3\22\5\22\u0100\n\22\3\22\3\22\6\22\u0104\n\22\r"+
		"\22\16\22\u0105\3\22\3\22\3\22\3\23\3\23\7\23\u010d\n\23\f\23\16\23\u0110"+
		"\13\23\3\23\5\23\u0113\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0142\n\31\3\32\5\32"+
		"\u0145\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u014c\n\32\3\32\5\32\u014f\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\5\33\u0156\n\33\3\33\5\33\u0159\n\33\3\34"+
		"\3\34\3\34\3\34\5\34\u015f\n\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0172\n\37\3\37\3\37"+
		"\5\37\u0176\n\37\3\37\3\37\3\37\3\37\5\37\u017c\n\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u018c\n\37"+
		"\f\37\16\37\u018f\13\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3."+
		"\3/\3/\3\60\3\60\5\60\u01ba\n\60\3\60\3\60\3\60\5\60\u01bf\n\60\3\61\3"+
		"\61\3\61\3\61\5\61\u01c5\n\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01cd"+
		"\n\62\3\63\3\63\3\63\3\63\5\63\u01d3\n\63\3\63\3\63\3\63\5\63\u01d8\n"+
		"\63\7\63\u01da\n\63\f\63\16\63\u01dd\13\63\5\63\u01df\n\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\5\64\u01e7\n\64\3\64\3\64\7\64\u01eb\n\64\f\64\16\64"+
		"\u01ee\13\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u01f7\n\65\3\65\3"+
		"\65\3\65\5\65\u01fc\n\65\3\66\3\66\3\66\3\66\5\66\u0202\n\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\2\3<9\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2"+
		"\6\3\2\33\35\3\2\36\37\4\2\4\5 #\3\2%(\2\u022a\2s\3\2\2\2\4{\3\2\2\2\6"+
		"\u0080\3\2\2\2\b\u008b\3\2\2\2\n\u009b\3\2\2\2\f\u00a7\3\2\2\2\16\u00ad"+
		"\3\2\2\2\20\u00bd\3\2\2\2\22\u00c1\3\2\2\2\24\u00c5\3\2\2\2\26\u00ca\3"+
		"\2\2\2\30\u00d6\3\2\2\2\32\u00db\3\2\2\2\34\u00dd\3\2\2\2\36\u00f0\3\2"+
		"\2\2 \u00f7\3\2\2\2\"\u0103\3\2\2\2$\u010a\3\2\2\2&\u0114\3\2\2\2(\u011c"+
		"\3\2\2\2*\u0125\3\2\2\2,\u012a\3\2\2\2.\u012c\3\2\2\2\60\u0134\3\2\2\2"+
		"\62\u014e\3\2\2\2\64\u0158\3\2\2\2\66\u015a\3\2\2\28\u0162\3\2\2\2:\u0164"+
		"\3\2\2\2<\u017b\3\2\2\2>\u0190\3\2\2\2@\u0192\3\2\2\2B\u0194\3\2\2\2D"+
		"\u0196\3\2\2\2F\u0198\3\2\2\2H\u019a\3\2\2\2J\u019c\3\2\2\2L\u019e\3\2"+
		"\2\2N\u01a0\3\2\2\2P\u01a2\3\2\2\2R\u01a4\3\2\2\2T\u01a6\3\2\2\2V\u01a9"+
		"\3\2\2\2X\u01ab\3\2\2\2Z\u01b0\3\2\2\2\\\u01b5\3\2\2\2^\u01b9\3\2\2\2"+
		"`\u01c4\3\2\2\2b\u01cc\3\2\2\2d\u01ce\3\2\2\2f\u01e2\3\2\2\2h\u01f1\3"+
		"\2\2\2j\u01fd\3\2\2\2l\u0205\3\2\2\2n\u020a\3\2\2\2pr\5\4\3\2qp\3\2\2"+
		"\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2ty\3\2\2\2us\3\2\2\2vz\5\32\16\2wz\5\6"+
		"\4\2xz\5\f\7\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\3\3\2\2\2{|\7\3\2\2|}\7"+
		"\4\2\2}~\5> \2~\177\7\5\2\2\177\5\3\2\2\2\u0080\u0081\5T+\2\u0081\u0083"+
		"\7\6\2\2\u0082\u0084\5\b\5\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\7"+
		"\2\2\u0088\7\3\2\2\2\u0089\u008c\5V,\2\u008a\u008c\5T+\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008a\3\2\2\2\u008c\u0095\3\2\2\2\u008d\u0092\5\n\6\2\u008e"+
		"\u008f\7\b\2\2\u008f\u0091\5\n\6\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\7\t\2\2\u0098\t\3\2\2\2\u0099\u009c\5@!\2\u009a\u009c"+
		"\5X-\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u00a5\3\2\2\2\u009d"+
		"\u00a3\7\n\2\2\u009e\u00a4\7\13\2\2\u009f\u00a4\5B\"\2\u00a0\u00a4\5D"+
		"#\2\u00a1\u00a4\5H%\2\u00a2\u00a4\5F$\2\u00a3\u009e\3\2\2\2\u00a3\u009f"+
		"\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\13\3\2\2"+
		"\2\u00a7\u00a8\5\16\b\2\u00a8\u00a9\5\24\13\2\u00a9\r\3\2\2\2\u00aa\u00ae"+
		"\5V,\2\u00ab\u00ae\5\\/\2\u00ac\u00ae\5T+\2\u00ad\u00aa\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\5@"+
		"!\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\5\20\t\2\u00b2\u00b3\7\r\2\2\u00b3"+
		"\17\3\2\2\2\u00b4\u00b9\5\22\n\2\u00b5\u00b6\7\b\2\2\u00b6\u00b8\5\22"+
		"\n\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00be\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\21\3\2\2\2\u00bf\u00c2"+
		"\5V,\2\u00c0\u00c2\5T+\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\5@!\2\u00c4\23\3\2\2\2\u00c5\u00c6\7\6\2\2"+
		"\u00c6\u00c7\5\26\f\2\u00c7\u00c8\7\16\2\2\u00c8\25\3\2\2\2\u00c9\u00cb"+
		"\5\30\r\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\27\3\2\2\2\u00ce\u00d7\5\32\16\2\u00cf\u00d7"+
		"\5\"\22\2\u00d0\u00d7\5$\23\2\u00d1\u00d7\5.\30\2\u00d2\u00d7\5\60\31"+
		"\2\u00d3\u00d7\5\66\34\2\u00d4\u00d7\58\35\2\u00d5\u00d7\5:\36\2\u00d6"+
		"\u00ce\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d1\3\2"+
		"\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\31\3\2\2\2\u00d8\u00dc\5\34\17\2\u00d9\u00dc\5\36"+
		"\20\2\u00da\u00dc\5 \21\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc\33\3\2\2\2\u00dd\u00de\5V,\2\u00de\u00e1\5@!\2\u00df"+
		"\u00e0\7\n\2\2\u00e0\u00e2\5<\37\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00eb\3\2\2\2\u00e3\u00e4\7\b\2\2\u00e4\u00e7\5@!\2\u00e5\u00e6"+
		"\7\n\2\2\u00e6\u00e8\5<\37\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e3\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00ef\7\t\2\2\u00ef\35\3\2\2\2\u00f0\u00f1\5V,\2\u00f1\u00f2\5@!\2\u00f2"+
		"\u00f3\7\17\2\2\u00f3\u00f4\5B\"\2\u00f4\u00f5\7\20\2\2\u00f5\u00f6\7"+
		"\t\2\2\u00f6\37\3\2\2\2\u00f7\u00fa\5T+\2\u00f8\u00fb\5@!\2\u00f9\u00fb"+
		"\5X-\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb!\3\2\2\2\u00fc\u0100"+
		"\5Z.\2\u00fd\u0100\5@!\2\u00fe\u0100\5^\60\2\u00ff\u00fc\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\n"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u00ff\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\5<"+
		"\37\2\u0108\u0109\7\t\2\2\u0109#\3\2\2\2\u010a\u010e\5&\24\2\u010b\u010d"+
		"\5(\25\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113\5*"+
		"\26\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113%\3\2\2\2\u0114\u0115"+
		"\7\21\2\2\u0115\u0116\7\f\2\2\u0116\u0117\5,\27\2\u0117\u0118\7\r\2\2"+
		"\u0118\u0119\7\6\2\2\u0119\u011a\5\26\f\2\u011a\u011b\7\16\2\2\u011b\'"+
		"\3\2\2\2\u011c\u011d\7\22\2\2\u011d\u011e\7\21\2\2\u011e\u011f\7\f\2\2"+
		"\u011f\u0120\5,\27\2\u0120\u0121\7\r\2\2\u0121\u0122\7\6\2\2\u0122\u0123"+
		"\5\26\f\2\u0123\u0124\7\16\2\2\u0124)\3\2\2\2\u0125\u0126\7\22\2\2\u0126"+
		"\u0127\7\6\2\2\u0127\u0128\5\26\f\2\u0128\u0129\7\16\2\2\u0129+\3\2\2"+
		"\2\u012a\u012b\5<\37\2\u012b-\3\2\2\2\u012c\u012d\7\23\2\2\u012d\u012e"+
		"\7\f\2\2\u012e\u012f\5,\27\2\u012f\u0130\7\r\2\2\u0130\u0131\7\6\2\2\u0131"+
		"\u0132\5\26\f\2\u0132\u0133\7\16\2\2\u0133/\3\2\2\2\u0134\u0135\7\24\2"+
		"\2\u0135\u0136\7\f\2\2\u0136\u0137\5\62\32\2\u0137\u0138\7\t\2\2\u0138"+
		"\u0139\5,\27\2\u0139\u013a\7\t\2\2\u013a\u013b\5\64\33\2\u013b\u0141\7"+
		"\r\2\2\u013c\u013d\7\6\2\2\u013d\u013e\5\26\f\2\u013e\u013f\7\16\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u0142\7\t\2\2\u0141\u013c\3\2\2\2\u0141\u0140\3\2"+
		"\2\2\u0142\61\3\2\2\2\u0143\u0145\5V,\2\u0144\u0143\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\5@!\2\u0147\u0148\7\n\2\2\u0148"+
		"\u014b\5<\37\2\u0149\u014a\7\b\2\2\u014a\u014c\5\62\32\2\u014b\u0149\3"+
		"\2\2\2\u014b\u014c\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014f\3\2\2\2\u014e"+
		"\u0144\3\2\2\2\u014e\u014d\3\2\2\2\u014f\63\3\2\2\2\u0150\u0151\5@!\2"+
		"\u0151\u0152\7\n\2\2\u0152\u0155\5<\37\2\u0153\u0154\7\b\2\2\u0154\u0156"+
		"\5\64\33\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2"+
		"\u0157\u0159\3\2\2\2\u0158\u0150\3\2\2\2\u0158\u0157\3\2\2\2\u0159\65"+
		"\3\2\2\2\u015a\u015e\7\25\2\2\u015b\u015f\5B\"\2\u015c\u015f\5@!\2\u015d"+
		"\u015f\5D#\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2"+
		"\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7\t\2\2\u0161\67"+
		"\3\2\2\2\u0162\u0163\7\26\2\2\u01639\3\2\2\2\u0164\u0165\7\27\2\2\u0165"+
		";\3\2\2\2\u0166\u0167\b\37\1\2\u0167\u0168\7\f\2\2\u0168\u0169\5<\37\2"+
		"\u0169\u016a\7\r\2\2\u016a\u017c\3\2\2\2\u016b\u016c\7\30\2\2\u016c\u017c"+
		"\5<\37\20\u016d\u017c\5@!\2\u016e\u017c\5^\60\2\u016f\u017c\5Z.\2\u0170"+
		"\u0172\7\37\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3"+
		"\2\2\2\u0173\u017c\5B\"\2\u0174\u0176\7\37\2\2\u0175\u0174\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017c\5D#\2\u0178\u017c\5F$\2"+
		"\u0179\u017c\5H%\2\u017a\u017c\5b\62\2\u017b\u0166\3\2\2\2\u017b\u016b"+
		"\3\2\2\2\u017b\u016d\3\2\2\2\u017b\u016e\3\2\2\2\u017b\u016f\3\2\2\2\u017b"+
		"\u0171\3\2\2\2\u017b\u0175\3\2\2\2\u017b\u0178\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017b\u017a\3\2\2\2\u017c\u018d\3\2\2\2\u017d\u017e\f\17\2\2\u017e"+
		"\u017f\7\31\2\2\u017f\u018c\5<\37\20\u0180\u0181\f\16\2\2\u0181\u0182"+
		"\7\32\2\2\u0182\u018c\5<\37\17\u0183\u0184\f\r\2\2\u0184\u0185\t\2\2\2"+
		"\u0185\u018c\5<\37\16\u0186\u0187\f\f\2\2\u0187\u0188\t\3\2\2\u0188\u018c"+
		"\5<\37\r\u0189\u018a\f\13\2\2\u018a\u018c\t\4\2\2\u018b\u017d\3\2\2\2"+
		"\u018b\u0180\3\2\2\2\u018b\u0183\3\2\2\2\u018b\u0186\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"=\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7\61\2\2\u0191?\3\2\2\2\u0192"+
		"\u0193\7\62\2\2\u0193A\3\2\2\2\u0194\u0195\7\63\2\2\u0195C\3\2\2\2\u0196"+
		"\u0197\7\64\2\2\u0197E\3\2\2\2\u0198\u0199\7\65\2\2\u0199G\3\2\2\2\u019a"+
		"\u019b\7\66\2\2\u019bI\3\2\2\2\u019c\u019d\7\67\2\2\u019dK\3\2\2\2\u019e"+
		"\u019f\78\2\2\u019fM\3\2\2\2\u01a0\u01a1\79\2\2\u01a1O\3\2\2\2\u01a2\u01a3"+
		"\7:\2\2\u01a3Q\3\2\2\2\u01a4\u01a5\7;\2\2\u01a5S\3\2\2\2\u01a6\u01a7\7"+
		"$\2\2\u01a7\u01a8\7\62\2\2\u01a8U\3\2\2\2\u01a9\u01aa\t\5\2\2\u01aaW\3"+
		"\2\2\2\u01ab\u01ac\5@!\2\u01ac\u01ad\7\17\2\2\u01ad\u01ae\5B\"\2\u01ae"+
		"\u01af\7\20\2\2\u01afY\3\2\2\2\u01b0\u01b1\5@!\2\u01b1\u01b2\7\17\2\2"+
		"\u01b2\u01b3\5<\37\2\u01b3\u01b4\7\20\2\2\u01b4[\3\2\2\2\u01b5\u01b6\7"+
		")\2\2\u01b6]\3\2\2\2\u01b7\u01ba\5@!\2\u01b8\u01ba\5Z.\2\u01b9\u01b7\3"+
		"\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\7*\2\2\u01bc"+
		"\u01bf\5@!\2\u01bd\u01bf\5Z.\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2"+
		"\u01bf_\3\2\2\2\u01c0\u01c5\5B\"\2\u01c1\u01c5\5D#\2\u01c2\u01c5\5F$\2"+
		"\u01c3\u01c5\5H%\2\u01c4\u01c0\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c4\u01c2"+
		"\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5a\3\2\2\2\u01c6\u01cd\5f\64\2\u01c7"+
		"\u01cd\5h\65\2\u01c8\u01cd\5j\66\2\u01c9\u01cd\5l\67\2\u01ca\u01cd\5n"+
		"8\2\u01cb\u01cd\5d\63\2\u01cc\u01c6\3\2\2\2\u01cc\u01c7\3\2\2\2\u01cc"+
		"\u01c8\3\2\2\2\u01cc\u01c9\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2"+
		"\2\2\u01cdc\3\2\2\2\u01ce\u01cf\5@!\2\u01cf\u01de\7\f\2\2\u01d0\u01d3"+
		"\5`\61\2\u01d1\u01d3\5@!\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3"+
		"\u01db\3\2\2\2\u01d4\u01d7\7\b\2\2\u01d5\u01d8\5`\61\2\u01d6\u01d8\5@"+
		"!\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9"+
		"\u01d4\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01d2\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7\r\2\2\u01e1e\3\2\2\2"+
		"\u01e2\u01e3\7+\2\2\u01e3\u01e6\7\f\2\2\u01e4\u01e7\5H%\2\u01e5\u01e7"+
		"\5@!\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01ec\3\2\2\2\u01e8"+
		"\u01e9\7\b\2\2\u01e9\u01eb\5<\37\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ef\u01f0\7\r\2\2\u01f0g\3\2\2\2\u01f1\u01f2\7,\2\2\u01f2"+
		"\u01f3\7\f\2\2\u01f3\u01f4\5H%\2\u01f4\u01f6\7\b\2\2\u01f5\u01f7\7-\2"+
		"\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fb\3\2\2\2\u01f8\u01fc"+
		"\5@!\2\u01f9\u01fc\5Z.\2\u01fa\u01fc\5^\60\2\u01fb\u01f8\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fci\3\2\2\2\u01fd\u01fe\7.\2\2\u01fe"+
		"\u0201\7\f\2\2\u01ff\u0202\5@!\2\u0200\u0202\5^\60\2\u0201\u01ff\3\2\2"+
		"\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\7\r\2\2\u0204k"+
		"\3\2\2\2\u0205\u0206\7/\2\2\u0206\u0207\7\f\2\2\u0207\u0208\5@!\2\u0208"+
		"\u0209\7\r\2\2\u0209m\3\2\2\2\u020a\u020b\7\60\2\2\u020b\u020c\7\f\2\2"+
		"\u020c\u020d\5@!\2\u020d\u020e\7\r\2\2\u020eo\3\2\2\2\63sy\u0085\u008b"+
		"\u0092\u0095\u009b\u00a3\u00a5\u00ad\u00b9\u00bd\u00c1\u00cc\u00d6\u00db"+
		"\u00e1\u00e7\u00eb\u00fa\u00ff\u0105\u010e\u0112\u0141\u0144\u014b\u014e"+
		"\u0155\u0158\u015e\u0171\u0175\u017b\u018b\u018d\u01b9\u01be\u01c4\u01cc"+
		"\u01d2\u01d7\u01db\u01de\u01e6\u01ec\u01f6\u01fb\u0201";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}