package antlr;

// Generated from Grammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(@NotNull GrammarParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#main_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_func(@NotNull GrammarParser.Main_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(@NotNull GrammarParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull GrammarParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(@NotNull GrammarParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incdecOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncdecOp(@NotNull GrammarParser.IncdecOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomCon}
	 * labeled alternative in {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomCon(@NotNull GrammarParser.AtomConContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(@NotNull GrammarParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivMod(@NotNull GrammarParser.MultDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull GrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elseif_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_cond(@NotNull GrammarParser.Elseif_condContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayOp(@NotNull GrammarParser.ArrayOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#void_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_func(@NotNull GrammarParser.Void_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#scan_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan_lit(@NotNull GrammarParser.Scan_litContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallOp(@NotNull GrammarParser.CallOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#next_arr_i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_arr_i(@NotNull GrammarParser.Next_arr_iContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(@NotNull GrammarParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegaExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegaExpr(@NotNull GrammarParser.NegaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralOp(@NotNull GrammarParser.LiteralOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#param_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_dec(@NotNull GrammarParser.Param_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(@NotNull GrammarParser.Param_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#array_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_assign(@NotNull GrammarParser.Array_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#next_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_var(@NotNull GrammarParser.Next_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op(@NotNull GrammarParser.Cond_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#next_var_i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_var_i(@NotNull GrammarParser.Next_var_iContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull GrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link GrammarParser#boolean_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(@NotNull GrammarParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentCond}
	 * labeled alternative in {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentCond(@NotNull GrammarParser.ParentCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(@NotNull GrammarParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull GrammarParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#else_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_cond(@NotNull GrammarParser.Else_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(@NotNull GrammarParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(@NotNull GrammarParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orCon}
	 * labeled alternative in {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCon(@NotNull GrammarParser.OrConContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#var_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_init(@NotNull GrammarParser.Var_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(@NotNull GrammarParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_block(@NotNull GrammarParser.Func_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ret_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet_func(@NotNull GrammarParser.Ret_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(@NotNull GrammarParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#inc_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec(@NotNull GrammarParser.Inc_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_cond(@NotNull GrammarParser.If_condContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull GrammarParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableOp}
	 * labeled alternative in {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOp(@NotNull GrammarParser.VariableOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link GrammarParser#boolean_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(@NotNull GrammarParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andCon}
	 * labeled alternative in {@link GrammarParser#cond_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCon(@NotNull GrammarParser.AndConContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec(@NotNull GrammarParser.Var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull GrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(@NotNull GrammarParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#for_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_param(@NotNull GrammarParser.For_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#addsub_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub_assign(@NotNull GrammarParser.Addsub_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#array_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_datatype(@NotNull GrammarParser.Array_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(@NotNull GrammarParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull GrammarParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#array_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_index(@NotNull GrammarParser.Array_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#dowhile_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile_loop(@NotNull GrammarParser.Dowhile_loopContext ctx);
}