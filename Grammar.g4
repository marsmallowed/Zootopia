/**
 * Define a grammar called Hello
 */
grammar Grammar;

/** LEXER */
Num	: [0-9]+; 
Float: [0-9]+ '.' [0-9]+ ('e''-'?[0-9]+)?;

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
CommentBlock : '#'(''..'~')* -> skip;

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
Func : 'func'[A-Za-z]+;
Var : [A-Za-z_]+;
Char : '`' (''..'~') '`';
String : '~' (''..'~')* '~';

/** PARSER */
start 
	: (func_block)? main_func;

main_func
	: VoidKey MainKey OpenPar ClosePar OpenBrace code_block CloseBrace;
	
func_block
	: function func_block
	| function;
	
function
	: void_func
	| ret_func;
	
void_func
	: VoidKey Func OpenPar (param_dec)? ClosePar OpenBrace code_block CloseBrace;
	
ret_func
	: datatype Func OpenPar (param_dec)? ClosePar OpenBrace code_block ReturnKey (literal|Var|expr) Terminator CloseBrace;

code_block 
	: (statement code_block)?;
	
statement 
	: var_dec 
	| var_init 
	| var_assign 
	| addsub_assign 
	| inc_dec 
	| expr Terminator
	| conditional 
	| for_loop 
	| while_loop 
	| dowhile_loop 
	| func_call Terminator
	| print
	| scan;

// Datatypes
datatype
	: IntKey 
	| FloatKey 
	| StringKey 
	| CharKey 
	| BooleanKey;
	
array_datatype 
	: datatype ArrayKey;

// Literals (For integers, the Num rule is used)
boolean_lit 
	: 'diurnal' 	#true
	| 'nocturnal'	#false;
	 
literal 
	: SubOp? Num 	#integer
	| boolean_lit 	#boolean
	| SubOp? Float 	#float
	| Char 			#char
	| String		#string;

// Variable Declaration / Initialization
var_dec 
	: datatype Var Terminator 
	| array_datatype Var next_var
	| datatype Var next_var 
	| array_datatype Var Terminator;
	
next_var 
	: Separator Var 
	| Separator Var Terminator;
	
var_init 
	: datatype Var AssignOp (literal | expr) Terminator 
	| datatype Var AssignOp (literal | expr) next_var_i
	| array_datatype Var AssignOp 'new' ArrayKey (Num | expr) Terminator 
	| array_datatype Var AssignOp 'new' ArrayKey (Num | expr) next_arr_i;
	
next_var_i 
	: Separator Var AssignOp (literal | expr) 
	| Separator Var AssignOp (literal | expr) Terminator;
	
next_arr_i 
	: Separator Var AssignOp 'new' ArrayKey (Num | expr) 
	| Separator Var AssignOp 'new' ArrayKey (Num | expr) Terminator;

// Index of an Array
array_index 
	: Var ArrayKey Num 
	| OpenPar Var ArrayKey Num ClosePar;

// Assignment Statements
var_assign 
	: Var AssignOp (func_call | expr | literal | Var ) Terminator;
	
array_assign 
	: array_index AssignOp (literal | expr | Var) Terminator;
	
addsub_assign
	: Var (AddAssignOp | SubAssignOp) (literal | expr | Var) Terminator;
	
inc_dec 
	: Var (IncOp | DecOp) Terminator;

// Arithmetic Expressions
expr : '-' expr								#NegaExpr 
	| OpenPar expr ClosePar					#ParenExpr
	| expr (MultOp | DivOp | ModOp) expr	#MultDivMod
	| expr (AddOp | SubOp) expr				#AddSub
	| literal								#atom
	| Var									#variable;
	
// Conditional Statements
cond_op 
	: LessOp 
	| LessEqualOp 
	| GreaterOp 
	| GreaterEqualOp 
	| EqualOp 
	| NotEqualOp;
	
cond_expr 
	: NotOp? OpenPar cond_expr ClosePar 	#ParentCond
	| cond_expr AndOp cond_expr				#andCon
	| cond_expr OrOp cond_expr				#orCon
	| condition							#atomCon;
	
condition
	: expr cond_op expr;
	
if_cond 
	: IfKey OpenPar cond_expr ClosePar OpenBrace code_block CloseBrace;
	
else_cond 
	: ElseKey OpenBrace code_block CloseBrace;

elseif_cond
	: ElseIfKey OpenPar cond_expr ClosePar OpenBrace code_block CloseBrace;

conditional
	: if_cond
	| if_cond (elseif_cond)* else_cond?;

// Loop Statements
for_loop 
	: ForKey OpenPar cond_expr ClosePar OpenBrace code_block CloseBrace;
	
while_loop 
	: WhileKey OpenPar cond_expr ClosePar OpenBrace code_block CloseBrace;
	
dowhile_loop 
	: DoWhileKey OpenBrace code_block CloseBrace WhileKey OpenPar cond_expr ClosePar Terminator;

// Function Declaration & Call
param_dec 
	: datatype Var Separator param_dec
	| datatype array_index Separator param_dec
	| array_datatype Var Separator param_dec
	| datatype Var
	| datatype array_index 
	| array_datatype Var ;
	
func_dec 
	: datatype Func OpenPar param_dec ClosePar OpenBrace code_block CloseBrace;

param_call 
	: Var Separator param_call
	| array_index Separator param_call
	| literal Separator param_call
	| array_index
	| literal
	| Var;

func_call 
	: Func OpenPar param_call ClosePar;

// Pre-defined Functions (printf & scanf)
// TODO : Take note that printf and scanf functions should NOT be able to accept arrays as parameters (unless the index is indicated)
predef_param 
	: (Var | literal | array_index | expr) next_predef_param 
	| (Var | literal | array_index | expr);
	
next_predef_param 
	: AddOp (Var | literal | array_index | expr) 
	| predef_param;
	
print 
	: PrintKey OpenPar predef_param ClosePar Terminator; 
	
scan_lit 
	: String 
	| Char 
	| Num 
	| Float;
	
scan 
	: ScanKey OpenPar scan_lit ClosePar Terminator;

WS : [' '\t'\r''\n']+ -> skip;




