// Generated from Tokens1.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Tokens1 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, INT=2, NEWLINE=3, WS=4, STR=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'"
	};
	public static final String[] ruleNames = {
		"ID", "INT", "NEWLINE", "WS", "STR"
	};


	public Tokens1(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tokens1.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7.\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\3"+
		"\6\3\26\n\3\r\3\16\3\27\3\4\5\4\33\n\4\3\4\3\4\3\5\6\5 \n\5\r\5\16\5!"+
		"\3\5\3\5\3\6\3\6\7\6(\n\6\f\6\16\6+\13\6\3\6\3\6\3)\2\7\3\3\5\4\7\5\t"+
		"\6\13\7\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\62"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2"+
		"\2\2\5\25\3\2\2\2\7\32\3\2\2\2\t\37\3\2\2\2\13%\3\2\2\2\r\21\t\2\2\2\16"+
		"\20\t\3\2\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22"+
		"\4\3\2\2\2\23\21\3\2\2\2\24\26\t\4\2\2\25\24\3\2\2\2\26\27\3\2\2\2\27"+
		"\25\3\2\2\2\27\30\3\2\2\2\30\6\3\2\2\2\31\33\7\17\2\2\32\31\3\2\2\2\32"+
		"\33\3\2\2\2\33\34\3\2\2\2\34\35\7\f\2\2\35\b\3\2\2\2\36 \t\5\2\2\37\36"+
		"\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\b\5\2\2$\n\3\2"+
		"\2\2%)\7$\2\2&(\13\2\2\2\'&\3\2\2\2(+\3\2\2\2)*\3\2\2\2)\'\3\2\2\2*,\3"+
		"\2\2\2+)\3\2\2\2,-\7$\2\2-\f\3\2\2\2\b\2\21\27\32!)\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}