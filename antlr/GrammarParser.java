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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		Num=10, AddOp=11, SubOp=12, MultOp=13, DivOp=14, ModOp=15, ExpOp=16, AssignOp=17, 
		AddAssignOp=18, SubAssignOp=19, IncOp=20, DecOp=21, LessOp=22, LessEqualOp=23, 
		GreaterOp=24, GreaterEqualOp=25, EqualOp=26, NotEqualOp=27, AndOp=28, 
		OrOp=29, NotOp=30, OpenPar=31, ClosePar=32, OpenBracket=33, CloseBracket=34, 
		Separator=35, Terminator=36, OpenBrace=37, CloseBrace=38, CommentBlock=39, 
		VoidKey=40, MainKey=41, IntKey=42, FloatKey=43, StringKey=44, CharKey=45, 
		BooleanKey=46, ArrayKey=47, PrintfKey=48, ScanfKey=49, IfKey=50, ElseKey=51, 
		ElseIfKey=52, ForKey=53, WhileKey=54, DoWhileKey=55, ReturnKey=56, NullKey=57, 
		Var=58, Func=59, Char=60, String=61, WS=62;
	public static final String[] tokenNames = {
		"<INVALID>", "'`'", "'nocturnal'", "'printf'", "'new'", "'diurnal'", "'scanf'", 
		"'-'", "'~'", "'.'", "Num", "'arf'", "'sss'", "'meow'", "'dook'", "'mooodulo'", 
		"'powpow'", "'='", "'arfthis'", "'sssthis'", "'mate'", "'prey'", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'('", "')'", 
		"'['", "']'", "','", "'<3'", "'e-worm'", "'f-worm'", "'#'", "'neuter'", 
		"'zoo'", "'sheep'", "'otter'", "'snake'", "'worm'", "'boo'", "'spider'", 
		"'purr'", "'rawr'", "'dog'", "'cat'", "'catdog'", "'foodchain'", "'run'", 
		"'move'", "'back'", "'extinct'", "Var", "Func", "Char", "String", "WS"
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
		RULE_param_dec = 32, RULE_next_param_dec = 33, RULE_func_dec = 34, RULE_param_call = 35, 
		RULE_next_param_call = 36, RULE_func_call = 37, RULE_print = 38, RULE_scan = 39;
	public static final String[] ruleNames = {
		"s", "code_block", "statement", "datatype", "array_datatype", "boolean_lit", 
		"float_lit", "char_lit", "string_lit", "literal", "var_dec", "next_var", 
		"var_init", "next_var_i", "next_arr_i", "var_assign", "addsub_assign", 
		"inc_dec", "expr", "cond_op", "not", "gates", "cond_expr", "next_cond_expr", 
		"cond", "next_cond", "next_cond2", "condition", "condition2", "for_loop", 
		"while_loop", "dowhile_loop", "param_dec", "next_param_dec", "func_dec", 
		"param_call", "next_param_call", "func_call", "print", "scan"
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
			setState(80); match(VoidKey);
			setState(81); match(MainKey);
			setState(82); match(OpenPar);
			setState(83); match(ClosePar);
			setState(84); code_block();
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
			setState(86); match(OpenBrace);
			setState(87); statement();
			setState(88); match(CloseBrace);
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
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); var_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); var_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92); var_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93); addsub_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94); inc_dec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95); expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96); condition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97); for_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(98); while_loop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(99); dowhile_loop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(100); func_call();
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
			setState(103);
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
			setState(105); datatype();
			setState(106); match(ArrayKey);
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
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__4) ) {
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
			setState(115);
			switch (_input.LA(1)) {
			case Num:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(110); match(Num);
				setState(111); match(T__0);
				setState(112); match(Num);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(113); match(T__0);
				setState(114); match(Num);
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
			setState(117); match(T__8);
			setState(118); match(Char);
			setState(119); match(T__8);
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
			setState(121); match(T__1);
			setState(122); match(String);
			setState(123); match(T__1);
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
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); match(Num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); boolean_lit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127); float_lit();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128); char_lit();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129); string_lit();
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
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); datatype();
				setState(133); match(Var);
				setState(134); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); array_datatype();
				setState(137); match(Var);
				setState(138); next_var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140); datatype();
				setState(141); match(Var);
				setState(142); next_var();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144); array_datatype();
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
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150); match(Separator);
				setState(151); match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); match(Separator);
				setState(153); match(Var);
				setState(154); match(Terminator);
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
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); datatype();
				setState(158); match(Var);
				setState(159); match(AssignOp);
				setState(162);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(160); literal();
					}
					break;
				case 2:
					{
					setState(161); expr(0);
					}
					break;
				}
				setState(164); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); datatype();
				setState(167); match(Var);
				setState(168); match(AssignOp);
				setState(171);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(169); literal();
					}
					break;
				case 2:
					{
					setState(170); expr(0);
					}
					break;
				}
				setState(173); next_var_i();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175); array_datatype();
				setState(176); match(Var);
				setState(177); match(AssignOp);
				setState(178); match(T__5);
				setState(179); match(ArrayKey);
				setState(182);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(180); match(Num);
					}
					break;
				case 2:
					{
					setState(181); expr(0);
					}
					break;
				}
				setState(184); match(Terminator);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186); array_datatype();
				setState(187); match(Var);
				setState(188); match(AssignOp);
				setState(189); match(T__5);
				setState(190); match(ArrayKey);
				setState(193);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(191); match(Num);
					}
					break;
				case 2:
					{
					setState(192); expr(0);
					}
					break;
				}
				setState(195); next_arr_i();
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
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199); match(Separator);
				setState(200); match(Var);
				setState(201); match(AssignOp);
				setState(204);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(202); literal();
					}
					break;
				case 2:
					{
					setState(203); expr(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206); match(Separator);
				setState(207); match(Var);
				setState(208); match(AssignOp);
				setState(211);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(209); literal();
					}
					break;
				case 2:
					{
					setState(210); expr(0);
					}
					break;
				}
				setState(213); match(Terminator);
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
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); match(Separator);
				setState(218); match(Var);
				setState(219); match(AssignOp);
				setState(220); match(T__5);
				setState(221); match(ArrayKey);
				setState(224);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(222); match(Num);
					}
					break;
				case 2:
					{
					setState(223); expr(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); match(Separator);
				setState(227); match(Var);
				setState(228); match(AssignOp);
				setState(229); match(T__5);
				setState(230); match(ArrayKey);
				setState(233);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
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
			setState(238); match(Var);
			setState(239); match(AssignOp);
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(240); literal();
				}
				break;
			case 2:
				{
				setState(241); expr(0);
				}
				break;
			case 3:
				{
				setState(242); match(Var);
				}
				break;
			}
			setState(245); match(Terminator);
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
			setState(247); match(Var);
			setState(248);
			_la = _input.LA(1);
			if ( !(_la==AddAssignOp || _la==SubAssignOp) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(249); literal();
				}
				break;
			case 2:
				{
				setState(250); expr(0);
				}
				break;
			case 3:
				{
				setState(251); match(Var);
				}
				break;
			}
			setState(254); match(Terminator);
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
			setState(256); match(Var);
			setState(257);
			_la = _input.LA(1);
			if ( !(_la==IncOp || _la==DecOp) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(258); match(Terminator);
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
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new NegaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(261); match(T__2);
				setState(262); expr(6);
				}
				break;
			case 2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263); match(OpenPar);
				setState(264); expr(0);
				setState(265); match(ClosePar);
				}
				break;
			case 3:
				{
				_localctx = new UnitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267); match(Num);
				}
				break;
			case 4:
				{
				_localctx = new NegaUnitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268); match(T__2);
				setState(269); match(Num);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(272);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(273);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultOp) | (1L << DivOp) | (1L << ModOp))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(274); expr(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(276);
						_la = _input.LA(1);
						if ( !(_la==AddOp || _la==SubOp) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(277); expr(4);
						}
						break;
					}
					} 
				}
				setState(282);
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
			setState(283);
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
			setState(285); match(NotOp);
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
			setState(287);
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
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289); not();
				setState(293);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(290); literal();
					}
					break;
				case 2:
					{
					setState(291); expr(0);
					}
					break;
				case 3:
					{
					setState(292); match(Var);
					}
					break;
				}
				setState(295); cond_op();
				setState(299);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
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
				setState(301); next_cond_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303); not();
				setState(307);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(304); literal();
					}
					break;
				case 2:
					{
					setState(305); expr(0);
					}
					break;
				case 3:
					{
					setState(306); match(Var);
					}
					break;
				}
				setState(309); cond_op();
				setState(313);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
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
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(315); literal();
					}
					break;
				case 2:
					{
					setState(316); expr(0);
					}
					break;
				case 3:
					{
					setState(317); match(Var);
					}
					break;
				}
				setState(320); cond_op();
				setState(324);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(321); literal();
					}
					break;
				case 2:
					{
					setState(322); expr(0);
					}
					break;
				case 3:
					{
					setState(323); match(Var);
					}
					break;
				}
				setState(326); next_cond_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(328); literal();
					}
					break;
				case 2:
					{
					setState(329); expr(0);
					}
					break;
				case 3:
					{
					setState(330); match(Var);
					}
					break;
				}
				setState(333); cond_op();
				setState(337);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
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
			setState(341); gates();
			setState(345);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(342); literal();
				}
				break;
			case 2:
				{
				setState(343); expr(0);
				}
				break;
			case 3:
				{
				setState(344); match(Var);
				}
				break;
			}
			setState(347); cond_op();
			setState(351);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(348); literal();
				}
				break;
			case 2:
				{
				setState(349); expr(0);
				}
				break;
			case 3:
				{
				setState(350); match(Var);
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
			setState(353); match(IfKey);
			setState(354); match(OpenPar);
			setState(355); cond_expr();
			setState(356); match(ClosePar);
			setState(357); code_block();
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
			setState(359); match(ElseKey);
			setState(360); code_block();
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
			setState(362); match(ElseIfKey);
			setState(363); match(OpenPar);
			setState(364); cond_expr();
			setState(365); match(ClosePar);
			setState(366); code_block();
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
			setState(384);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368); cond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369); cond();
				setState(370); next_cond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372); cond();
				setState(375);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(373); condition2();
					}
					break;
				case 2:
					{
					setState(374); next_cond2();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(377); cond();
				setState(380);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(378); condition2();
					}
					break;
				case 2:
					{
					setState(379); next_cond2();
					}
					break;
				}
				setState(382); next_cond();
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
			setState(390);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386); next_cond2();
				setState(387); next_cond2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389); next_cond2();
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
			setState(392); match(ForKey);
			setState(393); match(OpenPar);
			setState(394); cond_expr();
			setState(395); match(ClosePar);
			setState(396); code_block();
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
			setState(398); match(WhileKey);
			setState(399); match(OpenPar);
			setState(400); cond_expr();
			setState(401); match(ClosePar);
			setState(402); code_block();
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
			setState(404); match(DoWhileKey);
			setState(405); code_block();
			setState(406); match(WhileKey);
			setState(407); match(OpenPar);
			setState(408); cond_expr();
			setState(409); match(ClosePar);
			setState(410); match(Terminator);
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
		public Array_datatypeContext array_datatype() {
			return getRuleContext(Array_datatypeContext.class,0);
		}
		public Next_param_decContext next_param_dec() {
			return getRuleContext(Next_param_decContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
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
		enterRule(_localctx, 64, RULE_param_dec);
		try {
			setState(426);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412); datatype();
				setState(413); match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415); datatype();
				setState(416); match(Var);
				setState(417); next_param_dec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419); array_datatype();
				setState(420); match(Var);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(422); array_datatype();
				setState(423); match(Var);
				setState(424); next_param_dec();
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
		public TerminalNode Separator() { return getToken(GrammarParser.Separator, 0); }
		public Array_datatypeContext array_datatype() {
			return getRuleContext(Array_datatypeContext.class,0);
		}
		public Param_decContext param_dec() {
			return getRuleContext(Param_decContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
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
		enterRule(_localctx, 66, RULE_next_param_dec);
		try {
			setState(437);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428); match(Separator);
				setState(429); datatype();
				setState(430); match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432); match(Separator);
				setState(433); array_datatype();
				setState(434); match(Var);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436); param_dec();
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
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Param_decContext param_dec() {
			return getRuleContext(Param_decContext.class,0);
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
			setState(439); datatype();
			setState(440); match(Func);
			setState(441); match(OpenPar);
			setState(442); param_dec();
			setState(443); match(ClosePar);
			setState(444); code_block();
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
		public Next_param_callContext next_param_call() {
			return getRuleContext(Next_param_callContext.class,0);
		}
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
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
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446); match(Var);
				setState(447); next_param_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448); match(Var);
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
		public TerminalNode Separator() { return getToken(GrammarParser.Separator, 0); }
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
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
		enterRule(_localctx, 72, RULE_next_param_call);
		try {
			setState(454);
			switch (_input.LA(1)) {
			case Separator:
				enterOuterAlt(_localctx, 1);
				{
				setState(451); match(Separator);
				setState(452); match(Var);
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(453); param_call();
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

	public static class Func_callContext extends ParserRuleContext {
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
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
		enterRule(_localctx, 74, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456); match(Func);
			setState(457); match(OpenPar);
			setState(458); param_call();
			setState(459); match(ClosePar);
			setState(460); match(Terminator);
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
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
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
			setState(462); match(T__6);
			setState(463); match(OpenPar);
			setState(464); param_call();
			setState(465); match(ClosePar);
			setState(466); match(Terminator);
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
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(GrammarParser.ClosePar, 0); }
		public TerminalNode Terminator() { return getToken(GrammarParser.Terminator, 0); }
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
			setState(468); match(T__3);
			setState(469); match(OpenPar);
			setState(470); param_call();
			setState(471); match(ClosePar);
			setState(472); match(Terminator);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u01dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4h\n\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bv\n\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0085\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0097"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u009e\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00a5"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ae\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b9\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00c4\n\16\3\16\3\16\5\16\u00c8\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00cf\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d6"+
		"\n\17\3\17\3\17\5\17\u00da\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00e3\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ec\n\20\3\20\5"+
		"\20\u00ef\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00f6\n\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00ff\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0111\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0119\n\24\f\24\16\24\u011c\13\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0128\n\30\3\30\3\30\3\30"+
		"\3\30\5\30\u012e\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0136\n\30\3"+
		"\30\3\30\3\30\3\30\5\30\u013c\n\30\3\30\3\30\3\30\5\30\u0141\n\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0147\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u014e\n"+
		"\30\3\30\3\30\3\30\3\30\5\30\u0154\n\30\5\30\u0156\n\30\3\31\3\31\3\31"+
		"\3\31\5\31\u015c\n\31\3\31\3\31\3\31\3\31\5\31\u0162\n\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\5\35\u017a\n\35\3\35\3\35\3\35\5\35\u017f"+
		"\n\35\3\35\3\35\5\35\u0183\n\35\3\36\3\36\3\36\3\36\5\36\u0189\n\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01ad\n"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01b8\n#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\5%\u01c4\n%\3&\3&\3&\5&\u01c9\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3)\2\3&*\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\n\3\2,\60\4\2\4\4\7\7\3\2\24\25"+
		"\3\2\26\27\3\2\17\21\3\2\r\16\3\2\30\35\3\2\36\37\u0201\2R\3\2\2\2\4X"+
		"\3\2\2\2\6g\3\2\2\2\bi\3\2\2\2\nk\3\2\2\2\fn\3\2\2\2\16u\3\2\2\2\20w\3"+
		"\2\2\2\22{\3\2\2\2\24\u0084\3\2\2\2\26\u0096\3\2\2\2\30\u009d\3\2\2\2"+
		"\32\u00c7\3\2\2\2\34\u00d9\3\2\2\2\36\u00ee\3\2\2\2 \u00f0\3\2\2\2\"\u00f9"+
		"\3\2\2\2$\u0102\3\2\2\2&\u0110\3\2\2\2(\u011d\3\2\2\2*\u011f\3\2\2\2,"+
		"\u0121\3\2\2\2.\u0155\3\2\2\2\60\u0157\3\2\2\2\62\u0163\3\2\2\2\64\u0169"+
		"\3\2\2\2\66\u016c\3\2\2\28\u0182\3\2\2\2:\u0188\3\2\2\2<\u018a\3\2\2\2"+
		">\u0190\3\2\2\2@\u0196\3\2\2\2B\u01ac\3\2\2\2D\u01b7\3\2\2\2F\u01b9\3"+
		"\2\2\2H\u01c3\3\2\2\2J\u01c8\3\2\2\2L\u01ca\3\2\2\2N\u01d0\3\2\2\2P\u01d6"+
		"\3\2\2\2RS\7*\2\2ST\7+\2\2TU\7!\2\2UV\7\"\2\2VW\5\4\3\2W\3\3\2\2\2XY\7"+
		"\'\2\2YZ\5\6\4\2Z[\7(\2\2[\5\3\2\2\2\\h\5\26\f\2]h\5\32\16\2^h\5 \21\2"+
		"_h\5\"\22\2`h\5$\23\2ah\5&\24\2bh\58\35\2ch\5<\37\2dh\5> \2eh\5@!\2fh"+
		"\5L\'\2g\\\3\2\2\2g]\3\2\2\2g^\3\2\2\2g_\3\2\2\2g`\3\2\2\2ga\3\2\2\2g"+
		"b\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\7\3\2\2\2ij\t\2\2\2"+
		"j\t\3\2\2\2kl\5\b\5\2lm\7\61\2\2m\13\3\2\2\2no\t\3\2\2o\r\3\2\2\2pq\7"+
		"\f\2\2qr\7\13\2\2rv\7\f\2\2st\7\13\2\2tv\7\f\2\2up\3\2\2\2us\3\2\2\2v"+
		"\17\3\2\2\2wx\7\3\2\2xy\7>\2\2yz\7\3\2\2z\21\3\2\2\2{|\7\n\2\2|}\7?\2"+
		"\2}~\7\n\2\2~\23\3\2\2\2\177\u0085\7\f\2\2\u0080\u0085\5\f\7\2\u0081\u0085"+
		"\5\16\b\2\u0082\u0085\5\20\t\2\u0083\u0085\5\22\n\2\u0084\177\3\2\2\2"+
		"\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\25\3\2\2\2\u0086\u0087\5\b\5\2\u0087\u0088\7<\2\2\u0088"+
		"\u0089\7&\2\2\u0089\u0097\3\2\2\2\u008a\u008b\5\n\6\2\u008b\u008c\7<\2"+
		"\2\u008c\u008d\5\30\r\2\u008d\u0097\3\2\2\2\u008e\u008f\5\b\5\2\u008f"+
		"\u0090\7<\2\2\u0090\u0091\5\30\r\2\u0091\u0097\3\2\2\2\u0092\u0093\5\n"+
		"\6\2\u0093\u0094\7<\2\2\u0094\u0095\7&\2\2\u0095\u0097\3\2\2\2\u0096\u0086"+
		"\3\2\2\2\u0096\u008a\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0092\3\2\2\2\u0097"+
		"\27\3\2\2\2\u0098\u0099\7%\2\2\u0099\u009e\7<\2\2\u009a\u009b\7%\2\2\u009b"+
		"\u009c\7<\2\2\u009c\u009e\7&\2\2\u009d\u0098\3\2\2\2\u009d\u009a\3\2\2"+
		"\2\u009e\31\3\2\2\2\u009f\u00a0\5\b\5\2\u00a0\u00a1\7<\2\2\u00a1\u00a4"+
		"\7\23\2\2\u00a2\u00a5\5\24\13\2\u00a3\u00a5\5&\24\2\u00a4\u00a2\3\2\2"+
		"\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7&\2\2\u00a7\u00c8"+
		"\3\2\2\2\u00a8\u00a9\5\b\5\2\u00a9\u00aa\7<\2\2\u00aa\u00ad\7\23\2\2\u00ab"+
		"\u00ae\5\24\13\2\u00ac\u00ae\5&\24\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\5\34\17\2\u00b0\u00c8\3\2\2\2\u00b1"+
		"\u00b2\5\n\6\2\u00b2\u00b3\7<\2\2\u00b3\u00b4\7\23\2\2\u00b4\u00b5\7\6"+
		"\2\2\u00b5\u00b8\7\61\2\2\u00b6\u00b9\7\f\2\2\u00b7\u00b9\5&\24\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7&"+
		"\2\2\u00bb\u00c8\3\2\2\2\u00bc\u00bd\5\n\6\2\u00bd\u00be\7<\2\2\u00be"+
		"\u00bf\7\23\2\2\u00bf\u00c0\7\6\2\2\u00c0\u00c3\7\61\2\2\u00c1\u00c4\7"+
		"\f\2\2\u00c2\u00c4\5&\24\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\5\36\20\2\u00c6\u00c8\3\2\2\2\u00c7\u009f\3"+
		"\2\2\2\u00c7\u00a8\3\2\2\2\u00c7\u00b1\3\2\2\2\u00c7\u00bc\3\2\2\2\u00c8"+
		"\33\3\2\2\2\u00c9\u00ca\7%\2\2\u00ca\u00cb\7<\2\2\u00cb\u00ce\7\23\2\2"+
		"\u00cc\u00cf\5\24\13\2\u00cd\u00cf\5&\24\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00da\3\2\2\2\u00d0\u00d1\7%\2\2\u00d1\u00d2\7<\2\2\u00d2"+
		"\u00d5\7\23\2\2\u00d3\u00d6\5\24\13\2\u00d4\u00d6\5&\24\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7&\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00c9\3\2\2\2\u00d9\u00d0\3\2\2\2\u00da\35\3\2\2"+
		"\2\u00db\u00dc\7%\2\2\u00dc\u00dd\7<\2\2\u00dd\u00de\7\23\2\2\u00de\u00df"+
		"\7\6\2\2\u00df\u00e2\7\61\2\2\u00e0\u00e3\7\f\2\2\u00e1\u00e3\5&\24\2"+
		"\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00ef\3\2\2\2\u00e4\u00e5"+
		"\7%\2\2\u00e5\u00e6\7<\2\2\u00e6\u00e7\7\23\2\2\u00e7\u00e8\7\6\2\2\u00e8"+
		"\u00eb\7\61\2\2\u00e9\u00ec\7\f\2\2\u00ea\u00ec\5&\24\2\u00eb\u00e9\3"+
		"\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\7&\2\2\u00ee"+
		"\u00db\3\2\2\2\u00ee\u00e4\3\2\2\2\u00ef\37\3\2\2\2\u00f0\u00f1\7<\2\2"+
		"\u00f1\u00f5\7\23\2\2\u00f2\u00f6\5\24\13\2\u00f3\u00f6\5&\24\2\u00f4"+
		"\u00f6\7<\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7&\2\2\u00f8!\3\2\2\2\u00f9\u00fa"+
		"\7<\2\2\u00fa\u00fe\t\4\2\2\u00fb\u00ff\5\24\13\2\u00fc\u00ff\5&\24\2"+
		"\u00fd\u00ff\7<\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7&\2\2\u0101#\3\2\2\2\u0102\u0103"+
		"\7<\2\2\u0103\u0104\t\5\2\2\u0104\u0105\7&\2\2\u0105%\3\2\2\2\u0106\u0107"+
		"\b\24\1\2\u0107\u0108\7\t\2\2\u0108\u0111\5&\24\b\u0109\u010a\7!\2\2\u010a"+
		"\u010b\5&\24\2\u010b\u010c\7\"\2\2\u010c\u0111\3\2\2\2\u010d\u0111\7\f"+
		"\2\2\u010e\u010f\7\t\2\2\u010f\u0111\7\f\2\2\u0110\u0106\3\2\2\2\u0110"+
		"\u0109\3\2\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u011a\3\2"+
		"\2\2\u0112\u0113\f\6\2\2\u0113\u0114\t\6\2\2\u0114\u0119\5&\24\7\u0115"+
		"\u0116\f\5\2\2\u0116\u0117\t\7\2\2\u0117\u0119\5&\24\6\u0118\u0112\3\2"+
		"\2\2\u0118\u0115\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\'\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\t\b\2\2"+
		"\u011e)\3\2\2\2\u011f\u0120\7 \2\2\u0120+\3\2\2\2\u0121\u0122\t\t\2\2"+
		"\u0122-\3\2\2\2\u0123\u0127\5*\26\2\u0124\u0128\5\24\13\2\u0125\u0128"+
		"\5&\24\2\u0126\u0128\7<\2\2\u0127\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012d\5(\25\2\u012a\u012e\5\24"+
		"\13\2\u012b\u012e\5&\24\2\u012c\u012e\7<\2\2\u012d\u012a\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\5\60"+
		"\31\2\u0130\u0156\3\2\2\2\u0131\u0135\5*\26\2\u0132\u0136\5\24\13\2\u0133"+
		"\u0136\5&\24\2\u0134\u0136\7<\2\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013b\5(\25\2\u0138"+
		"\u013c\5\24\13\2\u0139\u013c\5&\24\2\u013a\u013c\7<\2\2\u013b\u0138\3"+
		"\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u0156\3\2\2\2\u013d"+
		"\u0141\5\24\13\2\u013e\u0141\5&\24\2\u013f\u0141\7<\2\2\u0140\u013d\3"+
		"\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0146\5(\25\2\u0143\u0147\5\24\13\2\u0144\u0147\5&\24\2\u0145\u0147\7"+
		"<\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0149\5\60\31\2\u0149\u0156\3\2\2\2\u014a\u014e\5"+
		"\24\13\2\u014b\u014e\5&\24\2\u014c\u014e\7<\2\2\u014d\u014a\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0153\5("+
		"\25\2\u0150\u0154\5\24\13\2\u0151\u0154\5&\24\2\u0152\u0154\7<\2\2\u0153"+
		"\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0156\3\2"+
		"\2\2\u0155\u0123\3\2\2\2\u0155\u0131\3\2\2\2\u0155\u0140\3\2\2\2\u0155"+
		"\u014d\3\2\2\2\u0156/\3\2\2\2\u0157\u015b\5,\27\2\u0158\u015c\5\24\13"+
		"\2\u0159\u015c\5&\24\2\u015a\u015c\7<\2\2\u015b\u0158\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0161\5(\25\2\u015e"+
		"\u0162\5\24\13\2\u015f\u0162\5&\24\2\u0160\u0162\7<\2\2\u0161\u015e\3"+
		"\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\61\3\2\2\2\u0163"+
		"\u0164\7\64\2\2\u0164\u0165\7!\2\2\u0165\u0166\5.\30\2\u0166\u0167\7\""+
		"\2\2\u0167\u0168\5\4\3\2\u0168\63\3\2\2\2\u0169\u016a\7\65\2\2\u016a\u016b"+
		"\5\4\3\2\u016b\65\3\2\2\2\u016c\u016d\7\66\2\2\u016d\u016e\7!\2\2\u016e"+
		"\u016f\5.\30\2\u016f\u0170\7\"\2\2\u0170\u0171\5\4\3\2\u0171\67\3\2\2"+
		"\2\u0172\u0183\5\62\32\2\u0173\u0174\5\62\32\2\u0174\u0175\5\64\33\2\u0175"+
		"\u0183\3\2\2\2\u0176\u0179\5\62\32\2\u0177\u017a\5:\36\2\u0178\u017a\5"+
		"\66\34\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a\u0183\3\2\2\2\u017b"+
		"\u017e\5\62\32\2\u017c\u017f\5:\36\2\u017d\u017f\5\66\34\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\5\64\33\2"+
		"\u0181\u0183\3\2\2\2\u0182\u0172\3\2\2\2\u0182\u0173\3\2\2\2\u0182\u0176"+
		"\3\2\2\2\u0182\u017b\3\2\2\2\u01839\3\2\2\2\u0184\u0185\5\66\34\2\u0185"+
		"\u0186\5\66\34\2\u0186\u0189\3\2\2\2\u0187\u0189\5\66\34\2\u0188\u0184"+
		"\3\2\2\2\u0188\u0187\3\2\2\2\u0189;\3\2\2\2\u018a\u018b\7\67\2\2\u018b"+
		"\u018c\7!\2\2\u018c\u018d\5.\30\2\u018d\u018e\7\"\2\2\u018e\u018f\5\4"+
		"\3\2\u018f=\3\2\2\2\u0190\u0191\78\2\2\u0191\u0192\7!\2\2\u0192\u0193"+
		"\5.\30\2\u0193\u0194\7\"\2\2\u0194\u0195\5\4\3\2\u0195?\3\2\2\2\u0196"+
		"\u0197\79\2\2\u0197\u0198\5\4\3\2\u0198\u0199\78\2\2\u0199\u019a\7!\2"+
		"\2\u019a\u019b\5.\30\2\u019b\u019c\7\"\2\2\u019c\u019d\7&\2\2\u019dA\3"+
		"\2\2\2\u019e\u019f\5\b\5\2\u019f\u01a0\7<\2\2\u01a0\u01ad\3\2\2\2\u01a1"+
		"\u01a2\5\b\5\2\u01a2\u01a3\7<\2\2\u01a3\u01a4\5D#\2\u01a4\u01ad\3\2\2"+
		"\2\u01a5\u01a6\5\n\6\2\u01a6\u01a7\7<\2\2\u01a7\u01ad\3\2\2\2\u01a8\u01a9"+
		"\5\n\6\2\u01a9\u01aa\7<\2\2\u01aa\u01ab\5D#\2\u01ab\u01ad\3\2\2\2\u01ac"+
		"\u019e\3\2\2\2\u01ac\u01a1\3\2\2\2\u01ac\u01a5\3\2\2\2\u01ac\u01a8\3\2"+
		"\2\2\u01adC\3\2\2\2\u01ae\u01af\7%\2\2\u01af\u01b0\5\b\5\2\u01b0\u01b1"+
		"\7<\2\2\u01b1\u01b8\3\2\2\2\u01b2\u01b3\7%\2\2\u01b3\u01b4\5\n\6\2\u01b4"+
		"\u01b5\7<\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b8\5B\"\2\u01b7\u01ae\3\2\2"+
		"\2\u01b7\u01b2\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8E\3\2\2\2\u01b9\u01ba"+
		"\5\b\5\2\u01ba\u01bb\7=\2\2\u01bb\u01bc\7!\2\2\u01bc\u01bd\5B\"\2\u01bd"+
		"\u01be\7\"\2\2\u01be\u01bf\5\4\3\2\u01bfG\3\2\2\2\u01c0\u01c1\7<\2\2\u01c1"+
		"\u01c4\5J&\2\u01c2\u01c4\7<\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c2\3\2\2"+
		"\2\u01c4I\3\2\2\2\u01c5\u01c6\7%\2\2\u01c6\u01c9\7<\2\2\u01c7\u01c9\5"+
		"H%\2\u01c8\u01c5\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9K\3\2\2\2\u01ca\u01cb"+
		"\7=\2\2\u01cb\u01cc\7!\2\2\u01cc\u01cd\5H%\2\u01cd\u01ce\7\"\2\2\u01ce"+
		"\u01cf\7&\2\2\u01cfM\3\2\2\2\u01d0\u01d1\7\5\2\2\u01d1\u01d2\7!\2\2\u01d2"+
		"\u01d3\5H%\2\u01d3\u01d4\7\"\2\2\u01d4\u01d5\7&\2\2\u01d5O\3\2\2\2\u01d6"+
		"\u01d7\7\b\2\2\u01d7\u01d8\7!\2\2\u01d8\u01d9\5H%\2\u01d9\u01da\7\"\2"+
		"\2\u01da\u01db\7&\2\2\u01dbQ\3\2\2\2*gu\u0084\u0096\u009d\u00a4\u00ad"+
		"\u00b8\u00c3\u00c7\u00ce\u00d5\u00d9\u00e2\u00eb\u00ee\u00f5\u00fe\u0110"+
		"\u0118\u011a\u0127\u012d\u0135\u013b\u0140\u0146\u014d\u0153\u0155\u015b"+
		"\u0161\u0179\u017e\u0182\u0188\u01ac\u01b7\u01c3\u01c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}