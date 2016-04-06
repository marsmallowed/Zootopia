package antlr;
// Generated from Grammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code atom}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull GrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull GrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterChar(@NotNull GrammarParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitChar(@NotNull GrammarParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(@NotNull GrammarParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(@NotNull GrammarParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var_init}.
	 * @param ctx the parse tree
	 */
	void enterVar_init(@NotNull GrammarParser.Var_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var_init}.
	 * @param ctx the parse tree
	 */
	void exitVar_init(@NotNull GrammarParser.Var_initContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArrayOp(@NotNull GrammarParser.ArrayOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArrayOp(@NotNull GrammarParser.ArrayOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#param_call}.
	 * @param ctx the parse tree
	 */
	void enterParam_call(@NotNull GrammarParser.Param_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#param_call}.
	 * @param ctx the parse tree
	 */
	void exitParam_call(@NotNull GrammarParser.Param_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(@NotNull GrammarParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(@NotNull GrammarParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#param_dec}.
	 * @param ctx the parse tree
	 */
	void enterParam_dec(@NotNull GrammarParser.Param_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#param_dec}.
	 * @param ctx the parse tree
	 */
	void exitParam_dec(@NotNull GrammarParser.Param_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloat(@NotNull GrammarParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloat(@NotNull GrammarParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull GrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull GrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#next_var_i}.
	 * @param ctx the parse tree
	 */
	void enterNext_var_i(@NotNull GrammarParser.Next_var_iContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#next_var_i}.
	 * @param ctx the parse tree
	 */
	void exitNext_var_i(@NotNull GrammarParser.Next_var_iContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegaExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegaExpr(@NotNull GrammarParser.NegaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegaExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegaExpr(@NotNull GrammarParser.NegaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link GrammarParser#boolean_lit}.
	 * @param ctx the parse tree
	 */
	void enterFalse(@NotNull GrammarParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link GrammarParser#boolean_lit}.
	 * @param ctx the parse tree
	 */
	void exitFalse(@NotNull GrammarParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(@NotNull GrammarParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(@NotNull GrammarParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elseif_cond}.
	 * @param ctx the parse tree
	 */
	void enterElseif_cond(@NotNull GrammarParser.Elseif_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elseif_cond}.
	 * @param ctx the parse tree
	 */
	void exitElseif_cond(@NotNull GrammarParser.Elseif_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#array_index}.
	 * @param ctx the parse tree
	 */
	void enterArray_index(@NotNull GrammarParser.Array_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#array_index}.
	 * @param ctx the parse tree
	 */
	void exitArray_index(@NotNull GrammarParser.Array_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#for_param}.
	 * @param ctx the parse tree
	 */
	void enterFor_param(@NotNull GrammarParser.For_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#for_param}.
	 * @param ctx the parse tree
	 */
	void exitFor_param(@NotNull GrammarParser.For_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_block}.
	 * @param ctx the parse tree
	 */
	void enterFunc_block(@NotNull GrammarParser.Func_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_block}.
	 * @param ctx the parse tree
	 */
	void exitFunc_block(@NotNull GrammarParser.Func_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ret_func}.
	 * @param ctx the parse tree
	 */
	void enterRet_func(@NotNull GrammarParser.Ret_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ret_func}.
	 * @param ctx the parse tree
	 */
	void exitRet_func(@NotNull GrammarParser.Ret_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#addsub_assign}.
	 * @param ctx the parse tree
	 */
	void enterAddsub_assign(@NotNull GrammarParser.Addsub_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#addsub_assign}.
	 * @param ctx the parse tree
	 */
	void exitAddsub_assign(@NotNull GrammarParser.Addsub_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andCon}
	 * labeled alternative in {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void enterAndCon(@NotNull GrammarParser.AndConContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andCon}
	 * labeled alternative in {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void exitAndCon(@NotNull GrammarParser.AndConContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(@NotNull GrammarParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(@NotNull GrammarParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(@NotNull GrammarParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(@NotNull GrammarParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull GrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull GrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull GrammarParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull GrammarParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterCallOp(@NotNull GrammarParser.CallOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitCallOp(@NotNull GrammarParser.CallOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orCon}
	 * labeled alternative in {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void enterOrCon(@NotNull GrammarParser.OrConContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orCon}
	 * labeled alternative in {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void exitOrCon(@NotNull GrammarParser.OrConContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#scan_lit}.
	 * @param ctx the parse tree
	 */
	void enterScan_lit(@NotNull GrammarParser.Scan_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#scan_lit}.
	 * @param ctx the parse tree
	 */
	void exitScan_lit(@NotNull GrammarParser.Scan_litContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterVariableOp(@NotNull GrammarParser.VariableOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitVariableOp(@NotNull GrammarParser.VariableOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#void_func}.
	 * @param ctx the parse tree
	 */
	void enterVoid_func(@NotNull GrammarParser.Void_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#void_func}.
	 * @param ctx the parse tree
	 */
	void exitVoid_func(@NotNull GrammarParser.Void_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivMod(@NotNull GrammarParser.MultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivMod(@NotNull GrammarParser.MultDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(@NotNull GrammarParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(@NotNull GrammarParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(@NotNull GrammarParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(@NotNull GrammarParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dowhile_loop}.
	 * @param ctx the parse tree
	 */
	void enterDowhile_loop(@NotNull GrammarParser.Dowhile_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dowhile_loop}.
	 * @param ctx the parse tree
	 */
	void exitDowhile_loop(@NotNull GrammarParser.Dowhile_loopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incdecOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterIncdecOp(@NotNull GrammarParser.IncdecOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incdecOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitIncdecOp(@NotNull GrammarParser.IncdecOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterLiteralOp(@NotNull GrammarParser.LiteralOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitLiteralOp(@NotNull GrammarParser.LiteralOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#array_assign}.
	 * @param ctx the parse tree
	 */
	void enterArray_assign(@NotNull GrammarParser.Array_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#array_assign}.
	 * @param ctx the parse tree
	 */
	void exitArray_assign(@NotNull GrammarParser.Array_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void enterIf_cond(@NotNull GrammarParser.If_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void exitIf_cond(@NotNull GrammarParser.If_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(@NotNull GrammarParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(@NotNull GrammarParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(@NotNull GrammarParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(@NotNull GrammarParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#next_var}.
	 * @param ctx the parse tree
	 */
	void enterNext_var(@NotNull GrammarParser.Next_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#next_var}.
	 * @param ctx the parse tree
	 */
	void exitNext_var(@NotNull GrammarParser.Next_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentCond}
	 * labeled alternative in {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void enterParentCond(@NotNull GrammarParser.ParentCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentCond}
	 * labeled alternative in {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void exitParentCond(@NotNull GrammarParser.ParentCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull GrammarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull GrammarParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#array_datatype}.
	 * @param ctx the parse tree
	 */
	void enterArray_datatype(@NotNull GrammarParser.Array_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#array_datatype}.
	 * @param ctx the parse tree
	 */
	void exitArray_datatype(@NotNull GrammarParser.Array_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#else_cond}.
	 * @param ctx the parse tree
	 */
	void enterElse_cond(@NotNull GrammarParser.Else_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#else_cond}.
	 * @param ctx the parse tree
	 */
	void exitElse_cond(@NotNull GrammarParser.Else_condContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link GrammarParser#boolean_lit}.
	 * @param ctx the parse tree
	 */
	void enterTrue(@NotNull GrammarParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link GrammarParser#boolean_lit}.
	 * @param ctx the parse tree
	 */
	void exitTrue(@NotNull GrammarParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#next_arr_i}.
	 * @param ctx the parse tree
	 */
	void enterNext_arr_i(@NotNull GrammarParser.Next_arr_iContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#next_arr_i}.
	 * @param ctx the parse tree
	 */
	void exitNext_arr_i(@NotNull GrammarParser.Next_arr_iContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomCon}
	 * labeled alternative in {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomCon(@NotNull GrammarParser.AtomConContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomCon}
	 * labeled alternative in {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomCon(@NotNull GrammarParser.AtomConContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull GrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull GrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void enterInc_dec(@NotNull GrammarParser.Inc_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void exitInc_dec(@NotNull GrammarParser.Inc_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(@NotNull GrammarParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(@NotNull GrammarParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#main_func}.
	 * @param ctx the parse tree
	 */
	void enterMain_func(@NotNull GrammarParser.Main_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#main_func}.
	 * @param ctx the parse tree
	 */
	void exitMain_func(@NotNull GrammarParser.Main_funcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull GrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull GrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(@NotNull GrammarParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(@NotNull GrammarParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(@NotNull GrammarParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(@NotNull GrammarParser.DatatypeContext ctx);
}