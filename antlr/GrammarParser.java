// Generated from Grammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, Num=5, Float=6, AddOp=7, SubOp=8, MultOp=9, 
		DivOp=10, ModOp=11, ExpOp=12, AssignOp=13, AddAssignOp=14, SubAssignOp=15, 
		IncOp=16, DecOp=17, LessOp=18, LessEqualOp=19, GreaterOp=20, GreaterEqualOp=21, 
		EqualOp=22, NotEqualOp=23, AndOp=24, OrOp=25, NotOp=26, OpenPar=27, ClosePar=28, 
		OpenBracket=29, CloseBracket=30, Separator=31, Terminator=32, OpenBrace=33, 
		CloseBrace=34, CommentBlock=35, VoidKey=36, MainKey=37, PrintKey=38, ScanKey=39, 
		IntKey=40, FloatKey=41, StringKey=42, CharKey=43, BooleanKey=44, ArrayKey=45, 
		PrintfKey=46, ScanfKey=47, IfKey=48, ElseKey=49, ElseIfKey=50, ForKey=51, 
		WhileKey=52, DoWhileKey=53, ReturnKey=54, NullKey=55, Var=56, Func=57, 
		Char=58, String=59, WS=60;
	public static final String[] tokenNames = {
		"<INVALID>", "'-'", "'new'", "'nocturnal'", "'diurnal'", "Num", "Float", 
		"'arf'", "'sss'", "'meow'", "'dook'", "'mooodulo'", "'powpow'", "'='", 
		"'arfthis'", "'sssthis'", "'mate'", "'prey'", "'<'", "'<='", "'>'", "'>='", 
		"'=='", "'!='", "'&&'", "'||'", "'!'", "'('", "')'", "'['", "']'", "','", 
		"'<3'", "'e-worm'", "'f-worm'", "'#'", "'neuter'", "'zoo'", "'print'", 
		"'scan'", "'sheep'", "'otter'", "'snake'", "'worm'", "'boo'", "'spider'", 
		"'purr'", "'rawr'", "'dog'", "'cat'", "'catdog'", "'foodchain'", "'run'", 
		"'move'", "'back'", "'extinct'", "Var", "Func", "Char", "String", "WS"
	};
	public static final int
		RULE_start = 0, RULE_main_func = 1, RULE_func_block = 2, RULE_function = 3, 
		RULE_void_func = 4, RULE_ret_func = 5, RULE_code_block = 6, RULE_statement = 7, 
		RULE_datatype = 8, RULE_array_datatype = 9, RULE_boolean_lit = 10, RULE_literal = 11, 
		RULE_var_dec = 12, RULE_next_var = 13, RULE_var_init = 14, RULE_next_var_i = 15, 
		RULE_next_arr_i = 16, RULE_array_index = 17, RULE_var_assign = 18, RULE_array_assign = 19, 
		RULE_addsub_assign = 20, RULE_inc_dec = 21, RULE_expr = 22, RULE_cond_op = 23, 
		RULE_cond_expr = 24, RULE_condition = 25, RULE_if_cond = 26, RULE_else_cond = 27, 
		RULE_elseif_cond = 28, RULE_conditional = 29, RULE_for_loop = 30, RULE_while_loop = 31, 
		RULE_dowhile_loop = 32, RULE_param_dec = 33, RULE_next_param_dec = 34, 
		RULE_func_dec = 35, RULE_param_call = 36, RULE_next_param_call = 37, RULE_func_call = 38, 
		RULE_predef_param = 39, RULE_next_predef_param = 40, RULE_print = 41, 
		RULE_scan_lit = 42, RULE_scan = 43;
	public static final String[] ruleNames = {
		"start", "main_func", "func_block", "function", "void_func", "ret_func", 
		"code_block", "statement", "datatype", "array_datatype", "boolean_lit", 
		"literal", "var_dec", "next_var", "var_init", "next_var_i", "next_arr_i", 
		"array_index", "var_assign", "array_assign", "addsub_assign", "inc_dec", 
		"expr", "cond_op", "cond_expr", "condition", "if_cond", "else_cond", "elseif_cond", 
		"conditional", "for_loop", "while_loop", "dowhile_loop", "param_dec", 
		"next_param_dec", "func_dec", "param_call", "next_param_call", "func_call", 
		"predef_param", "next_predef_param", "print", "scan_lit", "scan"
	};

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Func_blockContext func_block() {
			return getRuleContext(Func_blockContext.class,0);
		}
		public Main_funcContext main_func() {
			return getRuleContext(Main_funcContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(88); func_block();
				}
				break;
			}
			setState(91); main_func();
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

	public static class Main_funcContext extends ParserRuleContext {
		public TerminalNode MainKey() { return getToken(GrammarParser.MainKey, 0); }
		public TerminalNode VoidKey() { return getToken(GrammarParser.VoidKey, 0); }
		public TerminalNode OpenBrace() { return getToken(GrammarParser.OpenBrace, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(GrammarParser.CloseBrace, 0); }
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public Main_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMain_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMain_func(this);
		}
	}

	public final Main_funcContext main_func() throws RecognitionException {
		Main_funcContext _localctx = new Main_funcContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(VoidKey);
			setState(94); match(MainKey);
			setState(95); match(OpenPar);
			setState(96); match(ClosePar);
			setState(97); match(OpenBrace);
			setState(98); code_block();
			setState(99); match(CloseBrace);
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

	public static class Func_blockContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Func_blockContext func_block() {
			return getRuleContext(Func_blockContext.class,0);
		}
		public Func_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunc_block(this);
		}
	}

	public final Func_blockContext func_block() throws RecognitionException {
		Func_blockContext _localctx = new Func_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func_block);
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); function();
				setState(102); func_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); function();
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

	public static class FunctionContext extends ParserRuleContext {
		public Void_funcContext void_func() {
			return getRuleContext(Void_funcContext.class,0);
		}
		public Ret_funcContext ret_func() {
			return getRuleContext(Ret_funcContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case VoidKey:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); void_func();
				}
				break;
			case IntKey:
			case FloatKey:
			case StringKey:
			case CharKey:
			case BooleanKey:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); ret_func();
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

	public static class Void_funcContext extends ParserRuleContext {
		public TerminalNode VoidKey() { return getToken(GrammarParser.VoidKey, 0); }
		public TerminalNode OpenBrace() { return getToken(GrammarParser.OpenBrace, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode Func() { return getToken(GrammarParser.Func, 0); }
		public TerminalNode CloseBrace() { return getToken(GrammarParser.CloseBrace, 0); }
		public Param_decContext param_dec() {
			return getRuleContext(Param_decContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public Void_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVoid_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVoid_func(this);
		}
	}

	public final Void_funcContext void_func() throws RecognitionException {
		Void_funcContext _localctx = new Void_funcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_void_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(VoidKey);
			setState(112); match(Func);
			setState(113); match(OpenPar);
			setState(115);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntKey) | (1L << FloatKey) | (1L << StringKey) | (1L << CharKey) | (1L << BooleanKey))) != 0)) {
				{
				setState(114); param_dec();
				}
			}

			setState(117); match(ClosePar);
			setState(118); match(OpenBrace);
			setState(119); code_block();
			setState(120); match(CloseBrace);
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

	public static class Ret_funcContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode ReturnKey() { return getToken(GrammarParser.ReturnKey, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(GrammarParser.OpenBrace, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode Func() { return getToken(GrammarParser.Func, 0); }
		public TerminalNode CloseBrace() { return getToken(GrammarParser.CloseBrace, 0); }
		public Param_decContext param_dec() {
			return getRuleContext(Param_decContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public Ret_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRet_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRet_func(this);
		}
	}

	public final Ret_funcContext ret_func() throws RecognitionException {
		Ret_funcContext _localctx = new Ret_funcContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ret_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); datatype();
			setState(123); match(Func);
			setState(124); match(OpenPar);
			setState(126);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntKey) | (1L << FloatKey) | (1L << StringKey) | (1L << CharKey) | (1L << BooleanKey))) != 0)) {
				{
				setState(125); param_dec();
				}
			}

			setState(128); match(ClosePar);
			setState(129); match(OpenBrace);
			setState(130); code_block();
			setState(131); match(ReturnKey);
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(132); literal();
				}
				break;
			case 2:
				{
				setState(133); match(Var);
				}
				break;
			case 3:
				{
				setState(134); expr(0);
				}
				break;
			}
			setState(137); match(CloseBrace);
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

	public static class Code_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCode_block(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__1) | (1L << T__0) | (1L << Num) | (1L << Float) | (1L << SubOp) | (1L << OpenPar) | (1L << PrintKey) | (1L << ScanKey) | (1L << IntKey) | (1L << FloatKey) | (1L << StringKey) | (1L << CharKey) | (1L << BooleanKey) | (1L << IfKey) | (1L << ForKey) | (1L << WhileKey) | (1L << DoWhileKey) | (1L << Var) | (1L << Func) | (1L << Char) | (1L << String))) != 0)) {
				{
				setState(139); statement();
				setState(140); code_block();
				}
			}

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

	public static class StatementContext extends ParserRuleContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Addsub_assignContext addsub_assign() {
			return getRuleContext(Addsub_assignContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Var_initContext var_init() {
			return getRuleContext(Var_initContext.class,0);
		}
		public Dowhile_loopContext dowhile_loop() {
			return getRuleContext(Dowhile_loopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); var_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145); var_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); var_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147); addsub_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148); inc_dec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149); expr(0);
				setState(150); match(Terminator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(152); conditional();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(153); for_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(154); while_loop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(155); dowhile_loop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(156); func_call();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(157); print();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(158); scan();
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode IntKey() { return getToken(GrammarParser.IntKey, 0); }
		public TerminalNode BooleanKey() { return getToken(GrammarParser.BooleanKey, 0); }
		public TerminalNode CharKey() { return getToken(GrammarParser.CharKey, 0); }
		public TerminalNode StringKey() { return getToken(GrammarParser.StringKey, 0); }
		public TerminalNode FloatKey() { return getToken(GrammarParser.FloatKey, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntKey) | (1L << FloatKey) | (1L << StringKey) | (1L << CharKey) | (1L << BooleanKey))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Array_datatypeContext extends ParserRuleContext {
		public TerminalNode ArrayKey() { return getToken(GrammarParser.ArrayKey, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public Array_datatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArray_datatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArray_datatype(this);
		}
	}

	public final Array_datatypeContext array_datatype() throws RecognitionException {
		Array_datatypeContext _localctx = new Array_datatypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); datatype();
			setState(164); match(ArrayKey);
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

	public static class Boolean_litContext extends ParserRuleContext {
		public Boolean_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_lit; }
	 
		public Boolean_litContext() { }
		public void copyFrom(Boolean_litContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FalseContext extends Boolean_litContext {
		public FalseContext(Boolean_litContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFalse(this);
		}
	}
	public static class TrueContext extends Boolean_litContext {
		public TrueContext(Boolean_litContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrue(this);
		}
	}

	public final Boolean_litContext boolean_lit() throws RecognitionException {
		Boolean_litContext _localctx = new Boolean_litContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolean_lit);
		try {
			setState(168);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166); match(T__0);
				}
				break;
			case T__1:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167); match(T__1);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharContext extends LiteralContext {
		public TerminalNode Char() { return getToken(GrammarParser.Char, 0); }
		public CharContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChar(this);
		}
	}
	public static class IntegerContext extends LiteralContext {
		public TerminalNode SubOp() { return getToken(GrammarParser.SubOp, 0); }
		public TerminalNode Num() { return getToken(GrammarParser.Num, 0); }
		public IntegerContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInteger(this);
		}
	}
	public static class StringContext extends LiteralContext {
		public TerminalNode String() { return getToken(GrammarParser.String, 0); }
		public StringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitString(this);
		}
	}
	public static class BooleanContext extends LiteralContext {
		public Boolean_litContext boolean_lit() {
			return getRuleContext(Boolean_litContext.class,0);
		}
		public BooleanContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolean(this);
		}
	}
	public static class FloatContext extends LiteralContext {
		public TerminalNode SubOp() { return getToken(GrammarParser.SubOp, 0); }
		public TerminalNode Float() { return getToken(GrammarParser.Float, 0); }
		public FloatContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFloat(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal);
		int _la;
		try {
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				_la = _input.LA(1);
				if (_la==SubOp) {
					{
					setState(170); match(SubOp);
					}
				}

				setState(173); match(Num);
				}
				break;
			case 2:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174); boolean_lit();
				}
				break;
			case 3:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				_la = _input.LA(1);
				if (_la==SubOp) {
					{
					setState(175); match(SubOp);
					}
				}

				setState(178); match(Float);
				}
				break;
			case 4:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(179); match(Char);
				}
				break;
			case 5:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(180); match(String);
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

	public static class Var_decContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Next_varContext next_var() {
			return getRuleContext(Next_varContext.class,0);
		}
		public Array_datatypeContext array_datatype() {
			return getRuleContext(Array_datatypeContext.class,0);
		}
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar_dec(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_dec);
		try {
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183); datatype();
				setState(184); match(Var);
				setState(185); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); array_datatype();
				setState(188); match(Var);
				setState(189); next_var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); datatype();
				setState(192); match(Var);
				setState(193); next_var();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195); array_datatype();
				setState(196); match(Var);
				setState(197); match(Terminator);
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

	public static class Next_varContext extends ParserRuleContext {
		public TerminalNode Separator() { return getToken(GrammarParser.Separator, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Next_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNext_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNext_var(this);
		}
	}

	public final Next_varContext next_var() throws RecognitionException {
		Next_varContext _localctx = new Next_varContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_next_var);
		try {
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201); match(Separator);
				setState(202); match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); match(Separator);
				setState(204); match(Var);
				setState(205); match(Terminator);
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

	public static class Var_initContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(GrammarParser.Num, 0); }
		public TerminalNode ArrayKey() { return getToken(GrammarParser.ArrayKey, 0); }
		public Next_var_iContext next_var_i() {
			return getRuleContext(Next_var_iContext.class,0);
		}
		public Next_arr_iContext next_arr_i() {
			return getRuleContext(Next_arr_iContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AssignOp() { return getToken(GrammarParser.AssignOp, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Array_datatypeContext array_datatype() {
			return getRuleContext(Array_datatypeContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Var_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar_init(this);
		}
	}

	public final Var_initContext var_init() throws RecognitionException {
		Var_initContext _localctx = new Var_initContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_init);
		try {
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); datatype();
				setState(209); match(Var);
				setState(210); match(AssignOp);
				setState(213);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(211); literal();
					}
					break;
				case 2:
					{
					setState(212); expr(0);
					}
					break;
				}
				setState(215); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); datatype();
				setState(218); match(Var);
				setState(219); match(AssignOp);
				setState(222);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(220); literal();
					}
					break;
				case 2:
					{
					setState(221); expr(0);
					}
					break;
				}
				setState(224); next_var_i();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226); array_datatype();
				setState(227); match(Var);
				setState(228); match(AssignOp);
				setState(229); match(T__2);
				setState(230); match(ArrayKey);
				setState(233);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(231); match(Num);
					}
					break;
				case 2:
					{
					setState(232); expr(0);
					}
					break;
				}
				setState(235); match(Terminator);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237); array_datatype();
				setState(238); match(Var);
				setState(239); match(AssignOp);
				setState(240); match(T__2);
				setState(241); match(ArrayKey);
				setState(244);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(242); match(Num);
					}
					break;
				case 2:
					{
					setState(243); expr(0);
					}
					break;
				}
				setState(246); next_arr_i();
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

	public static class Next_var_iContext extends ParserRuleContext {
		public TerminalNode Separator() { return getToken(GrammarParser.Separator, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AssignOp() { return getToken(GrammarParser.AssignOp, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Next_var_iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_var_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNext_var_i(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNext_var_i(this);
		}
	}

	public final Next_var_iContext next_var_i() throws RecognitionException {
		Next_var_iContext _localctx = new Next_var_iContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_next_var_i);
		try {
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250); match(Separator);
				setState(251); match(Var);
				setState(252); match(AssignOp);
				setState(255);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(253); literal();
					}
					break;
				case 2:
					{
					setState(254); expr(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); match(Separator);
				setState(258); match(Var);
				setState(259); match(AssignOp);
				setState(262);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(260); literal();
					}
					break;
				case 2:
					{
					setState(261); expr(0);
					}
					break;
				}
				setState(264); match(Terminator);
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

	public static class Next_arr_iContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(GrammarParser.Num, 0); }
		public TerminalNode ArrayKey() { return getToken(GrammarParser.ArrayKey, 0); }
		public TerminalNode Separator() { return getToken(GrammarParser.Separator, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AssignOp() { return getToken(GrammarParser.AssignOp, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Next_arr_iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_arr_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNext_arr_i(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNext_arr_i(this);
		}
	}

	public final Next_arr_iContext next_arr_i() throws RecognitionException {
		Next_arr_iContext _localctx = new Next_arr_iContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_next_arr_i);
		try {
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); match(Separator);
				setState(269); match(Var);
				setState(270); match(AssignOp);
				setState(271); match(T__2);
				setState(272); match(ArrayKey);
				setState(275);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(273); match(Num);
					}
					break;
				case 2:
					{
					setState(274); expr(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277); match(Separator);
				setState(278); match(Var);
				setState(279); match(AssignOp);
				setState(280); match(T__2);
				setState(281); match(ArrayKey);
				setState(284);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(282); match(Num);
					}
					break;
				case 2:
					{
					setState(283); expr(0);
					}
					break;
				}
				setState(286); match(Terminator);
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

	public static class Array_indexContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(GrammarParser.Num, 0); }
		public TerminalNode ArrayKey() { return getToken(GrammarParser.ArrayKey, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public Array_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArray_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArray_index(this);
		}
	}

	public final Array_indexContext array_index() throws RecognitionException {
		Array_indexContext _localctx = new Array_indexContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array_index);
		try {
			setState(297);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(289); match(Var);
				setState(290); match(ArrayKey);
				setState(291); match(Num);
				}
				break;
			case OpenPar:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); match(OpenPar);
				setState(293); match(Var);
				setState(294); match(ArrayKey);
				setState(295); match(Num);
				setState(296); match(ClosePar);
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

	public static class Var_assignContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Var(int i) {
			return getToken(GrammarParser.Var, i);
		}
		public TerminalNode AssignOp() { return getToken(GrammarParser.AssignOp, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public List<TerminalNode> Var() { return getTokens(GrammarParser.Var); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar_assign(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(Var);
			setState(300); match(AssignOp);
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(301); literal();
				}
				break;
			case 2:
				{
				setState(302); expr(0);
				}
				break;
			case 3:
				{
				setState(303); match(Var);
				}
				break;
			}
			setState(306); match(Terminator);
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

	public static class Array_assignContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AssignOp() { return getToken(GrammarParser.AssignOp, 0); }
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Array_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArray_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArray_assign(this);
		}
	}

	public final Array_assignContext array_assign() throws RecognitionException {
		Array_assignContext _localctx = new Array_assignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308); array_index();
			setState(309); match(AssignOp);
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(310); literal();
				}
				break;
			case 2:
				{
				setState(311); expr(0);
				}
				break;
			case 3:
				{
				setState(312); match(Var);
				}
				break;
			}
			setState(315); match(Terminator);
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

	public static class Addsub_assignContext extends ParserRuleContext {
		public TerminalNode SubAssignOp() { return getToken(GrammarParser.SubAssignOp, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Var(int i) {
			return getToken(GrammarParser.Var, i);
		}
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public List<TerminalNode> Var() { return getTokens(GrammarParser.Var); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode AddAssignOp() { return getToken(GrammarParser.AddAssignOp, 0); }
		public Addsub_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addsub_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAddsub_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAddsub_assign(this);
		}
	}

	public final Addsub_assignContext addsub_assign() throws RecognitionException {
		Addsub_assignContext _localctx = new Addsub_assignContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_addsub_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); match(Var);
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==AddAssignOp || _la==SubAssignOp) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(322);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(319); literal();
				}
				break;
			case 2:
				{
				setState(320); expr(0);
				}
				break;
			case 3:
				{
				setState(321); match(Var);
				}
				break;
			}
			setState(324); match(Terminator);
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

	public static class Inc_decContext extends ParserRuleContext {
		public TerminalNode DecOp() { return getToken(GrammarParser.DecOp, 0); }
		public TerminalNode IncOp() { return getToken(GrammarParser.IncOp, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInc_dec(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(Var);
			setState(327);
			_la = _input.LA(1);
			if ( !(_la==IncOp || _la==DecOp) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(328); match(Terminator);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AtomContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAtom(this);
		}
	}
	public static class NegaExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegaExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNegaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNegaExpr(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParenExpr(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public TerminalNode SubOp() { return getToken(GrammarParser.SubOp, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AddOp() { return getToken(GrammarParser.AddOp, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAddSub(this);
		}
	}
	public static class MultDivModContext extends ExprContext {
		public TerminalNode ModOp() { return getToken(GrammarParser.ModOp, 0); }
		public TerminalNode DivOp() { return getToken(GrammarParser.DivOp, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MultOp() { return getToken(GrammarParser.MultOp, 0); }
		public MultDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMultDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMultDivMod(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVariable(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			switch (_input.LA(1)) {
			case T__3:
				{
				_localctx = new NegaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(331); match(T__3);
				setState(332); expr(6);
				}
				break;
			case OpenPar:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333); match(OpenPar);
				setState(334); expr(0);
				setState(335); match(ClosePar);
				}
				break;
			case T__1:
			case T__0:
			case Num:
			case Float:
			case SubOp:
			case Char:
			case String:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337); literal();
				}
				break;
			case Var:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338); match(Var);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(347);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(341);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(342);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultOp) | (1L << DivOp) | (1L << ModOp))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(343); expr(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(345);
						_la = _input.LA(1);
						if ( !(_la==AddOp || _la==SubOp) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(346); expr(4);
						}
						break;
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode GreaterEqualOp() { return getToken(GrammarParser.GreaterEqualOp, 0); }
		public TerminalNode GreaterOp() { return getToken(GrammarParser.GreaterOp, 0); }
		public TerminalNode LessOp() { return getToken(GrammarParser.LessOp, 0); }
		public TerminalNode EqualOp() { return getToken(GrammarParser.EqualOp, 0); }
		public TerminalNode LessEqualOp() { return getToken(GrammarParser.LessEqualOp, 0); }
		public TerminalNode NotEqualOp() { return getToken(GrammarParser.NotEqualOp, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCond_op(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessOp) | (1L << LessEqualOp) | (1L << GreaterOp) | (1L << GreaterEqualOp) | (1L << EqualOp) | (1L << NotEqualOp))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Cond_exprContext extends ParserRuleContext {
		public Cond_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expr; }
	 
		public Cond_exprContext() { }
		public void copyFrom(Cond_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndConContext extends Cond_exprContext {
		public TerminalNode AndOp() { return getToken(GrammarParser.AndOp, 0); }
		public Cond_exprContext cond_expr(int i) {
			return getRuleContext(Cond_exprContext.class,i);
		}
		public List<Cond_exprContext> cond_expr() {
			return getRuleContexts(Cond_exprContext.class);
		}
		public AndConContext(Cond_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAndCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAndCon(this);
		}
	}
	public static class ParentCondContext extends Cond_exprContext {
		public TerminalNode NotOp() { return getToken(GrammarParser.NotOp, 0); }
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public ParentCondContext(Cond_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParentCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParentCond(this);
		}
	}
	public static class OrConContext extends Cond_exprContext {
		public TerminalNode OrOp() { return getToken(GrammarParser.OrOp, 0); }
		public Cond_exprContext cond_expr(int i) {
			return getRuleContext(Cond_exprContext.class,i);
		}
		public List<Cond_exprContext> cond_expr() {
			return getRuleContexts(Cond_exprContext.class);
		}
		public OrConContext(Cond_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOrCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOrCon(this);
		}
	}
	public static class AtomConContext extends Cond_exprContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AtomConContext(Cond_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAtomCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAtomCon(this);
		}
	}

	public final Cond_exprContext cond_expr() throws RecognitionException {
		return cond_expr(0);
	}

	private Cond_exprContext cond_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Cond_exprContext _localctx = new Cond_exprContext(_ctx, _parentState);
		Cond_exprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_cond_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new ParentCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(356);
				_la = _input.LA(1);
				if (_la==NotOp) {
					{
					setState(355); match(NotOp);
					}
				}

				setState(358); match(OpenPar);
				setState(359); cond_expr(0);
				setState(360); match(ClosePar);
				}
				break;
			case 2:
				{
				_localctx = new AtomConContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(362); condition();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(371);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new AndConContext(new Cond_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond_expr);
						setState(365);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(366); match(AndOp);
						setState(367); cond_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new OrConContext(new Cond_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond_expr);
						setState(368);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(369); match(OrOp);
						setState(370); cond_expr(3);
						}
						break;
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class ConditionContext extends ParserRuleContext {
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); expr(0);
			setState(377); cond_op();
			setState(378); expr(0);
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

	public static class If_condContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(GrammarParser.OpenBrace, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(GrammarParser.CloseBrace, 0); }
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public TerminalNode IfKey() { return getToken(GrammarParser.IfKey, 0); }
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public If_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIf_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIf_cond(this);
		}
	}

	public final If_condContext if_cond() throws RecognitionException {
		If_condContext _localctx = new If_condContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_if_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); match(IfKey);
			setState(381); match(OpenPar);
			setState(382); cond_expr(0);
			setState(383); match(ClosePar);
			setState(384); match(OpenBrace);
			setState(385); code_block();
			setState(386); match(CloseBrace);
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

	public static class Else_condContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(GrammarParser.OpenBrace, 0); }
		public TerminalNode ElseKey() { return getToken(GrammarParser.ElseKey, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(GrammarParser.CloseBrace, 0); }
		public Else_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElse_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElse_cond(this);
		}
	}

	public final Else_condContext else_cond() throws RecognitionException {
		Else_condContext _localctx = new Else_condContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_else_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); match(ElseKey);
			setState(389); match(OpenBrace);
			setState(390); code_block();
			setState(391); match(CloseBrace);
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

	public static class Elseif_condContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(GrammarParser.OpenBrace, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(GrammarParser.CloseBrace, 0); }
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public TerminalNode ElseIfKey() { return getToken(GrammarParser.ElseIfKey, 0); }
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public Elseif_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElseif_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElseif_cond(this);
		}
	}

	public final Elseif_condContext elseif_cond() throws RecognitionException {
		Elseif_condContext _localctx = new Elseif_condContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elseif_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); match(ElseIfKey);
			setState(394); match(OpenPar);
			setState(395); cond_expr(0);
			setState(396); match(ClosePar);
			setState(397); match(OpenBrace);
			setState(398); code_block();
			setState(399); match(CloseBrace);
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

	public static class ConditionalContext extends ParserRuleContext {
		public Else_condContext else_cond() {
			return getRuleContext(Else_condContext.class,0);
		}
		public Elseif_condContext elseif_cond(int i) {
			return getRuleContext(Elseif_condContext.class,i);
		}
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
		public List<Elseif_condContext> elseif_cond() {
			return getRuleContexts(Elseif_condContext.class);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_conditional);
		int _la;
		try {
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401); if_cond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402); if_cond();
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIfKey) {
					{
					{
					setState(403); elseif_cond();
					}
					}
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(410);
				_la = _input.LA(1);
				if (_la==ElseKey) {
					{
					setState(409); else_cond();
					}
				}

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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(GrammarParser.OpenBrace, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(GrammarParser.CloseBrace, 0); }
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public TerminalNode ForKey() { return getToken(GrammarParser.ForKey, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); match(ForKey);
			setState(415); match(OpenPar);
			setState(416); cond_expr(0);
			setState(417); match(ClosePar);
			setState(418); match(OpenBrace);
			setState(419); code_block();
			setState(420); match(CloseBrace);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WhileKey() { return getToken(GrammarParser.WhileKey, 0); }
		public TerminalNode OpenBrace() { return getToken(GrammarParser.OpenBrace, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(GrammarParser.CloseBrace, 0); }
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); match(WhileKey);
			setState(423); match(OpenPar);
			setState(424); cond_expr(0);
			setState(425); match(ClosePar);
			setState(426); match(OpenBrace);
			setState(427); code_block();
			setState(428); match(CloseBrace);
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

	public static class Dowhile_loopContext extends ParserRuleContext {
		public TerminalNode DoWhileKey() { return getToken(GrammarParser.DoWhileKey, 0); }
		public TerminalNode WhileKey() { return getToken(GrammarParser.WhileKey, 0); }
		public TerminalNode OpenBrace() { return getToken(GrammarParser.OpenBrace, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(GrammarParser.CloseBrace, 0); }
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public Dowhile_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDowhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDowhile_loop(this);
		}
	}

	public final Dowhile_loopContext dowhile_loop() throws RecognitionException {
		Dowhile_loopContext _localctx = new Dowhile_loopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dowhile_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(DoWhileKey);
			setState(431); match(OpenBrace);
			setState(432); code_block();
			setState(433); match(CloseBrace);
			setState(434); match(WhileKey);
			setState(435); match(OpenPar);
			setState(436); cond_expr(0);
			setState(437); match(ClosePar);
			setState(438); match(Terminator);
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

	public static class Param_decContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Array_datatypeContext array_datatype() {
			return getRuleContext(Array_datatypeContext.class,0);
		}
		public Next_param_decContext next_param_dec() {
			return getRuleContext(Next_param_decContext.class,0);
		}
		public Param_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParam_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParam_dec(this);
		}
	}

	public final Param_decContext param_dec() throws RecognitionException {
		Param_decContext _localctx = new Param_decContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_param_dec);
		try {
			setState(461);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440); datatype();
				setState(441); match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443); datatype();
				setState(444); match(Var);
				setState(445); next_param_dec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(447); datatype();
				setState(448); array_index();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(450); datatype();
				setState(451); array_index();
				setState(452); next_param_dec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(454); array_datatype();
				setState(455); match(Var);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(457); array_datatype();
				setState(458); match(Var);
				setState(459); next_param_dec();
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

	public static class Next_param_decContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode Separator() { return getToken(GrammarParser.Separator, 0); }
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Array_datatypeContext array_datatype() {
			return getRuleContext(Array_datatypeContext.class,0);
		}
		public Param_decContext param_dec() {
			return getRuleContext(Param_decContext.class,0);
		}
		public Next_param_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_param_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNext_param_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNext_param_dec(this);
		}
	}

	public final Next_param_decContext next_param_dec() throws RecognitionException {
		Next_param_decContext _localctx = new Next_param_decContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_next_param_dec);
		try {
			setState(476);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463); match(Separator);
				setState(464); datatype();
				setState(465); match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467); match(Separator);
				setState(468); datatype();
				setState(469); array_index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471); match(Separator);
				setState(472); array_datatype();
				setState(473); match(Var);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475); param_dec();
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

	public static class Func_decContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(GrammarParser.OpenBrace, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode Func() { return getToken(GrammarParser.Func, 0); }
		public TerminalNode CloseBrace() { return getToken(GrammarParser.CloseBrace, 0); }
		public Param_decContext param_dec() {
			return getRuleContext(Param_decContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public Func_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunc_dec(this);
		}
	}

	public final Func_decContext func_dec() throws RecognitionException {
		Func_decContext _localctx = new Func_decContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_func_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478); datatype();
			setState(479); match(Func);
			setState(480); match(OpenPar);
			setState(481); param_dec();
			setState(482); match(ClosePar);
			setState(483); match(OpenBrace);
			setState(484); code_block();
			setState(485); match(CloseBrace);
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

	public static class Param_callContext extends ParserRuleContext {
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Next_param_callContext next_param_call() {
			return getRuleContext(Next_param_callContext.class,0);
		}
		public Param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParam_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParam_call(this);
		}
	}

	public final Param_callContext param_call() throws RecognitionException {
		Param_callContext _localctx = new Param_callContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_param_call);
		try {
			setState(494);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487); match(Var);
				setState(488); next_param_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489); array_index();
				setState(490); next_param_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492); array_index();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493); match(Var);
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

	public static class Next_param_callContext extends ParserRuleContext {
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public TerminalNode Separator() { return getToken(GrammarParser.Separator, 0); }
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Next_param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_param_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNext_param_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNext_param_call(this);
		}
	}

	public final Next_param_callContext next_param_call() throws RecognitionException {
		Next_param_callContext _localctx = new Next_param_callContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_next_param_call);
		try {
			setState(501);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496); match(Separator);
				setState(497); match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498); match(Separator);
				setState(499); array_index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500); param_call();
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

	public static class Func_callContext extends ParserRuleContext {
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode Func() { return getToken(GrammarParser.Func, 0); }
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503); match(Func);
			setState(504); match(OpenPar);
			setState(505); param_call();
			setState(506); match(ClosePar);
			setState(507); match(Terminator);
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

	public static class Predef_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public Next_predef_paramContext next_predef_param() {
			return getRuleContext(Next_predef_paramContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Predef_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predef_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPredef_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPredef_param(this);
		}
	}

	public final Predef_paramContext predef_param() throws RecognitionException {
		Predef_paramContext _localctx = new Predef_paramContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_predef_param);
		try {
			setState(522);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(509); match(Var);
					}
					break;
				case 2:
					{
					setState(510); literal();
					}
					break;
				case 3:
					{
					setState(511); array_index();
					}
					break;
				case 4:
					{
					setState(512); expr(0);
					}
					break;
				}
				setState(515); next_predef_param();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(516); match(Var);
					}
					break;
				case 2:
					{
					setState(517); literal();
					}
					break;
				case 3:
					{
					setState(518); array_index();
					}
					break;
				case 4:
					{
					setState(519); expr(0);
					}
					break;
				}
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

	public static class Next_predef_paramContext extends ParserRuleContext {
		public Predef_paramContext predef_param() {
			return getRuleContext(Predef_paramContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public TerminalNode AddOp() { return getToken(GrammarParser.AddOp, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Next_predef_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_predef_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNext_predef_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNext_predef_param(this);
		}
	}

	public final Next_predef_paramContext next_predef_param() throws RecognitionException {
		Next_predef_paramContext _localctx = new Next_predef_paramContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_next_predef_param);
		try {
			setState(532);
			switch (_input.LA(1)) {
			case AddOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(524); match(AddOp);
				setState(529);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(525); match(Var);
					}
					break;
				case 2:
					{
					setState(526); literal();
					}
					break;
				case 3:
					{
					setState(527); array_index();
					}
					break;
				case 4:
					{
					setState(528); expr(0);
					}
					break;
				}
				}
				break;
			case T__3:
			case T__1:
			case T__0:
			case Num:
			case Float:
			case SubOp:
			case OpenPar:
			case Var:
			case Char:
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(531); predef_param();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PrintKey() { return getToken(GrammarParser.PrintKey, 0); }
		public Predef_paramContext predef_param() {
			return getRuleContext(Predef_paramContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534); match(PrintKey);
			setState(535); match(OpenPar);
			setState(536); predef_param();
			setState(537); match(ClosePar);
			setState(538); match(Terminator);
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

	public static class Scan_litContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(GrammarParser.Num, 0); }
		public TerminalNode String() { return getToken(GrammarParser.String, 0); }
		public TerminalNode Char() { return getToken(GrammarParser.Char, 0); }
		public TerminalNode Float() { return getToken(GrammarParser.Float, 0); }
		public Scan_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterScan_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitScan_lit(this);
		}
	}

	public final Scan_litContext scan_lit() throws RecognitionException {
		Scan_litContext _localctx = new Scan_litContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_scan_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Num) | (1L << Float) | (1L << Char) | (1L << String))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ScanContext extends ParserRuleContext {
		public Scan_litContext scan_lit() {
			return getRuleContext(Scan_litContext.class,0);
		}
		public TerminalNode ScanKey() { return getToken(GrammarParser.ScanKey, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitScan(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542); match(ScanKey);
			setState(543); match(OpenPar);
			setState(544); scan_lit();
			setState(545); match(ClosePar);
			setState(546); match(Terminator);
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
		case 22: return expr_sempred((ExprContext)_localctx, predIndex);
		case 24: return cond_expr_sempred((Cond_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_expr_sempred(Cond_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 3);
		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		case 1: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u0227\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\5\2\\\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\5\4l\n\4\3\5\3\5\5\5p\n\5\3\6\3\6\3\6\3\6\5\6v\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0081\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u008a\n\7\3\7\3\7\3\b\3\b\3\b\5\b\u0091\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a2\n\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\5\f\u00ab\n\f\3\r\5\r\u00ae\n\r\3\r\3\r\3\r\5\r\u00b3\n"+
		"\r\3\r\3\r\3\r\5\r\u00b8\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ca\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00d1\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00d8\n\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e1\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00ec\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00f7\n\20\3\20\3\20\5\20\u00fb\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0102\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u0109\n\21"+
		"\3\21\3\21\5\21\u010d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0116"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u011f\n\22\3\22\5\22\u0122"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u012c\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0133\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u013c\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0145\n\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5"+
		"\30\u0156\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u015e\n\30\f\30\16\30"+
		"\u0161\13\30\3\31\3\31\3\32\3\32\5\32\u0167\n\32\3\32\3\32\3\32\3\32\3"+
		"\32\5\32\u016e\n\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0176\n\32\f\32"+
		"\16\32\u0179\13\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\7\37\u0197\n\37\f\37\16\37\u019a\13\37\3\37\5\37\u019d"+
		"\n\37\5\37\u019f\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01d0\n#\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\5$\u01df\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u01f1\n&\3\'\3\'\3\'\3\'\3\'\5\'\u01f8\n\'\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\5)\u0204\n)\3)\3)\3)\3)\3)\5)\u020b\n)\5)\u020d\n)\3*\3"+
		"*\3*\3*\3*\5*\u0214\n*\3*\5*\u0217\n*\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3-\2\4.\62.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVX\2\t\3\2*.\3\2\20\21\3\2\22\23\3\2\13\r"+
		"\3\2\t\n\3\2\24\31\4\2\7\b<=\u0251\2[\3\2\2\2\4_\3\2\2\2\6k\3\2\2\2\b"+
		"o\3\2\2\2\nq\3\2\2\2\f|\3\2\2\2\16\u0090\3\2\2\2\20\u00a1\3\2\2\2\22\u00a3"+
		"\3\2\2\2\24\u00a5\3\2\2\2\26\u00aa\3\2\2\2\30\u00b7\3\2\2\2\32\u00c9\3"+
		"\2\2\2\34\u00d0\3\2\2\2\36\u00fa\3\2\2\2 \u010c\3\2\2\2\"\u0121\3\2\2"+
		"\2$\u012b\3\2\2\2&\u012d\3\2\2\2(\u0136\3\2\2\2*\u013f\3\2\2\2,\u0148"+
		"\3\2\2\2.\u0155\3\2\2\2\60\u0162\3\2\2\2\62\u016d\3\2\2\2\64\u017a\3\2"+
		"\2\2\66\u017e\3\2\2\28\u0186\3\2\2\2:\u018b\3\2\2\2<\u019e\3\2\2\2>\u01a0"+
		"\3\2\2\2@\u01a8\3\2\2\2B\u01b0\3\2\2\2D\u01cf\3\2\2\2F\u01de\3\2\2\2H"+
		"\u01e0\3\2\2\2J\u01f0\3\2\2\2L\u01f7\3\2\2\2N\u01f9\3\2\2\2P\u020c\3\2"+
		"\2\2R\u0216\3\2\2\2T\u0218\3\2\2\2V\u021e\3\2\2\2X\u0220\3\2\2\2Z\\\5"+
		"\6\4\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\5\4\3\2^\3\3\2\2\2_`\7&\2\2`"+
		"a\7\'\2\2ab\7\35\2\2bc\7\36\2\2cd\7#\2\2de\5\16\b\2ef\7$\2\2f\5\3\2\2"+
		"\2gh\5\b\5\2hi\5\6\4\2il\3\2\2\2jl\5\b\5\2kg\3\2\2\2kj\3\2\2\2l\7\3\2"+
		"\2\2mp\5\n\6\2np\5\f\7\2om\3\2\2\2on\3\2\2\2p\t\3\2\2\2qr\7&\2\2rs\7;"+
		"\2\2su\7\35\2\2tv\5D#\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\36\2\2xy\7#"+
		"\2\2yz\5\16\b\2z{\7$\2\2{\13\3\2\2\2|}\5\22\n\2}~\7;\2\2~\u0080\7\35\2"+
		"\2\177\u0081\5D#\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0083\7\36\2\2\u0083\u0084\7#\2\2\u0084\u0085\5\16\b\2\u0085"+
		"\u0089\78\2\2\u0086\u008a\5\30\r\2\u0087\u008a\7:\2\2\u0088\u008a\5.\30"+
		"\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\7$\2\2\u008c\r\3\2\2\2\u008d\u008e\5\20\t\2\u008e"+
		"\u008f\5\16\b\2\u008f\u0091\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\17\3\2\2\2\u0092\u00a2\5\32\16\2\u0093\u00a2\5\36\20\2\u0094"+
		"\u00a2\5&\24\2\u0095\u00a2\5*\26\2\u0096\u00a2\5,\27\2\u0097\u0098\5."+
		"\30\2\u0098\u0099\7\"\2\2\u0099\u00a2\3\2\2\2\u009a\u00a2\5<\37\2\u009b"+
		"\u00a2\5> \2\u009c\u00a2\5@!\2\u009d\u00a2\5B\"\2\u009e\u00a2\5N(\2\u009f"+
		"\u00a2\5T+\2\u00a0\u00a2\5X-\2\u00a1\u0092\3\2\2\2\u00a1\u0093\3\2\2\2"+
		"\u00a1\u0094\3\2\2\2\u00a1\u0095\3\2\2\2\u00a1\u0096\3\2\2\2\u00a1\u0097"+
		"\3\2\2\2\u00a1\u009a\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1"+
		"\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a2\21\3\2\2\2\u00a3\u00a4\t\2\2\2\u00a4\23\3\2\2\2\u00a5\u00a6"+
		"\5\22\n\2\u00a6\u00a7\7/\2\2\u00a7\25\3\2\2\2\u00a8\u00ab\7\6\2\2\u00a9"+
		"\u00ab\7\5\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\27\3\2\2"+
		"\2\u00ac\u00ae\7\n\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b8\7\7\2\2\u00b0\u00b8\5\26\f\2\u00b1\u00b3\7\n\2\2"+
		"\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b8"+
		"\7\b\2\2\u00b5\u00b8\7<\2\2\u00b6\u00b8\7=\2\2\u00b7\u00ad\3\2\2\2\u00b7"+
		"\u00b0\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2"+
		"\2\2\u00b8\31\3\2\2\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb\7:\2\2\u00bb\u00bc"+
		"\7\"\2\2\u00bc\u00ca\3\2\2\2\u00bd\u00be\5\24\13\2\u00be\u00bf\7:\2\2"+
		"\u00bf\u00c0\5\34\17\2\u00c0\u00ca\3\2\2\2\u00c1\u00c2\5\22\n\2\u00c2"+
		"\u00c3\7:\2\2\u00c3\u00c4\5\34\17\2\u00c4\u00ca\3\2\2\2\u00c5\u00c6\5"+
		"\24\13\2\u00c6\u00c7\7:\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00b9\3\2\2\2\u00c9\u00bd\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c5\3\2"+
		"\2\2\u00ca\33\3\2\2\2\u00cb\u00cc\7!\2\2\u00cc\u00d1\7:\2\2\u00cd\u00ce"+
		"\7!\2\2\u00ce\u00cf\7:\2\2\u00cf\u00d1\7\"\2\2\u00d0\u00cb\3\2\2\2\u00d0"+
		"\u00cd\3\2\2\2\u00d1\35\3\2\2\2\u00d2\u00d3\5\22\n\2\u00d3\u00d4\7:\2"+
		"\2\u00d4\u00d7\7\17\2\2\u00d5\u00d8\5\30\r\2\u00d6\u00d8\5.\30\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\""+
		"\2\2\u00da\u00fb\3\2\2\2\u00db\u00dc\5\22\n\2\u00dc\u00dd\7:\2\2\u00dd"+
		"\u00e0\7\17\2\2\u00de\u00e1\5\30\r\2\u00df\u00e1\5.\30\2\u00e0\u00de\3"+
		"\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\5 \21\2\u00e3"+
		"\u00fb\3\2\2\2\u00e4\u00e5\5\24\13\2\u00e5\u00e6\7:\2\2\u00e6\u00e7\7"+
		"\17\2\2\u00e7\u00e8\7\4\2\2\u00e8\u00eb\7/\2\2\u00e9\u00ec\7\7\2\2\u00ea"+
		"\u00ec\5.\30\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\7\"\2\2\u00ee\u00fb\3\2\2\2\u00ef\u00f0\5\24\13\2\u00f0"+
		"\u00f1\7:\2\2\u00f1\u00f2\7\17\2\2\u00f2\u00f3\7\4\2\2\u00f3\u00f6\7/"+
		"\2\2\u00f4\u00f7\7\7\2\2\u00f5\u00f7\5.\30\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\5\"\22\2\u00f9\u00fb\3"+
		"\2\2\2\u00fa\u00d2\3\2\2\2\u00fa\u00db\3\2\2\2\u00fa\u00e4\3\2\2\2\u00fa"+
		"\u00ef\3\2\2\2\u00fb\37\3\2\2\2\u00fc\u00fd\7!\2\2\u00fd\u00fe\7:\2\2"+
		"\u00fe\u0101\7\17\2\2\u00ff\u0102\5\30\r\2\u0100\u0102\5.\30\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u010d\3\2\2\2\u0103\u0104\7!\2\2\u0104"+
		"\u0105\7:\2\2\u0105\u0108\7\17\2\2\u0106\u0109\5\30\r\2\u0107\u0109\5"+
		".\30\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\7\"\2\2\u010b\u010d\3\2\2\2\u010c\u00fc\3\2\2\2\u010c\u0103\3\2"+
		"\2\2\u010d!\3\2\2\2\u010e\u010f\7!\2\2\u010f\u0110\7:\2\2\u0110\u0111"+
		"\7\17\2\2\u0111\u0112\7\4\2\2\u0112\u0115\7/\2\2\u0113\u0116\7\7\2\2\u0114"+
		"\u0116\5.\30\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\u0122\3\2"+
		"\2\2\u0117\u0118\7!\2\2\u0118\u0119\7:\2\2\u0119\u011a\7\17\2\2\u011a"+
		"\u011b\7\4\2\2\u011b\u011e\7/\2\2\u011c\u011f\7\7\2\2\u011d\u011f\5.\30"+
		"\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122"+
		"\7\"\2\2\u0121\u010e\3\2\2\2\u0121\u0117\3\2\2\2\u0122#\3\2\2\2\u0123"+
		"\u0124\7:\2\2\u0124\u0125\7/\2\2\u0125\u012c\7\7\2\2\u0126\u0127\7\35"+
		"\2\2\u0127\u0128\7:\2\2\u0128\u0129\7/\2\2\u0129\u012a\7\7\2\2\u012a\u012c"+
		"\7\36\2\2\u012b\u0123\3\2\2\2\u012b\u0126\3\2\2\2\u012c%\3\2\2\2\u012d"+
		"\u012e\7:\2\2\u012e\u0132\7\17\2\2\u012f\u0133\5\30\r\2\u0130\u0133\5"+
		".\30\2\u0131\u0133\7:\2\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\"\2\2\u0135\'\3\2\2\2"+
		"\u0136\u0137\5$\23\2\u0137\u013b\7\17\2\2\u0138\u013c\5\30\r\2\u0139\u013c"+
		"\5.\30\2\u013a\u013c\7:\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7\"\2\2\u013e)\3\2\2\2"+
		"\u013f\u0140\7:\2\2\u0140\u0144\t\3\2\2\u0141\u0145\5\30\r\2\u0142\u0145"+
		"\5.\30\2\u0143\u0145\7:\2\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\"\2\2\u0147+\3\2\2\2"+
		"\u0148\u0149\7:\2\2\u0149\u014a\t\4\2\2\u014a\u014b\7\"\2\2\u014b-\3\2"+
		"\2\2\u014c\u014d\b\30\1\2\u014d\u014e\7\3\2\2\u014e\u0156\5.\30\b\u014f"+
		"\u0150\7\35\2\2\u0150\u0151\5.\30\2\u0151\u0152\7\36\2\2\u0152\u0156\3"+
		"\2\2\2\u0153\u0156\5\30\r\2\u0154\u0156\7:\2\2\u0155\u014c\3\2\2\2\u0155"+
		"\u014f\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\u015f\3\2"+
		"\2\2\u0157\u0158\f\6\2\2\u0158\u0159\t\5\2\2\u0159\u015e\5.\30\7\u015a"+
		"\u015b\f\5\2\2\u015b\u015c\t\6\2\2\u015c\u015e\5.\30\6\u015d\u0157\3\2"+
		"\2\2\u015d\u015a\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160/\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\t\7\2\2"+
		"\u0163\61\3\2\2\2\u0164\u0166\b\32\1\2\u0165\u0167\7\34\2\2\u0166\u0165"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\7\35\2\2"+
		"\u0169\u016a\5\62\32\2\u016a\u016b\7\36\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016e\5\64\33\2\u016d\u0164\3\2\2\2\u016d\u016c\3\2\2\2\u016e\u0177\3"+
		"\2\2\2\u016f\u0170\f\5\2\2\u0170\u0171\7\32\2\2\u0171\u0176\5\62\32\6"+
		"\u0172\u0173\f\4\2\2\u0173\u0174\7\33\2\2\u0174\u0176\5\62\32\5\u0175"+
		"\u016f\3\2\2\2\u0175\u0172\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\63\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b"+
		"\5.\30\2\u017b\u017c\5\60\31\2\u017c\u017d\5.\30\2\u017d\65\3\2\2\2\u017e"+
		"\u017f\7\62\2\2\u017f\u0180\7\35\2\2\u0180\u0181\5\62\32\2\u0181\u0182"+
		"\7\36\2\2\u0182\u0183\7#\2\2\u0183\u0184\5\16\b\2\u0184\u0185\7$\2\2\u0185"+
		"\67\3\2\2\2\u0186\u0187\7\63\2\2\u0187\u0188\7#\2\2\u0188\u0189\5\16\b"+
		"\2\u0189\u018a\7$\2\2\u018a9\3\2\2\2\u018b\u018c\7\64\2\2\u018c\u018d"+
		"\7\35\2\2\u018d\u018e\5\62\32\2\u018e\u018f\7\36\2\2\u018f\u0190\7#\2"+
		"\2\u0190\u0191\5\16\b\2\u0191\u0192\7$\2\2\u0192;\3\2\2\2\u0193\u019f"+
		"\5\66\34\2\u0194\u0198\5\66\34\2\u0195\u0197\5:\36\2\u0196\u0195\3\2\2"+
		"\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019c"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019d\58\35\2\u019c\u019b\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u0193\3\2\2\2\u019e\u0194\3\2"+
		"\2\2\u019f=\3\2\2\2\u01a0\u01a1\7\65\2\2\u01a1\u01a2\7\35\2\2\u01a2\u01a3"+
		"\5\62\32\2\u01a3\u01a4\7\36\2\2\u01a4\u01a5\7#\2\2\u01a5\u01a6\5\16\b"+
		"\2\u01a6\u01a7\7$\2\2\u01a7?\3\2\2\2\u01a8\u01a9\7\66\2\2\u01a9\u01aa"+
		"\7\35\2\2\u01aa\u01ab\5\62\32\2\u01ab\u01ac\7\36\2\2\u01ac\u01ad\7#\2"+
		"\2\u01ad\u01ae\5\16\b\2\u01ae\u01af\7$\2\2\u01afA\3\2\2\2\u01b0\u01b1"+
		"\7\67\2\2\u01b1\u01b2\7#\2\2\u01b2\u01b3\5\16\b\2\u01b3\u01b4\7$\2\2\u01b4"+
		"\u01b5\7\66\2\2\u01b5\u01b6\7\35\2\2\u01b6\u01b7\5\62\32\2\u01b7\u01b8"+
		"\7\36\2\2\u01b8\u01b9\7\"\2\2\u01b9C\3\2\2\2\u01ba\u01bb\5\22\n\2\u01bb"+
		"\u01bc\7:\2\2\u01bc\u01d0\3\2\2\2\u01bd\u01be\5\22\n\2\u01be\u01bf\7:"+
		"\2\2\u01bf\u01c0\5F$\2\u01c0\u01d0\3\2\2\2\u01c1\u01c2\5\22\n\2\u01c2"+
		"\u01c3\5$\23\2\u01c3\u01d0\3\2\2\2\u01c4\u01c5\5\22\n\2\u01c5\u01c6\5"+
		"$\23\2\u01c6\u01c7\5F$\2\u01c7\u01d0\3\2\2\2\u01c8\u01c9\5\24\13\2\u01c9"+
		"\u01ca\7:\2\2\u01ca\u01d0\3\2\2\2\u01cb\u01cc\5\24\13\2\u01cc\u01cd\7"+
		":\2\2\u01cd\u01ce\5F$\2\u01ce\u01d0\3\2\2\2\u01cf\u01ba\3\2\2\2\u01cf"+
		"\u01bd\3\2\2\2\u01cf\u01c1\3\2\2\2\u01cf\u01c4\3\2\2\2\u01cf\u01c8\3\2"+
		"\2\2\u01cf\u01cb\3\2\2\2\u01d0E\3\2\2\2\u01d1\u01d2\7!\2\2\u01d2\u01d3"+
		"\5\22\n\2\u01d3\u01d4\7:\2\2\u01d4\u01df\3\2\2\2\u01d5\u01d6\7!\2\2\u01d6"+
		"\u01d7\5\22\n\2\u01d7\u01d8\5$\23\2\u01d8\u01df\3\2\2\2\u01d9\u01da\7"+
		"!\2\2\u01da\u01db\5\24\13\2\u01db\u01dc\7:\2\2\u01dc\u01df\3\2\2\2\u01dd"+
		"\u01df\5D#\2\u01de\u01d1\3\2\2\2\u01de\u01d5\3\2\2\2\u01de\u01d9\3\2\2"+
		"\2\u01de\u01dd\3\2\2\2\u01dfG\3\2\2\2\u01e0\u01e1\5\22\n\2\u01e1\u01e2"+
		"\7;\2\2\u01e2\u01e3\7\35\2\2\u01e3\u01e4\5D#\2\u01e4\u01e5\7\36\2\2\u01e5"+
		"\u01e6\7#\2\2\u01e6\u01e7\5\16\b\2\u01e7\u01e8\7$\2\2\u01e8I\3\2\2\2\u01e9"+
		"\u01ea\7:\2\2\u01ea\u01f1\5L\'\2\u01eb\u01ec\5$\23\2\u01ec\u01ed\5L\'"+
		"\2\u01ed\u01f1\3\2\2\2\u01ee\u01f1\5$\23\2\u01ef\u01f1\7:\2\2\u01f0\u01e9"+
		"\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"K\3\2\2\2\u01f2\u01f3\7!\2\2\u01f3\u01f8\7:\2\2\u01f4\u01f5\7!\2\2\u01f5"+
		"\u01f8\5$\23\2\u01f6\u01f8\5J&\2\u01f7\u01f2\3\2\2\2\u01f7\u01f4\3\2\2"+
		"\2\u01f7\u01f6\3\2\2\2\u01f8M\3\2\2\2\u01f9\u01fa\7;\2\2\u01fa\u01fb\7"+
		"\35\2\2\u01fb\u01fc\5J&\2\u01fc\u01fd\7\36\2\2\u01fd\u01fe\7\"\2\2\u01fe"+
		"O\3\2\2\2\u01ff\u0204\7:\2\2\u0200\u0204\5\30\r\2\u0201\u0204\5$\23\2"+
		"\u0202\u0204\5.\30\2\u0203\u01ff\3\2\2\2\u0203\u0200\3\2\2\2\u0203\u0201"+
		"\3\2\2\2\u0203\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u020d\5R*\2\u0206"+
		"\u020b\7:\2\2\u0207\u020b\5\30\r\2\u0208\u020b\5$\23\2\u0209\u020b\5."+
		"\30\2\u020a\u0206\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u0208\3\2\2\2\u020a"+
		"\u0209\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u0203\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020dQ\3\2\2\2\u020e\u0213\7\t\2\2\u020f\u0214\7:\2\2\u0210\u0214"+
		"\5\30\r\2\u0211\u0214\5$\23\2\u0212\u0214\5.\30\2\u0213\u020f\3\2\2\2"+
		"\u0213\u0210\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214\u0217"+
		"\3\2\2\2\u0215\u0217\5P)\2\u0216\u020e\3\2\2\2\u0216\u0215\3\2\2\2\u0217"+
		"S\3\2\2\2\u0218\u0219\7(\2\2\u0219\u021a\7\35\2\2\u021a\u021b\5P)\2\u021b"+
		"\u021c\7\36\2\2\u021c\u021d\7\"\2\2\u021dU\3\2\2\2\u021e\u021f\t\b\2\2"+
		"\u021fW\3\2\2\2\u0220\u0221\7)\2\2\u0221\u0222\7\35\2\2\u0222\u0223\5"+
		"V,\2\u0223\u0224\7\36\2\2\u0224\u0225\7\"\2\2\u0225Y\3\2\2\2\62[kou\u0080"+
		"\u0089\u0090\u00a1\u00aa\u00ad\u00b2\u00b7\u00c9\u00d0\u00d7\u00e0\u00eb"+
		"\u00f6\u00fa\u0101\u0108\u010c\u0115\u011e\u0121\u012b\u0132\u013b\u0144"+
		"\u0155\u015d\u015f\u0166\u016d\u0175\u0177\u0198\u019c\u019e\u01cf\u01de"+
		"\u01f0\u01f7\u0203\u020a\u020c\u0213\u0216";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}