// Generated from c:\Users\75993\Desktop\����ԭ��\project\C2LLVMProject\src\Parser\simpleC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCLexer extends Lexer {
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
		T__38=39, T__39=40, T__40=41, T__41=42, ID=43, INT=44, DOUBLE=45, CHAR=46, 
		STRING=47, LIB=48, Conjunction=49, Operator=50, LineComment=51, BlockComment=52, 
		WS=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "ID", "INT", "DOUBLE", "CHAR", "STRING", "LIB", "Conjunction", 
			"Operator", "LineComment", "BlockComment", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'>'", "'{'", "'}'", "';'", "','", "'('", 
			"')'", "'='", "'['", "']'", "'if'", "'else'", "'while'", "'for'", "'return'", 
			"'!'", "'*'", "'/'", "'%'", "'+'", "'-'", "'=='", "'!='", "'<='", "'>='", 
			"'&&'", "'||'", "'int'", "'double'", "'char'", "'string'", "'void'", 
			"'struct'", "'.'", "'strlen'", "'atoi'", "'printf'", "'scanf'", "'&'", 
			"'gets'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "INT", "DOUBLE", "CHAR", 
			"STRING", "LIB", "Conjunction", "Operator", "LineComment", "BlockComment", 
			"WS"
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


	public simpleCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u016d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\3*\3*\3+\3+\3+\3+\3+\3,\3,\7,\u010b\n,\f,\16,\u010e\13,\3-\6-\u0111"+
		"\n-\r-\16-\u0112\3.\6.\u0116\n.\r.\16.\u0117\3.\3.\6.\u011c\n.\r.\16."+
		"\u011d\3/\3/\3/\3/\3\60\3\60\7\60\u0126\n\60\f\60\16\60\u0129\13\60\3"+
		"\60\3\60\3\61\6\61\u012e\n\61\r\61\16\61\u012f\3\61\3\61\5\61\u0134\n"+
		"\61\3\62\3\62\3\62\3\62\5\62\u013a\n\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u0147\n\63\3\64\3\64\3\64\3\64\7\64\u014d"+
		"\n\64\f\64\16\64\u0150\13\64\3\64\5\64\u0153\n\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\7\65\u015d\n\65\f\65\16\65\u0160\13\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\6\66\u0168\n\66\r\66\16\66\u0169\3\66\3\66\5\u0127"+
		"\u014e\u015e\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2C\\c|\6\2##,-"+
		"//\61\61\5\2\13\f\17\17\"\"\2\u017e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5v\3\2\2\2\7x\3\2\2\2\tz\3\2\2\2"+
		"\13|\3\2\2\2\r~\3\2\2\2\17\u0080\3\2\2\2\21\u0082\3\2\2\2\23\u0084\3\2"+
		"\2\2\25\u0086\3\2\2\2\27\u0088\3\2\2\2\31\u008a\3\2\2\2\33\u008c\3\2\2"+
		"\2\35\u008f\3\2\2\2\37\u0094\3\2\2\2!\u009a\3\2\2\2#\u009e\3\2\2\2%\u00a5"+
		"\3\2\2\2\'\u00a7\3\2\2\2)\u00a9\3\2\2\2+\u00ab\3\2\2\2-\u00ad\3\2\2\2"+
		"/\u00af\3\2\2\2\61\u00b1\3\2\2\2\63\u00b4\3\2\2\2\65\u00b7\3\2\2\2\67"+
		"\u00ba\3\2\2\29\u00bd\3\2\2\2;\u00c0\3\2\2\2=\u00c3\3\2\2\2?\u00c7\3\2"+
		"\2\2A\u00ce\3\2\2\2C\u00d3\3\2\2\2E\u00da\3\2\2\2G\u00df\3\2\2\2I\u00e6"+
		"\3\2\2\2K\u00e8\3\2\2\2M\u00ef\3\2\2\2O\u00f4\3\2\2\2Q\u00fb\3\2\2\2S"+
		"\u0101\3\2\2\2U\u0103\3\2\2\2W\u0108\3\2\2\2Y\u0110\3\2\2\2[\u0115\3\2"+
		"\2\2]\u011f\3\2\2\2_\u0123\3\2\2\2a\u012d\3\2\2\2c\u0139\3\2\2\2e\u0146"+
		"\3\2\2\2g\u0148\3\2\2\2i\u0158\3\2\2\2k\u0167\3\2\2\2mn\7%\2\2no\7k\2"+
		"\2op\7p\2\2pq\7e\2\2qr\7n\2\2rs\7w\2\2st\7f\2\2tu\7g\2\2u\4\3\2\2\2vw"+
		"\7>\2\2w\6\3\2\2\2xy\7@\2\2y\b\3\2\2\2z{\7}\2\2{\n\3\2\2\2|}\7\177\2\2"+
		"}\f\3\2\2\2~\177\7=\2\2\177\16\3\2\2\2\u0080\u0081\7.\2\2\u0081\20\3\2"+
		"\2\2\u0082\u0083\7*\2\2\u0083\22\3\2\2\2\u0084\u0085\7+\2\2\u0085\24\3"+
		"\2\2\2\u0086\u0087\7?\2\2\u0087\26\3\2\2\2\u0088\u0089\7]\2\2\u0089\30"+
		"\3\2\2\2\u008a\u008b\7_\2\2\u008b\32\3\2\2\2\u008c\u008d\7k\2\2\u008d"+
		"\u008e\7h\2\2\u008e\34\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091\7n\2\2\u0091"+
		"\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093\36\3\2\2\2\u0094\u0095\7y\2\2\u0095"+
		"\u0096\7j\2\2\u0096\u0097\7k\2\2\u0097\u0098\7n\2\2\u0098\u0099\7g\2\2"+
		"\u0099 \3\2\2\2\u009a\u009b\7h\2\2\u009b\u009c\7q\2\2\u009c\u009d\7t\2"+
		"\2\u009d\"\3\2\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7"+
		"v\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7p\2\2\u00a4$"+
		"\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7,\2\2\u00a8(\3"+
		"\2\2\2\u00a9\u00aa\7\61\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7\'\2\2\u00ac,"+
		"\3\2\2\2\u00ad\u00ae\7-\2\2\u00ae.\3\2\2\2\u00af\u00b0\7/\2\2\u00b0\60"+
		"\3\2\2\2\u00b1\u00b2\7?\2\2\u00b2\u00b3\7?\2\2\u00b3\62\3\2\2\2\u00b4"+
		"\u00b5\7#\2\2\u00b5\u00b6\7?\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8"+
		"\u00b9\7?\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb\u00bc\7?\2\2\u00bc"+
		"8\3\2\2\2\u00bd\u00be\7(\2\2\u00be\u00bf\7(\2\2\u00bf:\3\2\2\2\u00c0\u00c1"+
		"\7~\2\2\u00c1\u00c2\7~\2\2\u00c2<\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5"+
		"\7p\2\2\u00c5\u00c6\7v\2\2\u00c6>\3\2\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9"+
		"\7q\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7d\2\2\u00cb\u00cc\7n\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd@\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7j\2\2\u00d0"+
		"\u00d1\7c\2\2\u00d1\u00d2\7t\2\2\u00d2B\3\2\2\2\u00d3\u00d4\7u\2\2\u00d4"+
		"\u00d5\7v\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7p\2\2"+
		"\u00d8\u00d9\7i\2\2\u00d9D\3\2\2\2\u00da\u00db\7x\2\2\u00db\u00dc\7q\2"+
		"\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7f\2\2\u00deF\3\2\2\2\u00df\u00e0\7"+
		"u\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4"+
		"\7e\2\2\u00e4\u00e5\7v\2\2\u00e5H\3\2\2\2\u00e6\u00e7\7\60\2\2\u00e7J"+
		"\3\2\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7t\2\2\u00eb"+
		"\u00ec\7n\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7p\2\2\u00eeL\3\2\2\2\u00ef"+
		"\u00f0\7c\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7k\2\2"+
		"\u00f3N\3\2\2\2\u00f4\u00f5\7r\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7k\2"+
		"\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7h\2\2\u00faP\3\2"+
		"\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff"+
		"\7p\2\2\u00ff\u0100\7h\2\2\u0100R\3\2\2\2\u0101\u0102\7(\2\2\u0102T\3"+
		"\2\2\2\u0103\u0104\7i\2\2\u0104\u0105\7g\2\2\u0105\u0106\7v\2\2\u0106"+
		"\u0107\7u\2\2\u0107V\3\2\2\2\u0108\u010c\t\2\2\2\u0109\u010b\t\3\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010dX\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\t\4\2\2\u0110\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"Z\3\2\2\2\u0114\u0116\t\4\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2"+
		"\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b"+
		"\7\60\2\2\u011a\u011c\t\4\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2"+
		"\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\\\3\2\2\2\u011f\u0120\7"+
		")\2\2\u0120\u0121\13\2\2\2\u0121\u0122\7)\2\2\u0122^\3\2\2\2\u0123\u0127"+
		"\7$\2\2\u0124\u0126\13\2\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u012b\7$\2\2\u012b`\3\2\2\2\u012c\u012e\t\5\2\2\u012d\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u0132\7\60\2\2\u0132\u0134\7j\2\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134b\3\2\2\2\u0135\u0136\7(\2\2\u0136\u013a"+
		"\7(\2\2\u0137\u0138\7~\2\2\u0138\u013a\7~\2\2\u0139\u0135\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013ad\3\2\2\2\u013b\u0147\t\6\2\2\u013c\u013d\7?\2\2\u013d"+
		"\u0147\7?\2\2\u013e\u013f\7#\2\2\u013f\u0147\7?\2\2\u0140\u0147\7>\2\2"+
		"\u0141\u0142\7>\2\2\u0142\u0147\7?\2\2\u0143\u0147\7@\2\2\u0144\u0145"+
		"\7@\2\2\u0145\u0147\7?\2\2\u0146\u013b\3\2\2\2\u0146\u013c\3\2\2\2\u0146"+
		"\u013e\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0143\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147f\3\2\2\2\u0148\u0149\7\61\2\2\u0149\u014a"+
		"\7\61\2\2\u014a\u014e\3\2\2\2\u014b\u014d\13\2\2\2\u014c\u014b\3\2\2\2"+
		"\u014d\u0150\3\2\2\2\u014e\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0152"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\7\17\2\2\u0152\u0151\3\2\2\2"+
		"\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7\f\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0157\b\64\2\2\u0157h\3\2\2\2\u0158\u0159\7\61\2\2\u0159"+
		"\u015a\7,\2\2\u015a\u015e\3\2\2\2\u015b\u015d\13\2\2\2\u015c\u015b\3\2"+
		"\2\2\u015d\u0160\3\2\2\2\u015e\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7,\2\2\u0162\u0163\7\61"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0165\b\65\2\2\u0165j\3\2\2\2\u0166\u0168"+
		"\t\7\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b\66\2\2\u016cl\3\2\2\2"+
		"\20\2\u010c\u0112\u0117\u011d\u0127\u012f\u0133\u0139\u0146\u014e\u0152"+
		"\u015e\u0169\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}