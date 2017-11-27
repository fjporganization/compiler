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
		STRINGVALUE=1, WHITESPACE=2, TYPEQUALIFIER=3, TYPESPECIFIER=4, FUNCTIONRETURNTYPESPECIFIER=5, 
		LOGICALVALUE=6, FORLOOPKEYWORD=7, WHILELOOPKEYWORD=8, DOWHILEKEYWORD=9, 
		CONDITIONKEYWORD=10, CONDITIONELSEKEYWORD=11, SWITCHKEYWORD=12, SWITCHCASEKEYWORD=13, 
		BREAKKEYWORD=14, DEFAULTKEYWORD=15, SEMICOLON=16, COLON=17, STRINGCONCATENATION=18, 
		MULTIPLICATIONDIVISIONOPERATOR=19, ADDITIONSUBTRACTIONOPERATOR=20, RELATIONALOPERATOR=21, 
		EQUALITYOPERATOR=22, ASSIGNMENTOPERATOR=23, LOGICALOR=24, LOGICALAND=25, 
		LOGICALNEGATION=26, QUESTIONMARK=27, IDENTIFIER=28, NUMERICALVALUE=29, 
		LEFTPARENTHESE=30, RIGHTPARENTHESE=31, LEFTBRACE=32, RIGHTBRACE=33, COMMA=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"STRINGVALUE", "WHITESPACE", "TYPEQUALIFIER", "TYPESPECIFIER", "FUNCTIONRETURNTYPESPECIFIER", 
		"LOGICALVALUE", "FORLOOPKEYWORD", "WHILELOOPKEYWORD", "DOWHILEKEYWORD", 
		"CONDITIONKEYWORD", "CONDITIONELSEKEYWORD", "SWITCHKEYWORD", "SWITCHCASEKEYWORD", 
		"BREAKKEYWORD", "DEFAULTKEYWORD", "SEMICOLON", "COLON", "STRINGCONCATENATION", 
		"MULTIPLICATIONDIVISIONOPERATOR", "ADDITIONSUBTRACTIONOPERATOR", "RELATIONALOPERATOR", 
		"EQUALITYOPERATOR", "ASSIGNMENTOPERATOR", "LOGICALOR", "LOGICALAND", "LOGICALNEGATION", 
		"QUESTIONMARK", "IDENTIFIER", "NUMERICALVALUE", "LEFTPARENTHESE", "RIGHTPARENTHESE", 
		"LEFTBRACE", "RIGHTBRACE", "COMMA", "DIGIT", "LOWERCASE", "UPPERCASE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'const'", null, "'void'", null, "'for'", "'while'", 
		"'do'", "'if'", "'else'", "'switch'", "'case'", "'break'", "'default'", 
		"';'", "':'", "'.'", null, null, null, null, "'='", "'||'", "'&&'", "'!'", 
		"'?'", null, null, "'('", "')'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRINGVALUE", "WHITESPACE", "TYPEQUALIFIER", "TYPESPECIFIER", "FUNCTIONRETURNTYPESPECIFIER", 
		"LOGICALVALUE", "FORLOOPKEYWORD", "WHILELOOPKEYWORD", "DOWHILEKEYWORD", 
		"CONDITIONKEYWORD", "CONDITIONELSEKEYWORD", "SWITCHKEYWORD", "SWITCHCASEKEYWORD", 
		"BREAKKEYWORD", "DEFAULTKEYWORD", "SEMICOLON", "COLON", "STRINGCONCATENATION", 
		"MULTIPLICATIONDIVISIONOPERATOR", "ADDITIONSUBTRACTIONOPERATOR", "RELATIONALOPERATOR", 
		"EQUALITYOPERATOR", "ASSIGNMENTOPERATOR", "LOGICALOR", "LOGICALAND", "LOGICALNEGATION", 
		"QUESTIONMARK", "IDENTIFIER", "NUMERICALVALUE", "LEFTPARENTHESE", "RIGHTPARENTHESE", 
		"LEFTBRACE", "RIGHTBRACE", "COMMA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\7\2R\n\2\f\2\16\2"+
		"U\13\2\3\2\3\2\3\3\6\3Z\n\3\r\3\16\3[\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5z\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u008a\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00cb\n\26\3\27\3\27\3\27\3\27\5\27"+
		"\u00d1\n\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\6\35\u00e1\n\35\r\35\16\35\u00e2\3\35\3\35\3\35\7\35\u00e8"+
		"\n\35\f\35\16\35\u00eb\13\35\3\36\5\36\u00ee\n\36\3\36\6\36\u00f1\n\36"+
		"\r\36\16\36\u00f2\3\36\5\36\u00f6\n\36\3\36\6\36\u00f9\n\36\r\36\16\36"+
		"\u00fa\3\36\3\36\6\36\u00ff\n\36\r\36\16\36\u0100\5\36\u0103\n\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\2\2\'\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"\2I\2K\2\3\2\n\6\2\f\f\17\17$$^^\4\2$$^^\5\2\13\f\16\17\"\"\4\2,,\61\61"+
		"\4\2--//\3\2\62;\3\2c|\3\2C\\\2\u0126\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3M\3\2\2\2\5Y\3\2\2\2\7_\3\2\2\2\ty\3\2\2"+
		"\2\13{\3\2\2\2\r\u0089\3\2\2\2\17\u008b\3\2\2\2\21\u008f\3\2\2\2\23\u0095"+
		"\3\2\2\2\25\u0098\3\2\2\2\27\u009b\3\2\2\2\31\u00a0\3\2\2\2\33\u00a7\3"+
		"\2\2\2\35\u00ac\3\2\2\2\37\u00b2\3\2\2\2!\u00ba\3\2\2\2#\u00bc\3\2\2\2"+
		"%\u00be\3\2\2\2\'\u00c0\3\2\2\2)\u00c2\3\2\2\2+\u00ca\3\2\2\2-\u00d0\3"+
		"\2\2\2/\u00d2\3\2\2\2\61\u00d4\3\2\2\2\63\u00d7\3\2\2\2\65\u00da\3\2\2"+
		"\2\67\u00dc\3\2\2\29\u00e0\3\2\2\2;\u0102\3\2\2\2=\u0104\3\2\2\2?\u0106"+
		"\3\2\2\2A\u0108\3\2\2\2C\u010a\3\2\2\2E\u010c\3\2\2\2G\u010e\3\2\2\2I"+
		"\u0110\3\2\2\2K\u0112\3\2\2\2MS\7$\2\2NR\n\2\2\2OP\7^\2\2PR\t\3\2\2QN"+
		"\3\2\2\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2V"+
		"W\7$\2\2W\4\3\2\2\2XZ\t\4\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2"+
		"\\]\3\2\2\2]^\b\3\2\2^\6\3\2\2\2_`\7e\2\2`a\7q\2\2ab\7p\2\2bc\7u\2\2c"+
		"d\7v\2\2d\b\3\2\2\2ef\7k\2\2fg\7p\2\2gz\7v\2\2hi\7t\2\2ij\7g\2\2jk\7c"+
		"\2\2kz\7n\2\2lm\7d\2\2mn\7q\2\2no\7q\2\2op\7n\2\2pq\7g\2\2qr\7c\2\2rz"+
		"\7p\2\2st\7u\2\2tu\7v\2\2uv\7t\2\2vw\7k\2\2wx\7p\2\2xz\7i\2\2ye\3\2\2"+
		"\2yh\3\2\2\2yl\3\2\2\2ys\3\2\2\2z\n\3\2\2\2{|\7x\2\2|}\7q\2\2}~\7k\2\2"+
		"~\177\7f\2\2\177\f\3\2\2\2\u0080\u0081\7v\2\2\u0081\u0082\7t\2\2\u0082"+
		"\u0083\7w\2\2\u0083\u008a\7g\2\2\u0084\u0085\7h\2\2\u0085\u0086\7c\2\2"+
		"\u0086\u0087\7n\2\2\u0087\u0088\7u\2\2\u0088\u008a\7g\2\2\u0089\u0080"+
		"\3\2\2\2\u0089\u0084\3\2\2\2\u008a\16\3\2\2\2\u008b\u008c\7h\2\2\u008c"+
		"\u008d\7q\2\2\u008d\u008e\7t\2\2\u008e\20\3\2\2\2\u008f\u0090\7y\2\2\u0090"+
		"\u0091\7j\2\2\u0091\u0092\7k\2\2\u0092\u0093\7n\2\2\u0093\u0094\7g\2\2"+
		"\u0094\22\3\2\2\2\u0095\u0096\7f\2\2\u0096\u0097\7q\2\2\u0097\24\3\2\2"+
		"\2\u0098\u0099\7k\2\2\u0099\u009a\7h\2\2\u009a\26\3\2\2\2\u009b\u009c"+
		"\7g\2\2\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u009f\7g\2\2\u009f"+
		"\30\3\2\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7y\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7j\2\2\u00a6\32\3\2\2\2\u00a7"+
		"\u00a8\7e\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\34\3\2\2\2\u00ac\u00ad\7d\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7"+
		"g\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7m\2\2\u00b1\36\3\2\2\2\u00b2\u00b3"+
		"\7f\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7w\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7v\2\2\u00b9 \3\2\2\2\u00ba"+
		"\u00bb\7=\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\7<\2\2\u00bd$\3\2\2\2\u00be"+
		"\u00bf\7\60\2\2\u00bf&\3\2\2\2\u00c0\u00c1\t\5\2\2\u00c1(\3\2\2\2\u00c2"+
		"\u00c3\t\6\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5\u00cb\7?\2\2\u00c6"+
		"\u00cb\7@\2\2\u00c7\u00c8\7>\2\2\u00c8\u00cb\7?\2\2\u00c9\u00cb\7>\2\2"+
		"\u00ca\u00c4\3\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb,\3\2\2\2\u00cc\u00cd\7?\2\2\u00cd\u00d1\7?\2\2\u00ce\u00cf"+
		"\7#\2\2\u00cf\u00d1\7?\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		".\3\2\2\2\u00d2\u00d3\7?\2\2\u00d3\60\3\2\2\2\u00d4\u00d5\7~\2\2\u00d5"+
		"\u00d6\7~\2\2\u00d6\62\3\2\2\2\u00d7\u00d8\7(\2\2\u00d8\u00d9\7(\2\2\u00d9"+
		"\64\3\2\2\2\u00da\u00db\7#\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7A\2\2\u00dd"+
		"8\3\2\2\2\u00de\u00e1\5I%\2\u00df\u00e1\5K&\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e9\3\2\2\2\u00e4\u00e8\5I%\2\u00e5\u00e8\5K&\2\u00e6\u00e8"+
		"\5G$\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea:\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00ec\u00ee\5)\25\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00f1\5G$\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u0103\3\2"+
		"\2\2\u00f4\u00f6\5)\25\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f9\5G$\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2"+
		"\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe"+
		"\7\60\2\2\u00fd\u00ff\5G$\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u00ed\3\2"+
		"\2\2\u0102\u00f5\3\2\2\2\u0103<\3\2\2\2\u0104\u0105\7*\2\2\u0105>\3\2"+
		"\2\2\u0106\u0107\7+\2\2\u0107@\3\2\2\2\u0108\u0109\7}\2\2\u0109B\3\2\2"+
		"\2\u010a\u010b\7\177\2\2\u010bD\3\2\2\2\u010c\u010d\7.\2\2\u010dF\3\2"+
		"\2\2\u010e\u010f\t\7\2\2\u010fH\3\2\2\2\u0110\u0111\t\b\2\2\u0111J\3\2"+
		"\2\2\u0112\u0113\t\t\2\2\u0113L\3\2\2\2\24\2QS[y\u0089\u00ca\u00d0\u00e0"+
		"\u00e2\u00e7\u00e9\u00ed\u00f2\u00f5\u00fa\u0100\u0102\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}