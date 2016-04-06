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
		RULE_else_cond = 28, RULE_elseif_cond = 29, RULE_conditional = 30, RULE_for_param = 31, 
		RULE_for_loop = 32, RULE_while_loop = 33, RULE_dowhile_loop = 34, RULE_param_dec = 35, 
		RULE_param_call = 36, RULE_func_call = 37, RULE_print = 38, RULE_scan_lit = 39, 
		RULE_scan = 40;
	public static final String[] ruleNames = {
		"start", "main_func", "func_block", "function", "void_func", "ret_func", 
		"code_block", "statement", "datatype", "array_datatype", "boolean_lit", 
		"literal", "var_dec", "next_var", "var_init", "next_var_i", "next_arr_i", 
		"array_index", "var_assign", "array_assign", "addsub_assign", "inc_dec", 
		"expr", "operand", "cond_op", "cond_expr", "condition", "if_cond", "else_cond", 
		"elseif_cond", "conditional", "for_param", "for_loop", "while_loop", "dowhile_loop", 
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
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(82); func_block();
				}
				break;
			}
			setState(85); main_func();
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
			setState(87); match(VoidKey);
			setState(88); match(MainKey);
			setState(89); match(OpenPar);
			setState(90); match(ClosePar);
			setState(91); match(OpenBrace);
			setState(92); code_block();
			setState(93); match(CloseBrace);
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
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); function();
				setState(96); func_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); function();
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
			setState(103);
			switch (_input.LA(1)) {
			case VoidKey:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); void_func();
				}
				break;
			case IntKey:
			case FloatKey:
			case StringKey:
			case CharKey:
			case BooleanKey:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); ret_func();
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
			setState(105); match(VoidKey);
			setState(106); match(Func);
			setState(107); match(OpenPar);
			setState(109);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntKey) | (1L << FloatKey) | (1L << StringKey) | (1L << CharKey) | (1L << BooleanKey))) != 0)) {
				{
				setState(108); param_dec();
				}
			}

			setState(111); match(ClosePar);
			setState(112); match(OpenBrace);
			setState(113); code_block();
			setState(114); match(CloseBrace);
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
			setState(116); datatype();
			setState(117); match(Func);
			setState(118); match(OpenPar);
			setState(120);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntKey) | (1L << FloatKey) | (1L << StringKey) | (1L << CharKey) | (1L << BooleanKey))) != 0)) {
				{
				setState(119); param_dec();
				}
			}

			setState(122); match(ClosePar);
			setState(123); match(OpenBrace);
			setState(124); code_block();
			setState(125); match(ReturnKey);
			setState(126); expr(0);
			setState(127); match(Terminator);
			setState(128); match(CloseBrace);
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
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); statement();
				setState(131); code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); statement();
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
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136); var_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); var_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138); var_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139); addsub_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140); inc_dec();
				setState(141); match(Terminator);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143); expr(0);
				setState(144); match(Terminator);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(146); conditional();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(147); for_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(148); while_loop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(149); dowhile_loop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(150); func_call();
				setState(151); match(Terminator);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(153); print();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(154); scan();
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
			setState(157);
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
			setState(159); datatype();
			setState(160); match(ArrayKey);
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
			setState(164);
			switch (_input.LA(1)) {
			case TrueKey:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162); match(TrueKey);
				}
				break;
			case FalseKey:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163); match(FalseKey);
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
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				_la = _input.LA(1);
				if (_la==SubOp) {
					{
					setState(166); match(SubOp);
					}
				}

				setState(169); match(Num);
				}
				break;
			case 2:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170); boolean_lit();
				}
				break;
			case 3:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				_la = _input.LA(1);
				if (_la==SubOp) {
					{
					setState(171); match(SubOp);
					}
				}

				setState(174); match(Float);
				}
				break;
			case 4:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(175); match(Char);
				}
				break;
			case 5:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(176); match(String);
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
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); datatype();
				setState(180); match(Var);
				setState(181); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); array_datatype();
				setState(184); match(Var);
				setState(185); match(Terminator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187); array_datatype();
				setState(188); match(Var);
				setState(189); next_var();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191); datatype();
				setState(192); match(Var);
				setState(193); next_var();
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
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197); match(Separator);
				setState(198); match(Var);
				setState(199); next_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200); match(Separator);
				setState(201); match(Var);
				setState(202); match(Terminator);
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
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); datatype();
				setState(206); match(Var);
				setState(207); match(AssignOp);
				setState(208); expr(0);
				setState(209); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211); datatype();
				setState(212); match(Var);
				setState(213); match(AssignOp);
				setState(214); expr(0);
				setState(215); next_var_i();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217); array_datatype();
				setState(218); match(Var);
				setState(219); match(AssignOp);
				setState(220); match(NewKey);
				setState(221); match(ArrayKey);
				setState(222); expr(0);
				setState(223); match(Terminator);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225); array_datatype();
				setState(226); match(Var);
				setState(227); match(AssignOp);
				setState(228); match(NewKey);
				setState(229); match(ArrayKey);
				setState(230); expr(0);
				setState(231); next_arr_i();
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
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); match(Separator);
				setState(236); match(Var);
				setState(237); match(AssignOp);
				setState(238); expr(0);
				setState(239); next_var_i();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241); match(Separator);
				setState(242); match(Var);
				setState(243); match(AssignOp);
				setState(244); expr(0);
				setState(245); match(Terminator);
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
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); match(Separator);
				setState(250); match(Var);
				setState(251); match(AssignOp);
				setState(252); match(NewKey);
				setState(253); match(ArrayKey);
				setState(254); expr(0);
				setState(255); next_arr_i();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); match(Separator);
				setState(258); match(Var);
				setState(259); match(AssignOp);
				setState(260); match(NewKey);
				setState(261); match(ArrayKey);
				setState(262); expr(0);
				setState(263); match(Terminator);
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
			setState(275);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(267); match(Var);
				setState(268); match(ArrayKey);
				setState(269); match(Num);
				}
				break;
			case OpenPar:
				enterOuterAlt(_localctx, 2);
				{
				setState(270); match(OpenPar);
				setState(271); match(Var);
				setState(272); match(ArrayKey);
				setState(273); match(Num);
				setState(274); match(ClosePar);
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
			setState(277); match(Var);
			setState(278); match(AssignOp);
			setState(279); expr(0);
			setState(280); match(Terminator);
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
			setState(282); array_index();
			setState(283); match(AssignOp);
			setState(284); expr(0);
			setState(285); match(Terminator);
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
			setState(287); match(Var);
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==AddAssignOp || _la==SubAssignOp) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(289); expr(0);
			setState(290); match(Terminator);
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
			setState(292); match(Var);
			setState(293);
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
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new NegaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(296); match(T__0);
				setState(297); expr(5);
				}
				break;
			case 2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298); match(OpenPar);
				setState(299); expr(0);
				setState(300); match(ClosePar);
				}
				break;
			case 3:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302); operand();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(305);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(306);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultOp) | (1L << DivOp) | (1L << ModOp))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(307); expr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(308);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(309);
						_la = _input.LA(1);
						if ( !(_la==AddOp || _la==SubOp) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(310); expr(3);
						}
						break;
					}
					} 
				}
				setState(315);
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
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new LiteralOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(316); literal();
				}
				break;
			case 2:
				_localctx = new VariableOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(317); match(Var);
				}
				break;
			case 3:
				_localctx = new ArrayOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(318); array_index();
				}
				break;
			case 4:
				_localctx = new CallOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(319); func_call();
				}
				break;
			case 5:
				_localctx = new IncdecOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(320); inc_dec();
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
			setState(323);
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
			setState(334);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new ParentCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(327);
				_la = _input.LA(1);
				if (_la==NotOp) {
					{
					setState(326); match(NotOp);
					}
				}

				setState(329); match(OpenPar);
				setState(330); cond_expr(0);
				setState(331); match(ClosePar);
				}
				break;
			case 2:
				{
				_localctx = new AtomConContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333); condition();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(342);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new AndConContext(new Cond_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond_expr);
						setState(336);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(337); match(AndOp);
						setState(338); cond_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new OrConContext(new Cond_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond_expr);
						setState(339);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(340); match(OrOp);
						setState(341); cond_expr(3);
						}
						break;
					}
					} 
				}
				setState(346);
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
			setState(347); expr(0);
			setState(351);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(348); cond_op();
				setState(349); expr(0);
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
			setState(353); match(IfKey);
			setState(354); match(OpenPar);
			setState(355); cond_expr(0);
			setState(356); match(ClosePar);
			setState(357); match(OpenBrace);
			setState(358); code_block();
			setState(359); match(CloseBrace);
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
			setState(361); match(ElseKey);
			setState(362); match(OpenBrace);
			setState(363); code_block();
			setState(364); match(CloseBrace);
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
			setState(366); match(ElseIfKey);
			setState(367); match(OpenPar);
			setState(368); cond_expr(0);
			setState(369); match(ClosePar);
			setState(370); match(OpenBrace);
			setState(371); code_block();
			setState(372); match(CloseBrace);
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
			setState(385);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374); if_cond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375); if_cond();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIfKey) {
					{
					{
					setState(376); elseif_cond();
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				_la = _input.LA(1);
				if (_la==ElseKey) {
					{
					setState(382); else_cond();
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

	public static class For_paramContext extends ParserRuleContext {
		public List<TerminalNode> CondSep() { return getTokens(GrammarParser.CondSep); }
		public TerminalNode Num() { return getToken(GrammarParser.Num, 0); }
		public TerminalNode IntKey() { return getToken(GrammarParser.IntKey, 0); }
		public TerminalNode AssignOp() { return getToken(GrammarParser.AssignOp, 0); }
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public TerminalNode CondSep(int i) {
			return getToken(GrammarParser.CondSep, i);
		}
		public For_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFor_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFor_param(this);
		}
	}

	public final For_paramContext for_param() throws RecognitionException {
		For_paramContext _localctx = new For_paramContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_for_param);
		try {
			setState(404);
			switch (_input.LA(1)) {
			case IntKey:
				enterOuterAlt(_localctx, 1);
				{
				setState(387); match(IntKey);
				setState(388); match(Var);
				setState(389); match(AssignOp);
				setState(390); match(Num);
				setState(391); match(CondSep);
				setState(392); cond_expr(0);
				setState(393); match(CondSep);
				setState(394); inc_dec();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(396); match(Var);
				setState(397); match(AssignOp);
				setState(398); match(Num);
				setState(399); match(CondSep);
				setState(400); cond_expr(0);
				setState(401); match(CondSep);
				setState(402); inc_dec();
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(GrammarParser.OpenBrace, 0); }
		public For_paramContext for_param() {
			return getRuleContext(For_paramContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
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
		enterRule(_localctx, 64, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); match(ForKey);
			setState(407); match(OpenPar);
			setState(408); for_param();
			setState(409); match(ClosePar);
			setState(410); match(OpenBrace);
			setState(411); code_block();
			setState(412); match(CloseBrace);
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
		enterRule(_localctx, 66, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); match(WhileKey);
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
		enterRule(_localctx, 68, RULE_dowhile_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); match(DoWhileKey);
			setState(423); match(OpenBrace);
			setState(424); code_block();
			setState(425); match(CloseBrace);
			setState(426); match(WhileKey);
			setState(427); match(OpenPar);
			setState(428); cond_expr(0);
			setState(429); match(ClosePar);
			setState(430); match(Terminator);
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
		enterRule(_localctx, 70, RULE_param_dec);
		try {
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432); datatype();
				setState(433); match(Var);
				setState(434); match(Separator);
				setState(435); param_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437); datatype();
				setState(438); array_index();
				setState(439); match(Separator);
				setState(440); param_dec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442); array_datatype();
				setState(443); match(Var);
				setState(444); match(Separator);
				setState(445); param_dec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(447); datatype();
				setState(448); match(Var);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(450); datatype();
				setState(451); array_index();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(453); array_datatype();
				setState(454); match(Var);
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
		enterRule(_localctx, 72, RULE_param_call);
		try {
			setState(472);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458); match(Var);
				setState(459); match(Separator);
				setState(460); param_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461); array_index();
				setState(462); match(Separator);
				setState(463); param_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465); literal();
				setState(466); match(Separator);
				setState(467); param_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(469); array_index();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(470); literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(471); match(Var);
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
		enterRule(_localctx, 74, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474); match(Func);
			setState(475); match(OpenPar);
			setState(476); param_call();
			setState(477); match(ClosePar);
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
		enterRule(_localctx, 76, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); match(PrintKey);
			setState(480); match(OpenPar);
			setState(481); expr(0);
			setState(482); match(ClosePar);
			setState(483); match(Terminator);
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
		enterRule(_localctx, 78, RULE_scan_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
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
		enterRule(_localctx, 80, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487); match(ScanKey);
			setState(488); match(OpenPar);
			setState(489); scan_lit();
			setState(490); match(ClosePar);
			setState(491); match(Terminator);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u01f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\5\2"+
		"V\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4f\n\4"+
		"\3\5\3\5\5\5j\n\5\3\6\3\6\3\6\3\6\5\6p\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\5\7{\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b"+
		"\u0089\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u009e\n\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5\f\u00a7"+
		"\n\f\3\r\5\r\u00aa\n\r\3\r\3\r\3\r\5\r\u00af\n\r\3\r\3\r\3\r\5\r\u00b4"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00c6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ce"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00ec\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00fa\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010c\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0116\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0132\n\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u013a\n\30\f\30\16\30\u013d\13\30\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0144\n\31\3\32\3\32\3\33\3\33\5\33\u014a\n\33\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u0151\n\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0159\n\33\f\33"+
		"\16\33\u015c\13\33\3\34\3\34\3\34\3\34\5\34\u0162\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u017c\n \f \16 \u017f\13 \3 \5 \u0182"+
		"\n \5 \u0184\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!"+
		"\u0197\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01cb\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\5&\u01db\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)"+
		"\3*\3*\3*\3*\3*\3*\3*\2\4.\64+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\t\3\2\6\n\3\2!\"\3\2)*\3\2%\'\3"+
		"\2#$\3\2.\63\3\2\f\17\u0204\2U\3\2\2\2\4Y\3\2\2\2\6e\3\2\2\2\bi\3\2\2"+
		"\2\nk\3\2\2\2\fv\3\2\2\2\16\u0088\3\2\2\2\20\u009d\3\2\2\2\22\u009f\3"+
		"\2\2\2\24\u00a1\3\2\2\2\26\u00a6\3\2\2\2\30\u00b3\3\2\2\2\32\u00c5\3\2"+
		"\2\2\34\u00cd\3\2\2\2\36\u00eb\3\2\2\2 \u00f9\3\2\2\2\"\u010b\3\2\2\2"+
		"$\u0115\3\2\2\2&\u0117\3\2\2\2(\u011c\3\2\2\2*\u0121\3\2\2\2,\u0126\3"+
		"\2\2\2.\u0131\3\2\2\2\60\u0143\3\2\2\2\62\u0145\3\2\2\2\64\u0150\3\2\2"+
		"\2\66\u015d\3\2\2\28\u0163\3\2\2\2:\u016b\3\2\2\2<\u0170\3\2\2\2>\u0183"+
		"\3\2\2\2@\u0196\3\2\2\2B\u0198\3\2\2\2D\u01a0\3\2\2\2F\u01a8\3\2\2\2H"+
		"\u01ca\3\2\2\2J\u01da\3\2\2\2L\u01dc\3\2\2\2N\u01e1\3\2\2\2P\u01e7\3\2"+
		"\2\2R\u01e9\3\2\2\2TV\5\6\4\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\5\4\3\2"+
		"X\3\3\2\2\2YZ\7\5\2\2Z[\7\4\2\2[\\\7\33\2\2\\]\7\34\2\2]^\7\37\2\2^_\5"+
		"\16\b\2_`\7 \2\2`\5\3\2\2\2ab\5\b\5\2bc\5\6\4\2cf\3\2\2\2df\5\b\5\2ea"+
		"\3\2\2\2ed\3\2\2\2f\7\3\2\2\2gj\5\n\6\2hj\5\f\7\2ig\3\2\2\2ih\3\2\2\2"+
		"j\t\3\2\2\2kl\7\5\2\2lm\7:\2\2mo\7\33\2\2np\5H%\2on\3\2\2\2op\3\2\2\2"+
		"pq\3\2\2\2qr\7\34\2\2rs\7\37\2\2st\5\16\b\2tu\7 \2\2u\13\3\2\2\2vw\5\22"+
		"\n\2wx\7:\2\2xz\7\33\2\2y{\5H%\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\34"+
		"\2\2}~\7\37\2\2~\177\5\16\b\2\177\u0080\7,\2\2\u0080\u0081\5.\30\2\u0081"+
		"\u0082\7\24\2\2\u0082\u0083\7 \2\2\u0083\r\3\2\2\2\u0084\u0085\5\20\t"+
		"\2\u0085\u0086\5\16\b\2\u0086\u0089\3\2\2\2\u0087\u0089\5\20\t\2\u0088"+
		"\u0084\3\2\2\2\u0088\u0087\3\2\2\2\u0089\17\3\2\2\2\u008a\u009e\5\32\16"+
		"\2\u008b\u009e\5\36\20\2\u008c\u009e\5&\24\2\u008d\u009e\5*\26\2\u008e"+
		"\u008f\5,\27\2\u008f\u0090\7\24\2\2\u0090\u009e\3\2\2\2\u0091\u0092\5"+
		".\30\2\u0092\u0093\7\24\2\2\u0093\u009e\3\2\2\2\u0094\u009e\5> \2\u0095"+
		"\u009e\5B\"\2\u0096\u009e\5D#\2\u0097\u009e\5F$\2\u0098\u0099\5L\'\2\u0099"+
		"\u009a\7\24\2\2\u009a\u009e\3\2\2\2\u009b\u009e\5N(\2\u009c\u009e\5R*"+
		"\2\u009d\u008a\3\2\2\2\u009d\u008b\3\2\2\2\u009d\u008c\3\2\2\2\u009d\u008d"+
		"\3\2\2\2\u009d\u008e\3\2\2\2\u009d\u0091\3\2\2\2\u009d\u0094\3\2\2\2\u009d"+
		"\u0095\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0098\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\21\3\2\2\2\u009f\u00a0"+
		"\t\2\2\2\u00a0\23\3\2\2\2\u00a1\u00a2\5\22\n\2\u00a2\u00a3\7\13\2\2\u00a3"+
		"\25\3\2\2\2\u00a4\u00a7\7\20\2\2\u00a5\u00a7\7\21\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00aa\7$\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b4\7\f\2\2\u00ac"+
		"\u00b4\5\26\f\2\u00ad\u00af\7$\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b4\7\r\2\2\u00b1\u00b4\7\16\2\2\u00b2"+
		"\u00b4\7\17\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00ae\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\31\3\2\2\2\u00b5"+
		"\u00b6\5\22\n\2\u00b6\u00b7\7<\2\2\u00b7\u00b8\7\24\2\2\u00b8\u00c6\3"+
		"\2\2\2\u00b9\u00ba\5\24\13\2\u00ba\u00bb\7<\2\2\u00bb\u00bc\7\24\2\2\u00bc"+
		"\u00c6\3\2\2\2\u00bd\u00be\5\24\13\2\u00be\u00bf\7<\2\2\u00bf\u00c0\5"+
		"\34\17\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2\5\22\n\2\u00c2\u00c3\7<\2\2\u00c3"+
		"\u00c4\5\34\17\2\u00c4\u00c6\3\2\2\2\u00c5\u00b5\3\2\2\2\u00c5\u00b9\3"+
		"\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\33\3\2\2\2\u00c7"+
		"\u00c8\78\2\2\u00c8\u00c9\7<\2\2\u00c9\u00ce\5\34\17\2\u00ca\u00cb\78"+
		"\2\2\u00cb\u00cc\7<\2\2\u00cc\u00ce\7\24\2\2\u00cd\u00c7\3\2\2\2\u00cd"+
		"\u00ca\3\2\2\2\u00ce\35\3\2\2\2\u00cf\u00d0\5\22\n\2\u00d0\u00d1\7<\2"+
		"\2\u00d1\u00d2\7\64\2\2\u00d2\u00d3\5.\30\2\u00d3\u00d4\7\24\2\2\u00d4"+
		"\u00ec\3\2\2\2\u00d5\u00d6\5\22\n\2\u00d6\u00d7\7<\2\2\u00d7\u00d8\7\64"+
		"\2\2\u00d8\u00d9\5.\30\2\u00d9\u00da\5 \21\2\u00da\u00ec\3\2\2\2\u00db"+
		"\u00dc\5\24\13\2\u00dc\u00dd\7<\2\2\u00dd\u00de\7\64\2\2\u00de\u00df\7"+
		"+\2\2\u00df\u00e0\7\13\2\2\u00e0\u00e1\5.\30\2\u00e1\u00e2\7\24\2\2\u00e2"+
		"\u00ec\3\2\2\2\u00e3\u00e4\5\24\13\2\u00e4\u00e5\7<\2\2\u00e5\u00e6\7"+
		"\64\2\2\u00e6\u00e7\7+\2\2\u00e7\u00e8\7\13\2\2\u00e8\u00e9\5.\30\2\u00e9"+
		"\u00ea\5\"\22\2\u00ea\u00ec\3\2\2\2\u00eb\u00cf\3\2\2\2\u00eb\u00d5\3"+
		"\2\2\2\u00eb\u00db\3\2\2\2\u00eb\u00e3\3\2\2\2\u00ec\37\3\2\2\2\u00ed"+
		"\u00ee\78\2\2\u00ee\u00ef\7<\2\2\u00ef\u00f0\7\64\2\2\u00f0\u00f1\5.\30"+
		"\2\u00f1\u00f2\5 \21\2\u00f2\u00fa\3\2\2\2\u00f3\u00f4\78\2\2\u00f4\u00f5"+
		"\7<\2\2\u00f5\u00f6\7\64\2\2\u00f6\u00f7\5.\30\2\u00f7\u00f8\7\24\2\2"+
		"\u00f8\u00fa\3\2\2\2\u00f9\u00ed\3\2\2\2\u00f9\u00f3\3\2\2\2\u00fa!\3"+
		"\2\2\2\u00fb\u00fc\78\2\2\u00fc\u00fd\7<\2\2\u00fd\u00fe\7\64\2\2\u00fe"+
		"\u00ff\7+\2\2\u00ff\u0100\7\13\2\2\u0100\u0101\5.\30\2\u0101\u0102\5\""+
		"\22\2\u0102\u010c\3\2\2\2\u0103\u0104\78\2\2\u0104\u0105\7<\2\2\u0105"+
		"\u0106\7\64\2\2\u0106\u0107\7+\2\2\u0107\u0108\7\13\2\2\u0108\u0109\5"+
		".\30\2\u0109\u010a\7\24\2\2\u010a\u010c\3\2\2\2\u010b\u00fb\3\2\2\2\u010b"+
		"\u0103\3\2\2\2\u010c#\3\2\2\2\u010d\u010e\7<\2\2\u010e\u010f\7\13\2\2"+
		"\u010f\u0116\7\f\2\2\u0110\u0111\7\33\2\2\u0111\u0112\7<\2\2\u0112\u0113"+
		"\7\13\2\2\u0113\u0114\7\f\2\2\u0114\u0116\7\34\2\2\u0115\u010d\3\2\2\2"+
		"\u0115\u0110\3\2\2\2\u0116%\3\2\2\2\u0117\u0118\7<\2\2\u0118\u0119\7\64"+
		"\2\2\u0119\u011a\5.\30\2\u011a\u011b\7\24\2\2\u011b\'\3\2\2\2\u011c\u011d"+
		"\5$\23\2\u011d\u011e\7\64\2\2\u011e\u011f\5.\30\2\u011f\u0120\7\24\2\2"+
		"\u0120)\3\2\2\2\u0121\u0122\7<\2\2\u0122\u0123\t\3\2\2\u0123\u0124\5."+
		"\30\2\u0124\u0125\7\24\2\2\u0125+\3\2\2\2\u0126\u0127\7<\2\2\u0127\u0128"+
		"\t\4\2\2\u0128-\3\2\2\2\u0129\u012a\b\30\1\2\u012a\u012b\7\3\2\2\u012b"+
		"\u0132\5.\30\7\u012c\u012d\7\33\2\2\u012d\u012e\5.\30\2\u012e\u012f\7"+
		"\34\2\2\u012f\u0132\3\2\2\2\u0130\u0132\5\60\31\2\u0131\u0129\3\2\2\2"+
		"\u0131\u012c\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u013b\3\2\2\2\u0133\u0134"+
		"\f\5\2\2\u0134\u0135\t\5\2\2\u0135\u013a\5.\30\6\u0136\u0137\f\4\2\2\u0137"+
		"\u0138\t\6\2\2\u0138\u013a\5.\30\5\u0139\u0133\3\2\2\2\u0139\u0136\3\2"+
		"\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"/\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0144\5\30\r\2\u013f\u0144\7<\2\2"+
		"\u0140\u0144\5$\23\2\u0141\u0144\5L\'\2\u0142\u0144\5,\27\2\u0143\u013e"+
		"\3\2\2\2\u0143\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0142\3\2\2\2\u0144\61\3\2\2\2\u0145\u0146\t\7\2\2\u0146\63\3\2\2\2\u0147"+
		"\u0149\b\33\1\2\u0148\u014a\7\65\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3"+
		"\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7\33\2\2\u014c\u014d\5\64\33\2"+
		"\u014d\u014e\7\34\2\2\u014e\u0151\3\2\2\2\u014f\u0151\5\66\34\2\u0150"+
		"\u0147\3\2\2\2\u0150\u014f\3\2\2\2\u0151\u015a\3\2\2\2\u0152\u0153\f\5"+
		"\2\2\u0153\u0154\7\66\2\2\u0154\u0159\5\64\33\6\u0155\u0156\f\4\2\2\u0156"+
		"\u0157\7\67\2\2\u0157\u0159\5\64\33\5\u0158\u0152\3\2\2\2\u0158\u0155"+
		"\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\65\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0161\5.\30\2\u015e\u015f\5\62\32"+
		"\2\u015f\u0160\5.\30\2\u0160\u0162\3\2\2\2\u0161\u015e\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\67\3\2\2\2\u0163\u0164\7\26\2\2\u0164\u0165\7\33\2\2\u0165"+
		"\u0166\5\64\33\2\u0166\u0167\7\34\2\2\u0167\u0168\7\37\2\2\u0168\u0169"+
		"\5\16\b\2\u0169\u016a\7 \2\2\u016a9\3\2\2\2\u016b\u016c\7\27\2\2\u016c"+
		"\u016d\7\37\2\2\u016d\u016e\5\16\b\2\u016e\u016f\7 \2\2\u016f;\3\2\2\2"+
		"\u0170\u0171\7\25\2\2\u0171\u0172\7\33\2\2\u0172\u0173\5\64\33\2\u0173"+
		"\u0174\7\34\2\2\u0174\u0175\7\37\2\2\u0175\u0176\5\16\b\2\u0176\u0177"+
		"\7 \2\2\u0177=\3\2\2\2\u0178\u0184\58\35\2\u0179\u017d\58\35\2\u017a\u017c"+
		"\5<\37\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\5:"+
		"\36\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0178\3\2\2\2\u0183\u0179\3\2\2\2\u0184?\3\2\2\2\u0185\u0186\7\6\2\2"+
		"\u0186\u0187\7<\2\2\u0187\u0188\7\64\2\2\u0188\u0189\7\f\2\2\u0189\u018a"+
		"\79\2\2\u018a\u018b\5\64\33\2\u018b\u018c\79\2\2\u018c\u018d\5,\27\2\u018d"+
		"\u0197\3\2\2\2\u018e\u018f\7<\2\2\u018f\u0190\7\64\2\2\u0190\u0191\7\f"+
		"\2\2\u0191\u0192\79\2\2\u0192\u0193\5\64\33\2\u0193\u0194\79\2\2\u0194"+
		"\u0195\5,\27\2\u0195\u0197\3\2\2\2\u0196\u0185\3\2\2\2\u0196\u018e\3\2"+
		"\2\2\u0197A\3\2\2\2\u0198\u0199\7\30\2\2\u0199\u019a\7\33\2\2\u019a\u019b"+
		"\5@!\2\u019b\u019c\7\34\2\2\u019c\u019d\7\37\2\2\u019d\u019e\5\16\b\2"+
		"\u019e\u019f\7 \2\2\u019fC\3\2\2\2\u01a0\u01a1\7\31\2\2\u01a1\u01a2\7"+
		"\33\2\2\u01a2\u01a3\5\64\33\2\u01a3\u01a4\7\34\2\2\u01a4\u01a5\7\37\2"+
		"\2\u01a5\u01a6\5\16\b\2\u01a6\u01a7\7 \2\2\u01a7E\3\2\2\2\u01a8\u01a9"+
		"\7\32\2\2\u01a9\u01aa\7\37\2\2\u01aa\u01ab\5\16\b\2\u01ab\u01ac\7 \2\2"+
		"\u01ac\u01ad\7\31\2\2\u01ad\u01ae\7\33\2\2\u01ae\u01af\5\64\33\2\u01af"+
		"\u01b0\7\34\2\2\u01b0\u01b1\7\24\2\2\u01b1G\3\2\2\2\u01b2\u01b3\5\22\n"+
		"\2\u01b3\u01b4\7<\2\2\u01b4\u01b5\78\2\2\u01b5\u01b6\5H%\2\u01b6\u01cb"+
		"\3\2\2\2\u01b7\u01b8\5\22\n\2\u01b8\u01b9\5$\23\2\u01b9\u01ba\78\2\2\u01ba"+
		"\u01bb\5H%\2\u01bb\u01cb\3\2\2\2\u01bc\u01bd\5\24\13\2\u01bd\u01be\7<"+
		"\2\2\u01be\u01bf\78\2\2\u01bf\u01c0\5H%\2\u01c0\u01cb\3\2\2\2\u01c1\u01c2"+
		"\5\22\n\2\u01c2\u01c3\7<\2\2\u01c3\u01cb\3\2\2\2\u01c4\u01c5\5\22\n\2"+
		"\u01c5\u01c6\5$\23\2\u01c6\u01cb\3\2\2\2\u01c7\u01c8\5\24\13\2\u01c8\u01c9"+
		"\7<\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01b2\3\2\2\2\u01ca\u01b7\3\2\2\2\u01ca"+
		"\u01bc\3\2\2\2\u01ca\u01c1\3\2\2\2\u01ca\u01c4\3\2\2\2\u01ca\u01c7\3\2"+
		"\2\2\u01cbI\3\2\2\2\u01cc\u01cd\7<\2\2\u01cd\u01ce\78\2\2\u01ce\u01db"+
		"\5J&\2\u01cf\u01d0\5$\23\2\u01d0\u01d1\78\2\2\u01d1\u01d2\5J&\2\u01d2"+
		"\u01db\3\2\2\2\u01d3\u01d4\5\30\r\2\u01d4\u01d5\78\2\2\u01d5\u01d6\5J"+
		"&\2\u01d6\u01db\3\2\2\2\u01d7\u01db\5$\23\2\u01d8\u01db\5\30\r\2\u01d9"+
		"\u01db\7<\2\2\u01da\u01cc\3\2\2\2\u01da\u01cf\3\2\2\2\u01da\u01d3\3\2"+
		"\2\2\u01da\u01d7\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db"+
		"K\3\2\2\2\u01dc\u01dd\7:\2\2\u01dd\u01de\7\33\2\2\u01de\u01df\5J&\2\u01df"+
		"\u01e0\7\34\2\2\u01e0M\3\2\2\2\u01e1\u01e2\7\22\2\2\u01e2\u01e3\7\33\2"+
		"\2\u01e3\u01e4\5.\30\2\u01e4\u01e5\7\34\2\2\u01e5\u01e6\7\24\2\2\u01e6"+
		"O\3\2\2\2\u01e7\u01e8\t\b\2\2\u01e8Q\3\2\2\2\u01e9\u01ea\7\23\2\2\u01ea"+
		"\u01eb\7\33\2\2\u01eb\u01ec\5P)\2\u01ec\u01ed\7\34\2\2\u01ed\u01ee\7\24"+
		"\2\2\u01eeS\3\2\2\2\"Ueioz\u0088\u009d\u00a6\u00a9\u00ae\u00b3\u00c5\u00cd"+
		"\u00eb\u00f9\u010b\u0115\u0131\u0139\u013b\u0143\u0149\u0150\u0158\u015a"+
		"\u0161\u017d\u0181\u0183\u0196\u01ca\u01da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}