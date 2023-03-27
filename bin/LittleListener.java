// Generated from Little.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LittleParser}.
 */
public interface LittleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LittleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LittleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LittleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(LittleParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(LittleParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void enterPgm_body(LittleParser.Pgm_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void exitPgm_body(LittleParser.Pgm_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(LittleParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(LittleParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void enterString_decl(LittleParser.String_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void exitString_decl(LittleParser.String_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(LittleParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(LittleParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(LittleParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(LittleParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(LittleParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(LittleParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(LittleParser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(LittleParser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(LittleParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(LittleParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_tail(LittleParser.Id_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_tail(LittleParser.Id_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_list(LittleParser.Param_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_list(LittleParser.Param_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(LittleParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(LittleParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_tail(LittleParser.Param_decl_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_tail(LittleParser.Param_decl_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declarations(LittleParser.Func_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declarations(LittleParser.Func_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(LittleParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(LittleParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(LittleParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(LittleParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(LittleParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(LittleParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(LittleParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(LittleParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBase_stmt(LittleParser.Base_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBase_stmt(LittleParser.Base_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(LittleParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(LittleParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(LittleParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(LittleParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(LittleParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(LittleParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(LittleParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(LittleParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(LittleParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(LittleParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LittleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LittleParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefix(LittleParser.Expr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefix(LittleParser.Expr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(LittleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(LittleParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void enterFactor_prefix(LittleParser.Factor_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void exitFactor_prefix(LittleParser.Factor_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expr(LittleParser.Postfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expr(LittleParser.Postfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(LittleParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(LittleParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(LittleParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(LittleParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(LittleParser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(LittleParser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(LittleParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(LittleParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(LittleParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(LittleParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(LittleParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(LittleParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(LittleParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(LittleParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(LittleParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(LittleParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(LittleParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(LittleParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#compop}.
	 * @param ctx the parse tree
	 */
	void enterCompop(LittleParser.CompopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#compop}.
	 * @param ctx the parse tree
	 */
	void exitCompop(LittleParser.CompopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(LittleParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(LittleParser.While_stmtContext ctx);
}