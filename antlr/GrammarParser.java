package antlr;
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
		T__0=1, MainKey=2, VoidKey=3, IntKey=4, FloatKey=5, StringKey=6, CharKey=7, 
		BooleanKey=8, ArrayKey=9, Num=10, Float=11, Char=12, String=13, TrueKey=14, 
		FalseKey=15, PrintKey=16, ScanKey=17, Terminator=18, ElseIfKey=19, IfKey=20, 
		ElseKey=21, ForKey=22, WhileKey=23, DoWhileKey=24, OpenPar=25, ClosePar=26, 
		OpenBracket=27, CloseBracket=28, OpenBrace=29, CloseBrace=30, AddAssignOp=31, 
		SubAssignOp=32, AddOp=33, SubOp=34, MultOp=35, DivOp=36, ModOp=37, ExpOp=38, 
		IncOp=39, DecOp=40, NewKey=41, ReturnKey=42, NullKey=43, LessEqualOp=44, 
		GreaterEqualOp=45, LessOp=46, GreaterOp=47, NotEqualOp=48, EqualOp=49, 
		AssignOp=50, NotOp=51, AndOp=52, OrOp=53, Separator=54, CondSep=55, Func=56, 
		CommentBlock=57, Var=58, WS=59;
	public static final String[] tokenNames = {
		"<INVALID>", "'-'", "MainKey", "'neuter'", "'sheep'", "'otter'", "'snake'", 
		"'worm'", "'boo'", "'spider'", "Num", "Float", "Char", "String", "'diurnal'", 
		"'nocturnal'", "'purr'", "'rawr'", "'<3'", "'catdog'", "'dog'", "'cat'", 
		"'foodchain'", "'run'", "'move'", "'('", "')'", "'['", "']'", "'e-worm'", 
		"'f-worm'", "'arfthis'", "'sssthis'", "'arf'", "'sss'", "'meow'", "'dook'", 
		"'mooodulo'", "'powpow'", "'mate'", "'prey'", "'new'", "'back'", "'extinct'", 
		"'<='", "'>='", "'<'", "'>'", "'!='", "'=='", "'='", "'!'", "'&&'", "'||'", 
		"','", "':'", "Func", "CommentBlock", "Var", "WS"
	};
	public static final int
		RULE_start = 0, RULE_main_func = 1, RULE_func_block = 2, RULE_function = 3, 
		RULE_void_func = 4, RULE_ret_func = 5, RULE_code_block = 6, RULE_statement = 7, 
		RULE_datatype = 8, RULE_array_datatype = 9, RULE_boolean_lit = 10, RULE_literal = 11, 
		RULE_var_dec = 12, RULE_next_var = 13, RULE_var_init = 14, RULE_next_var_i = 15, 
		RULE_next_arr_i = 16, RULE_array_index = 17, RULE_var_assign = 18, RULE_array_assign = 19, 
		RULE_addsub_assign = 20, RULE_inc_dec = 21, RULE_expr = 22, RULE_operand = 23, 
		RULE_cond_op = 24, RULE_cond_expr = 25, RULE_condition = 26, RULE_if_cond = 27, 
		RULE_else_cond = 28, RULE_elseif_cond = 29, RULE_conditional = 30, RULE_for_loop = 31, 
		RULE_while_loop = 32, RULE_dowhile_loop = 33, RULE_param_dec = 34, RULE_param_call = 35, 
		RULE_func_call = 36, RULE_print = 37, RULE_scan_lit = 38, RULE_scan = 39;
	public static final String[] ruleNames = {
		"start", "main_func", "func_block", "function", "void_func", "ret_func", 
		"code_block", "statement", "datatype", "array_datatype", "boolean_lit", 
		"literal", "var_dec", "next_var", "var_init", "next_var_i", "next_arr_i", 
		"array_index", "var_assign", "array_assign", "addsub_assign", "inc_dec", 
		"expr", "operand", "cond_op", "cond_expr", "condition", "if_cond", "else_cond", 
		"elseif_cond", "conditional", "for_loop", "while_loop", "dowhile_loop", 
		"param_dec", "param_call", "func_call", "print", "scan_lit", "scan"
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
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(80); func_block();
				}
				break;
			}
			setState(83); main_func();
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
			setState(85); match(VoidKey);
			setState(86); match(MainKey);
			setState(87); match(OpenPar);
			setState(88); match(ClosePar);
			setState(89); match(OpenBrace);
			setState(90); code_block();
			setState(91); match(CloseBrace);
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
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); function();
				setState(94); func_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); function();
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
			setState(101);
			switch (_input.LA(1)) {
			case VoidKey:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); void_func();
				}
				break;
			case IntKey:
			case FloatKey:
			case StringKey:
			case CharKey:
			case BooleanKey:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); ret_func();
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
			setState(103); match(VoidKey);
			setState(104); match(Func);
			setState(105); match(OpenPar);
			setState(107);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntKey) | (1L << FloatKey) | (1L << StringKey) | (1L << CharKey) | (1L << BooleanKey))) != 0)) {
				{
				setState(106); param_dec();
				}
			}

			setState(109); match(ClosePar);
			setState(110); match(OpenBrace);
			setState(111); code_block();
			setState(112); match(CloseBrace);
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
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
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
			setState(114); datatype();
			setState(115); match(Func);
			setState(116); match(OpenPar);
			setState(118);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntKey) | (1L << FloatKey) | (1L << StringKey) | (1L << CharKey) | (1L << BooleanKey))) != 0)) {
				{
				setState(117); param_dec();
				}
			}

			setState(120); match(ClosePar);
			setState(121); match(OpenBrace);
			setState(122); code_block();
			setState(123); match(ReturnKey);
			setState(124); expr(0);
			setState(125); match(Terminator);
			setState(126); match(CloseBrace);
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
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128); statement();
				setState(129); code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); statement();
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
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); var_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); var_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136); var_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137); addsub_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138); inc_dec();
				setState(139); match(Terminator);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(141); expr(0);
				setState(142); match(Terminator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(144); conditional();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(145); for_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(146); while_loop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(147); dowhile_loop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(148); func_call();
				setState(149); match(Terminator);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(151); print();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(152); scan();
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
			setState(155);
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
			setState(157); datatype();
			setState(158); match(ArrayKey);
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
		public TerminalNode FalseKey() { return getToken(GrammarParser.FalseKey, 0); }
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
		public TerminalNode TrueKey() { return getToken(GrammarParser.TrueKey, 0); }
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
			setState(162);
			switch (_input.LA(1)) {
			case TrueKey:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160); match(TrueKey);
				}
				break;
			case FalseKey:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(FalseKey);
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
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				_la = _input.LA(1);
				if (_la==SubOp) {
					{
					setState(164); match(SubOp);
					}
				}

				setState(167); match(Num);
				}
				break;
			case 2:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168); boolean_lit();
				}
				break;
			case 3:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				_la = _input.LA(1);
				if (_la==SubOp) {
					{
					setState(169); match(SubOp);
					}
				}

				setState(172); match(Float);
				}
				break;
			case 4:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(173); match(Char);
				}
				break;
			case 5:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(174); match(String);
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
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); datatype();
				setState(178); match(Var);
				setState(179); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181); array_datatype();
				setState(182); match(Var);
				setState(183); match(Terminator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185); array_datatype();
				setState(186); match(Var);
				setState(187); next_var();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189); datatype();
				setState(190); match(Var);
				setState(191); next_var();
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
		public Next_varContext next_var() {
			return getRuleContext(Next_varContext.class,0);
		}
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
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195); match(Separator);
				setState(196); match(Var);
				setState(197); next_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); match(Separator);
				setState(199); match(Var);
				setState(200); match(Terminator);
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
		public TerminalNode NewKey() { return getToken(GrammarParser.NewKey, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AssignOp() { return getToken(GrammarParser.AssignOp, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Array_datatypeContext array_datatype() {
			return getRuleContext(Array_datatypeContext.class,0);
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
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); datatype();
				setState(204); match(Var);
				setState(205); match(AssignOp);
				setState(206); expr(0);
				setState(207); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209); datatype();
				setState(210); match(Var);
				setState(211); match(AssignOp);
				setState(212); expr(0);
				setState(213); next_var_i();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215); array_datatype();
				setState(216); match(Var);
				setState(217); match(AssignOp);
				setState(218); match(NewKey);
				setState(219); match(ArrayKey);
				setState(220); expr(0);
				setState(221); match(Terminator);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223); array_datatype();
				setState(224); match(Var);
				setState(225); match(AssignOp);
				setState(226); match(NewKey);
				setState(227); match(ArrayKey);
				setState(228); expr(0);
				setState(229); next_arr_i();
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
		public Next_var_iContext next_var_i() {
			return getRuleContext(Next_var_iContext.class,0);
		}
		public TerminalNode Separator() { return getToken(GrammarParser.Separator, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AssignOp() { return getToken(GrammarParser.AssignOp, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
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
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); match(Separator);
				setState(234); match(Var);
				setState(235); match(AssignOp);
				setState(236); expr(0);
				setState(237); next_var_i();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); match(Separator);
				setState(240); match(Var);
				setState(241); match(AssignOp);
				setState(242); expr(0);
				setState(243); match(Terminator);
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
		public TerminalNode ArrayKey() { return getToken(GrammarParser.ArrayKey, 0); }
		public Next_arr_iContext next_arr_i() {
			return getRuleContext(Next_arr_iContext.class,0);
		}
		public TerminalNode NewKey() { return getToken(GrammarParser.NewKey, 0); }
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
			setState(263);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247); match(Separator);
				setState(248); match(Var);
				setState(249); match(AssignOp);
				setState(250); match(NewKey);
				setState(251); match(ArrayKey);
				setState(252); expr(0);
				setState(253); next_arr_i();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255); match(Separator);
				setState(256); match(Var);
				setState(257); match(AssignOp);
				setState(258); match(NewKey);
				setState(259); match(ArrayKey);
				setState(260); expr(0);
				setState(261); match(Terminator);
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
			setState(273);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(265); match(Var);
				setState(266); match(ArrayKey);
				setState(267); match(Num);
				}
				break;
			case OpenPar:
				enterOuterAlt(_localctx, 2);
				{
				setState(268); match(OpenPar);
				setState(269); match(Var);
				setState(270); match(ArrayKey);
				setState(271); match(Num);
				setState(272); match(ClosePar);
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
		public TerminalNode AssignOp() { return getToken(GrammarParser.AssignOp, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
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
			setState(275); match(Var);
			setState(276); match(AssignOp);
			setState(277); expr(0);
			setState(278); match(Terminator);
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
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
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
			setState(280); array_index();
			setState(281); match(AssignOp);
			setState(282); expr(0);
			setState(283); match(Terminator);
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
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
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
			setState(285); match(Var);
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==AddAssignOp || _la==SubAssignOp) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(287); expr(0);
			setState(288); match(Terminator);
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
			setState(290); match(Var);
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==IncOp || _la==DecOp) ) {
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
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
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
			setState(301);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new NegaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(294); match(T__0);
				setState(295); expr(5);
				}
				break;
			case 2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296); match(OpenPar);
				setState(297); expr(0);
				setState(298); match(ClosePar);
				}
				break;
			case 3:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300); operand();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(309);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(303);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(304);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultOp) | (1L << DivOp) | (1L << ModOp))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(305); expr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(306);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(307);
						_la = _input.LA(1);
						if ( !(_la==AddOp || _la==SubOp) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(308); expr(3);
						}
						break;
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class OperandContext extends ParserRuleContext {
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallOpContext extends OperandContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public CallOpContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCallOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCallOp(this);
		}
	}
	public static class ArrayOpContext extends OperandContext {
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public ArrayOpContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArrayOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArrayOp(this);
		}
	}
	public static class VariableOpContext extends OperandContext {
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public VariableOpContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVariableOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVariableOp(this);
		}
	}
	public static class LiteralOpContext extends OperandContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralOpContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLiteralOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLiteralOp(this);
		}
	}
	public static class IncdecOpContext extends OperandContext {
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public IncdecOpContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIncdecOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIncdecOp(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operand);
		try {
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new LiteralOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(314); literal();
				}
				break;
			case 2:
				_localctx = new VariableOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315); match(Var);
				}
				break;
			case 3:
				_localctx = new ArrayOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(316); array_index();
				}
				break;
			case 4:
				_localctx = new CallOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(317); func_call();
				}
				break;
			case 5:
				_localctx = new IncdecOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(318); inc_dec();
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
		enterRule(_localctx, 48, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessEqualOp) | (1L << GreaterEqualOp) | (1L << LessOp) | (1L << GreaterOp) | (1L << NotEqualOp) | (1L << EqualOp))) != 0)) ) {
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_cond_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new ParentCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(325);
				_la = _input.LA(1);
				if (_la==NotOp) {
					{
					setState(324); match(NotOp);
					}
				}

				setState(327); match(OpenPar);
				setState(328); cond_expr(0);
				setState(329); match(ClosePar);
				}
				break;
			case 2:
				{
				_localctx = new AtomConContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(331); condition();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(340);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new AndConContext(new Cond_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond_expr);
						setState(334);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(335); match(AndOp);
						setState(336); cond_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new OrConContext(new Cond_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond_expr);
						setState(337);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(338); match(OrOp);
						setState(339); cond_expr(3);
						}
						break;
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 52, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); expr(0);
			setState(349);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(346); cond_op();
				setState(347); expr(0);
				}
				break;
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
		enterRule(_localctx, 54, RULE_if_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351); match(IfKey);
			setState(352); match(OpenPar);
			setState(353); cond_expr(0);
			setState(354); match(ClosePar);
			setState(355); match(OpenBrace);
			setState(356); code_block();
			setState(357); match(CloseBrace);
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
		enterRule(_localctx, 56, RULE_else_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(ElseKey);
			setState(360); match(OpenBrace);
			setState(361); code_block();
			setState(362); match(CloseBrace);
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
		enterRule(_localctx, 58, RULE_elseif_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); match(ElseIfKey);
			setState(365); match(OpenPar);
			setState(366); cond_expr(0);
			setState(367); match(ClosePar);
			setState(368); match(OpenBrace);
			setState(369); code_block();
			setState(370); match(CloseBrace);
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
		enterRule(_localctx, 60, RULE_conditional);
		int _la;
		try {
			setState(383);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372); if_cond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373); if_cond();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIfKey) {
					{
					{
					setState(374); elseif_cond();
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				_la = _input.LA(1);
				if (_la==ElseKey) {
					{
					setState(380); else_cond();
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
		public TerminalNode CondSep() { return getToken(GrammarParser.CondSep, 0); }
		public Cond_exprContext cond_expr(int i) {
			return getRuleContext(Cond_exprContext.class,i);
		}
		public TerminalNode OpenBrace() { return getToken(GrammarParser.OpenBrace, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public List<Cond_exprContext> cond_expr() {
			return getRuleContexts(Cond_exprContext.class);
		}
		public TerminalNode CloseBrace() { return getToken(GrammarParser.CloseBrace, 0); }
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
		enterRule(_localctx, 62, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); match(ForKey);
			setState(386); match(OpenPar);
			setState(392);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(387); cond_expr(0);
				}
				break;
			case 2:
				{
				setState(388); cond_expr(0);
				setState(389); match(CondSep);
				setState(390); cond_expr(0);
				}
				break;
			}
			setState(394); match(ClosePar);
			setState(395); match(OpenBrace);
			setState(396); code_block();
			setState(397); match(CloseBrace);
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
		enterRule(_localctx, 64, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); match(WhileKey);
			setState(400); match(OpenPar);
			setState(401); cond_expr(0);
			setState(402); match(ClosePar);
			setState(403); match(OpenBrace);
			setState(404); code_block();
			setState(405); match(CloseBrace);
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
		enterRule(_localctx, 66, RULE_dowhile_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); match(DoWhileKey);
			setState(408); match(OpenBrace);
			setState(409); code_block();
			setState(410); match(CloseBrace);
			setState(411); match(WhileKey);
			setState(412); match(OpenPar);
			setState(413); cond_expr(0);
			setState(414); match(ClosePar);
			setState(415); match(Terminator);
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
		enterRule(_localctx, 68, RULE_param_dec);
		try {
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417); datatype();
				setState(418); match(Var);
				setState(419); match(Separator);
				setState(420); param_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422); datatype();
				setState(423); array_index();
				setState(424); match(Separator);
				setState(425); param_dec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427); array_datatype();
				setState(428); match(Var);
				setState(429); match(Separator);
				setState(430); param_dec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432); datatype();
				setState(433); match(Var);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(435); datatype();
				setState(436); array_index();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(438); array_datatype();
				setState(439); match(Var);
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

	public static class Param_callContext extends ParserRuleContext {
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public TerminalNode Separator() { return getToken(GrammarParser.Separator, 0); }
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
		enterRule(_localctx, 70, RULE_param_call);
		try {
			setState(457);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443); match(Var);
				setState(444); match(Separator);
				setState(445); param_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446); array_index();
				setState(447); match(Separator);
				setState(448); param_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450); literal();
				setState(451); match(Separator);
				setState(452); param_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454); array_index();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(455); literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(456); match(Var);
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
		enterRule(_localctx, 72, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); match(Func);
			setState(460); match(OpenPar);
			setState(461); param_call();
			setState(462); match(ClosePar);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 74, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); match(PrintKey);
			setState(465); match(OpenPar);
			setState(466); expr(0);
			setState(467); match(ClosePar);
			setState(468); match(Terminator);
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
		enterRule(_localctx, 76, RULE_scan_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
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
		enterRule(_localctx, 78, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); match(ScanKey);
			setState(473); match(OpenPar);
			setState(474); scan_lit();
			setState(475); match(ClosePar);
			setState(476); match(Terminator);
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
		case 25: return cond_expr_sempred((Cond_exprContext)_localctx, predIndex);
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
		case 0: return precpred(_ctx, 3);
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u01e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\5\2T\n\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4d\n\4\3\5\3"+
		"\5\5\5h\n\5\3\6\3\6\3\6\3\6\5\6n\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\5\7y\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0087"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u009c\n\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5\f\u00a5\n\f"+
		"\3\r\5\r\u00a8\n\r\3\r\3\r\3\r\5\r\u00ad\n\r\3\r\3\r\3\r\5\r\u00b2\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00c4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cc\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00ea\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00f8\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010a\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0114\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0130\n\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u0138\n\30\f\30\16\30\u013b\13\30\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0142\n\31\3\32\3\32\3\33\3\33\5\33\u0148\n\33\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u014f\n\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0157\n\33\f\33"+
		"\16\33\u015a\13\33\3\34\3\34\3\34\3\34\5\34\u0160\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u017a\n \f \16 \u017d\13 \3 \5 \u0180"+
		"\n \5 \u0182\n \3!\3!\3!\3!\3!\3!\3!\5!\u018b\n!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01bc\n"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01cc\n%\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\2\4.\64*\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\t"+
		"\3\2\6\n\3\2!\"\3\2)*\3\2%\'\3\2#$\3\2.\63\3\2\f\17\u01f6\2S\3\2\2\2\4"+
		"W\3\2\2\2\6c\3\2\2\2\bg\3\2\2\2\ni\3\2\2\2\ft\3\2\2\2\16\u0086\3\2\2\2"+
		"\20\u009b\3\2\2\2\22\u009d\3\2\2\2\24\u009f\3\2\2\2\26\u00a4\3\2\2\2\30"+
		"\u00b1\3\2\2\2\32\u00c3\3\2\2\2\34\u00cb\3\2\2\2\36\u00e9\3\2\2\2 \u00f7"+
		"\3\2\2\2\"\u0109\3\2\2\2$\u0113\3\2\2\2&\u0115\3\2\2\2(\u011a\3\2\2\2"+
		"*\u011f\3\2\2\2,\u0124\3\2\2\2.\u012f\3\2\2\2\60\u0141\3\2\2\2\62\u0143"+
		"\3\2\2\2\64\u014e\3\2\2\2\66\u015b\3\2\2\28\u0161\3\2\2\2:\u0169\3\2\2"+
		"\2<\u016e\3\2\2\2>\u0181\3\2\2\2@\u0183\3\2\2\2B\u0191\3\2\2\2D\u0199"+
		"\3\2\2\2F\u01bb\3\2\2\2H\u01cb\3\2\2\2J\u01cd\3\2\2\2L\u01d2\3\2\2\2N"+
		"\u01d8\3\2\2\2P\u01da\3\2\2\2RT\5\6\4\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2"+
		"UV\5\4\3\2V\3\3\2\2\2WX\7\5\2\2XY\7\4\2\2YZ\7\33\2\2Z[\7\34\2\2[\\\7\37"+
		"\2\2\\]\5\16\b\2]^\7 \2\2^\5\3\2\2\2_`\5\b\5\2`a\5\6\4\2ad\3\2\2\2bd\5"+
		"\b\5\2c_\3\2\2\2cb\3\2\2\2d\7\3\2\2\2eh\5\n\6\2fh\5\f\7\2ge\3\2\2\2gf"+
		"\3\2\2\2h\t\3\2\2\2ij\7\5\2\2jk\7:\2\2km\7\33\2\2ln\5F$\2ml\3\2\2\2mn"+
		"\3\2\2\2no\3\2\2\2op\7\34\2\2pq\7\37\2\2qr\5\16\b\2rs\7 \2\2s\13\3\2\2"+
		"\2tu\5\22\n\2uv\7:\2\2vx\7\33\2\2wy\5F$\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2"+
		"\2z{\7\34\2\2{|\7\37\2\2|}\5\16\b\2}~\7,\2\2~\177\5.\30\2\177\u0080\7"+
		"\24\2\2\u0080\u0081\7 \2\2\u0081\r\3\2\2\2\u0082\u0083\5\20\t\2\u0083"+
		"\u0084\5\16\b\2\u0084\u0087\3\2\2\2\u0085\u0087\5\20\t\2\u0086\u0082\3"+
		"\2\2\2\u0086\u0085\3\2\2\2\u0087\17\3\2\2\2\u0088\u009c\5\32\16\2\u0089"+
		"\u009c\5\36\20\2\u008a\u009c\5&\24\2\u008b\u009c\5*\26\2\u008c\u008d\5"+
		",\27\2\u008d\u008e\7\24\2\2\u008e\u009c\3\2\2\2\u008f\u0090\5.\30\2\u0090"+
		"\u0091\7\24\2\2\u0091\u009c\3\2\2\2\u0092\u009c\5> \2\u0093\u009c\5@!"+
		"\2\u0094\u009c\5B\"\2\u0095\u009c\5D#\2\u0096\u0097\5J&\2\u0097\u0098"+
		"\7\24\2\2\u0098\u009c\3\2\2\2\u0099\u009c\5L\'\2\u009a\u009c\5P)\2\u009b"+
		"\u0088\3\2\2\2\u009b\u0089\3\2\2\2\u009b\u008a\3\2\2\2\u009b\u008b\3\2"+
		"\2\2\u009b\u008c\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0092\3\2\2\2\u009b"+
		"\u0093\3\2\2\2\u009b\u0094\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0096\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\21\3\2\2\2\u009d\u009e"+
		"\t\2\2\2\u009e\23\3\2\2\2\u009f\u00a0\5\22\n\2\u00a0\u00a1\7\13\2\2\u00a1"+
		"\25\3\2\2\2\u00a2\u00a5\7\20\2\2\u00a3\u00a5\7\21\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a5\27\3\2\2\2\u00a6\u00a8\7$\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00b2\7\f\2\2\u00aa"+
		"\u00b2\5\26\f\2\u00ab\u00ad\7$\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b2\7\r\2\2\u00af\u00b2\7\16\2\2\u00b0"+
		"\u00b2\7\17\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b1\u00ac\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\31\3\2\2\2\u00b3"+
		"\u00b4\5\22\n\2\u00b4\u00b5\7<\2\2\u00b5\u00b6\7\24\2\2\u00b6\u00c4\3"+
		"\2\2\2\u00b7\u00b8\5\24\13\2\u00b8\u00b9\7<\2\2\u00b9\u00ba\7\24\2\2\u00ba"+
		"\u00c4\3\2\2\2\u00bb\u00bc\5\24\13\2\u00bc\u00bd\7<\2\2\u00bd\u00be\5"+
		"\34\17\2\u00be\u00c4\3\2\2\2\u00bf\u00c0\5\22\n\2\u00c0\u00c1\7<\2\2\u00c1"+
		"\u00c2\5\34\17\2\u00c2\u00c4\3\2\2\2\u00c3\u00b3\3\2\2\2\u00c3\u00b7\3"+
		"\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\33\3\2\2\2\u00c5"+
		"\u00c6\78\2\2\u00c6\u00c7\7<\2\2\u00c7\u00cc\5\34\17\2\u00c8\u00c9\78"+
		"\2\2\u00c9\u00ca\7<\2\2\u00ca\u00cc\7\24\2\2\u00cb\u00c5\3\2\2\2\u00cb"+
		"\u00c8\3\2\2\2\u00cc\35\3\2\2\2\u00cd\u00ce\5\22\n\2\u00ce\u00cf\7<\2"+
		"\2\u00cf\u00d0\7\64\2\2\u00d0\u00d1\5.\30\2\u00d1\u00d2\7\24\2\2\u00d2"+
		"\u00ea\3\2\2\2\u00d3\u00d4\5\22\n\2\u00d4\u00d5\7<\2\2\u00d5\u00d6\7\64"+
		"\2\2\u00d6\u00d7\5.\30\2\u00d7\u00d8\5 \21\2\u00d8\u00ea\3\2\2\2\u00d9"+
		"\u00da\5\24\13\2\u00da\u00db\7<\2\2\u00db\u00dc\7\64\2\2\u00dc\u00dd\7"+
		"+\2\2\u00dd\u00de\7\13\2\2\u00de\u00df\5.\30\2\u00df\u00e0\7\24\2\2\u00e0"+
		"\u00ea\3\2\2\2\u00e1\u00e2\5\24\13\2\u00e2\u00e3\7<\2\2\u00e3\u00e4\7"+
		"\64\2\2\u00e4\u00e5\7+\2\2\u00e5\u00e6\7\13\2\2\u00e6\u00e7\5.\30\2\u00e7"+
		"\u00e8\5\"\22\2\u00e8\u00ea\3\2\2\2\u00e9\u00cd\3\2\2\2\u00e9\u00d3\3"+
		"\2\2\2\u00e9\u00d9\3\2\2\2\u00e9\u00e1\3\2\2\2\u00ea\37\3\2\2\2\u00eb"+
		"\u00ec\78\2\2\u00ec\u00ed\7<\2\2\u00ed\u00ee\7\64\2\2\u00ee\u00ef\5.\30"+
		"\2\u00ef\u00f0\5 \21\2\u00f0\u00f8\3\2\2\2\u00f1\u00f2\78\2\2\u00f2\u00f3"+
		"\7<\2\2\u00f3\u00f4\7\64\2\2\u00f4\u00f5\5.\30\2\u00f5\u00f6\7\24\2\2"+
		"\u00f6\u00f8\3\2\2\2\u00f7\u00eb\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f8!\3"+
		"\2\2\2\u00f9\u00fa\78\2\2\u00fa\u00fb\7<\2\2\u00fb\u00fc\7\64\2\2\u00fc"+
		"\u00fd\7+\2\2\u00fd\u00fe\7\13\2\2\u00fe\u00ff\5.\30\2\u00ff\u0100\5\""+
		"\22\2\u0100\u010a\3\2\2\2\u0101\u0102\78\2\2\u0102\u0103\7<\2\2\u0103"+
		"\u0104\7\64\2\2\u0104\u0105\7+\2\2\u0105\u0106\7\13\2\2\u0106\u0107\5"+
		".\30\2\u0107\u0108\7\24\2\2\u0108\u010a\3\2\2\2\u0109\u00f9\3\2\2\2\u0109"+
		"\u0101\3\2\2\2\u010a#\3\2\2\2\u010b\u010c\7<\2\2\u010c\u010d\7\13\2\2"+
		"\u010d\u0114\7\f\2\2\u010e\u010f\7\33\2\2\u010f\u0110\7<\2\2\u0110\u0111"+
		"\7\13\2\2\u0111\u0112\7\f\2\2\u0112\u0114\7\34\2\2\u0113\u010b\3\2\2\2"+
		"\u0113\u010e\3\2\2\2\u0114%\3\2\2\2\u0115\u0116\7<\2\2\u0116\u0117\7\64"+
		"\2\2\u0117\u0118\5.\30\2\u0118\u0119\7\24\2\2\u0119\'\3\2\2\2\u011a\u011b"+
		"\5$\23\2\u011b\u011c\7\64\2\2\u011c\u011d\5.\30\2\u011d\u011e\7\24\2\2"+
		"\u011e)\3\2\2\2\u011f\u0120\7<\2\2\u0120\u0121\t\3\2\2\u0121\u0122\5."+
		"\30\2\u0122\u0123\7\24\2\2\u0123+\3\2\2\2\u0124\u0125\7<\2\2\u0125\u0126"+
		"\t\4\2\2\u0126-\3\2\2\2\u0127\u0128\b\30\1\2\u0128\u0129\7\3\2\2\u0129"+
		"\u0130\5.\30\7\u012a\u012b\7\33\2\2\u012b\u012c\5.\30\2\u012c\u012d\7"+
		"\34\2\2\u012d\u0130\3\2\2\2\u012e\u0130\5\60\31\2\u012f\u0127\3\2\2\2"+
		"\u012f\u012a\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0139\3\2\2\2\u0131\u0132"+
		"\f\5\2\2\u0132\u0133\t\5\2\2\u0133\u0138\5.\30\6\u0134\u0135\f\4\2\2\u0135"+
		"\u0136\t\6\2\2\u0136\u0138\5.\30\5\u0137\u0131\3\2\2\2\u0137\u0134\3\2"+
		"\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"/\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0142\5\30\r\2\u013d\u0142\7<\2\2"+
		"\u013e\u0142\5$\23\2\u013f\u0142\5J&\2\u0140\u0142\5,\27\2\u0141\u013c"+
		"\3\2\2\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142\61\3\2\2\2\u0143\u0144\t\7\2\2\u0144\63\3\2\2\2\u0145"+
		"\u0147\b\33\1\2\u0146\u0148\7\65\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3"+
		"\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7\33\2\2\u014a\u014b\5\64\33\2"+
		"\u014b\u014c\7\34\2\2\u014c\u014f\3\2\2\2\u014d\u014f\5\66\34\2\u014e"+
		"\u0145\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0158\3\2\2\2\u0150\u0151\f\5"+
		"\2\2\u0151\u0152\7\66\2\2\u0152\u0157\5\64\33\6\u0153\u0154\f\4\2\2\u0154"+
		"\u0155\7\67\2\2\u0155\u0157\5\64\33\5\u0156\u0150\3\2\2\2\u0156\u0153"+
		"\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\65\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015f\5.\30\2\u015c\u015d\5\62\32"+
		"\2\u015d\u015e\5.\30\2\u015e\u0160\3\2\2\2\u015f\u015c\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\67\3\2\2\2\u0161\u0162\7\26\2\2\u0162\u0163\7\33\2\2\u0163"+
		"\u0164\5\64\33\2\u0164\u0165\7\34\2\2\u0165\u0166\7\37\2\2\u0166\u0167"+
		"\5\16\b\2\u0167\u0168\7 \2\2\u01689\3\2\2\2\u0169\u016a\7\27\2\2\u016a"+
		"\u016b\7\37\2\2\u016b\u016c\5\16\b\2\u016c\u016d\7 \2\2\u016d;\3\2\2\2"+
		"\u016e\u016f\7\25\2\2\u016f\u0170\7\33\2\2\u0170\u0171\5\64\33\2\u0171"+
		"\u0172\7\34\2\2\u0172\u0173\7\37\2\2\u0173\u0174\5\16\b\2\u0174\u0175"+
		"\7 \2\2\u0175=\3\2\2\2\u0176\u0182\58\35\2\u0177\u017b\58\35\2\u0178\u017a"+
		"\5<\37\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180\5:"+
		"\36\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181"+
		"\u0176\3\2\2\2\u0181\u0177\3\2\2\2\u0182?\3\2\2\2\u0183\u0184\7\30\2\2"+
		"\u0184\u018a\7\33\2\2\u0185\u018b\5\64\33\2\u0186\u0187\5\64\33\2\u0187"+
		"\u0188\79\2\2\u0188\u0189\5\64\33\2\u0189\u018b\3\2\2\2\u018a\u0185\3"+
		"\2\2\2\u018a\u0186\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\7\34\2\2\u018d"+
		"\u018e\7\37\2\2\u018e\u018f\5\16\b\2\u018f\u0190\7 \2\2\u0190A\3\2\2\2"+
		"\u0191\u0192\7\31\2\2\u0192\u0193\7\33\2\2\u0193\u0194\5\64\33\2\u0194"+
		"\u0195\7\34\2\2\u0195\u0196\7\37\2\2\u0196\u0197\5\16\b\2\u0197\u0198"+
		"\7 \2\2\u0198C\3\2\2\2\u0199\u019a\7\32\2\2\u019a\u019b\7\37\2\2\u019b"+
		"\u019c\5\16\b\2\u019c\u019d\7 \2\2\u019d\u019e\7\31\2\2\u019e\u019f\7"+
		"\33\2\2\u019f\u01a0\5\64\33\2\u01a0\u01a1\7\34\2\2\u01a1\u01a2\7\24\2"+
		"\2\u01a2E\3\2\2\2\u01a3\u01a4\5\22\n\2\u01a4\u01a5\7<\2\2\u01a5\u01a6"+
		"\78\2\2\u01a6\u01a7\5F$\2\u01a7\u01bc\3\2\2\2\u01a8\u01a9\5\22\n\2\u01a9"+
		"\u01aa\5$\23\2\u01aa\u01ab\78\2\2\u01ab\u01ac\5F$\2\u01ac\u01bc\3\2\2"+
		"\2\u01ad\u01ae\5\24\13\2\u01ae\u01af\7<\2\2\u01af\u01b0\78\2\2\u01b0\u01b1"+
		"\5F$\2\u01b1\u01bc\3\2\2\2\u01b2\u01b3\5\22\n\2\u01b3\u01b4\7<\2\2\u01b4"+
		"\u01bc\3\2\2\2\u01b5\u01b6\5\22\n\2\u01b6\u01b7\5$\23\2\u01b7\u01bc\3"+
		"\2\2\2\u01b8\u01b9\5\24\13\2\u01b9\u01ba\7<\2\2\u01ba\u01bc\3\2\2\2\u01bb"+
		"\u01a3\3\2\2\2\u01bb\u01a8\3\2\2\2\u01bb\u01ad\3\2\2\2\u01bb\u01b2\3\2"+
		"\2\2\u01bb\u01b5\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bcG\3\2\2\2\u01bd\u01be"+
		"\7<\2\2\u01be\u01bf\78\2\2\u01bf\u01cc\5H%\2\u01c0\u01c1\5$\23\2\u01c1"+
		"\u01c2\78\2\2\u01c2\u01c3\5H%\2\u01c3\u01cc\3\2\2\2\u01c4\u01c5\5\30\r"+
		"\2\u01c5\u01c6\78\2\2\u01c6\u01c7\5H%\2\u01c7\u01cc\3\2\2\2\u01c8\u01cc"+
		"\5$\23\2\u01c9\u01cc\5\30\r\2\u01ca\u01cc\7<\2\2\u01cb\u01bd\3\2\2\2\u01cb"+
		"\u01c0\3\2\2\2\u01cb\u01c4\3\2\2\2\u01cb\u01c8\3\2\2\2\u01cb\u01c9\3\2"+
		"\2\2\u01cb\u01ca\3\2\2\2\u01ccI\3\2\2\2\u01cd\u01ce\7:\2\2\u01ce\u01cf"+
		"\7\33\2\2\u01cf\u01d0\5H%\2\u01d0\u01d1\7\34\2\2\u01d1K\3\2\2\2\u01d2"+
		"\u01d3\7\22\2\2\u01d3\u01d4\7\33\2\2\u01d4\u01d5\5.\30\2\u01d5\u01d6\7"+
		"\34\2\2\u01d6\u01d7\7\24\2\2\u01d7M\3\2\2\2\u01d8\u01d9\t\b\2\2\u01d9"+
		"O\3\2\2\2\u01da\u01db\7\23\2\2\u01db\u01dc\7\33\2\2\u01dc\u01dd\5N(\2"+
		"\u01dd\u01de\7\34\2\2\u01de\u01df\7\24\2\2\u01dfQ\3\2\2\2\"Scgmx\u0086"+
		"\u009b\u00a4\u00a7\u00ac\u00b1\u00c3\u00cb\u00e9\u00f7\u0109\u0113\u012f"+
		"\u0137\u0139\u0141\u0147\u014e\u0156\u0158\u015f\u017b\u017f\u0181\u018a"+
		"\u01bb\u01cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}