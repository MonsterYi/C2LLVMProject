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
			"'[]'", "'*'", "'('", "')'", "'}'", "'['", "']'", "'if'", "'else'", "'while'", 
			"'for'", "'return'", "'continue;'", "'break;'", "'!'", "'&&'", "'||'", 
			"'/'", "'%'", "'+'", "'-'", "'=='", "'!='", "'<='", "'>='", "'struct'", 
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(168);
				match(T__9);
				}
			}

			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				{
				setState(171);
				myType();
				}
				break;
			case T__38:
				{
				setState(172);
				myVoid();
				}
				break;
			case T__33:
				{
				setState(173);
				struct();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(176);
			myID();
			setState(177);
			match(T__10);
			setState(178);
			functionParamsDef();
			setState(179);
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
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				functionParamDef();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(182);
					match(T__5);
					setState(183);
					functionParamDef();
					}
					}
					setState(188);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(192);
				match(T__9);
				}
			}

			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				{
				setState(195);
				myType();
				}
				break;
			case T__33:
				{
				setState(196);
				struct();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(199);
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
			setState(201);
			match(T__3);
			setState(202);
			block();
			setState(203);
			match(T__12);
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
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				sentence();
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << ID))) != 0) );
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
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				{
				setState(210);
				defineSentence();
				}
				break;
			case ID:
				{
				setState(211);
				assignSentence();
				}
				break;
			case T__15:
				{
				setState(212);
				ifSentenceBlock();
				}
				break;
			case T__17:
				{
				setState(213);
				whileSentence();
				}
				break;
			case T__18:
				{
				setState(214);
				forSentence();
				}
				break;
			case T__19:
				{
				setState(215);
				returnSentence();
				}
				break;
			case T__20:
				{
				setState(216);
				continueSentence();
				}
				break;
			case T__21:
				{
				setState(217);
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				baseDefineSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				arrayDefineSentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
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
			setState(225);
			myType();
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

			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(231);
				match(T__5);
				setState(232);
				myID();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(233);
					match(T__7);
					setState(234);
					expr(0);
					}
				}

				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
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
			setState(244);
			myType();
			setState(245);
			myID();
			setState(246);
			match(T__13);
			setState(247);
			myInt();
			setState(248);
			match(T__14);
			setState(249);
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
			setState(251);
			struct();
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(252);
				myID();
				}
				break;
			case 2:
				{
				setState(253);
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
			setState(263); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(256);
						arrayItem();
						}
						break;
					case 2:
						{
						setState(257);
						myID();
						}
						break;
					case 3:
						{
						setState(258);
						structItem();
						}
						break;
					}
					setState(261);
					match(T__7);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(265); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(267);
			expr(0);
			setState(268);
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
			setState(270);
			ifSentence();
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(271);
					elifSentence();
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(277);
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
			setState(280);
			match(T__15);
			setState(281);
			match(T__10);
			setState(282);
			condition();
			setState(283);
			match(T__11);
			setState(284);
			match(T__3);
			setState(285);
			block();
			setState(286);
			match(T__12);
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
			setState(288);
			match(T__16);
			setState(289);
			match(T__15);
			setState(290);
			match(T__10);
			setState(291);
			condition();
			setState(292);
			match(T__11);
			setState(293);
			match(T__3);
			setState(294);
			block();
			setState(295);
			match(T__12);
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
			setState(297);
			match(T__16);
			setState(298);
			match(T__3);
			setState(299);
			block();
			setState(300);
			match(T__12);
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
			setState(302);
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
			setState(304);
			match(T__17);
			setState(305);
			match(T__10);
			setState(306);
			condition();
			setState(307);
			match(T__11);
			setState(308);
			match(T__3);
			setState(309);
			block();
			setState(310);
			match(T__12);
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
			setState(312);
			match(T__18);
			setState(313);
			match(T__10);
			setState(314);
			forDefineSentence();
			setState(315);
			match(T__6);
			setState(316);
			condition();
			setState(317);
			match(T__6);
			setState(318);
			forIteratorSentence();
			setState(319);
			match(T__11);
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(320);
				match(T__3);
				setState(321);
				block();
				setState(322);
				match(T__12);
				}
				break;
			case T__6:
				{
				setState(324);
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
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
					{
					setState(327);
					myType();
					}
				}

				setState(330);
				myID();
				setState(331);
				match(T__7);
				setState(332);
				expr(0);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(333);
					match(T__5);
					setState(334);
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
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				myID();
				setState(341);
				match(T__7);
				setState(342);
				expr(0);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(343);
					match(T__5);
					setState(344);
					forIteratorSentence();
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
			setState(350);
			match(T__19);
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(351);
				myInt();
				}
				break;
			case ID:
				{
				setState(352);
				myID();
				}
				break;
			case DOUBLE:
				{
				setState(353);
				myDouble();
				}
				break;
			case T__6:
				break;
			default:
				break;
			}
			setState(356);
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
			setState(358);
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
			setState(360);
			match(T__21);
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
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MyIDContext myID() {
			return getRuleContext(MyIDContext.class,0);
		}
		public StructItemContext structItem() {
			return getRuleContext(StructItemContext.class,0);
		}
		public ArrayItemContext arrayItem() {
			return getRuleContext(ArrayItemContext.class,0);
		}
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
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
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(363);
				match(T__10);
				setState(364);
				expr(0);
				setState(365);
				match(T__11);
				}
				break;
			case 2:
				{
				setState(367);
				((ExprContext)_localctx).op = match(T__22);
				setState(368);
				expr(14);
				}
				break;
			case 3:
				{
				setState(369);
				myID();
				}
				break;
			case 4:
				{
				setState(370);
				structItem();
				}
				break;
			case 5:
				{
				setState(371);
				arrayItem();
				}
				break;
			case 6:
				{
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(372);
					((ExprContext)_localctx).op = match(T__28);
					}
				}

				setState(375);
				myInt();
				}
				break;
			case 7:
				{
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(376);
					((ExprContext)_localctx).op = match(T__28);
					}
				}

				setState(379);
				myDouble();
				}
				break;
			case 8:
				{
				setState(380);
				myChar();
				}
				break;
			case 9:
				{
				setState(381);
				myString();
				}
				break;
			case 10:
				{
				setState(382);
				function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(385);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(386);
						match(T__23);
						setState(387);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(388);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(389);
						match(T__24);
						setState(390);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(391);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(392);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__25) | (1L << T__26))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(393);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(394);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(395);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(396);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(397);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(398);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
			setState(404);
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
			setState(406);
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
			setState(408);
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
			setState(410);
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
			setState(412);
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
			setState(414);
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
			setState(416);
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
			setState(418);
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
			setState(420);
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
			setState(422);
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
			setState(424);
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
			setState(426);
			match(T__33);
			setState(427);
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
			setState(429);
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
			setState(431);
			myID();
			setState(432);
			match(T__13);
			setState(433);
			myInt();
			setState(434);
			match(T__14);
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
			setState(436);
			myID();
			setState(437);
			match(T__13);
			setState(438);
			expr(0);
			setState(439);
			match(T__14);
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
			setState(441);
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
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(443);
				myID();
				}
				break;
			case 2:
				{
				setState(444);
				arrayItem();
				}
				break;
			}
			setState(447);
			match(T__39);
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(448);
				myID();
				}
				break;
			case 2:
				{
				setState(449);
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
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				myInt();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				myDouble();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				myChar();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(455);
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
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				{
				setState(458);
				printFunc();
				}
				break;
			case T__41:
				{
				setState(459);
				scanfFunc();
				}
				break;
			case T__43:
				{
				setState(460);
				getsFunc();
				}
				break;
			case T__44:
				{
				setState(461);
				strlenFunc();
				}
				break;
			case T__45:
				{
				setState(462);
				atoiFunc();
				}
				break;
			case ID:
				{
				setState(463);
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
			setState(466);
			myID();
			setState(467);
			match(T__10);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(470);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DOUBLE:
				case CHAR:
				case STRING:
					{
					setState(468);
					argument();
					}
					break;
				case ID:
					{
					setState(469);
					myID();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(472);
					match(T__5);
					setState(475);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case DOUBLE:
					case CHAR:
					case STRING:
						{
						setState(473);
						argument();
						}
						break;
					case ID:
						{
						setState(474);
						myID();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(484);
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
			setState(486);
			match(T__40);
			setState(487);
			match(T__10);
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(488);
				myString();
				}
				break;
			case ID:
				{
				setState(489);
				myID();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(492);
				match(T__5);
				setState(493);
				expr(0);
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
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
			setState(501);
			match(T__41);
			setState(502);
			match(T__10);
			setState(503);
			myString();
			{
			setState(504);
			match(T__5);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(505);
				match(T__42);
				}
			}

			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(508);
				myID();
				}
				break;
			case 2:
				{
				setState(509);
				arrayItem();
				}
				break;
			case 3:
				{
				setState(510);
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
			setState(513);
			match(T__43);
			setState(514);
			match(T__10);
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(515);
				myID();
				}
				break;
			case 2:
				{
				setState(516);
				structItem();
				}
				break;
			}
			setState(519);
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
			setState(521);
			match(T__44);
			setState(522);
			match(T__10);
			setState(523);
			myID();
			setState(524);
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
			setState(526);
			match(T__45);
			setState(527);
			match(T__10);
			setState(528);
			myID();
			setState(529);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0216\4\2\t\2\4"+
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
		"\3\6\3\6\3\6\3\6\5\6\u00a4\n\6\5\6\u00a6\n\6\3\7\3\7\3\7\3\b\5\b\u00ac"+
		"\n\b\3\b\3\b\3\b\5\b\u00b1\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00bb"+
		"\n\t\f\t\16\t\u00be\13\t\3\t\5\t\u00c1\n\t\3\n\5\n\u00c4\n\n\3\n\3\n\5"+
		"\n\u00c8\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\f\u00d1\n\f\r\f\16\f\u00d2"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00dd\n\r\3\16\3\16\3\16\5\16\u00e2"+
		"\n\16\3\17\3\17\3\17\3\17\5\17\u00e8\n\17\3\17\3\17\3\17\3\17\5\17\u00ee"+
		"\n\17\7\17\u00f0\n\17\f\17\16\17\u00f3\13\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u0101\n\21\3\22\3\22\3\22\5\22"+
		"\u0106\n\22\3\22\3\22\6\22\u010a\n\22\r\22\16\22\u010b\3\22\3\22\3\22"+
		"\3\23\3\23\7\23\u0113\n\23\f\23\16\23\u0116\13\23\3\23\5\23\u0119\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0148\n\31\3\32\5\32\u014b\n\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u0152\n\32\3\32\5\32\u0155\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u015c\n\33\3\33\5\33\u015f\n\33\3\34\3\34\3\34\3\34\5\34\u0165\n"+
		"\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u0178\n\37\3\37\3\37\5\37\u017c\n\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0182\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u0192\n\37\f\37\16\37\u0195\13\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3+\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\5\60\u01c0\n"+
		"\60\3\60\3\60\3\60\5\60\u01c5\n\60\3\61\3\61\3\61\3\61\5\61\u01cb\n\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01d3\n\62\3\63\3\63\3\63\3\63\5\63"+
		"\u01d9\n\63\3\63\3\63\3\63\5\63\u01de\n\63\7\63\u01e0\n\63\f\63\16\63"+
		"\u01e3\13\63\5\63\u01e5\n\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u01ed"+
		"\n\64\3\64\3\64\7\64\u01f1\n\64\f\64\16\64\u01f4\13\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\5\65\u01fd\n\65\3\65\3\65\3\65\5\65\u0202\n\65\3"+
		"\66\3\66\3\66\3\66\5\66\u0208\n\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\2\3<9\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\6\4\2\f\f\34\35\3\2\36"+
		"\37\4\2\4\5 #\3\2%(\2\u0232\2s\3\2\2\2\4{\3\2\2\2\6\u0080\3\2\2\2\b\u008b"+
		"\3\2\2\2\n\u009b\3\2\2\2\f\u00a7\3\2\2\2\16\u00ab\3\2\2\2\20\u00c0\3\2"+
		"\2\2\22\u00c3\3\2\2\2\24\u00cb\3\2\2\2\26\u00d0\3\2\2\2\30\u00dc\3\2\2"+
		"\2\32\u00e1\3\2\2\2\34\u00e3\3\2\2\2\36\u00f6\3\2\2\2 \u00fd\3\2\2\2\""+
		"\u0109\3\2\2\2$\u0110\3\2\2\2&\u011a\3\2\2\2(\u0122\3\2\2\2*\u012b\3\2"+
		"\2\2,\u0130\3\2\2\2.\u0132\3\2\2\2\60\u013a\3\2\2\2\62\u0154\3\2\2\2\64"+
		"\u015e\3\2\2\2\66\u0160\3\2\2\28\u0168\3\2\2\2:\u016a\3\2\2\2<\u0181\3"+
		"\2\2\2>\u0196\3\2\2\2@\u0198\3\2\2\2B\u019a\3\2\2\2D\u019c\3\2\2\2F\u019e"+
		"\3\2\2\2H\u01a0\3\2\2\2J\u01a2\3\2\2\2L\u01a4\3\2\2\2N\u01a6\3\2\2\2P"+
		"\u01a8\3\2\2\2R\u01aa\3\2\2\2T\u01ac\3\2\2\2V\u01af\3\2\2\2X\u01b1\3\2"+
		"\2\2Z\u01b6\3\2\2\2\\\u01bb\3\2\2\2^\u01bf\3\2\2\2`\u01ca\3\2\2\2b\u01d2"+
		"\3\2\2\2d\u01d4\3\2\2\2f\u01e8\3\2\2\2h\u01f7\3\2\2\2j\u0203\3\2\2\2l"+
		"\u020b\3\2\2\2n\u0210\3\2\2\2pr\5\4\3\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2ty\3\2\2\2us\3\2\2\2vz\5\32\16\2wz\5\6\4\2xz\5\f\7\2yv\3\2\2"+
		"\2yw\3\2\2\2yx\3\2\2\2z\3\3\2\2\2{|\7\3\2\2|}\7\4\2\2}~\5> \2~\177\7\5"+
		"\2\2\177\5\3\2\2\2\u0080\u0081\5T+\2\u0081\u0083\7\6\2\2\u0082\u0084\5"+
		"\b\5\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\7\2\2\u0088\7\3\2\2\2"+
		"\u0089\u008c\5V,\2\u008a\u008c\5T+\2\u008b\u0089\3\2\2\2\u008b\u008a\3"+
		"\2\2\2\u008c\u0095\3\2\2\2\u008d\u0092\5\n\6\2\u008e\u008f\7\b\2\2\u008f"+
		"\u0091\5\n\6\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u008d\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\t"+
		"\2\2\u0098\t\3\2\2\2\u0099\u009c\5@!\2\u009a\u009c\5X-\2\u009b\u0099\3"+
		"\2\2\2\u009b\u009a\3\2\2\2\u009c\u00a5\3\2\2\2\u009d\u00a3\7\n\2\2\u009e"+
		"\u00a4\7\13\2\2\u009f\u00a4\5B\"\2\u00a0\u00a4\5D#\2\u00a1\u00a4\5H%\2"+
		"\u00a2\u00a4\5F$\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a0"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u009d\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\13\3\2\2\2\u00a7\u00a8\5\16\b"+
		"\2\u00a8\u00a9\5\24\13\2\u00a9\r\3\2\2\2\u00aa\u00ac\7\f\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b0\3\2\2\2\u00ad\u00b1\5V,\2\u00ae"+
		"\u00b1\5\\/\2\u00af\u00b1\5T+\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2"+
		"\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\5@!\2\u00b3\u00b4"+
		"\7\r\2\2\u00b4\u00b5\5\20\t\2\u00b5\u00b6\7\16\2\2\u00b6\17\3\2\2\2\u00b7"+
		"\u00bc\5\22\n\2\u00b8\u00b9\7\b\2\2\u00b9\u00bb\5\22\n\2\u00ba\u00b8\3"+
		"\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c1\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b7\3\2"+
		"\2\2\u00c0\u00bf\3\2\2\2\u00c1\21\3\2\2\2\u00c2\u00c4\7\f\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c8\5V,\2\u00c6"+
		"\u00c8\5T+\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2"+
		"\2\u00c9\u00ca\5@!\2\u00ca\23\3\2\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00cd"+
		"\5\26\f\2\u00cd\u00ce\7\17\2\2\u00ce\25\3\2\2\2\u00cf\u00d1\5\30\r\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\27\3\2\2\2\u00d4\u00dd\5\32\16\2\u00d5\u00dd\5\"\22\2\u00d6"+
		"\u00dd\5$\23\2\u00d7\u00dd\5.\30\2\u00d8\u00dd\5\60\31\2\u00d9\u00dd\5"+
		"\66\34\2\u00da\u00dd\58\35\2\u00db\u00dd\5:\36\2\u00dc\u00d4\3\2\2\2\u00dc"+
		"\u00d5\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2"+
		"\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\31\3\2\2\2\u00de\u00e2\5\34\17\2\u00df\u00e2\5\36\20\2\u00e0\u00e2\5"+
		" \21\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\33\3\2\2\2\u00e3\u00e4\5V,\2\u00e4\u00e7\5@!\2\u00e5\u00e6\7\n\2\2\u00e6"+
		"\u00e8\5<\37\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00f1\3\2"+
		"\2\2\u00e9\u00ea\7\b\2\2\u00ea\u00ed\5@!\2\u00eb\u00ec\7\n\2\2\u00ec\u00ee"+
		"\5<\37\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00e9\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\t\2\2\u00f5"+
		"\35\3\2\2\2\u00f6\u00f7\5V,\2\u00f7\u00f8\5@!\2\u00f8\u00f9\7\20\2\2\u00f9"+
		"\u00fa\5B\"\2\u00fa\u00fb\7\21\2\2\u00fb\u00fc\7\t\2\2\u00fc\37\3\2\2"+
		"\2\u00fd\u0100\5T+\2\u00fe\u0101\5@!\2\u00ff\u0101\5X-\2\u0100\u00fe\3"+
		"\2\2\2\u0100\u00ff\3\2\2\2\u0101!\3\2\2\2\u0102\u0106\5Z.\2\u0103\u0106"+
		"\5@!\2\u0104\u0106\5^\60\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7\n\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u0105\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\5<\37\2\u010e\u010f\7\t"+
		"\2\2\u010f#\3\2\2\2\u0110\u0114\5&\24\2\u0111\u0113\5(\25\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\5*\26\2\u0118\u0117\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119%\3\2\2\2\u011a\u011b\7\22\2\2\u011b\u011c"+
		"\7\r\2\2\u011c\u011d\5,\27\2\u011d\u011e\7\16\2\2\u011e\u011f\7\6\2\2"+
		"\u011f\u0120\5\26\f\2\u0120\u0121\7\17\2\2\u0121\'\3\2\2\2\u0122\u0123"+
		"\7\23\2\2\u0123\u0124\7\22\2\2\u0124\u0125\7\r\2\2\u0125\u0126\5,\27\2"+
		"\u0126\u0127\7\16\2\2\u0127\u0128\7\6\2\2\u0128\u0129\5\26\f\2\u0129\u012a"+
		"\7\17\2\2\u012a)\3\2\2\2\u012b\u012c\7\23\2\2\u012c\u012d\7\6\2\2\u012d"+
		"\u012e\5\26\f\2\u012e\u012f\7\17\2\2\u012f+\3\2\2\2\u0130\u0131\5<\37"+
		"\2\u0131-\3\2\2\2\u0132\u0133\7\24\2\2\u0133\u0134\7\r\2\2\u0134\u0135"+
		"\5,\27\2\u0135\u0136\7\16\2\2\u0136\u0137\7\6\2\2\u0137\u0138\5\26\f\2"+
		"\u0138\u0139\7\17\2\2\u0139/\3\2\2\2\u013a\u013b\7\25\2\2\u013b\u013c"+
		"\7\r\2\2\u013c\u013d\5\62\32\2\u013d\u013e\7\t\2\2\u013e\u013f\5,\27\2"+
		"\u013f\u0140\7\t\2\2\u0140\u0141\5\64\33\2\u0141\u0147\7\16\2\2\u0142"+
		"\u0143\7\6\2\2\u0143\u0144\5\26\f\2\u0144\u0145\7\17\2\2\u0145\u0148\3"+
		"\2\2\2\u0146\u0148\7\t\2\2\u0147\u0142\3\2\2\2\u0147\u0146\3\2\2\2\u0148"+
		"\61\3\2\2\2\u0149\u014b\5V,\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c\u014d\5@!\2\u014d\u014e\7\n\2\2\u014e\u0151"+
		"\5<\37\2\u014f\u0150\7\b\2\2\u0150\u0152\5\62\32\2\u0151\u014f\3\2\2\2"+
		"\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u014a"+
		"\3\2\2\2\u0154\u0153\3\2\2\2\u0155\63\3\2\2\2\u0156\u0157\5@!\2\u0157"+
		"\u0158\7\n\2\2\u0158\u015b\5<\37\2\u0159\u015a\7\b\2\2\u015a\u015c\5\64"+
		"\33\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u0156\3\2\2\2\u015e\u015d\3\2\2\2\u015f\65\3\2\2"+
		"\2\u0160\u0164\7\26\2\2\u0161\u0165\5B\"\2\u0162\u0165\5@!\2\u0163\u0165"+
		"\5D#\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\7\t\2\2\u0167\67\3\2\2"+
		"\2\u0168\u0169\7\27\2\2\u01699\3\2\2\2\u016a\u016b\7\30\2\2\u016b;\3\2"+
		"\2\2\u016c\u016d\b\37\1\2\u016d\u016e\7\r\2\2\u016e\u016f\5<\37\2\u016f"+
		"\u0170\7\16\2\2\u0170\u0182\3\2\2\2\u0171\u0172\7\31\2\2\u0172\u0182\5"+
		"<\37\20\u0173\u0182\5@!\2\u0174\u0182\5^\60\2\u0175\u0182\5Z.\2\u0176"+
		"\u0178\7\37\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3"+
		"\2\2\2\u0179\u0182\5B\"\2\u017a\u017c\7\37\2\2\u017b\u017a\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0182\5D#\2\u017e\u0182\5F$\2"+
		"\u017f\u0182\5H%\2\u0180\u0182\5b\62\2\u0181\u016c\3\2\2\2\u0181\u0171"+
		"\3\2\2\2\u0181\u0173\3\2\2\2\u0181\u0174\3\2\2\2\u0181\u0175\3\2\2\2\u0181"+
		"\u0177\3\2\2\2\u0181\u017b\3\2\2\2\u0181\u017e\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0180\3\2\2\2\u0182\u0193\3\2\2\2\u0183\u0184\f\17\2\2\u0184"+
		"\u0185\7\32\2\2\u0185\u0192\5<\37\20\u0186\u0187\f\16\2\2\u0187\u0188"+
		"\7\33\2\2\u0188\u0192\5<\37\17\u0189\u018a\f\r\2\2\u018a\u018b\t\2\2\2"+
		"\u018b\u0192\5<\37\16\u018c\u018d\f\f\2\2\u018d\u018e\t\3\2\2\u018e\u0192"+
		"\5<\37\r\u018f\u0190\f\13\2\2\u0190\u0192\t\4\2\2\u0191\u0183\3\2\2\2"+
		"\u0191\u0186\3\2\2\2\u0191\u0189\3\2\2\2\u0191\u018c\3\2\2\2\u0191\u018f"+
		"\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"=\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7\61\2\2\u0197?\3\2\2\2\u0198"+
		"\u0199\7\62\2\2\u0199A\3\2\2\2\u019a\u019b\7\63\2\2\u019bC\3\2\2\2\u019c"+
		"\u019d\7\64\2\2\u019dE\3\2\2\2\u019e\u019f\7\65\2\2\u019fG\3\2\2\2\u01a0"+
		"\u01a1\7\66\2\2\u01a1I\3\2\2\2\u01a2\u01a3\7\67\2\2\u01a3K\3\2\2\2\u01a4"+
		"\u01a5\78\2\2\u01a5M\3\2\2\2\u01a6\u01a7\79\2\2\u01a7O\3\2\2\2\u01a8\u01a9"+
		"\7:\2\2\u01a9Q\3\2\2\2\u01aa\u01ab\7;\2\2\u01abS\3\2\2\2\u01ac\u01ad\7"+
		"$\2\2\u01ad\u01ae\7\62\2\2\u01aeU\3\2\2\2\u01af\u01b0\t\5\2\2\u01b0W\3"+
		"\2\2\2\u01b1\u01b2\5@!\2\u01b2\u01b3\7\20\2\2\u01b3\u01b4\5B\"\2\u01b4"+
		"\u01b5\7\21\2\2\u01b5Y\3\2\2\2\u01b6\u01b7\5@!\2\u01b7\u01b8\7\20\2\2"+
		"\u01b8\u01b9\5<\37\2\u01b9\u01ba\7\21\2\2\u01ba[\3\2\2\2\u01bb\u01bc\7"+
		")\2\2\u01bc]\3\2\2\2\u01bd\u01c0\5@!\2\u01be\u01c0\5Z.\2\u01bf\u01bd\3"+
		"\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c4\7*\2\2\u01c2"+
		"\u01c5\5@!\2\u01c3\u01c5\5Z.\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2"+
		"\u01c5_\3\2\2\2\u01c6\u01cb\5B\"\2\u01c7\u01cb\5D#\2\u01c8\u01cb\5F$\2"+
		"\u01c9\u01cb\5H%\2\u01ca\u01c6\3\2\2\2\u01ca\u01c7\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cba\3\2\2\2\u01cc\u01d3\5f\64\2\u01cd"+
		"\u01d3\5h\65\2\u01ce\u01d3\5j\66\2\u01cf\u01d3\5l\67\2\u01d0\u01d3\5n"+
		"8\2\u01d1\u01d3\5d\63\2\u01d2\u01cc\3\2\2\2\u01d2\u01cd\3\2\2\2\u01d2"+
		"\u01ce\3\2\2\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2"+
		"\2\2\u01d3c\3\2\2\2\u01d4\u01d5\5@!\2\u01d5\u01e4\7\r\2\2\u01d6\u01d9"+
		"\5`\61\2\u01d7\u01d9\5@!\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"\u01e1\3\2\2\2\u01da\u01dd\7\b\2\2\u01db\u01de\5`\61\2\u01dc\u01de\5@"+
		"!\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de\u01e0\3\2\2\2\u01df"+
		"\u01da\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01d8\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\7\16\2\2\u01e7e\3\2\2\2"+
		"\u01e8\u01e9\7+\2\2\u01e9\u01ec\7\r\2\2\u01ea\u01ed\5H%\2\u01eb\u01ed"+
		"\5@!\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01f2\3\2\2\2\u01ee"+
		"\u01ef\7\b\2\2\u01ef\u01f1\5<\37\2\u01f0\u01ee\3\2\2\2\u01f1\u01f4\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f5\u01f6\7\16\2\2\u01f6g\3\2\2\2\u01f7\u01f8\7,\2\2"+
		"\u01f8\u01f9\7\r\2\2\u01f9\u01fa\5H%\2\u01fa\u01fc\7\b\2\2\u01fb\u01fd"+
		"\7-\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0201\3\2\2\2\u01fe"+
		"\u0202\5@!\2\u01ff\u0202\5Z.\2\u0200\u0202\5^\60\2\u0201\u01fe\3\2\2\2"+
		"\u0201\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202i\3\2\2\2\u0203\u0204\7"+
		".\2\2\u0204\u0207\7\r\2\2\u0205\u0208\5@!\2\u0206\u0208\5^\60\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\7\16"+
		"\2\2\u020ak\3\2\2\2\u020b\u020c\7/\2\2\u020c\u020d\7\r\2\2\u020d\u020e"+
		"\5@!\2\u020e\u020f\7\16\2\2\u020fm\3\2\2\2\u0210\u0211\7\60\2\2\u0211"+
		"\u0212\7\r\2\2\u0212\u0213\5@!\2\u0213\u0214\7\16\2\2\u0214o\3\2\2\2\65"+
		"sy\u0085\u008b\u0092\u0095\u009b\u00a3\u00a5\u00ab\u00b0\u00bc\u00c0\u00c3"+
		"\u00c7\u00d2\u00dc\u00e1\u00e7\u00ed\u00f1\u0100\u0105\u010b\u0114\u0118"+
		"\u0147\u014a\u0151\u0154\u015b\u015e\u0164\u0177\u017b\u0181\u0191\u0193"+
		"\u01bf\u01c4\u01ca\u01d2\u01d8\u01dd\u01e1\u01e4\u01ec\u01f2\u01fc\u0201"+
		"\u0207";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}