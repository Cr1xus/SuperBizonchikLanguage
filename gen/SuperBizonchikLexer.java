// Generated from /Users/Cr1xus/Documents/git_projects/SuperBizonchikLanguage/src/SuperBizonchik.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SuperBizonchikLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Println=1, Print=2, Def=3, If=4, Else=5, Return=6, While=7, To=8, Do=9, 
		End=10, Null=11, Or=12, And=13, Equals=14, NEquals=15, GTEquals=16, LTEquals=17, 
		Pow=18, Excl=19, GT=20, LT=21, Add=22, Subtract=23, Multiply=24, Divide=25, 
		Modulus=26, OBrace=27, CBrace=28, OParen=29, CParen=30, SColon=31, Assign=32, 
		Comma=33, Bool=34, Number=35, Identifier=36, String=37, Comment=38, Space=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Println", "Print", "Def", "If", "Else", "Return", "While", "To", "Do", 
		"End", "Null", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", 
		"Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", 
		"OBrace", "CBrace", "OParen", "CParen", "SColon", "Assign", "Comma", "Bool", 
		"Number", "Identifier", "String", "Comment", "Space", "Int", "Digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'println'", "'print'", "'def'", "'if'", "'else'", "'return'", "'while'", 
		"'to'", "'do'", "'end'", "'null'", "'||'", "'&&'", "'=='", "'!='", "'>='", 
		"'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'{'", "'}'", "'('", "')'", "';'", "'='", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Println", "Print", "Def", "If", "Else", "Return", "While", "To", 
		"Do", "End", "Null", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", 
		"Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", 
		"OBrace", "CBrace", "OParen", "CParen", "SColon", "Assign", "Comma", "Bool", 
		"Number", "Identifier", "String", "Comment", "Space"
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


	public SuperBizonchikLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SuperBizonchik.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u011b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00c7\n#"+
		"\3$\3$\3$\7$\u00cc\n$\f$\16$\u00cf\13$\5$\u00d1\n$\3%\3%\7%\u00d5\n%\f"+
		"%\16%\u00d8\13%\3&\3&\3&\3&\3&\3&\7&\u00e0\n&\f&\16&\u00e3\13&\3&\3&\3"+
		"&\3&\3&\3&\3&\7&\u00ec\n&\f&\16&\u00ef\13&\3&\5&\u00f2\n&\3\'\3\'\3\'"+
		"\3\'\7\'\u00f8\n\'\f\'\16\'\u00fb\13\'\3\'\3\'\3\'\3\'\7\'\u0101\n\'\f"+
		"\'\16\'\u0104\13\'\3\'\3\'\5\'\u0108\n\'\3\'\3\'\3(\3(\3(\3(\3)\3)\7)"+
		"\u0112\n)\f)\16)\u0115\13)\3)\5)\u0118\n)\3*\3*\3\u0102\2+\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q\2S\2\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\5\2\f\f\17\17$"+
		"$\3\2))\5\2\f\f\17\17))\4\2\f\f\17\17\5\2\13\f\16\17\"\"\3\2\63;\3\2\62"+
		";\u0128\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3U\3\2\2\2\5]\3"+
		"\2\2\2\7c\3\2\2\2\tg\3\2\2\2\13j\3\2\2\2\ro\3\2\2\2\17v\3\2\2\2\21|\3"+
		"\2\2\2\23\177\3\2\2\2\25\u0082\3\2\2\2\27\u0086\3\2\2\2\31\u008b\3\2\2"+
		"\2\33\u008e\3\2\2\2\35\u0091\3\2\2\2\37\u0094\3\2\2\2!\u0097\3\2\2\2#"+
		"\u009a\3\2\2\2%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a1\3\2\2\2+\u00a3\3"+
		"\2\2\2-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61\u00a9\3\2\2\2\63\u00ab\3\2\2\2"+
		"\65\u00ad\3\2\2\2\67\u00af\3\2\2\29\u00b1\3\2\2\2;\u00b3\3\2\2\2=\u00b5"+
		"\3\2\2\2?\u00b7\3\2\2\2A\u00b9\3\2\2\2C\u00bb\3\2\2\2E\u00c6\3\2\2\2G"+
		"\u00c8\3\2\2\2I\u00d2\3\2\2\2K\u00f1\3\2\2\2M\u0107\3\2\2\2O\u010b\3\2"+
		"\2\2Q\u0117\3\2\2\2S\u0119\3\2\2\2UV\7r\2\2VW\7t\2\2WX\7k\2\2XY\7p\2\2"+
		"YZ\7v\2\2Z[\7n\2\2[\\\7p\2\2\\\4\3\2\2\2]^\7r\2\2^_\7t\2\2_`\7k\2\2`a"+
		"\7p\2\2ab\7v\2\2b\6\3\2\2\2cd\7f\2\2de\7g\2\2ef\7h\2\2f\b\3\2\2\2gh\7"+
		"k\2\2hi\7h\2\2i\n\3\2\2\2jk\7g\2\2kl\7n\2\2lm\7u\2\2mn\7g\2\2n\f\3\2\2"+
		"\2op\7t\2\2pq\7g\2\2qr\7v\2\2rs\7w\2\2st\7t\2\2tu\7p\2\2u\16\3\2\2\2v"+
		"w\7y\2\2wx\7j\2\2xy\7k\2\2yz\7n\2\2z{\7g\2\2{\20\3\2\2\2|}\7v\2\2}~\7"+
		"q\2\2~\22\3\2\2\2\177\u0080\7f\2\2\u0080\u0081\7q\2\2\u0081\24\3\2\2\2"+
		"\u0082\u0083\7g\2\2\u0083\u0084\7p\2\2\u0084\u0085\7f\2\2\u0085\26\3\2"+
		"\2\2\u0086\u0087\7p\2\2\u0087\u0088\7w\2\2\u0088\u0089\7n\2\2\u0089\u008a"+
		"\7n\2\2\u008a\30\3\2\2\2\u008b\u008c\7~\2\2\u008c\u008d\7~\2\2\u008d\32"+
		"\3\2\2\2\u008e\u008f\7(\2\2\u008f\u0090\7(\2\2\u0090\34\3\2\2\2\u0091"+
		"\u0092\7?\2\2\u0092\u0093\7?\2\2\u0093\36\3\2\2\2\u0094\u0095\7#\2\2\u0095"+
		"\u0096\7?\2\2\u0096 \3\2\2\2\u0097\u0098\7@\2\2\u0098\u0099\7?\2\2\u0099"+
		"\"\3\2\2\2\u009a\u009b\7>\2\2\u009b\u009c\7?\2\2\u009c$\3\2\2\2\u009d"+
		"\u009e\7`\2\2\u009e&\3\2\2\2\u009f\u00a0\7#\2\2\u00a0(\3\2\2\2\u00a1\u00a2"+
		"\7@\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7"+
		"-\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7/\2\2\u00a8\60\3\2\2\2\u00a9\u00aa\7"+
		",\2\2\u00aa\62\3\2\2\2\u00ab\u00ac\7\61\2\2\u00ac\64\3\2\2\2\u00ad\u00ae"+
		"\7\'\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7}\2\2\u00b08\3\2\2\2\u00b1\u00b2"+
		"\7\177\2\2\u00b2:\3\2\2\2\u00b3\u00b4\7*\2\2\u00b4<\3\2\2\2\u00b5\u00b6"+
		"\7+\2\2\u00b6>\3\2\2\2\u00b7\u00b8\7=\2\2\u00b8@\3\2\2\2\u00b9\u00ba\7"+
		"?\2\2\u00baB\3\2\2\2\u00bb\u00bc\7.\2\2\u00bcD\3\2\2\2\u00bd\u00be\7v"+
		"\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c7\7g\2\2\u00c1\u00c2"+
		"\7h\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7u\2\2\u00c5"+
		"\u00c7\7g\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c7F\3\2\2\2\u00c8"+
		"\u00d0\5Q)\2\u00c9\u00cd\7\60\2\2\u00ca\u00cc\5S*\2\u00cb\u00ca\3\2\2"+
		"\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00c9\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"H\3\2\2\2\u00d2\u00d6\t\2\2\2\u00d3\u00d5\t\3\2\2\u00d4\u00d3\3\2\2\2"+
		"\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7J\3"+
		"\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00e1\t\4\2\2\u00da\u00e0\n\5\2\2\u00db"+
		"\u00dc\7^\2\2\u00dc\u00e0\7^\2\2\u00dd\u00de\7^\2\2\u00de\u00e0\7$\2\2"+
		"\u00df\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00f2\t\4\2\2\u00e5\u00ed\t\6\2\2\u00e6\u00ec\n\7"+
		"\2\2\u00e7\u00e8\7^\2\2\u00e8\u00ec\7^\2\2\u00e9\u00ea\7^\2\2\u00ea\u00ec"+
		"\7)\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\t\6\2\2\u00f1\u00d9\3\2\2\2\u00f1"+
		"\u00e5\3\2\2\2\u00f2L\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4\u00f5\7\61\2"+
		"\2\u00f5\u00f9\3\2\2\2\u00f6\u00f8\n\b\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0108\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u00fd\7\61\2\2\u00fd\u00fe\7,\2\2\u00fe\u0102\3\2"+
		"\2\2\u00ff\u0101\13\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\u0106\7,\2\2\u0106\u0108\7\61\2\2\u0107\u00f3\3\2\2\2\u0107"+
		"\u00fc\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b\'\2\2\u010aN\3\2\2\2"+
		"\u010b\u010c\t\t\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b(\2\2\u010eP\3\2"+
		"\2\2\u010f\u0113\t\n\2\2\u0110\u0112\5S*\2\u0111\u0110\3\2\2\2\u0112\u0115"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0118\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0118\7\62\2\2\u0117\u010f\3\2\2\2\u0117\u0116\3"+
		"\2\2\2\u0118R\3\2\2\2\u0119\u011a\t\13\2\2\u011aT\3\2\2\2\21\2\u00c6\u00cd"+
		"\u00d0\u00d6\u00df\u00e1\u00eb\u00ed\u00f1\u00f9\u0102\u0107\u0113\u0117"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}