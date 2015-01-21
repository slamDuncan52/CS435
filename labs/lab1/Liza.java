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
		WS=1, RESERVED=2, SINGLES=3, ID=4, INTEGER=5, FLOATING=6, STRING=7, COMMENT=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'"
	};
	public static final String[] ruleNames = {
		"WS", "RESERVED", "SINGLES", "ID", "INTEGER", "FLOATING", "STRING", "COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u0087\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\25"+
		"\n\2\r\2\16\2\26\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3F\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Y"+
		"\n\4\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\3\6\6\6c\n\6\r\6\16\6d\3\7\5\7h\n"+
		"\7\3\7\6\7k\n\7\r\7\16\7l\3\7\3\7\7\7q\n\7\f\7\16\7t\13\7\3\b\3\b\7\b"+
		"x\n\b\f\b\16\b{\13\b\3\b\3\b\3\t\3\t\7\t\u0081\n\t\f\t\16\t\u0084\13\t"+
		"\3\t\3\t\4y\u0082\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\n\5\2\13"+
		"\f\17\17\"\"\n\2*-//\61\61==]]__}}\177\177\6\2C\\aac|~~\7\2\62;C\\aac"+
		"|~~\3\2\62;\5\2))--~~\3\2\61\61\3\2\f\f\u00a2\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\3\24\3\2\2\2\5E\3\2\2\2\7X\3\2\2\2\tZ\3\2\2\2\13b\3\2\2\2\rg\3"+
		"\2\2\2\17u\3\2\2\2\21~\3\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\26\3\2\2"+
		"\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\b\2\2\2\31\4\3\2\2"+
		"\2\32\33\7k\2\2\33F\7h\2\2\34\35\7g\2\2\35\36\7n\2\2\36\37\7u\2\2\37F"+
		"\7g\2\2 !\7y\2\2!\"\7j\2\2\"#\7k\2\2#$\7n\2\2$F\7g\2\2%&\7f\2\2&F\7q\2"+
		"\2\'(\7d\2\2()\7t\2\2)*\7g\2\2*+\7c\2\2+F\7m\2\2,-\7k\2\2-.\7p\2\2.F\7"+
		"v\2\2/\60\7h\2\2\60\61\7n\2\2\61\62\7q\2\2\62\63\7c\2\2\63F\7v\2\2\64"+
		"\65\7e\2\2\65\66\7j\2\2\66\67\7c\2\2\67F\7t\2\289\7d\2\29:\7q\2\2:;\7"+
		"q\2\2;F\7n\2\2<=\7v\2\2=>\7t\2\2>?\7w\2\2?F\7g\2\2@A\7h\2\2AB\7c\2\2B"+
		"C\7n\2\2CD\7u\2\2DF\7g\2\2E\32\3\2\2\2E\34\3\2\2\2E \3\2\2\2E%\3\2\2\2"+
		"E\'\3\2\2\2E,\3\2\2\2E/\3\2\2\2E\64\3\2\2\2E8\3\2\2\2E<\3\2\2\2E@\3\2"+
		"\2\2F\6\3\2\2\2GH\7(\2\2HY\7(\2\2IJ\7~\2\2JY\7~\2\2KY\7?\2\2LM\7?\2\2"+
		"MY\7?\2\2NY\7#\2\2OP\7#\2\2PY\7?\2\2QY\7>\2\2RS\7>\2\2SY\7?\2\2TY\7@\2"+
		"\2UV\7@\2\2VY\7?\2\2WY\t\3\2\2XG\3\2\2\2XI\3\2\2\2XK\3\2\2\2XL\3\2\2\2"+
		"XN\3\2\2\2XO\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XT\3\2\2\2XU\3\2\2\2XW\3\2\2\2"+
		"Y\b\3\2\2\2Z^\t\4\2\2[]\t\5\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2"+
		"\2\2_\n\3\2\2\2`^\3\2\2\2ac\t\6\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3"+
		"\2\2\2e\f\3\2\2\2fh\t\7\2\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\t\6\2\2ji"+
		"\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2nr\7\60\2\2oq\t\6\2\2"+
		"po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\16\3\2\2\2tr\3\2\2\2uy\7$\2"+
		"\2vx\13\2\2\2wv\3\2\2\2x{\3\2\2\2yz\3\2\2\2yw\3\2\2\2z|\3\2\2\2{y\3\2"+
		"\2\2|}\7$\2\2}\20\3\2\2\2~\u0082\t\b\2\2\177\u0081\13\2\2\2\u0080\177"+
		"\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\t\t\2\2\u0086\22\3\2\2"+
		"\2\r\2\26EX^dglry\u0082\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}