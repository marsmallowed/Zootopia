/**
 * Define a grammar called Hello
 */
grammar Grammar;

/** LEXER */
MainKey : 'zoo';
VoidKey : 'neuter';
IntKey : 'sheep';
FloatKey : 'otter';
StringKey : 'snake';
CharKey : 'worm';
BooleanKey : 'boo';
ArrayKey : 'spider'; // Ex: int[] -> sheep spider varName; varName spider 0 = 5; -- assign value 5 to varName's first index 
Num	: [0-9]+; 
Float: [0-9]+ '.' [0-9]+;
Char : '`' [A-Za-z]? '`';
String : '~' [A-Za-z]* '~';
TrueKey: 'diurnal';
FalseKey: 'nocturnal';
PrintKey : 'purr';
ScanKey : 'rawr';
Terminator : '<3';
ElseIfKey : 'catdog';
IfKey : 'dog';
ElseKey : 'cat';
ForKey : 'foodchain';
WhileKey : 'run';
DoWhileKey : 'move';
OpenPar : '(';
ClosePar : ')';
OpenBracket : '[';
CloseBracket : ']';
OpenBrace : 'e-worm'; // {
CloseBrace : 'f-worm'; // }
AddAssignOp : 'arfthis'; // +=
SubAssignOp : 'sssthis'; // -=
AddOp : 'arf'; // +
SubOp : 'sss'; // -
MultOp : 'meow'; // *
DivOp : 'dook'; // /
ModOp : 'mooodulo'; // %
ExpOp : 'powpow'; // ^
IncOp : 'mate'; // ++
DecOp : 'prey'; // -- 
NewKey : 'new';
ReturnKey : 'back';
NullKey : 'extinct';
LessEqualOp : '<=';
GreaterEqualOp : '>=';
LessOp : '<';
GreaterOp : '>';
NotEqualOp : '!=';
EqualOp : '==';
AssignOp : '=';
NotOp : '!';
AndOp : '&&';
OrOp : '||';
Separator : ',';
CondSep: ':';
Func : 'func'[A-Za-z]+;
CommentBlock : 'noise' '-' ~[\r\n]* '\r\n'? '-' -> skip ;
Var : [A-Za-z_]+;

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
	: datatype Func OpenPar (param_dec)? ClosePar OpenBrace code_block ReturnKey expr Terminator CloseBrace;

code_block 
	: statement code_block
	| statement;
	
statement 
	: var_dec 
	| var_init 
	| var_assign 
	| addsub_assign 
	| inc_dec Terminator
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
	: TrueKey 	#true
	| FalseKey	#false;
	 
literal 
	: SubOp? Num 	#integer
	| boolean_lit 	#boolean
	| SubOp? Float 	#float
	| Char 			#char
	| String		#string;

// Variable Declaration / Initialization
var_dec 
	: datatype Var Terminator 
	| array_datatype Var Terminator
	| array_datatype Var next_var
	| datatype Var next_var;
	
next_var 
	: Separator Var next_var 
	| Separator Var Terminator;
	
var_init 
	: datatype Var AssignOp expr Terminator 
	| datatype Var AssignOp expr next_var_i
	| array_datatype Var AssignOp NewKey ArrayKey expr Terminator 
	| array_datatype Var AssignOp NewKey ArrayKey expr next_arr_i;
	
next_var_i 
	: Separator Var AssignOp expr next_var_i
	| Separator Var AssignOp expr Terminator;
	
next_arr_i 
	: Separator Var AssignOp NewKey ArrayKey expr next_arr_i
	| Separator Var AssignOp NewKey ArrayKey expr Terminator;

// Index of an Array
array_index 
	: Var ArrayKey Num 
	| OpenPar Var ArrayKey Num ClosePar;

// Assignment Statements
var_assign 
	: Var AssignOp expr Terminator;
	
array_assign 
	: array_index AssignOp expr Terminator;
	
addsub_assign
	: Var (AddAssignOp | SubAssignOp) expr Terminator;
	
inc_dec 
	: Var (IncOp | DecOp);

// Arithmetic Expressions
expr
	: '-' expr								#NegaExpr 
	| OpenPar expr ClosePar					#ParenExpr
	| expr (MultOp | DivOp | ModOp) expr	#MultDivMod
	| expr (AddOp | SubOp) expr				#AddSub
	| operand								#atom;
	
operand
	: literal		#literalOp
	| Var			#variableOp
	| array_index   #arrayOp
	| func_call		#callOp
	| inc_dec		#incdecOp;
	
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
	: expr (cond_op expr)?;
	
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
	: ForKey OpenPar (cond_expr | cond_expr CondSep cond_expr) ClosePar OpenBrace code_block CloseBrace;
	
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
//predef_param 
//	: expr next_predef_param 
//	| (Var | literal | array_index | expr);
//	
//next_predef_param 
//	: AddOp expr 
//	| predef_param;
	
print 
	: PrintKey OpenPar expr ClosePar Terminator; 
	
scan_lit 
	: String 
	| Char 
	| Num 
	| Float;
	
scan 
	: ScanKey OpenPar scan_lit ClosePar Terminator;

WS : [' '\t'\r''\n']+ -> skip;