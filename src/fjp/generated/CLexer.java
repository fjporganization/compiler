package fjp.generated; 
// Generated from ./grammar/C.g4 by ANTLR 4.7
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
		COMMENT=1, WHITESPACE=2, WRITEINT=3, READINT=4, WRITEFRAC=5, READFRAC=6, 
		TYPEQUALIFIER=7, TYPESPECIFIER=8, FUNCTIONRETURNTYPESPECIFIER=9, LOGICALVALUE=10, 
		FORLOOPKEYWORD=11, WHILELOOPKEYWORD=12, DOWHILEKEYWORD=13, CONDITIONKEYWORD=14, 
		CONDITIONELSEKEYWORD=15, SWITCHKEYWORD=16, SWITCHCASEKEYWORD=17, BREAKKEYWORD=18, 
		DEFAULTKEYWORD=19, SEMICOLON=20, COLON=21, STRINGCONCATENATION=22, MULTIPLICATIONDIVISIONOPERATOR=23, 
		ADDITIONSUBTRACTIONOPERATOR=24, RELATIONALOPERATOR=25, EQUALITYOPERATOR=26, 
		ASSIGNMENTOPERATOR=27, LOGICALOR=28, LOGICALAND=29, LOGICALNEGATION=30, 
		QUESTIONMARK=31, IDENTIFIER=32, NUMERICALVALUE=33, LEFTPARENTHESE=34, 
		RIGHTPARENTHESE=35, LEFTBRACE=36, RIGHTBRACE=37, COMMA=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMENT", "WHITESPACE", "WRITEINT", "READINT", "WRITEFRAC", "READFRAC", 
		"TYPEQUALIFIER", "TYPESPECIFIER", "FUNCTIONRETURNTYPESPECIFIER", "LOGICALVALUE", 
		"FORLOOPKEYWORD", "WHILELOOPKEYWORD", "DOWHILEKEYWORD", "CONDITIONKEYWORD", 
		"CONDITIONELSEKEYWORD", "SWITCHKEYWORD", "SWITCHCASEKEYWORD", "BREAKKEYWORD", 
		"DEFAULTKEYWORD", "SEMICOLON", "COLON", "STRINGCONCATENATION", "MULTIPLICATIONDIVISIONOPERATOR", 
		"ADDITIONSUBTRACTIONOPERATOR", "RELATIONALOPERATOR", "EQUALITYOPERATOR", 
		"ASSIGNMENTOPERATOR", "LOGICALOR", "LOGICALAND", "LOGICALNEGATION", "QUESTIONMARK", 
		"IDENTIFIER", "NUMERICALVALUE", "LEFTPARENTHESE", "RIGHTPARENTHESE", "LEFTBRACE", 
		"RIGHTBRACE", "COMMA", "DIGIT", "LOWERCASE", "UPPERCASE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'writeint'", "'readint'", "'writefrac'", "'readfrac'", 
		"'const'", null, "'void'", null, "'for'", "'while'", "'do'", "'if'", "'else'", 
		"'switch'", "'case'", "'break'", "'default'", "';'", "':'", "'.'", null, 
		null, null, null, "'='", "'||'", "'&&'", "'!'", "'?'", null, null, "'('", 
		"')'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "WHITESPACE", "WRITEINT", "READINT", "WRITEFRAC", "READFRAC", 
		"TYPEQUALIFIER", "TYPESPECIFIER", "FUNCTIONRETURNTYPESPECIFIER", "LOGICALVALUE", 
		"FORLOOPKEYWORD", "WHILELOOPKEYWORD", "DOWHILEKEYWORD", "CONDITIONKEYWORD", 
		"CONDITIONELSEKEYWORD", "SWITCHKEYWORD", "SWITCHCASEKEYWORD", "BREAKKEYWORD", 
		"DEFAULTKEYWORD", "SEMICOLON", "COLON", "STRINGCONCATENATION", "MULTIPLICATIONDIVISIONOPERATOR", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u013c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\3\3\6\3`\n\3\r\3\16\3a\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u009f\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00af\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f0"+
		"\n\32\3\33\3\33\3\33\3\33\5\33\u00f6\n\33\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\6!\u0106\n!\r!\16!\u0107\3!\3!\3!\7!"+
		"\u010d\n!\f!\16!\u0110\13!\3\"\5\"\u0113\n\"\3\"\6\"\u0116\n\"\r\"\16"+
		"\"\u0117\3\"\5\"\u011b\n\"\3\"\6\"\u011e\n\"\r\"\16\"\u011f\3\"\3\"\5"+
		"\"\u0124\n\"\3\"\6\"\u0127\n\"\r\"\16\"\u0128\5\"\u012b\n\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2"+
		"S\2\3\2\t\4\2\f\f\17\17\5\2\13\f\16\17\"\"\4\2,,\61\61\4\2--//\3\2\62"+
		";\3\2c|\3\2C\\\2\u014d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3U\3\2\2\2\5"+
		"_\3\2\2\2\7e\3\2\2\2\tn\3\2\2\2\13v\3\2\2\2\r\u0080\3\2\2\2\17\u0089\3"+
		"\2\2\2\21\u009e\3\2\2\2\23\u00a0\3\2\2\2\25\u00ae\3\2\2\2\27\u00b0\3\2"+
		"\2\2\31\u00b4\3\2\2\2\33\u00ba\3\2\2\2\35\u00bd\3\2\2\2\37\u00c0\3\2\2"+
		"\2!\u00c5\3\2\2\2#\u00cc\3\2\2\2%\u00d1\3\2\2\2\'\u00d7\3\2\2\2)\u00df"+
		"\3\2\2\2+\u00e1\3\2\2\2-\u00e3\3\2\2\2/\u00e5\3\2\2\2\61\u00e7\3\2\2\2"+
		"\63\u00ef\3\2\2\2\65\u00f5\3\2\2\2\67\u00f7\3\2\2\29\u00f9\3\2\2\2;\u00fc"+
		"\3\2\2\2=\u00ff\3\2\2\2?\u0101\3\2\2\2A\u0105\3\2\2\2C\u012a\3\2\2\2E"+
		"\u012c\3\2\2\2G\u012e\3\2\2\2I\u0130\3\2\2\2K\u0132\3\2\2\2M\u0134\3\2"+
		"\2\2O\u0136\3\2\2\2Q\u0138\3\2\2\2S\u013a\3\2\2\2UY\7%\2\2VX\n\2\2\2W"+
		"V\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\b\2\2"+
		"\2]\4\3\2\2\2^`\t\3\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2"+
		"\2\2cd\b\3\2\2d\6\3\2\2\2ef\7y\2\2fg\7t\2\2gh\7k\2\2hi\7v\2\2ij\7g\2\2"+
		"jk\7k\2\2kl\7p\2\2lm\7v\2\2m\b\3\2\2\2no\7t\2\2op\7g\2\2pq\7c\2\2qr\7"+
		"f\2\2rs\7k\2\2st\7p\2\2tu\7v\2\2u\n\3\2\2\2vw\7y\2\2wx\7t\2\2xy\7k\2\2"+
		"yz\7v\2\2z{\7g\2\2{|\7h\2\2|}\7t\2\2}~\7c\2\2~\177\7e\2\2\177\f\3\2\2"+
		"\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7c\2\2\u0083\u0084"+
		"\7f\2\2\u0084\u0085\7h\2\2\u0085\u0086\7t\2\2\u0086\u0087\7c\2\2\u0087"+
		"\u0088\7e\2\2\u0088\16\3\2\2\2\u0089\u008a\7e\2\2\u008a\u008b\7q\2\2\u008b"+
		"\u008c\7p\2\2\u008c\u008d\7u\2\2\u008d\u008e\7v\2\2\u008e\20\3\2\2\2\u008f"+
		"\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091\u009f\7v\2\2\u0092\u0093\7d\2\2"+
		"\u0093\u0094\7q\2\2\u0094\u0095\7q\2\2\u0095\u0096\7n\2\2\u0096\u0097"+
		"\7g\2\2\u0097\u0098\7c\2\2\u0098\u009f\7p\2\2\u0099\u009a\7t\2\2\u009a"+
		"\u009b\7c\2\2\u009b\u009c\7v\2\2\u009c\u009d\7k\2\2\u009d\u009f\7q\2\2"+
		"\u009e\u008f\3\2\2\2\u009e\u0092\3\2\2\2\u009e\u0099\3\2\2\2\u009f\22"+
		"\3\2\2\2\u00a0\u00a1\7x\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7f\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7t\2\2\u00a7"+
		"\u00a8\7w\2\2\u00a8\u00af\7g\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7c\2\2"+
		"\u00ab\u00ac\7n\2\2\u00ac\u00ad\7u\2\2\u00ad\u00af\7g\2\2\u00ae\u00a5"+
		"\3\2\2\2\u00ae\u00a9\3\2\2\2\u00af\26\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1"+
		"\u00b2\7q\2\2\u00b2\u00b3\7t\2\2\u00b3\30\3\2\2\2\u00b4\u00b5\7y\2\2\u00b5"+
		"\u00b6\7j\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7g\2\2"+
		"\u00b9\32\3\2\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7q\2\2\u00bc\34\3\2\2"+
		"\2\u00bd\u00be\7k\2\2\u00be\u00bf\7h\2\2\u00bf\36\3\2\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		" \3\2\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7y\2\2\u00c7\u00c8\7k\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7j\2\2\u00cb\"\3\2\2\2\u00cc"+
		"\u00cd\7e\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2"+
		"\u00d0$\3\2\2\2\u00d1\u00d2\7d\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7g\2"+
		"\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7m\2\2\u00d6&\3\2\2\2\u00d7\u00d8\7"+
		"f\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7c\2\2\u00db\u00dc"+
		"\7w\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7v\2\2\u00de(\3\2\2\2\u00df\u00e0"+
		"\7=\2\2\u00e0*\3\2\2\2\u00e1\u00e2\7<\2\2\u00e2,\3\2\2\2\u00e3\u00e4\7"+
		"\60\2\2\u00e4.\3\2\2\2\u00e5\u00e6\t\4\2\2\u00e6\60\3\2\2\2\u00e7\u00e8"+
		"\t\5\2\2\u00e8\62\3\2\2\2\u00e9\u00ea\7@\2\2\u00ea\u00f0\7?\2\2\u00eb"+
		"\u00f0\7@\2\2\u00ec\u00ed\7>\2\2\u00ed\u00f0\7?\2\2\u00ee\u00f0\7>\2\2"+
		"\u00ef\u00e9\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ee"+
		"\3\2\2\2\u00f0\64\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2\u00f6\7?\2\2\u00f3"+
		"\u00f4\7#\2\2\u00f4\u00f6\7?\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f3\3\2\2"+
		"\2\u00f6\66\3\2\2\2\u00f7\u00f8\7?\2\2\u00f88\3\2\2\2\u00f9\u00fa\7~\2"+
		"\2\u00fa\u00fb\7~\2\2\u00fb:\3\2\2\2\u00fc\u00fd\7(\2\2\u00fd\u00fe\7"+
		"(\2\2\u00fe<\3\2\2\2\u00ff\u0100\7#\2\2\u0100>\3\2\2\2\u0101\u0102\7A"+
		"\2\2\u0102@\3\2\2\2\u0103\u0106\5Q)\2\u0104\u0106\5S*\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010e\3\2\2\2\u0109\u010d\5Q)\2\u010a\u010d\5S*\2"+
		"\u010b\u010d\5O(\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"B\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113\5\61\31\2\u0112\u0111\3\2\2"+
		"\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0116\5O(\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u012b\3\2\2\2\u0119\u011b\5\61\31\2\u011a\u0119\3\2\2\2\u011a\u011b\3"+
		"\2\2\2\u011b\u011d\3\2\2\2\u011c\u011e\5O(\2\u011d\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\7~\2\2\u0122\u0124\5\61\31\2\u0123\u0122\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0127\5O(\2\u0126\u0125\3\2\2"+
		"\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b"+
		"\3\2\2\2\u012a\u0112\3\2\2\2\u012a\u011a\3\2\2\2\u012bD\3\2\2\2\u012c"+
		"\u012d\7*\2\2\u012dF\3\2\2\2\u012e\u012f\7+\2\2\u012fH\3\2\2\2\u0130\u0131"+
		"\7}\2\2\u0131J\3\2\2\2\u0132\u0133\7\177\2\2\u0133L\3\2\2\2\u0134\u0135"+
		"\7.\2\2\u0135N\3\2\2\2\u0136\u0137\t\6\2\2\u0137P\3\2\2\2\u0138\u0139"+
		"\t\7\2\2\u0139R\3\2\2\2\u013a\u013b\t\b\2\2\u013bT\3\2\2\2\24\2Ya\u009e"+
		"\u00ae\u00ef\u00f5\u0105\u0107\u010c\u010e\u0112\u0117\u011a\u011f\u0123"+
		"\u0128\u012a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}