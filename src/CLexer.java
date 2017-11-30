// Generated from C.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRINGVALUE=1, WHITESPACE=2, WRITEINT=3, READINT=4, TYPEQUALIFIER=5, TYPESPECIFIER=6, 
		FUNCTIONRETURNTYPESPECIFIER=7, LOGICALVALUE=8, FORLOOPKEYWORD=9, WHILELOOPKEYWORD=10, 
		DOWHILEKEYWORD=11, CONDITIONKEYWORD=12, CONDITIONELSEKEYWORD=13, SWITCHKEYWORD=14, 
		SWITCHCASEKEYWORD=15, BREAKKEYWORD=16, DEFAULTKEYWORD=17, SEMICOLON=18, 
		COLON=19, STRINGCONCATENATION=20, MULTIPLICATIONDIVISIONOPERATOR=21, ADDITIONSUBTRACTIONOPERATOR=22, 
		RELATIONALOPERATOR=23, EQUALITYOPERATOR=24, ASSIGNMENTOPERATOR=25, LOGICALOR=26, 
		LOGICALAND=27, LOGICALNEGATION=28, QUESTIONMARK=29, IDENTIFIER=30, NUMERICALVALUE=31, 
		LEFTPARENTHESE=32, RIGHTPARENTHESE=33, LEFTBRACE=34, RIGHTBRACE=35, COMMA=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"STRINGVALUE", "WHITESPACE", "WRITEINT", "READINT", "TYPEQUALIFIER", "TYPESPECIFIER", 
		"FUNCTIONRETURNTYPESPECIFIER", "LOGICALVALUE", "FORLOOPKEYWORD", "WHILELOOPKEYWORD", 
		"DOWHILEKEYWORD", "CONDITIONKEYWORD", "CONDITIONELSEKEYWORD", "SWITCHKEYWORD", 
		"SWITCHCASEKEYWORD", "BREAKKEYWORD", "DEFAULTKEYWORD", "SEMICOLON", "COLON", 
		"STRINGCONCATENATION", "MULTIPLICATIONDIVISIONOPERATOR", "ADDITIONSUBTRACTIONOPERATOR", 
		"RELATIONALOPERATOR", "EQUALITYOPERATOR", "ASSIGNMENTOPERATOR", "LOGICALOR", 
		"LOGICALAND", "LOGICALNEGATION", "QUESTIONMARK", "IDENTIFIER", "NUMERICALVALUE", 
		"LEFTPARENTHESE", "RIGHTPARENTHESE", "LEFTBRACE", "RIGHTBRACE", "COMMA", 
		"DIGIT", "LOWERCASE", "UPPERCASE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'writeInt'", "'readInt'", "'const'", null, "'void'", 
		null, "'for'", "'while'", "'do'", "'if'", "'else'", "'switch'", "'case'", 
		"'break'", "'default'", "';'", "':'", "'.'", null, null, null, null, "'='", 
		"'||'", "'&&'", "'!'", "'?'", null, null, "'('", "')'", "'{'", "'}'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRINGVALUE", "WHITESPACE", "WRITEINT", "READINT", "TYPEQUALIFIER", 
		"TYPESPECIFIER", "FUNCTIONRETURNTYPESPECIFIER", "LOGICALVALUE", "FORLOOPKEYWORD", 
		"WHILELOOPKEYWORD", "DOWHILEKEYWORD", "CONDITIONKEYWORD", "CONDITIONELSEKEYWORD", 
		"SWITCHKEYWORD", "SWITCHCASEKEYWORD", "BREAKKEYWORD", "DEFAULTKEYWORD", 
		"SEMICOLON", "COLON", "STRINGCONCATENATION", "MULTIPLICATIONDIVISIONOPERATOR", 
		"ADDITIONSUBTRACTIONOPERATOR", "RELATIONALOPERATOR", "EQUALITYOPERATOR", 
		"ASSIGNMENTOPERATOR", "LOGICALOR", "LOGICALAND", "LOGICALNEGATION", "QUESTIONMARK", 
		"IDENTIFIER", "NUMERICALVALUE", "LEFTPARENTHESE", "RIGHTPARENTHESE", "LEFTBRACE", 
		"RIGHTBRACE", "COMMA"
	};
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


	public CLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0129\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\7\2"+
		"V\n\2\f\2\16\2Y\13\2\3\2\3\2\3\3\6\3^\n\3\r\3\16\3_\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u008f\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u009f\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e0"+
		"\n\30\3\31\3\31\3\31\3\31\5\31\u00e6\n\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\6\37\u00f6\n\37\r\37\16\37\u00f7"+
		"\3\37\3\37\3\37\7\37\u00fd\n\37\f\37\16\37\u0100\13\37\3 \5 \u0103\n "+
		"\3 \6 \u0106\n \r \16 \u0107\3 \5 \u010b\n \3 \6 \u010e\n \r \16 \u010f"+
		"\3 \3 \6 \u0114\n \r \16 \u0115\5 \u0118\n \3!\3!\3\"\3\"\3#\3#\3$\3$"+
		"\3%\3%\3&\3&\3\'\3\'\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\2\3\2\n\6\2\f\f"+
		"\17\17$$^^\4\2$$^^\5\2\13\f\16\17\"\"\4\2,,\61\61\4\2--//\3\2\62;\3\2"+
		"c|\3\2C\\\2\u013b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3Q\3\2\2\2\5]\3\2\2\2\7c\3\2\2\2\tl\3\2"+
		"\2\2\13t\3\2\2\2\r\u008e\3\2\2\2\17\u0090\3\2\2\2\21\u009e\3\2\2\2\23"+
		"\u00a0\3\2\2\2\25\u00a4\3\2\2\2\27\u00aa\3\2\2\2\31\u00ad\3\2\2\2\33\u00b0"+
		"\3\2\2\2\35\u00b5\3\2\2\2\37\u00bc\3\2\2\2!\u00c1\3\2\2\2#\u00c7\3\2\2"+
		"\2%\u00cf\3\2\2\2\'\u00d1\3\2\2\2)\u00d3\3\2\2\2+\u00d5\3\2\2\2-\u00d7"+
		"\3\2\2\2/\u00df\3\2\2\2\61\u00e5\3\2\2\2\63\u00e7\3\2\2\2\65\u00e9\3\2"+
		"\2\2\67\u00ec\3\2\2\29\u00ef\3\2\2\2;\u00f1\3\2\2\2=\u00f5\3\2\2\2?\u0117"+
		"\3\2\2\2A\u0119\3\2\2\2C\u011b\3\2\2\2E\u011d\3\2\2\2G\u011f\3\2\2\2I"+
		"\u0121\3\2\2\2K\u0123\3\2\2\2M\u0125\3\2\2\2O\u0127\3\2\2\2QW\7$\2\2R"+
		"V\n\2\2\2ST\7^\2\2TV\t\3\2\2UR\3\2\2\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2W"+
		"X\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7$\2\2[\4\3\2\2\2\\^\t\4\2\2]\\\3\2\2"+
		"\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\b\3\2\2b\6\3\2\2\2cd\7y\2"+
		"\2de\7t\2\2ef\7k\2\2fg\7v\2\2gh\7g\2\2hi\7K\2\2ij\7p\2\2jk\7v\2\2k\b\3"+
		"\2\2\2lm\7t\2\2mn\7g\2\2no\7c\2\2op\7f\2\2pq\7K\2\2qr\7p\2\2rs\7v\2\2"+
		"s\n\3\2\2\2tu\7e\2\2uv\7q\2\2vw\7p\2\2wx\7u\2\2xy\7v\2\2y\f\3\2\2\2z{"+
		"\7k\2\2{|\7p\2\2|\u008f\7v\2\2}~\7t\2\2~\177\7g\2\2\177\u0080\7c\2\2\u0080"+
		"\u008f\7n\2\2\u0081\u0082\7d\2\2\u0082\u0083\7q\2\2\u0083\u0084\7q\2\2"+
		"\u0084\u0085\7n\2\2\u0085\u0086\7g\2\2\u0086\u0087\7c\2\2\u0087\u008f"+
		"\7p\2\2\u0088\u0089\7u\2\2\u0089\u008a\7v\2\2\u008a\u008b\7t\2\2\u008b"+
		"\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\u008f\7i\2\2\u008ez\3\2\2\2\u008e"+
		"}\3\2\2\2\u008e\u0081\3\2\2\2\u008e\u0088\3\2\2\2\u008f\16\3\2\2\2\u0090"+
		"\u0091\7x\2\2\u0091\u0092\7q\2\2\u0092\u0093\7k\2\2\u0093\u0094\7f\2\2"+
		"\u0094\20\3\2\2\2\u0095\u0096\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098\7"+
		"w\2\2\u0098\u009f\7g\2\2\u0099\u009a\7h\2\2\u009a\u009b\7c\2\2\u009b\u009c"+
		"\7n\2\2\u009c\u009d\7u\2\2\u009d\u009f\7g\2\2\u009e\u0095\3\2\2\2\u009e"+
		"\u0099\3\2\2\2\u009f\22\3\2\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7q\2\2"+
		"\u00a2\u00a3\7t\2\2\u00a3\24\3\2\2\2\u00a4\u00a5\7y\2\2\u00a5\u00a6\7"+
		"j\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7g\2\2\u00a9\26"+
		"\3\2\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac\7q\2\2\u00ac\30\3\2\2\2\u00ad"+
		"\u00ae\7k\2\2\u00ae\u00af\7h\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		"\u00b2\7n\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7g\2\2\u00b4\34\3\2\2\2\u00b5"+
		"\u00b6\7u\2\2\u00b6\u00b7\7y\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7v\2\2"+
		"\u00b9\u00ba\7e\2\2\u00ba\u00bb\7j\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7"+
		"e\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7g\2\2\u00c0 "+
		"\3\2\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7c\2\2\u00c5\u00c6\7m\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7f\2\2\u00c8"+
		"\u00c9\7g\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7w\2\2"+
		"\u00cc\u00cd\7n\2\2\u00cd\u00ce\7v\2\2\u00ce$\3\2\2\2\u00cf\u00d0\7=\2"+
		"\2\u00d0&\3\2\2\2\u00d1\u00d2\7<\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7\60\2"+
		"\2\u00d4*\3\2\2\2\u00d5\u00d6\t\5\2\2\u00d6,\3\2\2\2\u00d7\u00d8\t\6\2"+
		"\2\u00d8.\3\2\2\2\u00d9\u00da\7@\2\2\u00da\u00e0\7?\2\2\u00db\u00e0\7"+
		"@\2\2\u00dc\u00dd\7>\2\2\u00dd\u00e0\7?\2\2\u00de\u00e0\7>\2\2\u00df\u00d9"+
		"\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\60\3\2\2\2\u00e1\u00e2\7?\2\2\u00e2\u00e6\7?\2\2\u00e3\u00e4\7#\2\2\u00e4"+
		"\u00e6\7?\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\62\3\2\2\2"+
		"\u00e7\u00e8\7?\2\2\u00e8\64\3\2\2\2\u00e9\u00ea\7~\2\2\u00ea\u00eb\7"+
		"~\2\2\u00eb\66\3\2\2\2\u00ec\u00ed\7(\2\2\u00ed\u00ee\7(\2\2\u00ee8\3"+
		"\2\2\2\u00ef\u00f0\7#\2\2\u00f0:\3\2\2\2\u00f1\u00f2\7A\2\2\u00f2<\3\2"+
		"\2\2\u00f3\u00f6\5M\'\2\u00f4\u00f6\5O(\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fe\3\2\2\2\u00f9\u00fd\5M\'\2\u00fa\u00fd\5O(\2\u00fb\u00fd\5K&\2"+
		"\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff>\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0103\5-\27\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0105\3\2\2\2\u0104\u0106\5K&\2\u0105\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0118\3\2\2\2\u0109"+
		"\u010b\5-\27\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2"+
		"\2\2\u010c\u010e\5K&\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\7\60\2\2"+
		"\u0112\u0114\5K&\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0102\3\2\2\2\u0117"+
		"\u010a\3\2\2\2\u0118@\3\2\2\2\u0119\u011a\7*\2\2\u011aB\3\2\2\2\u011b"+
		"\u011c\7+\2\2\u011cD\3\2\2\2\u011d\u011e\7}\2\2\u011eF\3\2\2\2\u011f\u0120"+
		"\7\177\2\2\u0120H\3\2\2\2\u0121\u0122\7.\2\2\u0122J\3\2\2\2\u0123\u0124"+
		"\t\7\2\2\u0124L\3\2\2\2\u0125\u0126\t\b\2\2\u0126N\3\2\2\2\u0127\u0128"+
		"\t\t\2\2\u0128P\3\2\2\2\24\2UW_\u008e\u009e\u00df\u00e5\u00f5\u00f7\u00fc"+
		"\u00fe\u0102\u0107\u010a\u010f\u0115\u0117\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}