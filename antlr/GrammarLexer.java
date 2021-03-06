package antlr;
// Generated from Grammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'"
	};
	public static final String[] ruleNames = {
		"T__0", "MainKey", "VoidKey", "IntKey", "FloatKey", "StringKey", "CharKey", 
		"BooleanKey", "ArrayKey", "Num", "Float", "Char", "String", "TrueKey", 
		"FalseKey", "PrintKey", "ScanKey", "Terminator", "ElseIfKey", "IfKey", 
		"ElseKey", "ForKey", "WhileKey", "DoWhileKey", "OpenPar", "ClosePar", 
		"OpenBracket", "CloseBracket", "OpenBrace", "CloseBrace", "AddAssignOp", 
		"SubAssignOp", "AddOp", "SubOp", "MultOp", "DivOp", "ModOp", "ExpOp", 
		"IncOp", "DecOp", "NewKey", "ReturnKey", "NullKey", "LessEqualOp", "GreaterEqualOp", 
		"LessOp", "GreaterOp", "NotEqualOp", "EqualOp", "AssignOp", "NotOp", "AndOp", 
		"OrOp", "Separator", "CondSep", "Func", "CommentBlock", "Var", "WS"
	};


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2=\u01b8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13\u00aa\n\13\r\13\16"+
		"\13\u00ab\3\f\6\f\u00af\n\f\r\f\16\f\u00b0\3\f\3\f\6\f\u00b5\n\f\r\f\16"+
		"\f\u00b6\3\r\3\r\5\r\u00bb\n\r\3\r\3\r\3\16\3\16\7\16\u00c1\n\16\f\16"+
		"\16\16\u00c4\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\39\39\39\39\69\u0190\n9\r9\169\u0191\3:\3:\3:\3:\3:\3:\3:\3:\7:\u019c"+
		"\n:\f:\16:\u019f\13:\3:\3:\5:\u01a3\n:\3:\3:\3:\3:\3;\3;\3;\3;\3;\6;\u01ae"+
		"\n;\r;\16;\u01af\3<\6<\u01b3\n<\r<\16<\u01b4\3<\3<\2\2=\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=\3\2"+
		"\b\3\2\62;\4\2C\\c|\7\2\"\"))C\\^^c|\4\2\f\f\17\17\5\2C\\aac|\6\2\13\f"+
		"\17\17\"\"))\u01c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\3y\3\2\2\2\5{\3\2\2\2\7\177\3\2\2\2\t\u0086\3\2\2\2\13\u008c\3\2"+
		"\2\2\r\u0092\3\2\2\2\17\u0098\3\2\2\2\21\u009d\3\2\2\2\23\u00a1\3\2\2"+
		"\2\25\u00a9\3\2\2\2\27\u00ae\3\2\2\2\31\u00b8\3\2\2\2\33\u00be\3\2\2\2"+
		"\35\u00c7\3\2\2\2\37\u00cf\3\2\2\2!\u00d9\3\2\2\2#\u00de\3\2\2\2%\u00e3"+
		"\3\2\2\2\'\u00e6\3\2\2\2)\u00ed\3\2\2\2+\u00f1\3\2\2\2-\u00f5\3\2\2\2"+
		"/\u00ff\3\2\2\2\61\u0103\3\2\2\2\63\u0108\3\2\2\2\65\u010a\3\2\2\2\67"+
		"\u010c\3\2\2\29\u010e\3\2\2\2;\u0110\3\2\2\2=\u0117\3\2\2\2?\u011e\3\2"+
		"\2\2A\u0126\3\2\2\2C\u012e\3\2\2\2E\u0132\3\2\2\2G\u0136\3\2\2\2I\u013b"+
		"\3\2\2\2K\u0140\3\2\2\2M\u0149\3\2\2\2O\u0150\3\2\2\2Q\u0155\3\2\2\2S"+
		"\u015a\3\2\2\2U\u015e\3\2\2\2W\u0163\3\2\2\2Y\u016b\3\2\2\2[\u016e\3\2"+
		"\2\2]\u0171\3\2\2\2_\u0173\3\2\2\2a\u0175\3\2\2\2c\u0178\3\2\2\2e\u017b"+
		"\3\2\2\2g\u017d\3\2\2\2i\u017f\3\2\2\2k\u0182\3\2\2\2m\u0185\3\2\2\2o"+
		"\u0187\3\2\2\2q\u0189\3\2\2\2s\u0193\3\2\2\2u\u01a8\3\2\2\2w\u01b2\3\2"+
		"\2\2yz\7/\2\2z\4\3\2\2\2{|\7|\2\2|}\7q\2\2}~\7q\2\2~\6\3\2\2\2\177\u0080"+
		"\7p\2\2\u0080\u0081\7g\2\2\u0081\u0082\7w\2\2\u0082\u0083\7v\2\2\u0083"+
		"\u0084\7g\2\2\u0084\u0085\7t\2\2\u0085\b\3\2\2\2\u0086\u0087\7u\2\2\u0087"+
		"\u0088\7j\2\2\u0088\u0089\7g\2\2\u0089\u008a\7g\2\2\u008a\u008b\7r\2\2"+
		"\u008b\n\3\2\2\2\u008c\u008d\7q\2\2\u008d\u008e\7v\2\2\u008e\u008f\7v"+
		"\2\2\u008f\u0090\7g\2\2\u0090\u0091\7t\2\2\u0091\f\3\2\2\2\u0092\u0093"+
		"\7u\2\2\u0093\u0094\7p\2\2\u0094\u0095\7c\2\2\u0095\u0096\7m\2\2\u0096"+
		"\u0097\7g\2\2\u0097\16\3\2\2\2\u0098\u0099\7y\2\2\u0099\u009a\7q\2\2\u009a"+
		"\u009b\7t\2\2\u009b\u009c\7o\2\2\u009c\20\3\2\2\2\u009d\u009e\7d\2\2\u009e"+
		"\u009f\7q\2\2\u009f\u00a0\7q\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\7u\2\2\u00a2"+
		"\u00a3\7r\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6\u00a7\7t\2\2\u00a7\24\3\2\2\2\u00a8\u00aa\t\2\2\2\u00a9\u00a8\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\26\3\2\2\2\u00ad\u00af\t\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2"+
		"\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4"+
		"\7\60\2\2\u00b3\u00b5\t\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\30\3\2\2\2\u00b8\u00ba"+
		"\7b\2\2\u00b9\u00bb\t\3\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\7b\2\2\u00bd\32\3\2\2\2\u00be\u00c2\7\u0080"+
		"\2\2\u00bf\u00c1\t\4\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c6\7\u0080\2\2\u00c6\34\3\2\2\2\u00c7\u00c8\7f\2\2\u00c8"+
		"\u00c9\7k\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7p\2\2"+
		"\u00cc\u00cd\7c\2\2\u00cd\u00ce\7n\2\2\u00ce\36\3\2\2\2\u00cf\u00d0\7"+
		"p\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4"+
		"\7w\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7c\2\2\u00d7"+
		"\u00d8\7n\2\2\u00d8 \3\2\2\2\u00d9\u00da\7r\2\2\u00da\u00db\7w\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\u00dd\7t\2\2\u00dd\"\3\2\2\2\u00de\u00df\7t\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e2\7t\2\2\u00e2$\3\2\2\2\u00e3"+
		"\u00e4\7>\2\2\u00e4\u00e5\7\65\2\2\u00e5&\3\2\2\2\u00e6\u00e7\7e\2\2\u00e7"+
		"\u00e8\7c\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7q\2\2"+
		"\u00eb\u00ec\7i\2\2\u00ec(\3\2\2\2\u00ed\u00ee\7f\2\2\u00ee\u00ef\7q\2"+
		"\2\u00ef\u00f0\7i\2\2\u00f0*\3\2\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7"+
		"c\2\2\u00f3\u00f4\7v\2\2\u00f4,\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7"+
		"\7q\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7e\2\2\u00fa"+
		"\u00fb\7j\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7p\2\2"+
		"\u00fe.\3\2\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7w\2\2\u0101\u0102\7p\2"+
		"\2\u0102\60\3\2\2\2\u0103\u0104\7o\2\2\u0104\u0105\7q\2\2\u0105\u0106"+
		"\7x\2\2\u0106\u0107\7g\2\2\u0107\62\3\2\2\2\u0108\u0109\7*\2\2\u0109\64"+
		"\3\2\2\2\u010a\u010b\7+\2\2\u010b\66\3\2\2\2\u010c\u010d\7]\2\2\u010d"+
		"8\3\2\2\2\u010e\u010f\7_\2\2\u010f:\3\2\2\2\u0110\u0111\7g\2\2\u0111\u0112"+
		"\7/\2\2\u0112\u0113\7y\2\2\u0113\u0114\7q\2\2\u0114\u0115\7t\2\2\u0115"+
		"\u0116\7o\2\2\u0116<\3\2\2\2\u0117\u0118\7h\2\2\u0118\u0119\7/\2\2\u0119"+
		"\u011a\7y\2\2\u011a\u011b\7q\2\2\u011b\u011c\7t\2\2\u011c\u011d\7o\2\2"+
		"\u011d>\3\2\2\2\u011e\u011f\7c\2\2\u011f\u0120\7t\2\2\u0120\u0121\7h\2"+
		"\2\u0121\u0122\7v\2\2\u0122\u0123\7j\2\2\u0123\u0124\7k\2\2\u0124\u0125"+
		"\7u\2\2\u0125@\3\2\2\2\u0126\u0127\7u\2\2\u0127\u0128\7u\2\2\u0128\u0129"+
		"\7u\2\2\u0129\u012a\7v\2\2\u012a\u012b\7j\2\2\u012b\u012c\7k\2\2\u012c"+
		"\u012d\7u\2\2\u012dB\3\2\2\2\u012e\u012f\7c\2\2\u012f\u0130\7t\2\2\u0130"+
		"\u0131\7h\2\2\u0131D\3\2\2\2\u0132\u0133\7u\2\2\u0133\u0134\7u\2\2\u0134"+
		"\u0135\7u\2\2\u0135F\3\2\2\2\u0136\u0137\7o\2\2\u0137\u0138\7g\2\2\u0138"+
		"\u0139\7q\2\2\u0139\u013a\7y\2\2\u013aH\3\2\2\2\u013b\u013c\7f\2\2\u013c"+
		"\u013d\7q\2\2\u013d\u013e\7q\2\2\u013e\u013f\7m\2\2\u013fJ\3\2\2\2\u0140"+
		"\u0141\7o\2\2\u0141\u0142\7q\2\2\u0142\u0143\7q\2\2\u0143\u0144\7q\2\2"+
		"\u0144\u0145\7f\2\2\u0145\u0146\7w\2\2\u0146\u0147\7n\2\2\u0147\u0148"+
		"\7q\2\2\u0148L\3\2\2\2\u0149\u014a\7r\2\2\u014a\u014b\7q\2\2\u014b\u014c"+
		"\7y\2\2\u014c\u014d\7r\2\2\u014d\u014e\7q\2\2\u014e\u014f\7y\2\2\u014f"+
		"N\3\2\2\2\u0150\u0151\7o\2\2\u0151\u0152\7c\2\2\u0152\u0153\7v\2\2\u0153"+
		"\u0154\7g\2\2\u0154P\3\2\2\2\u0155\u0156\7r\2\2\u0156\u0157\7t\2\2\u0157"+
		"\u0158\7g\2\2\u0158\u0159\7{\2\2\u0159R\3\2\2\2\u015a\u015b\7p\2\2\u015b"+
		"\u015c\7g\2\2\u015c\u015d\7y\2\2\u015dT\3\2\2\2\u015e\u015f\7d\2\2\u015f"+
		"\u0160\7c\2\2\u0160\u0161\7e\2\2\u0161\u0162\7m\2\2\u0162V\3\2\2\2\u0163"+
		"\u0164\7g\2\2\u0164\u0165\7z\2\2\u0165\u0166\7v\2\2\u0166\u0167\7k\2\2"+
		"\u0167\u0168\7p\2\2\u0168\u0169\7e\2\2\u0169\u016a\7v\2\2\u016aX\3\2\2"+
		"\2\u016b\u016c\7>\2\2\u016c\u016d\7?\2\2\u016dZ\3\2\2\2\u016e\u016f\7"+
		"@\2\2\u016f\u0170\7?\2\2\u0170\\\3\2\2\2\u0171\u0172\7>\2\2\u0172^\3\2"+
		"\2\2\u0173\u0174\7@\2\2\u0174`\3\2\2\2\u0175\u0176\7#\2\2\u0176\u0177"+
		"\7?\2\2\u0177b\3\2\2\2\u0178\u0179\7?\2\2\u0179\u017a\7?\2\2\u017ad\3"+
		"\2\2\2\u017b\u017c\7?\2\2\u017cf\3\2\2\2\u017d\u017e\7#\2\2\u017eh\3\2"+
		"\2\2\u017f\u0180\7(\2\2\u0180\u0181\7(\2\2\u0181j\3\2\2\2\u0182\u0183"+
		"\7~\2\2\u0183\u0184\7~\2\2\u0184l\3\2\2\2\u0185\u0186\7.\2\2\u0186n\3"+
		"\2\2\2\u0187\u0188\7<\2\2\u0188p\3\2\2\2\u0189\u018a\7h\2\2\u018a\u018b"+
		"\7w\2\2\u018b\u018c\7p\2\2\u018c\u018d\7e\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u0190\t\3\2\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192r\3\2\2\2\u0193\u0194\7p\2\2\u0194\u0195"+
		"\7q\2\2\u0195\u0196\7k\2\2\u0196\u0197\7u\2\2\u0197\u0198\7g\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019d\7/\2\2\u019a\u019c\n\5\2\2\u019b\u019a\3\2"+
		"\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a2\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7\17\2\2\u01a1\u01a3\7"+
		"\f\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a5\7/\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\b:\2\2\u01a7t\3\2\2\2\u01a8"+
		"\u01a9\7x\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab\7t\2\2\u01ab\u01ad\3\2\2"+
		"\2\u01ac\u01ae\t\6\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0v\3\2\2\2\u01b1\u01b3\t\7\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\b<\2\2\u01b7x\3\2\2\2\r\2\u00ab\u00b0"+
		"\u00b6\u00ba\u00c2\u0191\u019d\u01a2\u01af\u01b4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}