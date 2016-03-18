package model;
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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, Num=8, AddOp=9, 
		SubOp=10, MultOp=11, DivOp=12, ModOp=13, ExpOp=14, AssignOp=15, AddAssignOp=16, 
		SubAssignOp=17, IncOp=18, DecOp=19, LessOp=20, LessEqualOp=21, GreaterOp=22, 
		GreaterEqualOp=23, EqualOp=24, NotEqualOp=25, AndOp=26, OrOp=27, NotOp=28, 
		OpenPar=29, ClosePar=30, OpenBracket=31, CloseBracket=32, Separator=33, 
		Terminator=34, OpenBrace=35, CloseBrace=36, CommentBlock=37, VoidKey=38, 
		MainKey=39, IntKey=40, FloatKey=41, StringKey=42, CharKey=43, BooleanKey=44, 
		ArrayKey=45, PrintfKey=46, ScanfKey=47, IfKey=48, ElseKey=49, ElseIfKey=50, 
		ForKey=51, WhileKey=52, DoWhileKey=53, ReturnKey=54, NullKey=55, Var=56, 
		Func=57, Char=58, String=59, WS=60;
	public static final String[] tokenNames = {
		"<INVALID>", "'`'", "'nocturnal'", "'new'", "'diurnal'", "'-'", "'~'", 
		"'.'", "Num", "'arf'", "'sss'", "'meow'", "'dook'", "'mooodulo'", "'powpow'", 
		"'='", "'arfthis'", "'sssthis'", "'mate'", "'prey'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'('", "')'", "'['", "']'", 
		"','", "'<3'", "'e-worm'", "'f-worm'", "'#'", "'neuter'", "'zoo'", "'sheep'", 
		"'otter'", "'snake'", "'worm'", "'boo'", "'spider'", "'purr'", "'rawr'", 
		"'dog'", "'cat'", "'catdog'", "'foodchain'", "'run'", "'move'", "'back'", 
		"'extinct'", "Var", "Func", "Char", "String", "WS"
	};
	public static final int
		RULE_s = 0, RULE_code_block = 1, RULE_statement = 2, RULE_datatype = 3, 
		RULE_array_datatype = 4, RULE_boolean_lit = 5, RULE_float_lit = 6, RULE_char_lit = 7, 
		RULE_string_lit = 8, RULE_literal = 9, RULE_var_dec = 10, RULE_next_var = 11, 
		RULE_var_init = 12, RULE_next_var_i = 13, RULE_next_arr_i = 14, RULE_var_assign = 15, 
		RULE_addsub_assign = 16, RULE_inc_dec = 17, RULE_expr = 18, RULE_cond_op = 19, 
		RULE_not = 20, RULE_gates = 21, RULE_cond_expr = 22, RULE_next_cond_expr = 23, 
		RULE_cond = 24, RULE_next_cond = 25, RULE_next_cond2 = 26, RULE_condition = 27, 
		RULE_condition2 = 28, RULE_for_loop = 29, RULE_while_loop = 30, RULE_dowhile_loop = 31, 
		RULE_param = 32, RULE_next_param = 33, RULE_func_dec = 34, RULE_func_call = 35;
	public static final String[] ruleNames = {
		"s", "code_block", "statement", "datatype", "array_datatype", "boolean_lit", 
		"float_lit", "char_lit", "string_lit", "literal", "var_dec", "next_var", 
		"var_init", "next_var_i", "next_arr_i", "var_assign", "addsub_assign", 
		"inc_dec", "expr", "cond_op", "not", "gates", "cond_expr", "next_cond_expr", 
		"cond", "next_cond", "next_cond2", "condition", "condition2", "for_loop", 
		"while_loop", "dowhile_loop", "param", "next_param", "func_dec", "func_call"
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
	public static class SContext extends ParserRuleContext {
		public TerminalNode MainKey() { return getToken(GrammarParser.MainKey, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode VoidKey() { return getToken(GrammarParser.VoidKey, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(VoidKey);
			setState(73); match(MainKey);
			setState(74); match(OpenPar);
			setState(75); match(ClosePar);
			setState(76); code_block();
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
		public TerminalNode CloseBrace() { return getToken(GrammarParser.CloseBrace, 0); }
		public TerminalNode OpenBrace() { return getToken(GrammarParser.OpenBrace, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 2, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(OpenBrace);
			setState(79); statement();
			setState(80); match(CloseBrace);
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
		public Var_initContext var_init() {
			return getRuleContext(Var_initContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Addsub_assignContext addsub_assign() {
			return getRuleContext(Addsub_assignContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dowhile_loopContext dowhile_loop() {
			return getRuleContext(Dowhile_loopContext.class,0);
		}
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); var_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); var_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84); var_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85); addsub_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86); inc_dec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87); expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88); condition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89); for_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(90); while_loop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(91); dowhile_loop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(92); func_call();
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
		public TerminalNode CharKey() { return getToken(GrammarParser.CharKey, 0); }
		public TerminalNode BooleanKey() { return getToken(GrammarParser.BooleanKey, 0); }
		public TerminalNode IntKey() { return getToken(GrammarParser.IntKey, 0); }
		public TerminalNode FloatKey() { return getToken(GrammarParser.FloatKey, 0); }
		public TerminalNode StringKey() { return getToken(GrammarParser.StringKey, 0); }
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
		enterRule(_localctx, 6, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		enterRule(_localctx, 8, RULE_array_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); datatype();
			setState(98); match(ArrayKey);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolean_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolean_lit(this);
		}
	}

	public final Boolean_litContext boolean_lit() throws RecognitionException {
		Boolean_litContext _localctx = new Boolean_litContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_boolean_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__3) ) {
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

	public static class Float_litContext extends ParserRuleContext {
		public TerminalNode Num(int i) {
			return getToken(GrammarParser.Num, i);
		}
		public List<TerminalNode> Num() { return getTokens(GrammarParser.Num); }
		public Float_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFloat_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFloat_lit(this);
		}
	}

	public final Float_litContext float_lit() throws RecognitionException {
		Float_litContext _localctx = new Float_litContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_float_lit);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case Num:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(102); match(Num);
				setState(103); match(T__0);
				setState(104); match(Num);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(105); match(T__0);
				setState(106); match(Num);
				}
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

	public static class Char_litContext extends ParserRuleContext {
		public TerminalNode Char() { return getToken(GrammarParser.Char, 0); }
		public Char_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChar_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChar_lit(this);
		}
	}

	public final Char_litContext char_lit() throws RecognitionException {
		Char_litContext _localctx = new Char_litContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_char_lit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(T__6);
			setState(110); match(Char);
			setState(111); match(T__6);
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

	public static class String_litContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(GrammarParser.String, 0); }
		public String_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterString_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitString_lit(this);
		}
	}

	public final String_litContext string_lit() throws RecognitionException {
		String_litContext _localctx = new String_litContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string_lit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(T__1);
			setState(114); match(String);
			setState(115); match(T__1);
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
		public Boolean_litContext boolean_lit() {
			return getRuleContext(Boolean_litContext.class,0);
		}
		public Char_litContext char_lit() {
			return getRuleContext(Char_litContext.class,0);
		}
		public TerminalNode Num() { return getToken(GrammarParser.Num, 0); }
		public Float_litContext float_lit() {
			return getRuleContext(Float_litContext.class,0);
		}
		public String_litContext string_lit() {
			return getRuleContext(String_litContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		try {
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); match(Num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); boolean_lit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119); float_lit();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120); char_lit();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(121); string_lit();
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
		public Array_datatypeContext array_datatype() {
			return getRuleContext(Array_datatypeContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Next_varContext next_var() {
			return getRuleContext(Next_varContext.class,0);
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
		enterRule(_localctx, 20, RULE_var_dec);
		try {
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); datatype();
				setState(125); match(Var);
				setState(126); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); array_datatype();
				setState(129); match(Var);
				setState(130); next_var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132); datatype();
				setState(133); match(Var);
				setState(134); next_var();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136); array_datatype();
				setState(137); match(Var);
				setState(138); match(Terminator);
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
		enterRule(_localctx, 22, RULE_next_var);
		try {
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142); match(Separator);
				setState(143); match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); match(Separator);
				setState(145); match(Var);
				setState(146); match(Terminator);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_datatypeContext array_datatype() {
			return getRuleContext(Array_datatypeContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ArrayKey() { return getToken(GrammarParser.ArrayKey, 0); }
		public TerminalNode Num() { return getToken(GrammarParser.Num, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public Next_var_iContext next_var_i() {
			return getRuleContext(Next_var_iContext.class,0);
		}
		public TerminalNode AssignOp() { return getToken(GrammarParser.AssignOp, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Next_arr_iContext next_arr_i() {
			return getRuleContext(Next_arr_iContext.class,0);
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
		enterRule(_localctx, 24, RULE_var_init);
		try {
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149); datatype();
				setState(150); match(Var);
				setState(151); match(AssignOp);
				setState(154);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(152); literal();
					}
					break;
				case 2:
					{
					setState(153); expr(0);
					}
					break;
				}
				setState(156); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); datatype();
				setState(159); match(Var);
				setState(160); match(AssignOp);
				setState(163);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(161); literal();
					}
					break;
				case 2:
					{
					setState(162); expr(0);
					}
					break;
				}
				setState(165); next_var_i();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167); array_datatype();
				setState(168); match(Var);
				setState(169); match(AssignOp);
				setState(170); match(T__4);
				setState(171); match(ArrayKey);
				setState(174);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(172); match(Num);
					}
					break;
				case 2:
					{
					setState(173); expr(0);
					}
					break;
				}
				setState(176); match(Terminator);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178); array_datatype();
				setState(179); match(Var);
				setState(180); match(AssignOp);
				setState(181); match(T__4);
				setState(182); match(ArrayKey);
				setState(185);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(183); match(Num);
					}
					break;
				case 2:
					{
					setState(184); expr(0);
					}
					break;
				}
				setState(187); next_arr_i();
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode AssignOp() { return getToken(GrammarParser.AssignOp, 0); }
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
		enterRule(_localctx, 26, RULE_next_var_i);
		try {
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); match(Separator);
				setState(192); match(Var);
				setState(193); match(AssignOp);
				setState(196);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(194); literal();
					}
					break;
				case 2:
					{
					setState(195); expr(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); match(Separator);
				setState(199); match(Var);
				setState(200); match(AssignOp);
				setState(203);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(201); literal();
					}
					break;
				case 2:
					{
					setState(202); expr(0);
					}
					break;
				}
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

	public static class Next_arr_iContext extends ParserRuleContext {
		public TerminalNode Separator() { return getToken(GrammarParser.Separator, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ArrayKey() { return getToken(GrammarParser.ArrayKey, 0); }
		public TerminalNode Num() { return getToken(GrammarParser.Num, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode AssignOp() { return getToken(GrammarParser.AssignOp, 0); }
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
		enterRule(_localctx, 28, RULE_next_arr_i);
		try {
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(Separator);
				setState(210); match(Var);
				setState(211); match(AssignOp);
				setState(212); match(T__4);
				setState(213); match(ArrayKey);
				setState(216);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(214); match(Num);
					}
					break;
				case 2:
					{
					setState(215); expr(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218); match(Separator);
				setState(219); match(Var);
				setState(220); match(AssignOp);
				setState(221); match(T__4);
				setState(222); match(ArrayKey);
				setState(225);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(223); match(Num);
					}
					break;
				case 2:
					{
					setState(224); expr(0);
					}
					break;
				}
				setState(227); match(Terminator);
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

	public static class Var_assignContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Var(int i) {
			return getToken(GrammarParser.Var, i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode AssignOp() { return getToken(GrammarParser.AssignOp, 0); }
		public List<TerminalNode> Var() { return getTokens(GrammarParser.Var); }
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
		enterRule(_localctx, 30, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(Var);
			setState(231); match(AssignOp);
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(232); literal();
				}
				break;
			case 2:
				{
				setState(233); expr(0);
				}
				break;
			case 3:
				{
				setState(234); match(Var);
				}
				break;
			}
			setState(237); match(Terminator);
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode AddAssignOp() { return getToken(GrammarParser.AddAssignOp, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public List<TerminalNode> Var() { return getTokens(GrammarParser.Var); }
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
		enterRule(_localctx, 32, RULE_addsub_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(Var);
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==AddAssignOp || _la==SubAssignOp) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(241); literal();
				}
				break;
			case 2:
				{
				setState(242); expr(0);
				}
				break;
			case 3:
				{
				setState(243); match(Var);
				}
				break;
			}
			setState(246); match(Terminator);
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
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public TerminalNode IncOp() { return getToken(GrammarParser.IncOp, 0); }
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
		enterRule(_localctx, 34, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(Var);
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==IncOp || _la==DecOp) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(250); match(Terminator);
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
	public static class AddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AddOp() { return getToken(GrammarParser.AddOp, 0); }
		public TerminalNode SubOp() { return getToken(GrammarParser.SubOp, 0); }
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
	public static class NegaUnitContext extends ExprContext {
		public TerminalNode Num() { return getToken(GrammarParser.Num, 0); }
		public NegaUnitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNegaUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNegaUnit(this);
		}
	}
	public static class MultDivModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode DivOp() { return getToken(GrammarParser.DivOp, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MultOp() { return getToken(GrammarParser.MultOp, 0); }
		public TerminalNode ModOp() { return getToken(GrammarParser.ModOp, 0); }
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
	public static class UnitContext extends ExprContext {
		public TerminalNode Num() { return getToken(GrammarParser.Num, 0); }
		public UnitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnit(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new NegaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(253); match(T__2);
				setState(254); expr(6);
				}
				break;
			case 2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255); match(OpenPar);
				setState(256); expr(0);
				setState(257); match(ClosePar);
				}
				break;
			case 3:
				{
				_localctx = new UnitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259); match(Num);
				}
				break;
			case 4:
				{
				_localctx = new NegaUnitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260); match(T__2);
				setState(261); match(Num);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(265);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultOp) | (1L << DivOp) | (1L << ModOp))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(266); expr(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(268);
						_la = _input.LA(1);
						if ( !(_la==AddOp || _la==SubOp) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(269); expr(4);
						}
						break;
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public TerminalNode LessOp() { return getToken(GrammarParser.LessOp, 0); }
		public TerminalNode GreaterEqualOp() { return getToken(GrammarParser.GreaterEqualOp, 0); }
		public TerminalNode LessEqualOp() { return getToken(GrammarParser.LessEqualOp, 0); }
		public TerminalNode EqualOp() { return getToken(GrammarParser.EqualOp, 0); }
		public TerminalNode GreaterOp() { return getToken(GrammarParser.GreaterOp, 0); }
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
		enterRule(_localctx, 38, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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

	public static class NotContext extends ParserRuleContext {
		public TerminalNode NotOp() { return getToken(GrammarParser.NotOp, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(NotOp);
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

	public static class GatesContext extends ParserRuleContext {
		public TerminalNode AndOp() { return getToken(GrammarParser.AndOp, 0); }
		public TerminalNode OrOp() { return getToken(GrammarParser.OrOp, 0); }
		public GatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGates(this);
		}
	}

	public final GatesContext gates() throws RecognitionException {
		GatesContext _localctx = new GatesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_gates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !(_la==AndOp || _la==OrOp) ) {
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
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Var(int i) {
			return getToken(GrammarParser.Var, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public Next_cond_exprContext next_cond_expr() {
			return getRuleContext(Next_cond_exprContext.class,0);
		}
		public List<TerminalNode> Var() { return getTokens(GrammarParser.Var); }
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Cond_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCond_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCond_expr(this);
		}
	}

	public final Cond_exprContext cond_expr() throws RecognitionException {
		Cond_exprContext _localctx = new Cond_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cond_expr);
		try {
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281); not();
				setState(285);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(282); literal();
					}
					break;
				case 2:
					{
					setState(283); expr(0);
					}
					break;
				case 3:
					{
					setState(284); match(Var);
					}
					break;
				}
				setState(287); cond_op();
				setState(291);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(288); literal();
					}
					break;
				case 2:
					{
					setState(289); expr(0);
					}
					break;
				case 3:
					{
					setState(290); match(Var);
					}
					break;
				}
				setState(293); next_cond_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295); not();
				setState(299);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(296); literal();
					}
					break;
				case 2:
					{
					setState(297); expr(0);
					}
					break;
				case 3:
					{
					setState(298); match(Var);
					}
					break;
				}
				setState(301); cond_op();
				setState(305);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(302); literal();
					}
					break;
				case 2:
					{
					setState(303); expr(0);
					}
					break;
				case 3:
					{
					setState(304); match(Var);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(307); literal();
					}
					break;
				case 2:
					{
					setState(308); expr(0);
					}
					break;
				case 3:
					{
					setState(309); match(Var);
					}
					break;
				}
				setState(312); cond_op();
				setState(316);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(313); literal();
					}
					break;
				case 2:
					{
					setState(314); expr(0);
					}
					break;
				case 3:
					{
					setState(315); match(Var);
					}
					break;
				}
				setState(318); next_cond_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(320); literal();
					}
					break;
				case 2:
					{
					setState(321); expr(0);
					}
					break;
				case 3:
					{
					setState(322); match(Var);
					}
					break;
				}
				setState(325); cond_op();
				setState(329);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(326); literal();
					}
					break;
				case 2:
					{
					setState(327); expr(0);
					}
					break;
				case 3:
					{
					setState(328); match(Var);
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

	public static class Next_cond_exprContext extends ParserRuleContext {
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Var(int i) {
			return getToken(GrammarParser.Var, i);
		}
		public GatesContext gates() {
			return getRuleContext(GatesContext.class,0);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public List<TerminalNode> Var() { return getTokens(GrammarParser.Var); }
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Next_cond_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_cond_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNext_cond_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNext_cond_expr(this);
		}
	}

	public final Next_cond_exprContext next_cond_expr() throws RecognitionException {
		Next_cond_exprContext _localctx = new Next_cond_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_next_cond_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); gates();
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(334); literal();
				}
				break;
			case 2:
				{
				setState(335); expr(0);
				}
				break;
			case 3:
				{
				setState(336); match(Var);
				}
				break;
			}
			setState(339); cond_op();
			setState(343);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(340); literal();
				}
				break;
			case 2:
				{
				setState(341); expr(0);
				}
				break;
			case 3:
				{
				setState(342); match(Var);
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

	public static class CondContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public TerminalNode IfKey() { return getToken(GrammarParser.IfKey, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); match(IfKey);
			setState(346); match(OpenPar);
			setState(347); cond_expr();
			setState(348); match(ClosePar);
			setState(349); code_block();
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

	public static class Next_condContext extends ParserRuleContext {
		public TerminalNode ElseKey() { return getToken(GrammarParser.ElseKey, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Next_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNext_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNext_cond(this);
		}
	}

	public final Next_condContext next_cond() throws RecognitionException {
		Next_condContext _localctx = new Next_condContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_next_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351); match(ElseKey);
			setState(352); code_block();
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

	public static class Next_cond2Context extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public TerminalNode ElseIfKey() { return getToken(GrammarParser.ElseIfKey, 0); }
		public Next_cond2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_cond2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNext_cond2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNext_cond2(this);
		}
	}

	public final Next_cond2Context next_cond2() throws RecognitionException {
		Next_cond2Context _localctx = new Next_cond2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_next_cond2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); match(ElseIfKey);
			setState(355); match(OpenPar);
			setState(356); cond_expr();
			setState(357); match(ClosePar);
			setState(358); code_block();
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

	public static class ConditionContext extends ParserRuleContext {
		public Next_condContext next_cond() {
			return getRuleContext(Next_condContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Condition2Context condition2() {
			return getRuleContext(Condition2Context.class,0);
		}
		public Next_cond2Context next_cond2() {
			return getRuleContext(Next_cond2Context.class,0);
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
		enterRule(_localctx, 54, RULE_condition);
		try {
			setState(376);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360); cond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361); cond();
				setState(362); next_cond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364); cond();
				setState(367);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(365); condition2();
					}
					break;
				case 2:
					{
					setState(366); next_cond2();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(369); cond();
				setState(372);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(370); condition2();
					}
					break;
				case 2:
					{
					setState(371); next_cond2();
					}
					break;
				}
				setState(374); next_cond();
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

	public static class Condition2Context extends ParserRuleContext {
		public List<Next_cond2Context> next_cond2() {
			return getRuleContexts(Next_cond2Context.class);
		}
		public Next_cond2Context next_cond2(int i) {
			return getRuleContext(Next_cond2Context.class,i);
		}
		public Condition2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCondition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCondition2(this);
		}
	}

	public final Condition2Context condition2() throws RecognitionException {
		Condition2Context _localctx = new Condition2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_condition2);
		try {
			setState(382);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378); next_cond2();
				setState(379); next_cond2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381); next_cond2();
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
		public TerminalNode ForKey() { return getToken(GrammarParser.ForKey, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
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
		enterRule(_localctx, 58, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); match(ForKey);
			setState(385); match(OpenPar);
			setState(386); cond_expr();
			setState(387); match(ClosePar);
			setState(388); code_block();
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
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public TerminalNode WhileKey() { return getToken(GrammarParser.WhileKey, 0); }
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
		enterRule(_localctx, 60, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390); match(WhileKey);
			setState(391); match(OpenPar);
			setState(392); cond_expr();
			setState(393); match(ClosePar);
			setState(394); code_block();
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
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Cond_exprContext cond_expr() {
			return getRuleContext(Cond_exprContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public TerminalNode WhileKey() { return getToken(GrammarParser.WhileKey, 0); }
		public TerminalNode DoWhileKey() { return getToken(GrammarParser.DoWhileKey, 0); }
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
		enterRule(_localctx, 62, RULE_dowhile_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396); match(DoWhileKey);
			setState(397); code_block();
			setState(398); match(WhileKey);
			setState(399); match(OpenPar);
			setState(400); cond_expr();
			setState(401); match(ClosePar);
			setState(402); match(Terminator);
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

	public static class ParamContext extends ParserRuleContext {
		public Next_paramContext next_param() {
			return getRuleContext(Next_paramContext.class,0);
		}
		public Array_datatypeContext array_datatype() {
			return getRuleContext(Array_datatypeContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_param);
		try {
			setState(418);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404); datatype();
				setState(405); match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407); datatype();
				setState(408); match(Var);
				setState(409); next_param();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411); array_datatype();
				setState(412); match(Var);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(414); array_datatype();
				setState(415); match(Var);
				setState(416); next_param();
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

	public static class Next_paramContext extends ParserRuleContext {
		public TerminalNode Separator() { return getToken(GrammarParser.Separator, 0); }
		public Array_datatypeContext array_datatype() {
			return getRuleContext(Array_datatypeContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public Next_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNext_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNext_param(this);
		}
	}

	public final Next_paramContext next_param() throws RecognitionException {
		Next_paramContext _localctx = new Next_paramContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_next_param);
		try {
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420); match(Separator);
				setState(421); datatype();
				setState(422); match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424); match(Separator);
				setState(425); array_datatype();
				setState(426); match(Var);
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
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public TerminalNode Func() { return getToken(GrammarParser.Func, 0); }
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
		enterRule(_localctx, 68, RULE_func_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); datatype();
			setState(431); match(Func);
			setState(432); match(OpenPar);
			setState(433); param();
			setState(434); match(ClosePar);
			setState(435); code_block();
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
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
		public TerminalNode OpenPar() { return getToken(GrammarParser.OpenPar, 0); }
		public TerminalNode Func() { return getToken(GrammarParser.Func, 0); }
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
		enterRule(_localctx, 70, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(Func);
			setState(438); match(OpenPar);
			setState(439); param();
			setState(440); match(ClosePar);
			setState(441); match(Terminator);
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
		case 18: return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u01be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\5\13}\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0096\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u009d\n\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00a6\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00b1\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00bc\n\16\3\16\3\16\5\16\u00c0\n\16\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00c7\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ce\n\17\3\17\3\17\5\17"+
		"\u00d2\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00db\n\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e4\n\20\3\20\5\20\u00e7\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00ee\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00f7\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0109\n\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0111\n\24\f\24\16\24\u0114\13\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\5\30\u0120\n\30\3\30\3\30\3\30\3\30\5\30\u0126\n"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u012e\n\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0134\n\30\3\30\3\30\3\30\5\30\u0139\n\30\3\30\3\30\3\30\3\30\5"+
		"\30\u013f\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u0146\n\30\3\30\3\30\3\30"+
		"\3\30\5\30\u014c\n\30\5\30\u014e\n\30\3\31\3\31\3\31\3\31\5\31\u0154\n"+
		"\31\3\31\3\31\3\31\3\31\5\31\u015a\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0172\n\35\3\35\3\35\3\35\5\35\u0177\n\35\3\35\3\35\5"+
		"\35\u017b\n\35\3\36\3\36\3\36\3\36\5\36\u0181\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01a5\n\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\5#\u01af\n#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\2\3&&\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2"+
		"\n\3\2*.\4\2\4\4\6\6\3\2\22\23\3\2\24\25\3\2\r\17\3\2\13\f\3\2\26\33\3"+
		"\2\34\35\u01e3\2J\3\2\2\2\4P\3\2\2\2\6_\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2"+
		"\ff\3\2\2\2\16m\3\2\2\2\20o\3\2\2\2\22s\3\2\2\2\24|\3\2\2\2\26\u008e\3"+
		"\2\2\2\30\u0095\3\2\2\2\32\u00bf\3\2\2\2\34\u00d1\3\2\2\2\36\u00e6\3\2"+
		"\2\2 \u00e8\3\2\2\2\"\u00f1\3\2\2\2$\u00fa\3\2\2\2&\u0108\3\2\2\2(\u0115"+
		"\3\2\2\2*\u0117\3\2\2\2,\u0119\3\2\2\2.\u014d\3\2\2\2\60\u014f\3\2\2\2"+
		"\62\u015b\3\2\2\2\64\u0161\3\2\2\2\66\u0164\3\2\2\28\u017a\3\2\2\2:\u0180"+
		"\3\2\2\2<\u0182\3\2\2\2>\u0188\3\2\2\2@\u018e\3\2\2\2B\u01a4\3\2\2\2D"+
		"\u01ae\3\2\2\2F\u01b0\3\2\2\2H\u01b7\3\2\2\2JK\7(\2\2KL\7)\2\2LM\7\37"+
		"\2\2MN\7 \2\2NO\5\4\3\2O\3\3\2\2\2PQ\7%\2\2QR\5\6\4\2RS\7&\2\2S\5\3\2"+
		"\2\2T`\5\26\f\2U`\5\32\16\2V`\5 \21\2W`\5\"\22\2X`\5$\23\2Y`\5&\24\2Z"+
		"`\58\35\2[`\5<\37\2\\`\5> \2]`\5@!\2^`\5H%\2_T\3\2\2\2_U\3\2\2\2_V\3\2"+
		"\2\2_W\3\2\2\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3"+
		"\2\2\2_^\3\2\2\2`\7\3\2\2\2ab\t\2\2\2b\t\3\2\2\2cd\5\b\5\2de\7/\2\2e\13"+
		"\3\2\2\2fg\t\3\2\2g\r\3\2\2\2hi\7\n\2\2ij\7\t\2\2jn\7\n\2\2kl\7\t\2\2"+
		"ln\7\n\2\2mh\3\2\2\2mk\3\2\2\2n\17\3\2\2\2op\7\3\2\2pq\7<\2\2qr\7\3\2"+
		"\2r\21\3\2\2\2st\7\b\2\2tu\7=\2\2uv\7\b\2\2v\23\3\2\2\2w}\7\n\2\2x}\5"+
		"\f\7\2y}\5\16\b\2z}\5\20\t\2{}\5\22\n\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2"+
		"|z\3\2\2\2|{\3\2\2\2}\25\3\2\2\2~\177\5\b\5\2\177\u0080\7:\2\2\u0080\u0081"+
		"\7$\2\2\u0081\u008f\3\2\2\2\u0082\u0083\5\n\6\2\u0083\u0084\7:\2\2\u0084"+
		"\u0085\5\30\r\2\u0085\u008f\3\2\2\2\u0086\u0087\5\b\5\2\u0087\u0088\7"+
		":\2\2\u0088\u0089\5\30\r\2\u0089\u008f\3\2\2\2\u008a\u008b\5\n\6\2\u008b"+
		"\u008c\7:\2\2\u008c\u008d\7$\2\2\u008d\u008f\3\2\2\2\u008e~\3\2\2\2\u008e"+
		"\u0082\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u008a\3\2\2\2\u008f\27\3\2\2"+
		"\2\u0090\u0091\7#\2\2\u0091\u0096\7:\2\2\u0092\u0093\7#\2\2\u0093\u0094"+
		"\7:\2\2\u0094\u0096\7$\2\2\u0095\u0090\3\2\2\2\u0095\u0092\3\2\2\2\u0096"+
		"\31\3\2\2\2\u0097\u0098\5\b\5\2\u0098\u0099\7:\2\2\u0099\u009c\7\21\2"+
		"\2\u009a\u009d\5\24\13\2\u009b\u009d\5&\24\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7$\2\2\u009f\u00c0\3\2"+
		"\2\2\u00a0\u00a1\5\b\5\2\u00a1\u00a2\7:\2\2\u00a2\u00a5\7\21\2\2\u00a3"+
		"\u00a6\5\24\13\2\u00a4\u00a6\5&\24\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\5\34\17\2\u00a8\u00c0\3\2\2\2\u00a9"+
		"\u00aa\5\n\6\2\u00aa\u00ab\7:\2\2\u00ab\u00ac\7\21\2\2\u00ac\u00ad\7\5"+
		"\2\2\u00ad\u00b0\7/\2\2\u00ae\u00b1\7\n\2\2\u00af\u00b1\5&\24\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7$"+
		"\2\2\u00b3\u00c0\3\2\2\2\u00b4\u00b5\5\n\6\2\u00b5\u00b6\7:\2\2\u00b6"+
		"\u00b7\7\21\2\2\u00b7\u00b8\7\5\2\2\u00b8\u00bb\7/\2\2\u00b9\u00bc\7\n"+
		"\2\2\u00ba\u00bc\5&\24\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\5\36\20\2\u00be\u00c0\3\2\2\2\u00bf\u0097\3"+
		"\2\2\2\u00bf\u00a0\3\2\2\2\u00bf\u00a9\3\2\2\2\u00bf\u00b4\3\2\2\2\u00c0"+
		"\33\3\2\2\2\u00c1\u00c2\7#\2\2\u00c2\u00c3\7:\2\2\u00c3\u00c6\7\21\2\2"+
		"\u00c4\u00c7\5\24\13\2\u00c5\u00c7\5&\24\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00d2\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\7:\2\2\u00ca"+
		"\u00cd\7\21\2\2\u00cb\u00ce\5\24\13\2\u00cc\u00ce\5&\24\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7$\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00c1\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d2\35\3\2\2"+
		"\2\u00d3\u00d4\7#\2\2\u00d4\u00d5\7:\2\2\u00d5\u00d6\7\21\2\2\u00d6\u00d7"+
		"\7\5\2\2\u00d7\u00da\7/\2\2\u00d8\u00db\7\n\2\2\u00d9\u00db\5&\24\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00e7\3\2\2\2\u00dc\u00dd\7#"+
		"\2\2\u00dd\u00de\7:\2\2\u00de\u00df\7\21\2\2\u00df\u00e0\7\5\2\2\u00e0"+
		"\u00e3\7/\2\2\u00e1\u00e4\7\n\2\2\u00e2\u00e4\5&\24\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\7$\2\2\u00e6"+
		"\u00d3\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e7\37\3\2\2\2\u00e8\u00e9\7:\2\2"+
		"\u00e9\u00ed\7\21\2\2\u00ea\u00ee\5\24\13\2\u00eb\u00ee\5&\24\2\u00ec"+
		"\u00ee\7:\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7$\2\2\u00f0!\3\2\2\2\u00f1\u00f2"+
		"\7:\2\2\u00f2\u00f6\t\4\2\2\u00f3\u00f7\5\24\13\2\u00f4\u00f7\5&\24\2"+
		"\u00f5\u00f7\7:\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7$\2\2\u00f9#\3\2\2\2\u00fa\u00fb"+
		"\7:\2\2\u00fb\u00fc\t\5\2\2\u00fc\u00fd\7$\2\2\u00fd%\3\2\2\2\u00fe\u00ff"+
		"\b\24\1\2\u00ff\u0100\7\7\2\2\u0100\u0109\5&\24\b\u0101\u0102\7\37\2\2"+
		"\u0102\u0103\5&\24\2\u0103\u0104\7 \2\2\u0104\u0109\3\2\2\2\u0105\u0109"+
		"\7\n\2\2\u0106\u0107\7\7\2\2\u0107\u0109\7\n\2\2\u0108\u00fe\3\2\2\2\u0108"+
		"\u0101\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0112\3\2"+
		"\2\2\u010a\u010b\f\6\2\2\u010b\u010c\t\6\2\2\u010c\u0111\5&\24\7\u010d"+
		"\u010e\f\5\2\2\u010e\u010f\t\7\2\2\u010f\u0111\5&\24\6\u0110\u010a\3\2"+
		"\2\2\u0110\u010d\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\'\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\t\b\2\2"+
		"\u0116)\3\2\2\2\u0117\u0118\7\36\2\2\u0118+\3\2\2\2\u0119\u011a\t\t\2"+
		"\2\u011a-\3\2\2\2\u011b\u011f\5*\26\2\u011c\u0120\5\24\13\2\u011d\u0120"+
		"\5&\24\2\u011e\u0120\7:\2\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125\5(\25\2\u0122\u0126\5\24"+
		"\13\2\u0123\u0126\5&\24\2\u0124\u0126\7:\2\2\u0125\u0122\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\5\60"+
		"\31\2\u0128\u014e\3\2\2\2\u0129\u012d\5*\26\2\u012a\u012e\5\24\13\2\u012b"+
		"\u012e\5&\24\2\u012c\u012e\7:\2\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0133\5(\25\2\u0130"+
		"\u0134\5\24\13\2\u0131\u0134\5&\24\2\u0132\u0134\7:\2\2\u0133\u0130\3"+
		"\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u014e\3\2\2\2\u0135"+
		"\u0139\5\24\13\2\u0136\u0139\5&\24\2\u0137\u0139\7:\2\2\u0138\u0135\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013e\5(\25\2\u013b\u013f\5\24\13\2\u013c\u013f\5&\24\2\u013d\u013f\7"+
		":\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\5\60\31\2\u0141\u014e\3\2\2\2\u0142\u0146\5"+
		"\24\13\2\u0143\u0146\5&\24\2\u0144\u0146\7:\2\2\u0145\u0142\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014b\5("+
		"\25\2\u0148\u014c\5\24\13\2\u0149\u014c\5&\24\2\u014a\u014c\7:\2\2\u014b"+
		"\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\u014e\3\2"+
		"\2\2\u014d\u011b\3\2\2\2\u014d\u0129\3\2\2\2\u014d\u0138\3\2\2\2\u014d"+
		"\u0145\3\2\2\2\u014e/\3\2\2\2\u014f\u0153\5,\27\2\u0150\u0154\5\24\13"+
		"\2\u0151\u0154\5&\24\2\u0152\u0154\7:\2\2\u0153\u0150\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0159\5(\25\2\u0156"+
		"\u015a\5\24\13\2\u0157\u015a\5&\24\2\u0158\u015a\7:\2\2\u0159\u0156\3"+
		"\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\61\3\2\2\2\u015b"+
		"\u015c\7\62\2\2\u015c\u015d\7\37\2\2\u015d\u015e\5.\30\2\u015e\u015f\7"+
		" \2\2\u015f\u0160\5\4\3\2\u0160\63\3\2\2\2\u0161\u0162\7\63\2\2\u0162"+
		"\u0163\5\4\3\2\u0163\65\3\2\2\2\u0164\u0165\7\64\2\2\u0165\u0166\7\37"+
		"\2\2\u0166\u0167\5.\30\2\u0167\u0168\7 \2\2\u0168\u0169\5\4\3\2\u0169"+
		"\67\3\2\2\2\u016a\u017b\5\62\32\2\u016b\u016c\5\62\32\2\u016c\u016d\5"+
		"\64\33\2\u016d\u017b\3\2\2\2\u016e\u0171\5\62\32\2\u016f\u0172\5:\36\2"+
		"\u0170\u0172\5\66\34\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u017b"+
		"\3\2\2\2\u0173\u0176\5\62\32\2\u0174\u0177\5:\36\2\u0175\u0177\5\66\34"+
		"\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179"+
		"\5\64\33\2\u0179\u017b\3\2\2\2\u017a\u016a\3\2\2\2\u017a\u016b\3\2\2\2"+
		"\u017a\u016e\3\2\2\2\u017a\u0173\3\2\2\2\u017b9\3\2\2\2\u017c\u017d\5"+
		"\66\34\2\u017d\u017e\5\66\34\2\u017e\u0181\3\2\2\2\u017f\u0181\5\66\34"+
		"\2\u0180\u017c\3\2\2\2\u0180\u017f\3\2\2\2\u0181;\3\2\2\2\u0182\u0183"+
		"\7\65\2\2\u0183\u0184\7\37\2\2\u0184\u0185\5.\30\2\u0185\u0186\7 \2\2"+
		"\u0186\u0187\5\4\3\2\u0187=\3\2\2\2\u0188\u0189\7\66\2\2\u0189\u018a\7"+
		"\37\2\2\u018a\u018b\5.\30\2\u018b\u018c\7 \2\2\u018c\u018d\5\4\3\2\u018d"+
		"?\3\2\2\2\u018e\u018f\7\67\2\2\u018f\u0190\5\4\3\2\u0190\u0191\7\66\2"+
		"\2\u0191\u0192\7\37\2\2\u0192\u0193\5.\30\2\u0193\u0194\7 \2\2\u0194\u0195"+
		"\7$\2\2\u0195A\3\2\2\2\u0196\u0197\5\b\5\2\u0197\u0198\7:\2\2\u0198\u01a5"+
		"\3\2\2\2\u0199\u019a\5\b\5\2\u019a\u019b\7:\2\2\u019b\u019c\5D#\2\u019c"+
		"\u01a5\3\2\2\2\u019d\u019e\5\n\6\2\u019e\u019f\7:\2\2\u019f\u01a5\3\2"+
		"\2\2\u01a0\u01a1\5\n\6\2\u01a1\u01a2\7:\2\2\u01a2\u01a3\5D#\2\u01a3\u01a5"+
		"\3\2\2\2\u01a4\u0196\3\2\2\2\u01a4\u0199\3\2\2\2\u01a4\u019d\3\2\2\2\u01a4"+
		"\u01a0\3\2\2\2\u01a5C\3\2\2\2\u01a6\u01a7\7#\2\2\u01a7\u01a8\5\b\5\2\u01a8"+
		"\u01a9\7:\2\2\u01a9\u01af\3\2\2\2\u01aa\u01ab\7#\2\2\u01ab\u01ac\5\n\6"+
		"\2\u01ac\u01ad\7:\2\2\u01ad\u01af\3\2\2\2\u01ae\u01a6\3\2\2\2\u01ae\u01aa"+
		"\3\2\2\2\u01afE\3\2\2\2\u01b0\u01b1\5\b\5\2\u01b1\u01b2\7;\2\2\u01b2\u01b3"+
		"\7\37\2\2\u01b3\u01b4\5B\"\2\u01b4\u01b5\7 \2\2\u01b5\u01b6\5\4\3\2\u01b6"+
		"G\3\2\2\2\u01b7\u01b8\7;\2\2\u01b8\u01b9\7\37\2\2\u01b9\u01ba\5B\"\2\u01ba"+
		"\u01bb\7 \2\2\u01bb\u01bc\7$\2\2\u01bcI\3\2\2\2(_m|\u008e\u0095\u009c"+
		"\u00a5\u00b0\u00bb\u00bf\u00c6\u00cd\u00d1\u00da\u00e3\u00e6\u00ed\u00f6"+
		"\u0108\u0110\u0112\u011f\u0125\u012d\u0133\u0138\u013e\u0145\u014b\u014d"+
		"\u0153\u0159\u0171\u0176\u017a\u0180\u01a4\u01ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}