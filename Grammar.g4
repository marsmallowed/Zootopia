/**
 * Define a grammar called Hello
 */
grammar Grammar;

/** LEXER */
// Int Literal (also for Float)
Num	: [0-9]+; 

// Operators & Symbols
AddOp : 'arf'; // +
SubOp : 'sss'; // -
MultOp : 'meow'; // *
DivOp : 'dook'; // /
ModOp : 'mooodulo'; // %
ExpOp : 'powpow'; // ^
AssignOp : '=';
AddAssignOp : 'arfthis'; // +=
SubAssignOp : 'sssthis'; // -=
IncOp : 'mate'; // ++
DecOp : 'prey'; // -- 
LessOp : '<';
LessEqualOp : '<=';
GreaterOp : '>';
GreaterEqualOp : '>=';
EqualOp : '==';
NotEqualOp : '!=';
AndOp : '&&';
OrOp : '||';
NotOp : '!';
OpenPar : '(';
ClosePar : ')';
OpenBracket : '[';
CloseBracket : ']';
Separator : ',';
Terminator : '<3';
OpenBrace : 'e-worm'; // {
CloseBrace : 'f-worm'; // }
CommentBlock : '#';

// Keywords
VoidKey : 'neuter';
MainKey : 'zoo';
PrintKey : 'print';
ScanKey : 'scan';
IntKey : 'sheep';
FloatKey : 'otter';
StringKey : 'snake';
CharKey : 'worm';
BooleanKey : 'boo';
ArrayKey : 'spider'; // Ex: int[] -> sheep spider varName; varName spider 0 = 5; -- assign value 5 to varName's first index 
PrintfKey : 'purr';
ScanfKey : 'rawr';
IfKey : 'dog';
ElseKey : 'cat';
ElseIfKey : 'catdog';
ForKey : 'foodchain';
WhileKey : 'run';
DoWhileKey : 'move';
ReturnKey : 'back';
NullKey : 'extinct';

// Variable Name
Var : [A-Za-z_]+;
// Function Name
Func : 'func'[A-Za-z]*;

// String content
Char : .;
String : [.]+;

/** PARSER */
// Main / Start of grammar
// TODO : How to add function declarations into grammar
s : VoidKey MainKey OpenPar ClosePar code_block;

// Code Block
// TODO: for every statement, add to statement cfg!
code_block : OpenBrace statement CloseBrace; // TODO : tama ba to? once lang tatawagin statement haha i cannot sabaw na ko 3am na XD
statement : var_dec | var_init | var_assign | addsub_assign | inc_dec | expr | condition | for_loop | while_loop | dowhile_loop | func_call;

// Datatypes
datatype : IntKey | FloatKey | StringKey | CharKey | BooleanKey;
array_datatype : datatype ArrayKey;

// Literals (For integers, the Num rule is used)
boolean_lit : 'diurnal' | 'nocturnal'; // true / false
float_lit : (Num '.' Num) | ('.' Num);
char_lit : '`' Char '`'; 
string_lit : '~' String '~';
literal : Num | boolean_lit | float_lit | char_lit | string_lit;

// Variable Declaration / Initialization
var_dec : datatype Var Terminator | array_datatype Var next_var
		| datatype Var next_var | array_datatype Var Terminator; // int a; | int[] a; | 
next_var : Separator Var | Separator Var Terminator; // , x, y;
var_init : datatype Var AssignOp (literal | expr) Terminator | datatype Var AssignOp (literal | expr) next_var_i
		| array_datatype Var AssignOp 'new' ArrayKey (Num | expr) Terminator | array_datatype Var AssignOp 'new' ArrayKey (Num | expr) next_arr_i;
next_var_i : Separator Var AssignOp (literal | expr) | Separator Var AssignOp (literal | expr) Terminator;
next_arr_i : Separator Var AssignOp 'new' ArrayKey (Num | expr) | Separator Var AssignOp 'new' ArrayKey (Num | expr) Terminator;

// Index of an Array
array_index : Var ArrayKey Num | OpenPar Var ArrayKey Num ClosePar;

// Assignment Statements
// TODO : dito na rin ba ichecheck kung tama yung datatype ng inassign na value
//			(i.e. int x; x = 'a'; OR char c; c += 5; OR String s; s++;)?
//		  pati kung declared yung variable na inaassign (int x; x = y; OR int y; x = y;)?
var_assign : Var AssignOp (literal | expr | Var) Terminator;
array_assign : array_index AssignOp (literal | expr | Var) Terminator;
addsub_assign: Var (AddAssignOp | SubAssignOp) (literal | expr | Var) Terminator;
inc_dec : Var (IncOp | DecOp) Terminator;

// Arithmetic Expressions
// TODO : add float to grammar
//		  add Terminator
expr : '-' expr								#NegaExpr 
	| OpenPar expr ClosePar					#ParenExpr
	| expr (MultOp | DivOp | ModOp) expr	#MultDivMod
	| expr (AddOp | SubOp) expr				#AddSub
	| Num | float_lit	 					#Unit
	| '-' Num | '-'	float_lit				#NegaUnit;
	
// Conditional Statements
cond_op : LessOp | LessEqualOp | GreaterOp | GreaterEqualOp | EqualOp | NotEqualOp;
not : NotOp; // special case to since una sya sa statement (i.e. if (!true))
gates : AndOp | OrOp;
cond_expr : not (literal | expr | Var) cond_op (literal | expr | Var) next_cond_expr 
		| not (literal | expr | Var) cond_op (literal | expr | Var)
		| (literal | expr | Var) cond_op (literal | expr | Var) next_cond_expr
		| (literal | expr | Var) cond_op (literal | expr | Var);
next_cond_expr : gates (literal | expr | Var) cond_op (literal | expr | Var);
cond : IfKey OpenPar cond_expr ClosePar code_block;
next_cond : ElseKey code_block;
next_cond2 : ElseIfKey OpenPar cond_expr ClosePar code_block;
condition : cond | cond next_cond | cond (condition2 | next_cond2) | cond (condition2 | next_cond2) next_cond; // not sure
condition2 : next_cond2 next_cond2 | next_cond2; // if tama

// Loop Statements
for_loop : ForKey OpenPar cond_expr ClosePar code_block;
while_loop : WhileKey OpenPar cond_expr ClosePar code_block;
dowhile_loop : DoWhileKey code_block WhileKey OpenPar cond_expr ClosePar Terminator;

// Function Declaration & Call
param_dec : datatype Var | datatype Var next_param_dec
		| datatype array_index | datatype array_index next_param_dec
		| array_datatype Var | array_datatype Var next_param_dec;
next_param_dec : Separator datatype Var | Separator datatype array_index | Separator array_datatype Var | param_dec;
func_dec : datatype Func OpenPar param_dec ClosePar code_block;
param_call : Var next_param_call | array_index next_param_call | array_index | Var;
next_param_call : Separator Var | Separator array_index | param_call;
func_call : Func OpenPar param_call ClosePar Terminator;

// Pre-defined Functions (printf & scanf)
// TODO : Take note that printf and scanf functions should NOT be able to accept arrays as parameters (unless the index is indicated)
predef_param : (Var | literal | array_index | expr) next_predef_param | (Var | literal | array_index | expr);
next_predef_param : AddOp (Var | literal | array_index | expr) | predef_param;
print_var : PrintKey OpenPar predef_param ClosePar Terminator; 
scan_lit : string_lit | char_lit | Num | float_lit;
scan : ScanKey OpenPar scan_lit ClosePar Terminator;

WS : [' '\t'\r''\n']+ -> skip;




