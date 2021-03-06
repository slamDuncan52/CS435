// Generated from Liza.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Liza extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, IF=2, ELSE=3, WHILE=4, DO=5, BREAK=6, INT=7, FLOAT=8, CHAR=9, BOOL=10, 
		TRUE=11, FALSE=12, AND=13, OR=14, ASSIGN=15, EQ=16, NOT=17, NE=18, LT=19, 
		LE=20, GT=21, GE=22, LBRACE=23, RBRACE=24, LBRACK=25, RBRACK=26, LPAREN=27, 
		RPAREN=28, SEMI=29, PLUS=30, MINUS=31, MULT=32, DIV=33, ID=34, INTEGER=35, 
		FLOATING=36, STRING=37, COMMENT=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'"
	};
	public static final String[] ruleNames = {
		"WS", "IF", "ELSE", "WHILE", "DO", "BREAK", "INT", "FLOAT", "CHAR", "BOOL", 
		"TRUE", "FALSE", "AND", "OR", "ASSIGN", "EQ", "NOT", "NE", "LT", "LE", 
		"GT", "GE", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "LPAREN", "RPAREN", 
		"SEMI", "PLUS", "MINUS", "MULT", "DIV", "ID", "INTEGER", "FLOATING", "STRING", 
		"COMMENT"
	};


	public Liza(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Liza.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u00ea\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2Q\n\2\r\2\16\2R\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\7#\u00bf\n#\f#\16#\u00c2\13"+
		"#\3$\6$\u00c5\n$\r$\16$\u00c6\3%\6%\u00ca\n%\r%\16%\u00cb\3%\3%\6%\u00d0"+
		"\n%\r%\16%\u00d1\3&\3&\3&\3&\3&\7&\u00d9\n&\f&\16&\u00dc\13&\3&\3&\3\'"+
		"\3\'\3\'\3\'\7\'\u00e4\n\'\f\'\16\'\u00e7\13\'\3\'\3\'\3\u00e5\2(\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(\3\2\7\5\2\13\f\17\17\"\"\6\2C\\aac|~~\7\2\62;C\\aac|"+
		"~~\3\2\62;\4\2$$^^\u00f2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3P\3\2\2\2\5"+
		"V\3\2\2\2\7Y\3\2\2\2\t^\3\2\2\2\13d\3\2\2\2\rg\3\2\2\2\17m\3\2\2\2\21"+
		"q\3\2\2\2\23w\3\2\2\2\25|\3\2\2\2\27\u0081\3\2\2\2\31\u0086\3\2\2\2\33"+
		"\u008c\3\2\2\2\35\u008f\3\2\2\2\37\u0092\3\2\2\2!\u0094\3\2\2\2#\u0097"+
		"\3\2\2\2%\u0099\3\2\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2+\u00a1\3\2\2\2"+
		"-\u00a3\3\2\2\2/\u00a6\3\2\2\2\61\u00a8\3\2\2\2\63\u00aa\3\2\2\2\65\u00ac"+
		"\3\2\2\2\67\u00ae\3\2\2\29\u00b0\3\2\2\2;\u00b2\3\2\2\2=\u00b4\3\2\2\2"+
		"?\u00b6\3\2\2\2A\u00b8\3\2\2\2C\u00ba\3\2\2\2E\u00bc\3\2\2\2G\u00c4\3"+
		"\2\2\2I\u00c9\3\2\2\2K\u00d3\3\2\2\2M\u00df\3\2\2\2OQ\t\2\2\2PO\3\2\2"+
		"\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\b\2\2\2U\4\3\2\2\2VW\7k\2"+
		"\2WX\7h\2\2X\6\3\2\2\2YZ\7g\2\2Z[\7n\2\2[\\\7u\2\2\\]\7g\2\2]\b\3\2\2"+
		"\2^_\7y\2\2_`\7j\2\2`a\7k\2\2ab\7n\2\2bc\7g\2\2c\n\3\2\2\2de\7f\2\2ef"+
		"\7q\2\2f\f\3\2\2\2gh\7d\2\2hi\7t\2\2ij\7g\2\2jk\7c\2\2kl\7m\2\2l\16\3"+
		"\2\2\2mn\7k\2\2no\7p\2\2op\7v\2\2p\20\3\2\2\2qr\7h\2\2rs\7n\2\2st\7q\2"+
		"\2tu\7c\2\2uv\7v\2\2v\22\3\2\2\2wx\7e\2\2xy\7j\2\2yz\7c\2\2z{\7t\2\2{"+
		"\24\3\2\2\2|}\7d\2\2}~\7q\2\2~\177\7q\2\2\177\u0080\7n\2\2\u0080\26\3"+
		"\2\2\2\u0081\u0082\7v\2\2\u0082\u0083\7t\2\2\u0083\u0084\7w\2\2\u0084"+
		"\u0085\7g\2\2\u0085\30\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7n\2\2\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b\32\3\2\2\2\u008c"+
		"\u008d\7(\2\2\u008d\u008e\7(\2\2\u008e\34\3\2\2\2\u008f\u0090\7~\2\2\u0090"+
		"\u0091\7~\2\2\u0091\36\3\2\2\2\u0092\u0093\7?\2\2\u0093 \3\2\2\2\u0094"+
		"\u0095\7?\2\2\u0095\u0096\7?\2\2\u0096\"\3\2\2\2\u0097\u0098\7#\2\2\u0098"+
		"$\3\2\2\2\u0099\u009a\7#\2\2\u009a\u009b\7?\2\2\u009b&\3\2\2\2\u009c\u009d"+
		"\7>\2\2\u009d(\3\2\2\2\u009e\u009f\7>\2\2\u009f\u00a0\7?\2\2\u00a0*\3"+
		"\2\2\2\u00a1\u00a2\7@\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4\u00a5"+
		"\7?\2\2\u00a5.\3\2\2\2\u00a6\u00a7\7}\2\2\u00a7\60\3\2\2\2\u00a8\u00a9"+
		"\7\177\2\2\u00a9\62\3\2\2\2\u00aa\u00ab\7]\2\2\u00ab\64\3\2\2\2\u00ac"+
		"\u00ad\7_\2\2\u00ad\66\3\2\2\2\u00ae\u00af\7*\2\2\u00af8\3\2\2\2\u00b0"+
		"\u00b1\7+\2\2\u00b1:\3\2\2\2\u00b2\u00b3\7=\2\2\u00b3<\3\2\2\2\u00b4\u00b5"+
		"\7-\2\2\u00b5>\3\2\2\2\u00b6\u00b7\7/\2\2\u00b7@\3\2\2\2\u00b8\u00b9\7"+
		",\2\2\u00b9B\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bbD\3\2\2\2\u00bc\u00c0\t"+
		"\3\2\2\u00bd\u00bf\t\4\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1F\3\2\2\2\u00c2\u00c0\3\2\2\2"+
		"\u00c3\u00c5\t\5\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7H\3\2\2\2\u00c8\u00ca\t\5\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\7\60\2\2\u00ce\u00d0\t\5\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2J\3\2\2\2\u00d3\u00da\7$\2\2\u00d4\u00d5\7^\2\2\u00d5\u00d9"+
		"\7$\2\2\u00d6\u00d9\n\6\2\2\u00d7\u00d9\7^\2\2\u00d8\u00d4\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00de\7$\2\2\u00deL\3\2\2\2\u00df\u00e0\7\61\2\2\u00e0\u00e1\7\61\2\2"+
		"\u00e1\u00e5\3\2\2\2\u00e2\u00e4\13\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00e9\7\f\2\2\u00e9N\3\2\2\2\13\2R\u00c0\u00c6\u00cb"+
		"\u00d1\u00d8\u00da\u00e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}