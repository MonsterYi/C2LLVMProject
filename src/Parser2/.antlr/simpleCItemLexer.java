// Generated from c:\Users\75993\Desktop\±‡“Î‘≠¿Ì\project\C2LLVMProject\src\Parser2\simpleCItemLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCItemLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, INT=2, DOUBLE=3, CHAR=4, STRING=5, LIB=6, CONJUNCTION=7, OPERATOR=8, 
		INLINECOMMENT=9, BLOCKCOMMENT=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "INT", "DOUBLE", "CHAR", "STRING", "LIB", "CONJUNCTION", "OPERATOR", 
			"INLINECOMMENT", "BLOCKCOMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "INT", "DOUBLE", "CHAR", "STRING", "LIB", "CONJUNCTION", 
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


	public simpleCItemLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleCItemLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\6\3\"\n\3\r\3\16\3"+
		"#\3\4\6\4\'\n\4\r\4\16\4(\3\4\3\4\6\4-\n\4\r\4\16\4.\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\7\6\67\n\6\f\6\16\6:\13\6\3\6\3\6\3\7\6\7?\n\7\r\7\16\7@\3\7\3"+
		"\7\5\7E\n\7\3\b\3\b\3\b\3\b\5\bK\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tX\n\t\3\n\3\n\3\n\3\n\7\n^\n\n\f\n\16\na\13\n\3\n\5\nd\n"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13n\n\13\f\13\16\13q\13\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\6\fy\n\f\r\f\16\fz\3\f\3\f\58_o\2\r\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\b\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2\62;\4\2C\\c|\6\2##,-//\61\61\5\2\13\f\17\17\"\"\2\u008f\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3"+
		"\31\3\2\2\2\5!\3\2\2\2\7&\3\2\2\2\t\60\3\2\2\2\13\64\3\2\2\2\r>\3\2\2"+
		"\2\17J\3\2\2\2\21W\3\2\2\2\23Y\3\2\2\2\25i\3\2\2\2\27x\3\2\2\2\31\35\t"+
		"\2\2\2\32\34\t\3\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3"+
		"\2\2\2\36\4\3\2\2\2\37\35\3\2\2\2 \"\t\4\2\2! \3\2\2\2\"#\3\2\2\2#!\3"+
		"\2\2\2#$\3\2\2\2$\6\3\2\2\2%\'\t\4\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2"+
		"()\3\2\2\2)*\3\2\2\2*,\7\60\2\2+-\t\4\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2"+
		"\2./\3\2\2\2/\b\3\2\2\2\60\61\7)\2\2\61\62\13\2\2\2\62\63\7)\2\2\63\n"+
		"\3\2\2\2\648\7$\2\2\65\67\13\2\2\2\66\65\3\2\2\2\67:\3\2\2\289\3\2\2\2"+
		"8\66\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7$\2\2<\f\3\2\2\2=?\t\5\2\2>=\3\2\2"+
		"\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2BC\7\60\2\2CE\7j\2\2DB\3\2\2"+
		"\2DE\3\2\2\2E\16\3\2\2\2FG\7(\2\2GK\7(\2\2HI\7~\2\2IK\7~\2\2JF\3\2\2\2"+
		"JH\3\2\2\2K\20\3\2\2\2LX\t\6\2\2MN\7?\2\2NX\7?\2\2OP\7#\2\2PX\7?\2\2Q"+
		"X\7>\2\2RS\7>\2\2SX\7?\2\2TX\7@\2\2UV\7@\2\2VX\7?\2\2WL\3\2\2\2WM\3\2"+
		"\2\2WO\3\2\2\2WQ\3\2\2\2WR\3\2\2\2WT\3\2\2\2WU\3\2\2\2X\22\3\2\2\2YZ\7"+
		"\61\2\2Z[\7\61\2\2[_\3\2\2\2\\^\13\2\2\2]\\\3\2\2\2^a\3\2\2\2_`\3\2\2"+
		"\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2bd\7\17\2\2cb\3\2\2\2cd\3\2\2\2de\3\2"+
		"\2\2ef\7\f\2\2fg\3\2\2\2gh\b\n\2\2h\24\3\2\2\2ij\7\61\2\2jk\7,\2\2ko\3"+
		"\2\2\2ln\13\2\2\2ml\3\2\2\2nq\3\2\2\2op\3\2\2\2om\3\2\2\2pr\3\2\2\2qo"+
		"\3\2\2\2rs\7,\2\2st\7\61\2\2tu\3\2\2\2uv\b\13\2\2v\26\3\2\2\2wy\t\7\2"+
		"\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\f\2\2}\30\3\2"+
		"\2\2\20\2\35#(.8@DJW_coz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}