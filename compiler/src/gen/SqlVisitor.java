// Generated from C:/Users/Abd Shammout/Documents/compiler/compilerAbdNew/src\Sql.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SqlParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SqlParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#java_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_stmt_list(SqlParser.Java_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SqlParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#java_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_stmt(SqlParser.Java_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_type_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type_stmt(SqlParser.Create_type_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_Aggregation_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_Aggregation_function(SqlParser.Create_Aggregation_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aggregation_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_function_name(SqlParser.Aggregation_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aggregation_function_className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_function_className(SqlParser.Aggregation_function_classNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aggregation_function_methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_function_methodName(SqlParser.Aggregation_function_methodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aggregation_function_return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_function_return_type(SqlParser.Aggregation_function_return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SqlParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#inner_join_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_join_stmt(SqlParser.Inner_join_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#where_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_stmt(SqlParser.Where_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whete_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhete_condition(SqlParser.Whete_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#query_condition_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_condition_operations(SqlParser.Query_condition_operationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_condition(SqlParser.Join_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_query(SqlParser.Expr_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#list_literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_literal_value(SqlParser.List_literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SqlParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SqlParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#result_column_with_aggregation_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column_with_aggregation_function(SqlParser.Result_column_with_aggregation_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(SqlParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_file(SqlParser.Type_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_var_java_not_assignmen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_java_not_assignmen(SqlParser.Declare_var_java_not_assignmenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_var_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_java(SqlParser.Declare_var_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignment_var_list_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_var_list_java(SqlParser.Assignment_var_list_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignment_var_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_var_java(SqlParser.Assignment_var_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignment_var_list_without_declare_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_var_list_without_declare_java(SqlParser.Assignment_var_list_without_declare_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignment_var_without_declare_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_var_without_declare_java(SqlParser.Assignment_var_without_declare_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#parameters_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list(SqlParser.Parameters_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#default_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_parameters(SqlParser.Default_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#arguments_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_list(SqlParser.Arguments_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(SqlParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#arrow_function_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow_function_java(SqlParser.Arrow_function_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_java_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_java_name(SqlParser.Function_java_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_java_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_java_rule(SqlParser.Function_java_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_java_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_java_header(SqlParser.Function_java_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_java_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_java_call(SqlParser.Function_java_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#print_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_java(SqlParser.Print_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#while_java_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_java_rule(SqlParser.While_java_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#while_java_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_java_header(SqlParser.While_java_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#do_while_java_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_java_rule(SqlParser.Do_while_java_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_java_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_java_rule(SqlParser.For_java_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_java_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_java_header(SqlParser.For_java_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#shorten_operators_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShorten_operators_java(SqlParser.Shorten_operators_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_java_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_java_rule(SqlParser.If_java_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_basic_java_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_basic_java_rule(SqlParser.If_basic_java_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#body_brackets_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_brackets_java(SqlParser.Body_brackets_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#condition_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_java(SqlParser.Condition_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#switch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stmt(SqlParser.Switch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(SqlParser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_body(SqlParser.Java_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(SqlParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SqlParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SqlParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_name_no_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name_no_keyword(SqlParser.Any_name_no_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(SqlParser.Var_nameContext ctx);
}