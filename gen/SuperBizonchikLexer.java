// Generated from /Users/Cr1xus/Documents/git_projects/SuperBizonchikLang/SuperBizonchikLanguage/src/SuperBizonchik.g4 by ANTLR 4.5.1
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
		Println=1, Print=2, Func=3, If=4, Else=5, Return=6, While=7, To=8, Do=9, 
		End=10, Null=11, Decrement=12, Increment=13, Or=14, And=15, Equals=16, 
		NEquals=17, GTEquals=18, LTEquals=19, Pow=20, Excl=21, GT=22, LT=23, Add=24, 
		Subtract=25, Multiply=26, Divide=27, Modulus=28, OBrace=29, CBrace=30, 
		OParen=31, CParen=32, SColon=33, Assign=34, Comma=35, Bool=36, Number=37, 
		Identifier=38, String=39, Comment=40, Space=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Println", "Print", "Func", "If", "Else", "Return", "While", "To", "Do", 
		"End", "Null", "Decrement", "Increment", "Or", "And", "Equals", "NEquals", 
		"GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", 
		"Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OParen", "CParen", 
		"SColon", "Assign", "Comma", "Bool", "Number", "Identifier", "String", 
		"Comment", "Space", "Int", "Digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'println'", "'print'", "'func'", "'if'", "'else'", "'return'", 
		"'while'", "'to'", "'do'", "'end'", "'null'", "'--'", "'++'", "'||'", 
		"'&&'", "'=='", "'!='", "'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'{'", "'}'", "'('", "')'", "';'", "'='", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Println", "Print", "Func", "If", "Else", "Return", "While", "To", 
		"Do", "End", "Null", "Decrement", "Increment", "Or", "And", "Equals", 
		"NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", 
		"Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OParen", "CParen", 
		"SColon", "Assign", "Comma", "Bool", "Number", "Identifier", "String", 
		"Comment", "Space"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u0126\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00d2\n%\3&\3&\3&\7&\u00d7\n&\f&\16&\u00da"+
		"\13&\5&\u00dc\n&\3\'\3\'\7\'\u00e0\n\'\f\'\16\'\u00e3\13\'\3(\3(\3(\3"+
		"(\3(\3(\7(\u00eb\n(\f(\16(\u00ee\13(\3(\3(\3(\3(\3(\3(\3(\7(\u00f7\n("+
		"\f(\16(\u00fa\13(\3(\5(\u00fd\n(\3)\3)\3)\3)\7)\u0103\n)\f)\16)\u0106"+
		"\13)\3)\3)\3)\3)\7)\u010c\n)\f)\16)\u010f\13)\3)\3)\5)\u0113\n)\3)\3)"+
		"\3*\3*\3*\3*\3+\3+\7+\u011d\n+\f+\16+\u0120\13+\3+\5+\u0123\n+\3,\3,\3"+
		"\u010d\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W\2\3\2\f\5\2C\\aac|\6\2\62;C"+
		"\\aac|\3\2$$\5\2\f\f\17\17$$\3\2))\5\2\f\f\17\17))\4\2\f\f\17\17\5\2\13"+
		"\f\17\17\"\"\3\2\63;\3\2\62;\u0133\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3Y\3\2\2\2\5a\3\2\2\2\7g\3\2\2\2\tl\3"+
		"\2\2\2\13o\3\2\2\2\rt\3\2\2\2\17{\3\2\2\2\21\u0081\3\2\2\2\23\u0084\3"+
		"\2\2\2\25\u0087\3\2\2\2\27\u008b\3\2\2\2\31\u0090\3\2\2\2\33\u0093\3\2"+
		"\2\2\35\u0096\3\2\2\2\37\u0099\3\2\2\2!\u009c\3\2\2\2#\u009f\3\2\2\2%"+
		"\u00a2\3\2\2\2\'\u00a5\3\2\2\2)\u00a8\3\2\2\2+\u00aa\3\2\2\2-\u00ac\3"+
		"\2\2\2/\u00ae\3\2\2\2\61\u00b0\3\2\2\2\63\u00b2\3\2\2\2\65\u00b4\3\2\2"+
		"\2\67\u00b6\3\2\2\29\u00b8\3\2\2\2;\u00ba\3\2\2\2=\u00bc\3\2\2\2?\u00be"+
		"\3\2\2\2A\u00c0\3\2\2\2C\u00c2\3\2\2\2E\u00c4\3\2\2\2G\u00c6\3\2\2\2I"+
		"\u00d1\3\2\2\2K\u00d3\3\2\2\2M\u00dd\3\2\2\2O\u00fc\3\2\2\2Q\u0112\3\2"+
		"\2\2S\u0116\3\2\2\2U\u0122\3\2\2\2W\u0124\3\2\2\2YZ\7r\2\2Z[\7t\2\2[\\"+
		"\7k\2\2\\]\7p\2\2]^\7v\2\2^_\7n\2\2_`\7p\2\2`\4\3\2\2\2ab\7r\2\2bc\7t"+
		"\2\2cd\7k\2\2de\7p\2\2ef\7v\2\2f\6\3\2\2\2gh\7h\2\2hi\7w\2\2ij\7p\2\2"+
		"jk\7e\2\2k\b\3\2\2\2lm\7k\2\2mn\7h\2\2n\n\3\2\2\2op\7g\2\2pq\7n\2\2qr"+
		"\7u\2\2rs\7g\2\2s\f\3\2\2\2tu\7t\2\2uv\7g\2\2vw\7v\2\2wx\7w\2\2xy\7t\2"+
		"\2yz\7p\2\2z\16\3\2\2\2{|\7y\2\2|}\7j\2\2}~\7k\2\2~\177\7n\2\2\177\u0080"+
		"\7g\2\2\u0080\20\3\2\2\2\u0081\u0082\7v\2\2\u0082\u0083\7q\2\2\u0083\22"+
		"\3\2\2\2\u0084\u0085\7f\2\2\u0085\u0086\7q\2\2\u0086\24\3\2\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089\u008a\7f\2\2\u008a\26\3\2\2\2\u008b"+
		"\u008c\7p\2\2\u008c\u008d\7w\2\2\u008d\u008e\7n\2\2\u008e\u008f\7n\2\2"+
		"\u008f\30\3\2\2\2\u0090\u0091\7/\2\2\u0091\u0092\7/\2\2\u0092\32\3\2\2"+
		"\2\u0093\u0094\7-\2\2\u0094\u0095\7-\2\2\u0095\34\3\2\2\2\u0096\u0097"+
		"\7~\2\2\u0097\u0098\7~\2\2\u0098\36\3\2\2\2\u0099\u009a\7(\2\2\u009a\u009b"+
		"\7(\2\2\u009b \3\2\2\2\u009c\u009d\7?\2\2\u009d\u009e\7?\2\2\u009e\"\3"+
		"\2\2\2\u009f\u00a0\7#\2\2\u00a0\u00a1\7?\2\2\u00a1$\3\2\2\2\u00a2\u00a3"+
		"\7@\2\2\u00a3\u00a4\7?\2\2\u00a4&\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a7"+
		"\7?\2\2\u00a7(\3\2\2\2\u00a8\u00a9\7`\2\2\u00a9*\3\2\2\2\u00aa\u00ab\7"+
		"#\2\2\u00ab,\3\2\2\2\u00ac\u00ad\7@\2\2\u00ad.\3\2\2\2\u00ae\u00af\7>"+
		"\2\2\u00af\60\3\2\2\2\u00b0\u00b1\7-\2\2\u00b1\62\3\2\2\2\u00b2\u00b3"+
		"\7/\2\2\u00b3\64\3\2\2\2\u00b4\u00b5\7,\2\2\u00b5\66\3\2\2\2\u00b6\u00b7"+
		"\7\61\2\2\u00b78\3\2\2\2\u00b8\u00b9\7\'\2\2\u00b9:\3\2\2\2\u00ba\u00bb"+
		"\7}\2\2\u00bb<\3\2\2\2\u00bc\u00bd\7\177\2\2\u00bd>\3\2\2\2\u00be\u00bf"+
		"\7*\2\2\u00bf@\3\2\2\2\u00c0\u00c1\7+\2\2\u00c1B\3\2\2\2\u00c2\u00c3\7"+
		"=\2\2\u00c3D\3\2\2\2\u00c4\u00c5\7?\2\2\u00c5F\3\2\2\2\u00c6\u00c7\7."+
		"\2\2\u00c7H\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb"+
		"\7w\2\2\u00cb\u00d2\7g\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7c\2\2\u00ce"+
		"\u00cf\7n\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d2\7g\2\2\u00d1\u00c8\3\2\2"+
		"\2\u00d1\u00cc\3\2\2\2\u00d2J\3\2\2\2\u00d3\u00db\5U+\2\u00d4\u00d8\7"+
		"\60\2\2\u00d5\u00d7\5W,\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00d4\3\2\2\2\u00db\u00dc\3\2\2\2\u00dcL\3\2\2\2\u00dd\u00e1"+
		"\t\2\2\2\u00de\u00e0\t\3\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2N\3\2\2\2\u00e3\u00e1\3\2\2\2"+
		"\u00e4\u00ec\t\4\2\2\u00e5\u00eb\n\5\2\2\u00e6\u00e7\7^\2\2\u00e7\u00eb"+
		"\7^\2\2\u00e8\u00e9\7^\2\2\u00e9\u00eb\7$\2\2\u00ea\u00e5\3\2\2\2\u00ea"+
		"\u00e6\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00fd\t\4\2\2\u00f0\u00f8\t\6\2\2\u00f1\u00f7\n\7\2\2\u00f2\u00f3\7^"+
		"\2\2\u00f3\u00f7\7^\2\2\u00f4\u00f5\7^\2\2\u00f5\u00f7\7)\2\2\u00f6\u00f1"+
		"\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fd\t\6\2\2\u00fc\u00e4\3\2\2\2\u00fc\u00f0\3\2\2\2\u00fd"+
		"P\3\2\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\7\61\2\2\u0100\u0104\3\2\2"+
		"\2\u0101\u0103\n\b\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0113\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0108\7\61\2\2\u0108\u0109\7,\2\2\u0109\u010d\3\2\2\2\u010a\u010c\13"+
		"\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7,"+
		"\2\2\u0111\u0113\7\61\2\2\u0112\u00fe\3\2\2\2\u0112\u0107\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\b)\2\2\u0115R\3\2\2\2\u0116\u0117\t\t\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\b*\2\2\u0119T\3\2\2\2\u011a\u011e\t\n\2\2\u011b"+
		"\u011d\5W,\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2"+
		"\2\u011e\u011f\3\2\2\2\u011f\u0123\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123"+
		"\7\62\2\2\u0122\u011a\3\2\2\2\u0122\u0121\3\2\2\2\u0123V\3\2\2\2\u0124"+
		"\u0125\t\13\2\2\u0125X\3\2\2\2\21\2\u00d1\u00d8\u00db\u00e1\u00ea\u00ec"+
		"\u00f6\u00f8\u00fc\u0104\u010d\u0112\u011e\u0122\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}