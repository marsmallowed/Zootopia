package model;
// Generated from Grammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#func_dec}.
	 * @param ctx the parse tree
	 */
	void enterFunc_dec(@NotNull GrammarParser.Func_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#func_dec}.
	 * @param ctx the parse tree
	 */
	void exitFunc_dec(@NotNull GrammarParser.Func_decContext ctx);
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
	 * Enter a parse tree produced by the {@code Unit}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnit(@NotNull GrammarParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unit}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnit(@NotNull GrammarParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(@NotNull GrammarParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(@NotNull GrammarParser.CondContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull GrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull GrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#gates}.
	 * @param ctx the parse tree
	 */
	void enterGates(@NotNull GrammarParser.GatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#gates}.
	 * @param ctx the parse tree
	 */
	void exitGates(@NotNull GrammarParser.GatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull GrammarParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull GrammarParser.NotContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(@NotNull GrammarParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(@NotNull GrammarParser.DatatypeContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#next_param_call}.
	 * @param ctx the parse tree
	 */
	void enterNext_param_call(@NotNull GrammarParser.Next_param_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#next_param_call}.
	 * @param ctx the parse tree
	 */
	void exitNext_param_call(@NotNull GrammarParser.Next_param_callContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#float_lit}.
	 * @param ctx the parse tree
	 */
	void enterFloat_lit(@NotNull GrammarParser.Float_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#float_lit}.
	 * @param ctx the parse tree
	 */
	void exitFloat_lit(@NotNull GrammarParser.Float_litContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#next_cond_expr}.
	 * @param ctx the parse tree
	 */
	void enterNext_cond_expr(@NotNull GrammarParser.Next_cond_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#next_cond_expr}.
	 * @param ctx the parse tree
	 */
	void exitNext_cond_expr(@NotNull GrammarParser.Next_cond_exprContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#boolean_lit}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_lit(@NotNull GrammarParser.Boolean_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolean_lit}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_lit(@NotNull GrammarParser.Boolean_litContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#next_param_dec}.
	 * @param ctx the parse tree
	 */
	void enterNext_param_dec(@NotNull GrammarParser.Next_param_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#next_param_dec}.
	 * @param ctx the parse tree
	 */
	void exitNext_param_dec(@NotNull GrammarParser.Next_param_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegaUnit}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegaUnit(@NotNull GrammarParser.NegaUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegaUnit}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegaUnit(@NotNull GrammarParser.NegaUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void enterCond_expr(@NotNull GrammarParser.Cond_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 */
	void exitCond_expr(@NotNull GrammarParser.Cond_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#string_lit}.
	 * @param ctx the parse tree
	 */
	void enterString_lit(@NotNull GrammarParser.String_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#string_lit}.
	 * @param ctx the parse tree
	 */
	void exitString_lit(@NotNull GrammarParser.String_litContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#next_cond}.
	 * @param ctx the parse tree
	 */
	void enterNext_cond(@NotNull GrammarParser.Next_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#next_cond}.
	 * @param ctx the parse tree
	 */
	void exitNext_cond(@NotNull GrammarParser.Next_condContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(@NotNull GrammarParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(@NotNull GrammarParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condition2}.
	 * @param ctx the parse tree
	 */
	void enterCondition2(@NotNull GrammarParser.Condition2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condition2}.
	 * @param ctx the parse tree
	 */
	void exitCondition2(@NotNull GrammarParser.Condition2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#next_cond2}.
	 * @param ctx the parse tree
	 */
	void enterNext_cond2(@NotNull GrammarParser.Next_cond2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#next_cond2}.
	 * @param ctx the parse tree
	 */
	void exitNext_cond2(@NotNull GrammarParser.Next_cond2Context ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#char_lit}.
	 * @param ctx the parse tree
	 */
	void enterChar_lit(@NotNull GrammarParser.Char_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#char_lit}.
	 * @param ctx the parse tree
	 */
	void exitChar_lit(@NotNull GrammarParser.Char_litContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#dowhile_loop}.
	 * @param ctx the parse tree
	 */
	void enterDowhile_loop(@NotNull GrammarParser.Dowhile_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dowhile_loop}.
	 * @param ctx the parse tree
	 */
	void exitDowhile_loop(@NotNull GrammarParser.Dowhile_loopContext ctx);
}