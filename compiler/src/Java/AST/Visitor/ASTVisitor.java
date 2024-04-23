package Java.AST.Visitor;

import Java.AST.Expr;
import Java.AST.LiteralValue;
import Java.AST.Parse;
import Java.AST.RuleJavaStmt.assignmentVarWithoutDeclare.AssignmentJavaVarWithoutDeclare;
import Java.AST.RuleQueryStmt.Create.ColumnDef;
import Java.AST.RuleQueryStmt.Create.CreateType;
import Java.AST.RuleQueryStmt.SQL_Statement_List;
import Java.AST.RuleQueryStmt.Select.*;
import Java.AST.RuleQueryStmt.SQL_Statement;
import Java.AST.RuleQueryStmt.TableName;
import Java.AST.RuleQueryStmt.TypeName;
import Java.AST.RuleQueryStmt.Create.CreateTable;
import Java.AST.RuleJavaStmt.BodyBracketsJava;
import Java.AST.RuleJavaStmt.ConditionJava;
import Java.AST.RuleJavaStmt.JavaBody;
import Java.AST.RuleJavaStmt.JavaStmtList;
import Java.AST.RuleJavaStmt.assignmentVar.AssignmentJavaListVar;
import Java.AST.RuleJavaStmt.assignmentVar.AssignmentJavaVar;
import Java.AST.RuleJavaStmt.declareVar.DeclareJavaVar;
import Java.AST.RuleJavaStmt.declareVarNotAssignmen.DeclareJavaVarNotAssignment;
import Java.AST.RuleJavaStmt.doWhile_stmt.DoWhileJavaRule;
import Java.AST.RuleJavaStmt.for_stmt.ForJavaHeader;
import Java.AST.RuleJavaStmt.for_stmt.ForJavaRule;
import Java.AST.RuleJavaStmt.function.DefaultParameters;
import Java.AST.RuleJavaStmt.function.FunctionJavaHeader;
import Java.AST.RuleJavaStmt.function.FunctionJavaRule;
import Java.AST.RuleJavaStmt.function.ParametersList;
import Java.AST.RuleJavaStmt.function_java_call.Argument;
import Java.AST.RuleJavaStmt.function_java_call.ArgumentsList;
import Java.AST.RuleJavaStmt.function_java_call.ArrowFunctionJava;
import Java.AST.RuleJavaStmt.function_java_call.FunctionJavaCall;
import Java.AST.RuleJavaStmt.if_one_line.IfOneLineJava;
import Java.AST.RuleJavaStmt.if_one_line.IfOneLineReturnJava;
import Java.AST.RuleJavaStmt.if_stmt.IfBasicJavaRule;
import Java.AST.RuleJavaStmt.if_stmt.IfJavaRule;
import Java.AST.RuleJavaStmt.print.PrintJava;
import Java.AST.RuleJavaStmt.return_stmt.ReturnJava;
import Java.AST.RuleJavaStmt.shortenOperators.ShortenJavaOperators;
import Java.AST.RuleJavaStmt.switch_stmt.SwitchJavaCase;
import Java.AST.RuleJavaStmt.switch_stmt.SwitchJavaRule;
import Java.AST.RuleJavaStmt.while_stmt.WhileJavaHeader;
import Java.AST.RuleJavaStmt.while_stmt.WhileJavaRule;
import Java.SymbolTable.AggregationFunction;

public interface ASTVisitor {

    void visit(Parse p);

    void visit(AssignmentJavaListVar assignmentJavaListVar);

    void visit(AssignmentJavaVar assignmentJavaVar);

    void visit(DeclareJavaVar declareJavaVar);

    void visit(DeclareJavaVarNotAssignment declareJavaVarNotAssignment);

    void visit(DoWhileJavaRule doWhileJavaRule);

    void visit(ForJavaHeader forJavaHeader);

    void visit(ForJavaRule forJavaRule);

    void visit(DefaultParameters defaultParameters);

    void visit(FunctionJavaHeader functionJavaHeader);

    void visit(FunctionJavaRule functionJavaRule);

    void visit(ParametersList parametersList);

    void visit(Argument argument);

    void visit(ArgumentsList argumentsList);

    void visit(ArrowFunctionJava arrowFunctionJava);

    void visit(FunctionJavaCall functionJavaCall);

    void visit(IfOneLineJava ifOneLineJava);

    void visit(IfOneLineReturnJava ifOneLineReturnJava);

    void visit(IfBasicJavaRule ifBasicJavaRule);

    void visit(IfJavaRule ifJavaRule);

    void visit(PrintJava printJava);

    void visit(ReturnJava returnJava);

    void visit(ShortenJavaOperators shortenJavaOperators);

    void visit(SwitchJavaCase switchJavaCase);

    void visit(SwitchJavaRule switchJavaRule);

    void visit(WhileJavaHeader whileJavaHeader);

    void visit(WhileJavaRule whileJavaRule);

    void visit(BodyBracketsJava bodyBracketsJava);

    void visit(ConditionJava conditionJava);

    void visit(JavaBody javaBody);

    void visit(JavaStmtList javaStmtList);

    void visit(Expr expr);




    void visit(LiteralValue literalValue);

    void visit(CreateTable createTable);

    void visit(CreateType createType);

    void visit(ColumnDef columnDef);

    void visit(SelectCore selectCore);

    void visit(ResultColumn resultColumn);

    void visit(TableOrSubQuery tableOrSubQuery);

    void visit(SQL_Statement stmt);

    void visit(TableName tableName);

    void visit(TypeName typeName);

    void visit(SQL_Statement_List sql_statement_list);

    void visit(AssignmentJavaVarWithoutDeclare assignmentJavaVarWithoutDeclare);

    void visit(ExprQuery exprQuery);

    void visit(InnerJoinStmt innerJoinStmt);

    void visit(JoinCondition joinCondition);

    void visit(WhereCondition whereCondition);

    void visit(WhereStmt whereStmt);

    void visit(List_literalValue list_literalValue);

    void visit(AggregationFunction aggregationFunction);

    void visit(ResultColumnWithAggregationFunction resultColumnWithAggregationFunction);


//    public void visit(SwitchJavaRule switchJavaRule);
//    public void visit(IfJavaRule ifJavaRule);

//    public void visit(FunctionDeclaration funcDec);
//    public void visit(Statement stmt);
//    public void visit(SelectStmt selectStmt);
//    public void visit(SwitchLabel switchLabel);
//    public void visit(SwitchStatement switchStatement);
//    public void visit(SwitchBlockStatementGroup switchBlockStatementGroup);
//    public void visit(Value value);
//    public void visit(WhileStmt whileStmt);
//    public void visit(SignedNumber signedNumber);
//    public void visit(TableConstraint tableConstraint);
//    public void visit(TC_ForeignKey tc_foreignKey);
//    public void visit(TC_Key tc_key);
//    public void visit(TC_Unique tc_unique);
//    public void visit(TypeName typeName);
}
