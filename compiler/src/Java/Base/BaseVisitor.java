package Java.Base;

import Java.AST.Expr;
import Java.AST.LiteralValue;
import Java.AST.Parse;
import Java.AST.RuleJavaStmt.assignmentVarWithoutDeclare.AssignmentJavaListVarWithoutDeclare;
import Java.AST.RuleJavaStmt.assignmentVarWithoutDeclare.AssignmentJavaVarWithoutDeclare;
import Java.AST.RuleQueryStmt.Create.ColumnDef;
import Java.AST.RuleQueryStmt.Create.CreateTable;
import Java.AST.RuleQueryStmt.Create.CreateType;
import Java.AST.RuleQueryStmt.SQL_Statement_List;
import Java.AST.RuleQueryStmt.Select.*;
import Java.AST.RuleQueryStmt.TableName;
import Java.AST.RuleQueryStmt.TypeName;
import Java.AST.RuleQueryStmt.SQL_Statement;
import Java.AST.RuleJavaStmt.BodyBracketsJava;
import Java.AST.RuleJavaStmt.ConditionJava;
import Java.AST.RuleJavaStmt.JavaBody;
import Java.AST.RuleJavaStmt.JavaStmtList;
import Java.AST.RuleJavaStmt.JavaStmt;
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
import Java.AST.RuleJavaStmt.if_stmt.IfBasicJavaRule;
import Java.AST.RuleJavaStmt.if_stmt.IfJavaRule;
import Java.AST.RuleJavaStmt.print.PrintJava;
import Java.AST.RuleJavaStmt.return_stmt.ReturnJava;
import Java.AST.RuleJavaStmt.shortenOperators.ShortenJavaOperators;
import Java.AST.RuleJavaStmt.switch_stmt.SwitchJavaCase;
import Java.AST.RuleJavaStmt.switch_stmt.SwitchJavaRule;
import Java.AST.RuleJavaStmt.while_stmt.WhileJavaHeader;
import Java.AST.RuleJavaStmt.while_stmt.WhileJavaRule;
import Java.Main;
import Java.SymbolTable.AggregationFunction;
import Java.SymbolTable.Scope;
import Java.SymbolTable.Symbol;
import Java.SymbolTable.Type;
import gen.SqlBaseVisitor;
import gen.SqlParser;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends SqlBaseVisitor {

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Parse visitParse(SqlParser.ParseContext ctx) {
        System.out.println("visit Parse");
        Parse p = new Parse();

        for (int i = 0; i < ctx.sql_stmt_list().size(); i++) {
            p.getSql_statement_lists().add(visitSql_stmt_list(ctx.sql_stmt_list(i)));
        }

        for (int i = 0; i < ctx.java_stmt_list().size(); i++) {
            p.getJavaStmtLists().add(visitJava_stmt_list(ctx.java_stmt_list(i)));
        }

        p.setLine(ctx.getStart().getLine()); //get line number
        p.setCol(ctx.getStart().getCharPositionInLine()); // get col number

        return p;
    }

    @Override
    public JavaStmtList visitJava_stmt_list(SqlParser.Java_stmt_listContext ctx) {
        System.out.println("visit Java_stmt_list");
        JavaStmtList javaStmtList = new JavaStmtList();
        for (int i = 0; i < ctx.java_stmt().size(); i++) {
            javaStmtList.getJavaStmts().add(visitJava_stmt(ctx.java_stmt(i)));
        }
        return javaStmtList;
    }


    @Override
    public JavaStmt visitJava_stmt(SqlParser.Java_stmtContext ctx) {
        System.out.println("visit Java_stmt");
        createScope();
        FunctionJavaRule functionJavaRule = new FunctionJavaRule();
        functionJavaRule.setScopeID(getCurrentScope().getId());
        functionJavaRule.setFunctionJavaHeader(visitFunction_java_header(ctx.function_java_rule().function_java_header()));
        if (ctx.function_java_rule().java_body()!=null){
            for (int i = 0; i < ctx.function_java_rule().java_body().size(); i++) {
                functionJavaRule.getJavaBodies().add(visitJava_body(ctx.function_java_rule().java_body(i)));
            }
        }
        removeScope();
        return functionJavaRule;
    }

    //============Function_java============
    @Override
    public FunctionJavaHeader visitFunction_java_header(SqlParser.Function_java_headerContext ctx) {
        System.out.println("visit Function_java_header");
        FunctionJavaHeader functionJavaHeader = new FunctionJavaHeader();
        functionJavaHeader.setScopeID(getCurrentScope().getId());
        functionJavaHeader.setFunctionName(ctx.function_java_name().getText());
        functionJavaHeader.setParametersList(visitParameters_list(ctx.parameters_list()));
        return  functionJavaHeader;
    }

    @Override
    public ParametersList visitParameters_list(SqlParser.Parameters_listContext ctx) {
        System.out.println("visit Parameters_list");
        ParametersList parametersList = new ParametersList();
        parametersList.setScopeID(getCurrentScope().getId());
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            String varName = ctx.IDENTIFIER(i).getText();
            parametersList.getParametersNames().add(varName);
//            createSymbol(varName, null, true);
        }
        for (int i = 0; i < ctx.default_parameters().size(); i++) {
            parametersList.getDefaultParameters().add(visitDefault_parameters(ctx.default_parameters(i)));
        }
        return parametersList;
    }

    @Override
    public DefaultParameters visitDefault_parameters(SqlParser.Default_parametersContext ctx) {
        System.out.println("visit Default_parameters");
        DefaultParameters defaultParameters = new DefaultParameters();
        defaultParameters.setScopeID(getCurrentScope().getId());
        String varName = ctx.IDENTIFIER().getText();
        defaultParameters.setParameterName(varName);
        defaultParameters.setParameterVal(visitExpr(ctx.expr()));
//        createSymbol(varName, Symbol.getTypeOfVal(ctx.expr()), true);
        return defaultParameters;
    }
    //====================================






    //============declare_var_java & assignment_var_list_java============

    @Override
    public DeclareJavaVar visitDeclare_var_java(SqlParser.Declare_var_javaContext ctx) {
        System.out.println("visit Declare_var_java");
        DeclareJavaVar declareJavaVar = new DeclareJavaVar();
        declareJavaVar.setScopeID(getCurrentScope().getId());
        declareJavaVar.setAssignmentJavaListVar(visitAssignment_var_list_java(ctx.assignment_var_list_java()));
        return declareJavaVar;
    }

    @Override
    public DeclareJavaVarNotAssignment visitDeclare_var_java_not_assignmen(SqlParser.Declare_var_java_not_assignmenContext ctx) {
        DeclareJavaVarNotAssignment declareJavaVarNotAssignment = new DeclareJavaVarNotAssignment();
        declareJavaVarNotAssignment.setScopeID(getCurrentScope().getId());
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            String varName = ctx.IDENTIFIER(i).getText();
            declareJavaVarNotAssignment.getNamesVar().add(varName);
//            createSymbol(varName, null, false);
        }
        return declareJavaVarNotAssignment;
    }

    @Override
    public AssignmentJavaListVar visitAssignment_var_list_java(SqlParser.Assignment_var_list_javaContext ctx) {
        System.out.println("visit Assignment_var_list_java");
        AssignmentJavaListVar assignmentJavaListVar = new AssignmentJavaListVar();
        assignmentJavaListVar.setScopeID(getCurrentScope().getId());
        for (int i = 0; i < ctx.assignment_var_java().size(); i++) {
            assignmentJavaListVar.getAssignmentJavaVars().add(visitAssignment_var_java(ctx.assignment_var_java(i)));
        }
        return  assignmentJavaListVar;
    }
    @Override
    public AssignmentJavaVar visitAssignment_var_java(SqlParser.Assignment_var_javaContext ctx) {
        System.out.println("visit Assignment_var_java");
        AssignmentJavaVar assignmentJavaVar = new AssignmentJavaVar();
        assignmentJavaVar.setScopeID(getCurrentScope().getId());
        String varName = ctx.IDENTIFIER().getText();
        assignmentJavaVar.setName(varName);
        assignmentJavaVar.setExprVal(visitExpr(ctx.expr()));

//        createSymbol(varName, Symbol.getTypeOfVal(ctx.expr()), false);
        return assignmentJavaVar;
    }

    @Override
    public AssignmentJavaListVarWithoutDeclare visitAssignment_var_list_without_declare_java(SqlParser.Assignment_var_list_without_declare_javaContext ctx) {
        System.out.println("visit visitAssignment_var_list_without_declare_java");
        AssignmentJavaListVarWithoutDeclare assignmentJavaListVarWithoutDeclare = new AssignmentJavaListVarWithoutDeclare();
        assignmentJavaListVarWithoutDeclare.setScopeID(getCurrentScope().getId());
        for (int i = 0; i < ctx.assignment_var_without_declare_java().size(); i++) {
            assignmentJavaListVarWithoutDeclare.getAssignmentJavaVars().add(visitAssignment_var_without_declare_java(ctx.assignment_var_without_declare_java(i)));
        }
        return assignmentJavaListVarWithoutDeclare;
    }

    @Override
    public AssignmentJavaVarWithoutDeclare visitAssignment_var_without_declare_java(SqlParser.Assignment_var_without_declare_javaContext ctx) {
        System.out.println("visit visitAssignment_var_without_declare_java");
        AssignmentJavaVarWithoutDeclare assignmentJavaVarWithoutDeclare = new AssignmentJavaVarWithoutDeclare();
        assignmentJavaVarWithoutDeclare.setScopeID(getCurrentScope().getId());
        String varName = ctx.IDENTIFIER().getText();
        assignmentJavaVarWithoutDeclare.setName(varName);
        assignmentJavaVarWithoutDeclare.setExprVal(visitExpr(ctx.expr()));
        return assignmentJavaVarWithoutDeclare;
    }

    //====================================


    //============switch_stmt============
    @Override
    public SwitchJavaRule visitSwitch_stmt(SqlParser.Switch_stmtContext ctx) {
        System.out.println("visit Switch_stmt");
        createScope();
        SwitchJavaRule switchJavaRule = new SwitchJavaRule();
        switchJavaRule.setScopeID(getCurrentScope().getId());
        switchJavaRule.setSwitchKey(ctx.IDENTIFIER().getText());
        for (int i = 0; i < ctx.switch_case().size(); i++) {
            switchJavaRule.getSwitchJavaCases().add(visitSwitch_case(ctx.switch_case(i)));
        }
        for (int i = 0; i < ctx.java_body().size(); i++) {
            switchJavaRule.getJavaBodies().add(visitJava_body(ctx.java_body(i)));
        }
        removeScope();
        return switchJavaRule;
    }

    @Override
    public SwitchJavaCase visitSwitch_case(SqlParser.Switch_caseContext ctx) {
        System.out.println("visit Switch_case");
        SwitchJavaCase switchJavaCase = new SwitchJavaCase();
        switchJavaCase.setScopeID(getCurrentScope().getId());
        switchJavaCase.setCaseExpr(visitExpr(ctx.expr()));
        for (int i = 0; i < ctx.java_body().size(); i++) {
            switchJavaCase.getJavaBodies().add(visitJava_body(ctx.java_body(i)));
        }
        return switchJavaCase;
    }

    //======================================


    //================function_java_call==========

    @Override
    public FunctionJavaCall visitFunction_java_call(SqlParser.Function_java_callContext ctx) {
        System.out.println("visit Function_java_call");
        FunctionJavaCall functionJavaCall = new FunctionJavaCall();
        functionJavaCall.setScopeID(getCurrentScope().getId());
        functionJavaCall.setFunctionName(ctx.function_java_name().getText());
        functionJavaCall.setArgumentsList(visitArguments_list(ctx.arguments_list()));
        return functionJavaCall;
    }

    @Override
    public ArgumentsList visitArguments_list(SqlParser.Arguments_listContext ctx) {
        System.out.println("visit Arguments_list");
        ArgumentsList argumentsList = new ArgumentsList();
        argumentsList.setScopeID(getCurrentScope().getId());
        if (ctx.argument() != null) {
            for (int i = 0; i < ctx.argument().size(); i++) {
                argumentsList.getArguments().add(visitArgument(ctx.argument(i)));
            }
        }
        return argumentsList;
    }

    @Override
    public Argument visitArgument(SqlParser.ArgumentContext ctx) {
        System.out.println("visit Argument");
        Argument argument = new Argument();
        argument.setScopeID(getCurrentScope().getId());
        if (ctx.expr() != null) {
            argument.setExpr(visitExpr(ctx.expr()));
        }
        if (ctx.arrow_function_java() != null) {
            argument.setArrowFunctionJava(visitArrow_function_java(ctx.arrow_function_java()));
        }
        return argument;
    }

    @Override
    public ArrowFunctionJava visitArrow_function_java(SqlParser.Arrow_function_javaContext ctx) {
        System.out.println("visit Arrow_function_java");
        createScope();
        ArrowFunctionJava arrowFunctionJava = new ArrowFunctionJava();
        arrowFunctionJava.setScopeID(getCurrentScope().getId());
        arrowFunctionJava.setParametersList(visitParameters_list(ctx.parameters_list()));
        arrowFunctionJava.setReturnExpr(visitExpr(ctx.expr()));
        removeScope();
        return arrowFunctionJava;
    }
    //======================================

    //============if_java============
    @Override
    public IfJavaRule visitIf_java_rule(SqlParser.If_java_ruleContext ctx) {
        System.out.println("visit If_java_rule");
        createScope();
        IfJavaRule ifJavaRule  = new IfJavaRule();
        ifJavaRule.setScopeID(getCurrentScope().getId());
        for (int i = 0; i < ctx.if_basic_java_rule().size(); i++) {
            ifJavaRule.getIfBasicJavaRules().add(visitIf_basic_java_rule(ctx.if_basic_java_rule(i)));
        }
        if (ctx.body_brackets_java()!=null){
            ifJavaRule.setBodyBracketsJava(visitBody_brackets_java(ctx.body_brackets_java()));
        }
        removeScope();
        return ifJavaRule;
    }

    @Override
    public IfBasicJavaRule visitIf_basic_java_rule(SqlParser.If_basic_java_ruleContext ctx) {
        System.out.println("visit If_basic_java_rule");
        IfBasicJavaRule ifBasicJavaRule = new IfBasicJavaRule();
        ifBasicJavaRule.setScopeID(getCurrentScope().getId());
        ifBasicJavaRule.setConditionJava(visitCondition_java(ctx.condition_java()));
        ifBasicJavaRule.setBodyBracketsJava(visitBody_brackets_java(ctx.body_brackets_java()));
        return ifBasicJavaRule;
    }

    @Override
    public ConditionJava visitCondition_java(SqlParser.Condition_javaContext ctx) {
        System.out.println("visit Condition_java");
        ConditionJava conditionJava = new ConditionJava();
        conditionJava.setScopeID(getCurrentScope().getId());
        for (int i = 0; i <ctx.expr().size() ; i++) {
            conditionJava.getExprs().add((visitExpr(ctx.expr(i))));
        }
        return conditionJava;
    }

    //====================================



    //============if_one_line_java============
//
//    @Override
//    public IfOneLineJava visitIf_one_line(SqlParser.If_one_lineContext ctx) {
//        System.out.println("visit If_one_line");
//        IfOneLineJava ifOneLineJava = new IfOneLineJava();
//        if (ctx.NOT()!=null){
//            ifOneLineJava.setNot(true);
//        }
//        ifOneLineJava.setConditionJava(visitCondition_java(ctx.condition_java()));
//        for (int i = 0; i < ctx.if_one_line_return().size(); i++) {
//            ifOneLineJava.getIfOneLineReturnJavas().add(visitIf_one_line_return(ctx.if_one_line_return(i)));
//        }
//        return ifOneLineJava;
//    }
//
//    @Override
//    public IfOneLineReturnJava visitIf_one_line_return(SqlParser.If_one_line_returnContext ctx) {
//        System.out.println("visit If_one_line_return");
//        IfOneLineReturnJava ifOneLineReturnJava = new IfOneLineReturnJava();
//        if (ctx.expr()!=null){
//            ifOneLineReturnJava.setExprReturn(visitExpr(ctx.expr()));
//        }
//        if (ctx.body_brackets_java()!=null){
//            ifOneLineReturnJava.setBodyBracketsJava(visitBody_brackets_java(ctx.body_brackets_java()));
//        }
//        return ifOneLineReturnJava;
//    }

    //====================================


    //==============for_java=============

    @Override
    public ForJavaRule visitFor_java_rule(SqlParser.For_java_ruleContext ctx) {
        System.out.println("visit For_java_rule");
        createScope();
        ForJavaRule forJavaRule = new ForJavaRule();
        forJavaRule.setScopeID(getCurrentScope().getId());
        forJavaRule.setForJavaHeader(visitFor_java_header(ctx.for_java_header()));
        forJavaRule.setBodyBracketsJava(visitBody_brackets_java(ctx.body_brackets_java()));
        removeScope();
        return forJavaRule;
    }

    @Override
    public ForJavaHeader visitFor_java_header(SqlParser.For_java_headerContext ctx) {
        System.out.println("visit For_java_header");
        ForJavaHeader forJavaHeader = new ForJavaHeader();
        forJavaHeader.setScopeID(getCurrentScope().getId());
        if (ctx.K_VAR()!=null)
            forJavaHeader.setAssignmentJavaListVar(visitAssignment_var_list_java(ctx.assignment_var_list_java()));
        else
            forJavaHeader.setAssignmentJavaListVarWithoutDeclare(visitAssignment_var_list_without_declare_java(ctx.assignment_var_list_without_declare_java()));

        forJavaHeader.setConditionJava(visitCondition_java(ctx.condition_java()));
        forJavaHeader.setShortenJavaOperatorsFor(visitShorten_operators_java(ctx.shorten_operators_java()));
        return forJavaHeader;
    }

    //====================================

    //===============while_java=====================
    @Override
    public WhileJavaRule visitWhile_java_rule(SqlParser.While_java_ruleContext ctx) {
        System.out.println("visit While_java_rule");
        createScope();
        WhileJavaRule whileJavaRule = new WhileJavaRule();
        whileJavaRule.setScopeID(getCurrentScope().getId());
        whileJavaRule.setWhileJavaHeader(visitWhile_java_header(ctx.while_java_header()));
        whileJavaRule.setBodyBracketsJava(visitBody_brackets_java(ctx.body_brackets_java()));
        removeScope();
        return whileJavaRule;
    }

    @Override
    public WhileJavaHeader visitWhile_java_header(SqlParser.While_java_headerContext ctx) {
        System.out.println("visit While_java_header");
        WhileJavaHeader whileJavaHeader = new WhileJavaHeader();
        whileJavaHeader.setScopeID(getCurrentScope().getId());
        whileJavaHeader.setConditionJava(visitCondition_java(ctx.condition_java()));
        return whileJavaHeader;
    }

    //====================================


    //===============do_while_java=====================
    @Override
    public DoWhileJavaRule visitDo_while_java_rule(SqlParser.Do_while_java_ruleContext ctx) {
        System.out.println("visit Do_while_java_rule");
        createScope();
        DoWhileJavaRule doWhileJavaRule = new DoWhileJavaRule();
        doWhileJavaRule.setScopeID(getCurrentScope().getId());
        doWhileJavaRule.setBodyBracketsJava(visitBody_brackets_java(ctx.body_brackets_java()));
        doWhileJavaRule.setWhileJavaHeader(visitWhile_java_header(ctx.while_java_header()));
        removeScope();
        return doWhileJavaRule;
    }

    //====================================


    //===============print_java=====================
    @Override
    public PrintJava visitPrint_java(SqlParser.Print_javaContext ctx) {
        System.out.println("visit Print_java");
        PrintJava printJava = new PrintJava();
        printJava.setScopeID(getCurrentScope().getId());
        printJava.setExprPrint(visitExpr(ctx.expr()));
        return printJava;
    }
    //====================================

    //===============print_java=====================
    @Override
    public ReturnJava visitReturn_stmt(SqlParser.Return_stmtContext ctx) {
        System.out.println("visit Return_stmt");
        ReturnJava returnJava = new ReturnJava();
        returnJava.setScopeID(getCurrentScope().getId());
        if (ctx.expr()!=null){
            returnJava.setExprReturn(visitExpr(ctx.expr()));
        }
        return returnJava;
    }
    //====================================



    @Override
    public ShortenJavaOperators visitShorten_operators_java(SqlParser.Shorten_operators_javaContext ctx) {
        System.out.println("visit Shorten_operators_java");
        ShortenJavaOperators shortenJavaOperators = new ShortenJavaOperators();
        shortenJavaOperators.setScopeID(getCurrentScope().getId());
        shortenJavaOperators.setName(ctx.any_name_no_keyword().getText());
        if (ctx.expr()!=null){
            shortenJavaOperators.setExprVal(visitExpr(ctx.expr()));
        }
        if (ctx.PLUS_PLUS()!=null){
            shortenJavaOperators.setOperator(ctx.PLUS_PLUS().getText());
        }else if (ctx.MINUS_MINUS()!=null){
            shortenJavaOperators.setOperator(ctx.MINUS_MINUS().getText());
        }else if (ctx.PLUS_ASSIGN()!=null){
            shortenJavaOperators.setOperator(ctx.PLUS_ASSIGN().getText());
        }else if (ctx.MINUS_ASSIGN()!=null){
            shortenJavaOperators.setOperator(ctx.MINUS_ASSIGN().getText());
        }else if (ctx.DIV_ASSIGN()!=null){
            shortenJavaOperators.setOperator(ctx.DIV_ASSIGN().getText());
        }else if (ctx.POWER_ASSIGN()!=null){
            shortenJavaOperators.setOperator(ctx.POWER_ASSIGN().getText());
        }else if (ctx.MOD_ASSIGN()!=null){
            shortenJavaOperators.setOperator(ctx.MOD_ASSIGN().getText());
        }else if (ctx.STAR_ASSIGN()!=null){
            shortenJavaOperators.setOperator(ctx.STAR_ASSIGN().getText());
        }
        return shortenJavaOperators;
    }

    @Override
    public JavaBody visitJava_body(SqlParser.Java_bodyContext ctx) {
        System.out.println("visit Java_body");
        if (ctx.declare_var_java() != null){
            DeclareJavaVar declareJavaVar = visitDeclare_var_java(ctx.declare_var_java());
            return declareJavaVar;
        }
        if (ctx.declare_var_java_not_assignmen() != null){
            DeclareJavaVarNotAssignment declareJavaVarNotAssignment = visitDeclare_var_java_not_assignmen(ctx.declare_var_java_not_assignmen());
            return declareJavaVarNotAssignment;
        }
        if (ctx.assignment_var_list_without_declare_java() != null){
            AssignmentJavaListVarWithoutDeclare assignmentJavaListVarWithoutDeclare = visitAssignment_var_list_without_declare_java(ctx.assignment_var_list_without_declare_java());
            return assignmentJavaListVarWithoutDeclare;
        }
        if (ctx.shorten_operators_java() != null){
            ShortenJavaOperators shortenJavaOperators = visitShorten_operators_java(ctx.shorten_operators_java());
            return shortenJavaOperators;
        }
        if (ctx.switch_stmt() != null){
            SwitchJavaRule switchJavaRule = visitSwitch_stmt(ctx.switch_stmt());
        return switchJavaRule;
        }
        if (ctx.function_java_call() != null){
            FunctionJavaCall functionJavaCall = visitFunction_java_call(ctx.function_java_call());
            return functionJavaCall;
        }
        if (ctx.if_java_rule()!= null){
            IfJavaRule ifJavaRule = visitIf_java_rule(ctx.if_java_rule());
            return ifJavaRule;
        }
//        if (ctx.if_one_line()!= null){
//            IfOneLineJava ifJavaRule =  visitIf_one_line(ctx.if_one_line());
//            return ifJavaRule;
//        }
        if (ctx.for_java_rule()!= null){
            ForJavaRule forJavaRule = visitFor_java_rule(ctx.for_java_rule());
            return forJavaRule;
        }
        if (ctx.while_java_rule()!= null){
            WhileJavaRule whileJavaRule = visitWhile_java_rule(ctx.while_java_rule());
            return whileJavaRule;
        }
        if (ctx.do_while_java_rule()!= null){
            DoWhileJavaRule doWhileJavaRule = visitDo_while_java_rule(ctx.do_while_java_rule());
            return doWhileJavaRule;
        }
        if (ctx.print_java()!= null){
            PrintJava printJava = visitPrint_java(ctx.print_java());
            return printJava;
        }
        if (ctx.K_BREAK()!= null){
            JavaBody javaBody = new JavaBody();
            javaBody.setAbreak(true);
            return javaBody;
        }
        if (ctx.return_stmt()!= null){
            ReturnJava returnJava = visitReturn_stmt(ctx.return_stmt());
            return returnJava;
        }
        return null;
    }

    @Override
    public BodyBracketsJava visitBody_brackets_java(SqlParser.Body_brackets_javaContext ctx) {
        System.out.println("visit Body_brackets_java");
        BodyBracketsJava bodyBracketsJava = new BodyBracketsJava();
        bodyBracketsJava.setScopeID(getCurrentScope().getId());
        if (ctx.java_body() != null){
            for (int i = 0; i < ctx.java_body().size(); i++) {
                bodyBracketsJava.getJavaBodies().add(visitJava_body(ctx.java_body(i)));
            }
        }
        return bodyBracketsJava;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Expr visitExpr(SqlParser.ExprContext ctx) {
        System.out.println("visit Expr");
        Expr expr = new Expr();
        if (getCurrentScope()!=null)
            expr.setScopeID(getCurrentScope().getId());

        if (ctx.var_name() != null)
            expr.setVarName(ctx.var_name().IDENTIFIER().getText());

        if (ctx.select_core() != null)
            expr.setSelectCore(visitSelect_core(ctx.select_core()));

        if (ctx.literal_value() != null) {
            expr.setLiteralValue(visitLiteral_value(ctx.literal_value()));
        }

        else if (ctx.unary_operator()!=null){
            if (ctx.unary_operator().PLUS()!=null)
                expr.setUnary_operator("+");
            if(ctx.unary_operator().MINUS()!=null)
                expr.setUnary_operator("-");
            if(ctx.unary_operator().TILDE()!=null)
                expr.setUnary_operator("~");
            if(ctx.unary_operator().K_NOT()!=null)
                expr.setUnary_operator("not");
            expr.getExprs().add(visitExpr(ctx.expr(0)));
        }

        else if (ctx.function_name()!=null) {
            expr.setFunction_name(ctx.function_name().any_name().IDENTIFIER().getText());
            for(int i=0;i<ctx.expr().size();i++) {
                expr.getExprs().add(visitExpr(ctx.expr(i)));
            }
        }

        else if (ctx.QUES()!=null){//if one line
            for (int i = 0; i < ctx.expr().size(); i++) {
                expr.getExprs().add(visitExpr(ctx.expr(i)));
            }
        }

        else if (ctx.expr().size()==1){
            expr.getExprs().add(visitExpr(ctx.expr(0)));
        } else {
            if(ctx.STAR()!=null){
                expr.setOperator("*");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
            else if(ctx.GT()!=null){
                expr.setOperator(">");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
            else if(ctx.GT2()!=null){
                expr.setOperator(">>");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
            else if(ctx.GT_EQ()!=null){
                expr.setOperator(">=");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
            else if(ctx.EQ()!=null){
                expr.setOperator("==");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
            else if(ctx.LT()!=null){
                expr.setOperator("<");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
            else if(ctx.LT2()!=null){
                expr.setOperator("<<");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
            else if(ctx.LT_EQ()!=null){
                expr.setOperator("<=");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
            else if(ctx.NOT_EQ1()!=null){
                expr.setOperator("!=");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
            else if(ctx.NOT_EQ2()!=null){
                expr.setOperator("<>");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
            else if(ctx.MOD()!=null){
                expr.setOperator("%");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
            else if(ctx.DIV()!=null){
                expr.setOperator("/");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
            else if(ctx.MINUS()!=null){
                expr.setOperator("-");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
            else if(ctx.PLUS()!=null){
                expr.setOperator("+");
                expr.getExprs().add(visitExpr(ctx.expr(0)));
                expr.getExprs().add(visitExpr(ctx.expr(1)));
            }
        }
        return expr;
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitError(SqlParser.ErrorContext ctx) { return visitChildren(ctx); }








    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public LiteralValue visitLiteral_value(SqlParser.Literal_valueContext ctx) {
        System.out.println("visitLiteral_value");
        LiteralValue literalValue=new LiteralValue();
        if (ctx.BLOB_LITERAL()!=null) {
            literalValue.setBLOB_LITERAL(ctx.BLOB_LITERAL().getSymbol().getText());
        }
        if (ctx.NUMERIC_LITERAL()!=null) {
            literalValue.setNUMERIC_LITERAL(Double.parseDouble(ctx.NUMERIC_LITERAL().getSymbol().getText()));
        }
        if (ctx.STRING_LITERAL()!=null) {
            literalValue.setSTRING_LITERAL(ctx.STRING_LITERAL().getSymbol().getText());
        }
        if (ctx.K_TRUE()!=null) {
            literalValue.setBOOLEAN_LITERAL(true);
        }
        if (ctx.K_FALSE()!=null) {
            literalValue.setBOOLEAN_LITERAL(false);
        }

        return literalValue;
    }

    @Override
    public SQL_Statement_List visitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx) {
        System.out.println("visitSql_stmt_list");
        SQL_Statement_List sql_statement_list = new SQL_Statement_List();
        for (int i = 0; i < ctx.sql_stmt().size(); i++) {
            sql_statement_list.getSql_statements().add(visitSql_stmt(ctx.sql_stmt(i)));
        }
        return sql_statement_list;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public SQL_Statement visitSql_stmt(SqlParser.Sql_stmtContext ctx) {

        System.out.println("visitSql_stmt ");
        SQL_Statement sql_statement = new SQL_Statement();
//        sql_statement.setScopeID(getCurrentScope().getId());
        if (ctx.create_table_stmt()!=null){
            sql_statement.setCreateTable(visitCreate_table_stmt(ctx.create_table_stmt()));
        }

        if (ctx.create_type_stmt()!=null){
            sql_statement.setCreateType(visitCreate_type_stmt(ctx.create_type_stmt()));
        }

        if (ctx.create_Aggregation_function()!=null){
            sql_statement.setAggregationFunction(visitCreate_Aggregation_function(ctx.create_Aggregation_function()));
        }

//        if (ctx.select_core()!=null){
//            sql_statement.setSelectCore(visitSelect_core(ctx.select_core()));
//        }

        return sql_statement;//no need
    }

    @Override
    public AggregationFunction visitCreate_Aggregation_function(SqlParser.Create_Aggregation_functionContext ctx) {
        System.out.println("visitCreate_Aggregation_function");
        AggregationFunction aggregationFunction = new AggregationFunction();
        aggregationFunction.setAggregationFunctionName(ctx.aggregation_function_name().getText());
        aggregationFunction.setJarPath(ctx.path().getText());
        aggregationFunction.setClassName(ctx.aggregation_function_className().getText());
        aggregationFunction.setMethodName(ctx.aggregation_function_methodName().getText());
        aggregationFunction.setReturnType(ctx.aggregation_function_return_type().getText());
        for (int i = 0; i < ctx.type_name().size(); i++) {
            aggregationFunction.getParams().add(visitType_name(ctx.type_name(i)));
        }
        return aggregationFunction;
    }

    @Override
    public CreateTable visitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx) {
        System.out.println("visitCreate_table_stmt");
        CreateTable createTable = new CreateTable();
//        createTable.setScopeID(getCurrentScope().getId());
        createTable.setTable_name(visitTable_name(ctx.table_name()));
        for (int i = 0; i < ctx.column_def().size(); i++) {
            createTable.getColumn_defs().add(visitColumn_def(ctx.column_def(i)));
        }
        createTable.setType_file(ctx.type_file().getText());
        createTable.setPath(ctx.path().getText());
        return createTable;
    }

    @Override
    public CreateType visitCreate_type_stmt(SqlParser.Create_type_stmtContext ctx) {
        System.out.println("visitCreate_type_stmt");
        CreateType createType = new CreateType();
//        createType.setScopeID(getCurrentScope().getId());
        createType.setType_name(visitType_name(ctx.type_name()));
        for (int i = 0; i < ctx.column_def().size(); i++) {
            createType.getColumn_defs().add(visitColumn_def(ctx.column_def(i)));
        }
        return createType;
    }

    @Override
    public ResultColumnWithAggregationFunction visitResult_column_with_aggregation_function(SqlParser.Result_column_with_aggregation_functionContext ctx) {
        System.out.println("visitResult_column_with_aggregation_function");
        ResultColumnWithAggregationFunction resultColumnWithAggregationFunction = new ResultColumnWithAggregationFunction();
        resultColumnWithAggregationFunction.setAggregationFunctionName(ctx.aggregation_function_name().getText());
        resultColumnWithAggregationFunction.setReturnColumn(ctx.any_name().getText());
        resultColumnWithAggregationFunction.setResultColumn(visitResult_column(ctx.result_column()));
        return resultColumnWithAggregationFunction;
    }

    @Override
    public SelectCore visitSelect_core(SqlParser.Select_coreContext ctx) {
        System.out.println("visitSelect_core");
        SelectCore selectCore = new SelectCore();
        selectCore.setScopeID(getCurrentScope().getId());
        for (int i = 0; i < ctx.result_column().size(); i++)
            selectCore.getResultColumns().add(visitResult_column(ctx.result_column(i)));
        for (int i = 0; i < ctx.result_column_with_aggregation_function().size(); i++)
            selectCore.getResultColumnWithAggregationFunctions()
                    .add(visitResult_column_with_aggregation_function(ctx.result_column_with_aggregation_function(i)));


        selectCore.setTableOrSubQuery(visitTable_or_subquery(ctx.table_or_subquery()));

        for (int i = 0; i < ctx.inner_join_stmt().size(); i++)
            selectCore.getInnerJoinStmts().add(visitInner_join_stmt(ctx.inner_join_stmt(i)));


        if (ctx.where_stmt()!=null)
            selectCore.setWhereStmt(visitWhere_stmt(ctx.where_stmt()));

        if (ctx.column_name()!=null)
            selectCore.setColumnGroupBy(visitColumn_name(ctx.column_name()));

        return selectCore;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public TableName visitTable_name(SqlParser.Table_nameContext ctx) {
        System.out.println("visitTable_name");
        TableName tableName = new TableName();
//        tableName.setScopeID(getCurrentScope().getId());
        tableName.setName(ctx.getText());
        return tableName;
    }

    @Override
    public TypeName visitType_name(SqlParser.Type_nameContext ctx) {
        System.out.println("visitType_name");
        TypeName typeName = new TypeName();
//        typeName.setScopeID(getCurrentScope().getId());
        typeName.setName(ctx.getText());
        return typeName;
    }

    @Override
    public ColumnDef visitColumn_def(SqlParser.Column_defContext ctx) {
        System.out.println("visitColumn_def");
        ColumnDef columnDef = new ColumnDef();
//        columnDef.setScopeID(getCurrentScope().getId());
        columnDef.setColumn_name(ctx.column_name().getText());
        columnDef.setType_name(visitType_name(ctx.type_name()));
        return columnDef;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ResultColumn visitResult_column(SqlParser.Result_columnContext ctx) {
        System.out.println("visitResult_column");
        ResultColumn resultColumn = new ResultColumn();
        resultColumn.setScopeID(getCurrentScope().getId());

        if(ctx.STAR()!=null){
            resultColumn.setStar(true);
            if (ctx.table_name()!=null)
                resultColumn.setTableNameWhitStart(ctx.table_name().any_name_no_keyword().IDENTIFIER().getText());
        }

        if (ctx.column_name()!=null)
            resultColumn.setColumnName(visitColumn_name(ctx.column_name()));

        return resultColumn;
    }

    @Override
    public TableOrSubQuery visitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx) {
        System.out.println("visitTable_or_subquery");
        TableOrSubQuery tableOrSubquery = new TableOrSubQuery();
//        tableOrSubquery.setScopeID(getCurrentScope().getId());
        tableOrSubquery.setTableName(visitTable_name(ctx.table_name()));
        if (ctx.table_alias()!=null)
            tableOrSubquery.setTable_alias(ctx.table_alias().getText());
        return tableOrSubquery;
    }


    @Override
    public InnerJoinStmt visitInner_join_stmt(SqlParser.Inner_join_stmtContext ctx) {
        System.out.println("visitInner_join_stmt");
        InnerJoinStmt innerJoinStmt = new InnerJoinStmt();
        if (ctx.table_or_subquery()!=null)
            innerJoinStmt.setTableOrSubQuery(visitTable_or_subquery(ctx.table_or_subquery()));
        for (int i = 0; i < ctx.join_condition().size(); i++) {
            innerJoinStmt.getJoinConditions().add(visitJoin_condition(ctx.join_condition(i)));
        }
        return innerJoinStmt;
    }

    @Override
    public WhereStmt visitWhere_stmt(SqlParser.Where_stmtContext ctx) {
        System.out.println("visitWhere_stmt");
        WhereStmt whereStmt = new WhereStmt();
        for (int i = 0; i < ctx.whete_condition().size(); i++) {
            whereStmt.getWhereConditions().add(visitWhete_condition(ctx.whete_condition(i)));
        }
        return whereStmt;
    }


    @Override
    public WhereCondition visitWhete_condition(SqlParser.Whete_conditionContext ctx) {
        System.out.println("visitWhete_condition");
        WhereCondition whereCondition = new WhereCondition();

        whereCondition.setColumnName(visitColumn_name(ctx.column_name()));

        if (ctx.query_condition_operations().ASSIGN()!=null)
            whereCondition.setConditionOperations(ctx.query_condition_operations().ASSIGN().getText());
        else if (ctx.query_condition_operations().GT()!=null)
            whereCondition.setConditionOperations(ctx.query_condition_operations().GT().getText());
        else if (ctx.query_condition_operations().GT_EQ()!=null)
            whereCondition.setConditionOperations(ctx.query_condition_operations().GT_EQ().getText());
        else if (ctx.query_condition_operations().LT()!=null)
            whereCondition.setConditionOperations(ctx.query_condition_operations().LT().getText());
        else if (ctx.query_condition_operations().LT_EQ()!=null)
            whereCondition.setConditionOperations(ctx.query_condition_operations().LT_EQ().getText());
        else if (ctx.query_condition_operations().K_LIKE()!=null)
            whereCondition.setConditionOperations(ctx.query_condition_operations().K_LIKE().getText());
        else if (ctx.query_condition_operations().K_IN()!=null)
            whereCondition.setConditionOperations(ctx.query_condition_operations().K_IN().getText());

        whereCondition.setExprQueryVal(visitExpr_query(ctx.expr_query()));

        return whereCondition;
    }


    @Override
    public JoinCondition visitJoin_condition(SqlParser.Join_conditionContext ctx) {
        System.out.println("visitJoin_condition");
        JoinCondition joinCondition = new JoinCondition();
        joinCondition.setColumnNameFirst(visitColumn_name(ctx.column_name(0)));
        joinCondition.setColumnNameSecond(visitColumn_name(ctx.column_name(1)));
        return joinCondition;
    }

    @Override
    public List_literalValue visitList_literal_value(SqlParser.List_literal_valueContext ctx) {
        System.out.println("visitExpr_query");
        List_literalValue list_literalValue = new List_literalValue();
        for (int i = 0; i < ctx.literal_value().size(); i++) {
            list_literalValue.getLiteralValues().add(visitLiteral_value(ctx.literal_value(i)));
        }
        return list_literalValue;
    }

    @Override
    public ExprQuery visitExpr_query(SqlParser.Expr_queryContext ctx) {
        System.out.println("visitExpr_query");
        ExprQuery exprQuery = new ExprQuery();
        if (ctx.literal_value()!=null)
            exprQuery.setLiteralValue(visitLiteral_value(ctx.literal_value()));

        if (ctx.var_name()!=null)
            exprQuery.setVarName(ctx.var_name().IDENTIFIER().getText());

        if (ctx.list_literal_value()!=null)
            exprQuery.setList_literalValue(visitList_literal_value(ctx.list_literal_value()));

        return exprQuery;
    }

    @Override
    public ColumnName visitColumn_name(SqlParser.Column_nameContext ctx) {
        System.out.println("visitColumn_name");
        System.out.println(ctx.any_name().getText());
        ColumnName columnName = new ColumnName();
        columnName.setName(ctx.any_name().getText());//todo
        if (ctx.table_name()!=null)
            columnName.setTableName(ctx.table_name().any_name_no_keyword().IDENTIFIER().getText());//todo
        return columnName;
    }


    private void createScope(){
        System.out.println("createScope++++");
        Scope scope;
        if (Main.symbolTable.getStackScopes().isEmpty()){
            scope = new Scope(null);
        }else {
            Scope scopeParent = Main.symbolTable.getStackScopes().peek();
            scope = new Scope(scopeParent);
        }
        Main.symbolTable.getStackScopes().push(scope);
        Main.symbolTable.getScopes().add(scope);
    }

    private void removeScope(){
        System.out.println("removeScope-----");
        Main.symbolTable.getStackScopes().pop();
    }

    private Scope getCurrentScope(){
        if (Main.symbolTable.getStackScopes().isEmpty())
            return null;
        return Main.symbolTable.getStackScopes().peek();
    }


//    private void createSymbol(String name, Type type, boolean isParam){
//        Symbol symbol = new Symbol(name);
//        symbol.setType(type);
//        symbol.setIsParam(isParam);
//        Scope currentScope = Main.symbolTable.getStackScopes().peek();
//        symbol.setScope(currentScope);
//        currentScope.addSymbol(name, symbol);
//    }



}
