// Generated from Liza.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LizaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, IF=2, ELSE=3, WHILE=4, DO=5, BREAK=6, INT=7, FLOAT=8, CHAR=9, BOOL=10, 
		TRUE=11, FALSE=12, AND=13, OR=14, ASSIGN=15, EQ=16, NOT=17, NE=18, LT=19, 
		LE=20, GT=21, GE=22, LBRACE=23, RBRACE=24, LBRACK=25, RBRACK=26, LPAREN=27, 
		RPAREN=28, SEMI=29, PLUS=30, MINUS=31, MUL=32, DIV=33, ID=34, INTEGER=35, 
		FLOATING=36, STRING=37, COMMENT=38;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "'if'", "'else'", "'while'", "'do'", "'break'", "'int'", 
		"'float'", "'char'", "'bool'", "'true'", "'false'", "'&&'", "'||'", "'='", 
		"'=='", "'!'", "'!='", "'<'", "'<='", "'>'", "'>='", "'{'", "'}'", "'['", 
		"']'", "'('", "')'", "';'", "'+'", "'-'", "'*'", "'/'", "ID", "INTEGER", 
		"FLOATING", "STRING", "COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_decls = 2, RULE_decl = 3, RULE_type = 4, 
		RULE_stmts = 5, RULE_stmt = 6, RULE_loc = 7, RULE_bool = 8, RULE_join = 9, 
		RULE_equality = 10, RULE_rel = 11, RULE_expr = 12, RULE_term = 13, RULE_unary = 14, 
		RULE_factor = 15;
	public static final String[] ruleNames = {
		"program", "block", "decls", "decl", "type", "stmts", "stmt", "loc", "bool", 
		"join", "equality", "rel", "expr", "term", "unary", "factor"
	};

	@Override
	public String getGrammarFileName() { return "Liza.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LizaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LizaParser.LBRACE, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LizaParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(LBRACE);
			setState(35); decls(0);
			setState(36); stmts(0);
			setState(37); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclsContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		return decls(0);
	}

	private DeclsContext decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclsContext _localctx = new DeclsContext(_ctx, _parentState);
		DeclsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_decls);
					setState(40);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(41); decl();
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(LizaParser.SEMI, 0); }
		public TerminalNode ID() { return getToken(LizaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); type(0);
			setState(48); match(ID);
			setState(49); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(LizaParser.RBRACK, 0); }
		public TerminalNode BOOL() { return getToken(LizaParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(LizaParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(LizaParser.INT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(LizaParser.INTEGER, 0); }
		public TerminalNode CHAR() { return getToken(LizaParser.CHAR, 0); }
		public TerminalNode LBRACK() { return getToken(LizaParser.LBRACK, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(52); match(INT);
				}
				break;
			case FLOAT:
				{
				setState(53); match(FLOAT);
				}
				break;
			case CHAR:
				{
				setState(54); match(CHAR);
				}
				break;
			case BOOL:
				{
				setState(55); match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(58);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(59); match(LBRACK);
					setState(60); match(INTEGER);
					setState(61); match(RBRACK);
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StmtsContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		return stmts(0);
	}

	private StmtsContext stmts(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtsContext _localctx = new StmtsContext(_ctx, _parentState);
		StmtsContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_stmts, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmtsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmts);
					setState(68);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(69); stmt();
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(LizaParser.BREAK, 0); }
		public TerminalNode LPAREN() { return getToken(LizaParser.LPAREN, 0); }
		public TerminalNode WHILE() { return getToken(LizaParser.WHILE, 0); }
		public TerminalNode IF() { return getToken(LizaParser.IF, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode DO() { return getToken(LizaParser.DO, 0); }
		public TerminalNode ELSE() { return getToken(LizaParser.ELSE, 0); }
		public TerminalNode ASSIGN() { return getToken(LizaParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(LizaParser.SEMI, 0); }
		public TerminalNode RPAREN() { return getToken(LizaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); loc(0);
				setState(76); match(ASSIGN);
				setState(77); bool(0);
				setState(78); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); match(IF);
				setState(81); match(LPAREN);
				setState(82); bool(0);
				setState(83); match(RPAREN);
				setState(84); stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86); match(IF);
				setState(87); match(LPAREN);
				setState(88); bool(0);
				setState(89); match(RPAREN);
				setState(90); stmt();
				setState(91); match(ELSE);
				setState(92); stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94); match(WHILE);
				setState(95); match(LPAREN);
				setState(96); bool(0);
				setState(97); match(RPAREN);
				setState(98); stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100); match(DO);
				setState(101); stmt();
				setState(102); match(WHILE);
				setState(103); match(LPAREN);
				setState(104); bool(0);
				setState(105); match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107); match(BREAK);
				setState(108); match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(109); block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(110); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(LizaParser.RBRACK, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode ID() { return getToken(LizaParser.ID, 0); }
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(LizaParser.LBRACK, 0); }
		public LocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitLoc(this);
		}
	}

	public final LocContext loc() throws RecognitionException {
		return loc(0);
	}

	private LocContext loc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LocContext _localctx = new LocContext(_ctx, _parentState);
		LocContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_loc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(114); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LocContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_loc);
					setState(116);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(117); match(LBRACK);
					setState(118); bool(0);
					setState(119); match(RBRACK);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode OR() { return getToken(LizaParser.OR, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		return bool(0);
	}

	private BoolContext bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolContext _localctx = new BoolContext(_ctx, _parentState);
		BoolContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_bool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(127); join(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool);
					setState(129);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(130); match(OR);
					setState(131); join(0);
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinContext extends ParserRuleContext {
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public TerminalNode AND() { return getToken(LizaParser.AND, 0); }
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitJoin(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		return join(0);
	}

	private JoinContext join(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinContext _localctx = new JoinContext(_ctx, _parentState);
		JoinContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_join, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138); equality(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_join);
					setState(140);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(141); match(AND);
					setState(142); equality(0);
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityContext extends ParserRuleContext {
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public TerminalNode NE() { return getToken(LizaParser.NE, 0); }
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public TerminalNode EQ() { return getToken(LizaParser.EQ, 0); }
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitEquality(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		return equality(0);
	}

	private EqualityContext equality(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityContext _localctx = new EqualityContext(_ctx, _parentState);
		EqualityContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_equality, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(149); rel();
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(151);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(152); match(EQ);
						setState(153); rel();
						}
						break;
					case 2:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(154);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(155); match(NE);
						setState(156); rel();
						}
						break;
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode LT() { return getToken(LizaParser.LT, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(LizaParser.LE, 0); }
		public TerminalNode GT() { return getToken(LizaParser.GT, 0); }
		public TerminalNode GE() { return getToken(LizaParser.GE, 0); }
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitRel(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rel);
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); expr(0);
				setState(163); match(LT);
				setState(164); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); expr(0);
				setState(167); match(LE);
				setState(168); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170); expr(0);
				setState(171); match(GE);
				setState(172); expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174); expr(0);
				setState(175); match(GT);
				setState(176); expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178); expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LizaParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(LizaParser.PLUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(182); term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(185); match(PLUS);
						setState(186); term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(188); match(MINUS);
						setState(189); term(0);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MUL() { return getToken(LizaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LizaParser.DIV, 0); }
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(196); unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(198);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(199); match(MUL);
						setState(200); unary();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(201);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(202); match(DIV);
						setState(203); unary();
						}
						break;
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(LizaParser.MINUS, 0); }
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(LizaParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unary);
		try {
			setState(214);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(NOT);
				setState(210); unary();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(211); match(MINUS);
				setState(212); unary();
				}
				break;
			case TRUE:
			case FALSE:
			case LPAREN:
			case ID:
			case INTEGER:
			case FLOATING:
				enterOuterAlt(_localctx, 3);
				{
				setState(213); factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(LizaParser.TRUE, 0); }
		public TerminalNode FLOATING() { return getToken(LizaParser.FLOATING, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LizaParser.RPAREN, 0); }
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LizaParser.LPAREN, 0); }
		public TerminalNode INTEGER() { return getToken(LizaParser.INTEGER, 0); }
		public TerminalNode FALSE() { return getToken(LizaParser.FALSE, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LizaListener ) ((LizaListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(225);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); match(LPAREN);
				setState(217); bool(0);
				setState(218); match(RPAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(220); loc(0);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(221); match(INTEGER);
				}
				break;
			case FLOATING:
				enterOuterAlt(_localctx, 4);
				{
				setState(222); match(FLOATING);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(223); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(224); match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return decls_sempred((DeclsContext)_localctx, predIndex);
		case 4: return type_sempred((TypeContext)_localctx, predIndex);
		case 5: return stmts_sempred((StmtsContext)_localctx, predIndex);
		case 7: return loc_sempred((LocContext)_localctx, predIndex);
		case 8: return bool_sempred((BoolContext)_localctx, predIndex);
		case 9: return join_sempred((JoinContext)_localctx, predIndex);
		case 10: return equality_sempred((EqualityContext)_localctx, predIndex);
		case 12: return expr_sempred((ExprContext)_localctx, predIndex);
		case 13: return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean equality_sempred(EqualityContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 3);
		case 7: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return precpred(_ctx, 3);
		case 11: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean stmts_sempred(StmtsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean loc_sempred(LocContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 3);
		case 9: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean decls_sempred(DeclsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean join_sempred(JoinContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bool_sempred(BoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\5\6;\n\6\3\6\3\6\3\6\3\6\7\6A\n\6\f\6\16\6D\13"+
		"\6\3\7\3\7\3\7\7\7I\n\7\f\7\16\7L\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\br\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u0087\n\n\f\n\16\n\u008a\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0092"+
		"\n\13\f\13\16\13\u0095\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a0"+
		"\n\f\f\f\16\f\u00a3\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00c1\n\16\f\16\16\16\u00c4\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00cf\n\17\f\17\16\17\u00d2\13\17\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00d9\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00e4\n\21\3\21\2\13\6\n\f\20\22\24\26\32\34\22\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\u00f6\2\"\3\2\2\2\4$\3\2\2\2\6"+
		")\3\2\2\2\b\61\3\2\2\2\n:\3\2\2\2\fE\3\2\2\2\16q\3\2\2\2\20s\3\2\2\2\22"+
		"\u0080\3\2\2\2\24\u008b\3\2\2\2\26\u0096\3\2\2\2\30\u00b5\3\2\2\2\32\u00b7"+
		"\3\2\2\2\34\u00c5\3\2\2\2\36\u00d8\3\2\2\2 \u00e3\3\2\2\2\"#\5\4\3\2#"+
		"\3\3\2\2\2$%\7\31\2\2%&\5\6\4\2&\'\5\f\7\2\'(\7\32\2\2(\5\3\2\2\2).\b"+
		"\4\1\2*+\f\4\2\2+-\5\b\5\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/"+
		"\7\3\2\2\2\60.\3\2\2\2\61\62\5\n\6\2\62\63\7$\2\2\63\64\7\37\2\2\64\t"+
		"\3\2\2\2\65\66\b\6\1\2\66;\7\t\2\2\67;\7\n\2\28;\7\13\2\29;\7\f\2\2:\65"+
		"\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;B\3\2\2\2<=\f\7\2\2=>\7\33\2"+
		"\2>?\7%\2\2?A\7\34\2\2@<\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\13\3\2"+
		"\2\2DB\3\2\2\2EJ\b\7\1\2FG\f\4\2\2GI\5\16\b\2HF\3\2\2\2IL\3\2\2\2JH\3"+
		"\2\2\2JK\3\2\2\2K\r\3\2\2\2LJ\3\2\2\2MN\5\20\t\2NO\7\21\2\2OP\5\22\n\2"+
		"PQ\7\37\2\2Qr\3\2\2\2RS\7\4\2\2ST\7\35\2\2TU\5\22\n\2UV\7\36\2\2VW\5\16"+
		"\b\2Wr\3\2\2\2XY\7\4\2\2YZ\7\35\2\2Z[\5\22\n\2[\\\7\36\2\2\\]\5\16\b\2"+
		"]^\7\5\2\2^_\5\16\b\2_r\3\2\2\2`a\7\6\2\2ab\7\35\2\2bc\5\22\n\2cd\7\36"+
		"\2\2de\5\16\b\2er\3\2\2\2fg\7\7\2\2gh\5\16\b\2hi\7\6\2\2ij\7\35\2\2jk"+
		"\5\22\n\2kl\7\36\2\2lr\3\2\2\2mn\7\b\2\2nr\7\37\2\2or\5\4\3\2pr\7\37\2"+
		"\2qM\3\2\2\2qR\3\2\2\2qX\3\2\2\2q`\3\2\2\2qf\3\2\2\2qm\3\2\2\2qo\3\2\2"+
		"\2qp\3\2\2\2r\17\3\2\2\2st\b\t\1\2tu\7$\2\2u}\3\2\2\2vw\f\4\2\2wx\7\33"+
		"\2\2xy\5\22\n\2yz\7\34\2\2z|\3\2\2\2{v\3\2\2\2|\177\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\21\3\2\2\2\177}\3\2\2\2\u0080\u0081\b\n\1\2\u0081\u0082\5"+
		"\24\13\2\u0082\u0088\3\2\2\2\u0083\u0084\f\4\2\2\u0084\u0085\7\20\2\2"+
		"\u0085\u0087\5\24\13\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\23\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\b\13\1\2\u008c\u008d\5\26\f\2\u008d\u0093\3\2\2\2\u008e\u008f\f"+
		"\4\2\2\u008f\u0090\7\17\2\2\u0090\u0092\5\26\f\2\u0091\u008e\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\25\3\2\2"+
		"\2\u0095\u0093\3\2\2\2\u0096\u0097\b\f\1\2\u0097\u0098\5\30\r\2\u0098"+
		"\u00a1\3\2\2\2\u0099\u009a\f\5\2\2\u009a\u009b\7\22\2\2\u009b\u00a0\5"+
		"\30\r\2\u009c\u009d\f\4\2\2\u009d\u009e\7\24\2\2\u009e\u00a0\5\30\r\2"+
		"\u009f\u0099\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\27\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\5\32\16\2\u00a5\u00a6\7\25\2\2\u00a6\u00a7\5\32\16\2\u00a7\u00b6"+
		"\3\2\2\2\u00a8\u00a9\5\32\16\2\u00a9\u00aa\7\26\2\2\u00aa\u00ab\5\32\16"+
		"\2\u00ab\u00b6\3\2\2\2\u00ac\u00ad\5\32\16\2\u00ad\u00ae\7\30\2\2\u00ae"+
		"\u00af\5\32\16\2\u00af\u00b6\3\2\2\2\u00b0\u00b1\5\32\16\2\u00b1\u00b2"+
		"\7\27\2\2\u00b2\u00b3\5\32\16\2\u00b3\u00b6\3\2\2\2\u00b4\u00b6\5\32\16"+
		"\2\u00b5\u00a4\3\2\2\2\u00b5\u00a8\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00b0"+
		"\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\31\3\2\2\2\u00b7\u00b8\b\16\1\2\u00b8"+
		"\u00b9\5\34\17\2\u00b9\u00c2\3\2\2\2\u00ba\u00bb\f\5\2\2\u00bb\u00bc\7"+
		" \2\2\u00bc\u00c1\5\34\17\2\u00bd\u00be\f\4\2\2\u00be\u00bf\7!\2\2\u00bf"+
		"\u00c1\5\34\17\2\u00c0\u00ba\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\33\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\b\17\1\2\u00c6\u00c7\5\36\20\2\u00c7\u00d0"+
		"\3\2\2\2\u00c8\u00c9\f\5\2\2\u00c9\u00ca\7\"\2\2\u00ca\u00cf\5\36\20\2"+
		"\u00cb\u00cc\f\4\2\2\u00cc\u00cd\7#\2\2\u00cd\u00cf\5\36\20\2\u00ce\u00c8"+
		"\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\35\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\23\2"+
		"\2\u00d4\u00d9\5\36\20\2\u00d5\u00d6\7!\2\2\u00d6\u00d9\5\36\20\2\u00d7"+
		"\u00d9\5 \21\2\u00d8\u00d3\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\37\3\2\2\2\u00da\u00db\7\35\2\2\u00db\u00dc\5\22\n\2\u00dc"+
		"\u00dd\7\36\2\2\u00dd\u00e4\3\2\2\2\u00de\u00e4\5\20\t\2\u00df\u00e4\7"+
		"%\2\2\u00e0\u00e4\7&\2\2\u00e1\u00e4\7\r\2\2\u00e2\u00e4\7\16\2\2\u00e3"+
		"\u00da\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e0\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4!\3\2\2\2\23.:BJq}\u0088"+
		"\u0093\u009f\u00a1\u00b5\u00c0\u00c2\u00ce\u00d0\u00d8\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}