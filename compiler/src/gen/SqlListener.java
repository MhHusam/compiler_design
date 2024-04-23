// Generated from C:/Users/Abd Shammout/Documents/compiler/compilerAbdNew/src\Sql.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SqlParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SqlParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SqlParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SqlParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SqlParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#java_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterJava_stmt_list(SqlParser.Java_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#java_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitJava_stmt_list(SqlParser.Java_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SqlParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SqlParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#java_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJava_stmt(SqlParser.Java_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#java_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJava_stmt(SqlParser.Java_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_stmt(SqlParser.Create_type_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_stmt(SqlParser.Create_type_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_Aggregation_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_Aggregation_function(SqlParser.Create_Aggregation_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_Aggregation_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_Aggregation_function(SqlParser.Create_Aggregation_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aggregation_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_function_name(SqlParser.Aggregation_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aggregation_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_function_name(SqlParser.Aggregation_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aggregation_function_className}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_function_className(SqlParser.Aggregation_function_classNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aggregation_function_className}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_function_className(SqlParser.Aggregation_function_classNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aggregation_function_methodName}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_function_methodName(SqlParser.Aggregation_function_methodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aggregation_function_methodName}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_function_methodName(SqlParser.Aggregation_function_methodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aggregation_function_return_type}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_function_return_type(SqlParser.Aggregation_function_return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aggregation_function_return_type}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_function_return_type(SqlParser.Aggregation_function_return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SqlParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SqlParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#inner_join_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInner_join_stmt(SqlParser.Inner_join_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#inner_join_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInner_join_stmt(SqlParser.Inner_join_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#where_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhere_stmt(SqlParser.Where_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#where_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhere_stmt(SqlParser.Where_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whete_condition}.
	 * @param ctx the parse tree
	 */
	void enterWhete_condition(SqlParser.Whete_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whete_condition}.
	 * @param ctx the parse tree
	 */
	void exitWhete_condition(SqlParser.Whete_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#query_condition_operations}.
	 * @param ctx the parse tree
	 */
	void enterQuery_condition_operations(SqlParser.Query_condition_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#query_condition_operations}.
	 * @param ctx the parse tree
	 */
	void exitQuery_condition_operations(SqlParser.Query_condition_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void enterJoin_condition(SqlParser.Join_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void exitJoin_condition(SqlParser.Join_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_query}.
	 * @param ctx the parse tree
	 */
	void enterExpr_query(SqlParser.Expr_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_query}.
	 * @param ctx the parse tree
	 */
	void exitExpr_query(SqlParser.Expr_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#list_literal_value}.
	 * @param ctx the parse tree
	 */
	void enterList_literal_value(SqlParser.List_literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#list_literal_value}.
	 * @param ctx the parse tree
	 */
	void exitList_literal_value(SqlParser.List_literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SqlParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SqlParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SqlParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SqlParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#result_column_with_aggregation_function}.
	 * @param ctx the parse tree
	 */
	void enterResult_column_with_aggregation_function(SqlParser.Result_column_with_aggregation_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#result_column_with_aggregation_function}.
	 * @param ctx the parse tree
	 */
	void exitResult_column_with_aggregation_function(SqlParser.Result_column_with_aggregation_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SqlParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(SqlParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(SqlParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#type_file}.
	 * @param ctx the parse tree
	 */
	void enterType_file(SqlParser.Type_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#type_file}.
	 * @param ctx the parse tree
	 */
	void exitType_file(SqlParser.Type_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_var_java_not_assignmen}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var_java_not_assignmen(SqlParser.Declare_var_java_not_assignmenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_var_java_not_assignmen}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var_java_not_assignmen(SqlParser.Declare_var_java_not_assignmenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_var_java}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var_java(SqlParser.Declare_var_javaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_var_java}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var_java(SqlParser.Declare_var_javaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assignment_var_list_java}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_var_list_java(SqlParser.Assignment_var_list_javaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assignment_var_list_java}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_var_list_java(SqlParser.Assignment_var_list_javaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assignment_var_java}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_var_java(SqlParser.Assignment_var_javaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assignment_var_java}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_var_java(SqlParser.Assignment_var_javaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assignment_var_list_without_declare_java}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_var_list_without_declare_java(SqlParser.Assignment_var_list_without_declare_javaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assignment_var_list_without_declare_java}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_var_list_without_declare_java(SqlParser.Assignment_var_list_without_declare_javaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assignment_var_without_declare_java}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_var_without_declare_java(SqlParser.Assignment_var_without_declare_javaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assignment_var_without_declare_java}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_var_without_declare_java(SqlParser.Assignment_var_without_declare_javaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list(SqlParser.Parameters_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list(SqlParser.Parameters_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#default_parameters}.
	 * @param ctx the parse tree
	 */
	void enterDefault_parameters(SqlParser.Default_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#default_parameters}.
	 * @param ctx the parse tree
	 */
	void exitDefault_parameters(SqlParser.Default_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void enterArguments_list(SqlParser.Arguments_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void exitArguments_list(SqlParser.Arguments_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(SqlParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(SqlParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#arrow_function_java}.
	 * @param ctx the parse tree
	 */
	void enterArrow_function_java(SqlParser.Arrow_function_javaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#arrow_function_java}.
	 * @param ctx the parse tree
	 */
	void exitArrow_function_java(SqlParser.Arrow_function_javaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_java_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_java_name(SqlParser.Function_java_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_java_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_java_name(SqlParser.Function_java_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_java_rule}.
	 * @param ctx the parse tree
	 */
	void enterFunction_java_rule(SqlParser.Function_java_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_java_rule}.
	 * @param ctx the parse tree
	 */
	void exitFunction_java_rule(SqlParser.Function_java_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_java_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_java_header(SqlParser.Function_java_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_java_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_java_header(SqlParser.Function_java_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_java_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_java_call(SqlParser.Function_java_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_java_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_java_call(SqlParser.Function_java_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#print_java}.
	 * @param ctx the parse tree
	 */
	void enterPrint_java(SqlParser.Print_javaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#print_java}.
	 * @param ctx the parse tree
	 */
	void exitPrint_java(SqlParser.Print_javaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#while_java_rule}.
	 * @param ctx the parse tree
	 */
	void enterWhile_java_rule(SqlParser.While_java_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#while_java_rule}.
	 * @param ctx the parse tree
	 */
	void exitWhile_java_rule(SqlParser.While_java_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#while_java_header}.
	 * @param ctx the parse tree
	 */
	void enterWhile_java_header(SqlParser.While_java_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#while_java_header}.
	 * @param ctx the parse tree
	 */
	void exitWhile_java_header(SqlParser.While_java_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#do_while_java_rule}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_java_rule(SqlParser.Do_while_java_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#do_while_java_rule}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_java_rule(SqlParser.Do_while_java_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#for_java_rule}.
	 * @param ctx the parse tree
	 */
	void enterFor_java_rule(SqlParser.For_java_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#for_java_rule}.
	 * @param ctx the parse tree
	 */
	void exitFor_java_rule(SqlParser.For_java_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#for_java_header}.
	 * @param ctx the parse tree
	 */
	void enterFor_java_header(SqlParser.For_java_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#for_java_header}.
	 * @param ctx the parse tree
	 */
	void exitFor_java_header(SqlParser.For_java_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#shorten_operators_java}.
	 * @param ctx the parse tree
	 */
	void enterShorten_operators_java(SqlParser.Shorten_operators_javaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#shorten_operators_java}.
	 * @param ctx the parse tree
	 */
	void exitShorten_operators_java(SqlParser.Shorten_operators_javaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_java_rule}.
	 * @param ctx the parse tree
	 */
	void enterIf_java_rule(SqlParser.If_java_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_java_rule}.
	 * @param ctx the parse tree
	 */
	void exitIf_java_rule(SqlParser.If_java_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_basic_java_rule}.
	 * @param ctx the parse tree
	 */
	void enterIf_basic_java_rule(SqlParser.If_basic_java_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_basic_java_rule}.
	 * @param ctx the parse tree
	 */
	void exitIf_basic_java_rule(SqlParser.If_basic_java_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#body_brackets_java}.
	 * @param ctx the parse tree
	 */
	void enterBody_brackets_java(SqlParser.Body_brackets_javaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#body_brackets_java}.
	 * @param ctx the parse tree
	 */
	void exitBody_brackets_java(SqlParser.Body_brackets_javaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#condition_java}.
	 * @param ctx the parse tree
	 */
	void enterCondition_java(SqlParser.Condition_javaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#condition_java}.
	 * @param ctx the parse tree
	 */
	void exitCondition_java(SqlParser.Condition_javaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stmt(SqlParser.Switch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stmt(SqlParser.Switch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(SqlParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(SqlParser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void enterJava_body(SqlParser.Java_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void exitJava_body(SqlParser.Java_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(SqlParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(SqlParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SqlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SqlParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SqlParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SqlParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#any_name_no_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAny_name_no_keyword(SqlParser.Any_name_no_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#any_name_no_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAny_name_no_keyword(SqlParser.Any_name_no_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(SqlParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(SqlParser.Var_nameContext ctx);
}