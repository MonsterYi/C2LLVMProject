// Generated from c:\Users\75993\Desktop\����ԭ��\project\C2LLVMProject\src\Parser2\simpleC.g4 by ANTLR 4.8
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
		T__38=39, LIB=40, ID=41, INT=42, DOUBLE=43, CHAR=44, STRING=45, OPERATOR=46, 
		CONJUNCTION=47, INLINECOMMENT=48, BLOCKCOMMENT=49, SPACE=50;
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
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "LIB", "ID", "INT", 
			"DOUBLE", "CHAR", "STRING", "OPERATOR", "CONJUNCTION", "INLINECOMMENT", 
			"BLOCKCOMMENT", "SPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u015a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\7)\u00fb"+
		"\n)\f)\16)\u00fe\13)\3)\3)\3)\3*\3*\7*\u0105\n*\f*\16*\u0108\13*\3+\6"+
		"+\u010b\n+\r+\16+\u010c\3,\6,\u0110\n,\r,\16,\u0111\3,\3,\6,\u0116\n,"+
		"\r,\16,\u0117\3-\3-\3-\3-\3.\3.\7.\u0120\n.\f.\16.\u0123\13.\3.\3.\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0131\n/\3\60\3\60\3\60\3\60\5\60\u0137"+
		"\n\60\3\61\3\61\3\61\3\61\7\61\u013d\n\61\f\61\16\61\u0140\13\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u014a\n\62\f\62\16\62\u014d\13"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\63\6\63\u0155\n\63\r\63\16\63\u0156\3\63"+
		"\3\63\6\u00fc\u0121\u013e\u014b\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64\3\2\b\5\2C\\aac|\5\2\62;C\\c|\3\2\62;\7\2##\'\'"+
		",-//\61\61\4\2>>@@\5\2\13\f\17\17\"\"\2\u0168\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\3g\3\2\2\2\5p\3\2\2\2\7r\3\2\2\2\tt\3\2\2\2\13v\3\2\2\2\rx\3\2\2"+
		"\2\17z\3\2\2\2\21|\3\2\2\2\23~\3\2\2\2\25\u0080\3\2\2\2\27\u0082\3\2\2"+
		"\2\31\u0084\3\2\2\2\33\u0086\3\2\2\2\35\u0089\3\2\2\2\37\u008e\3\2\2\2"+
		"!\u0094\3\2\2\2#\u0098\3\2\2\2%\u009f\3\2\2\2\'\u00a9\3\2\2\2)\u00b0\3"+
		"\2\2\2+\u00b2\3\2\2\2-\u00b5\3\2\2\2/\u00b8\3\2\2\2\61\u00ba\3\2\2\2\63"+
		"\u00bc\3\2\2\2\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00c2\3\2\2\2;\u00c5"+
		"\3\2\2\2=\u00c8\3\2\2\2?\u00cb\3\2\2\2A\u00ce\3\2\2\2C\u00d2\3\2\2\2E"+
		"\u00d9\3\2\2\2G\u00de\3\2\2\2I\u00e5\3\2\2\2K\u00ea\3\2\2\2M\u00f1\3\2"+
		"\2\2O\u00f7\3\2\2\2Q\u00fc\3\2\2\2S\u0102\3\2\2\2U\u010a\3\2\2\2W\u010f"+
		"\3\2\2\2Y\u0119\3\2\2\2[\u011d\3\2\2\2]\u0130\3\2\2\2_\u0136\3\2\2\2a"+
		"\u0138\3\2\2\2c\u0145\3\2\2\2e\u0154\3\2\2\2gh\7%\2\2hi\7k\2\2ij\7p\2"+
		"\2jk\7e\2\2kl\7n\2\2lm\7w\2\2mn\7f\2\2no\7g\2\2o\4\3\2\2\2pq\7>\2\2q\6"+
		"\3\2\2\2rs\7@\2\2s\b\3\2\2\2tu\7*\2\2u\n\3\2\2\2vw\7+\2\2w\f\3\2\2\2x"+
		"y\7.\2\2y\16\3\2\2\2z{\7}\2\2{\20\3\2\2\2|}\7\177\2\2}\22\3\2\2\2~\177"+
		"\7?\2\2\177\24\3\2\2\2\u0080\u0081\7=\2\2\u0081\26\3\2\2\2\u0082\u0083"+
		"\7]\2\2\u0083\30\3\2\2\2\u0084\u0085\7_\2\2\u0085\32\3\2\2\2\u0086\u0087"+
		"\7k\2\2\u0087\u0088\7h\2\2\u0088\34\3\2\2\2\u0089\u008a\7g\2\2\u008a\u008b"+
		"\7n\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g\2\2\u008d\36\3\2\2\2\u008e\u008f"+
		"\7y\2\2\u008f\u0090\7j\2\2\u0090\u0091\7k\2\2\u0091\u0092\7n\2\2\u0092"+
		"\u0093\7g\2\2\u0093 \3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7q\2\2\u0096"+
		"\u0097\7t\2\2\u0097\"\3\2\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7v\2\2\u009b\u009c\7w\2\2\u009c\u009d\7t\2\2\u009d\u009e\7p\2\2"+
		"\u009e$\3\2\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7p\2"+
		"\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6"+
		"\7w\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7=\2\2\u00a8&\3\2\2\2\u00a9\u00aa"+
		"\7d\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7c\2\2\u00ad"+
		"\u00ae\7m\2\2\u00ae\u00af\7=\2\2\u00af(\3\2\2\2\u00b0\u00b1\7#\2\2\u00b1"+
		"*\3\2\2\2\u00b2\u00b3\7(\2\2\u00b3\u00b4\7(\2\2\u00b4,\3\2\2\2\u00b5\u00b6"+
		"\7~\2\2\u00b6\u00b7\7~\2\2\u00b7.\3\2\2\2\u00b8\u00b9\7,\2\2\u00b9\60"+
		"\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb\62\3\2\2\2\u00bc\u00bd\7\'\2\2\u00bd"+
		"\64\3\2\2\2\u00be\u00bf\7-\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1"+
		"8\3\2\2\2\u00c2\u00c3\7?\2\2\u00c3\u00c4\7?\2\2\u00c4:\3\2\2\2\u00c5\u00c6"+
		"\7#\2\2\u00c6\u00c7\7?\2\2\u00c7<\3\2\2\2\u00c8\u00c9\7>\2\2\u00c9\u00ca"+
		"\7?\2\2\u00ca>\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc\u00cd\7?\2\2\u00cd@\3"+
		"\2\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"B\3\2\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7w\2\2\u00d5"+
		"\u00d6\7d\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7g\2\2\u00d8D\3\2\2\2\u00d9"+
		"\u00da\7e\2\2\u00da\u00db\7j\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7t\2\2"+
		"\u00ddF\3\2\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7t\2"+
		"\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7i\2\2\u00e4H\3\2"+
		"\2\2\u00e5\u00e6\7x\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9"+
		"\7f\2\2\u00e9J\3\2\2\2\u00ea\u00eb\7r\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed"+
		"\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7h\2\2\u00f0"+
		"L\3\2\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7c\2\2\u00f4"+
		"\u00f5\7p\2\2\u00f5\u00f6\7h\2\2\u00f6N\3\2\2\2\u00f7\u00f8\7(\2\2\u00f8"+
		"P\3\2\2\2\u00f9\u00fb\13\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2"+
		"\u00fc\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u0100\7\60\2\2\u0100\u0101\7j\2\2\u0101R\3\2\2\2\u0102"+
		"\u0106\t\2\2\2\u0103\u0105\t\3\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107T\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0109\u010b\t\4\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010dV\3\2\2\2\u010e\u0110\t\4\2\2"+
		"\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\7\60\2\2\u0114\u0116\t\4\2\2"+
		"\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118X\3\2\2\2\u0119\u011a\7)\2\2\u011a\u011b\13\2\2\2\u011b"+
		"\u011c\7)\2\2\u011cZ\3\2\2\2\u011d\u0121\7$\2\2\u011e\u0120\13\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u0122\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7$\2\2\u0125"+
		"\\\3\2\2\2\u0126\u0131\t\5\2\2\u0127\u0128\7?\2\2\u0128\u0131\7?\2\2\u0129"+
		"\u012a\7#\2\2\u012a\u0131\7?\2\2\u012b\u0131\t\6\2\2\u012c\u012d\7>\2"+
		"\2\u012d\u0131\7?\2\2\u012e\u012f\7@\2\2\u012f\u0131\7?\2\2\u0130\u0126"+
		"\3\2\2\2\u0130\u0127\3\2\2\2\u0130\u0129\3\2\2\2\u0130\u012b\3\2\2\2\u0130"+
		"\u012c\3\2\2\2\u0130\u012e\3\2\2\2\u0131^\3\2\2\2\u0132\u0133\7(\2\2\u0133"+
		"\u0137\7(\2\2\u0134\u0135\7~\2\2\u0135\u0137\7~\2\2\u0136\u0132\3\2\2"+
		"\2\u0136\u0134\3\2\2\2\u0137`\3\2\2\2\u0138\u0139\7\61\2\2\u0139\u013a"+
		"\7\61\2\2\u013a\u013e\3\2\2\2\u013b\u013d\13\2\2\2\u013c\u013b\3\2\2\2"+
		"\u013d\u0140\3\2\2\2\u013e\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\f\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\b\61\2\2\u0144b\3\2\2\2\u0145\u0146\7\61\2\2\u0146\u0147\7,\2\2"+
		"\u0147\u014b\3\2\2\2\u0148\u014a\13\2\2\2\u0149\u0148\3\2\2\2\u014a\u014d"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\7,\2\2\u014f\u0150\7\61\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0152\b\62\2\2\u0152d\3\2\2\2\u0153\u0155\t\7\2\2\u0154\u0153"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0159\b\63\2\2\u0159f\3\2\2\2\16\2\u00fc\u0106\u010c"+
		"\u0111\u0117\u0121\u0130\u0136\u013e\u014b\u0156\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}