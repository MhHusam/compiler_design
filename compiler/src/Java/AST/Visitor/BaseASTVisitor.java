package Java.AST.Visitor;

import Java.AST.Expr;
import Java.AST.LiteralValue;
import Java.AST.Parse;
import Java.AST.RuleJavaStmt.assignmentVarWithoutDeclare.AssignmentJavaVarWithoutDeclare;
import Java.AST.RuleQueryStmt.*;
import Java.AST.RuleQueryStmt.Create.ColumnDef;
import Java.AST.RuleQueryStmt.Create.CreateTable;
import Java.AST.RuleQueryStmt.Create.CreateType;
import Java.AST.RuleQueryStmt.TypeName;
import Java.AST.RuleQueryStmt.Select.*;
import Java.AST.RuleJavaStmt.*;
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
import Java.Main;
import Java.SymbolTable.*;

import java.util.ArrayList;

public class BaseASTVisitor implements ASTVisitor {


    @Override
    public void visit(Parse p) {
        System.out.println("ast parse ");
        System.out.println("---------------");
    }

    @Override
    public void visit(AssignmentJavaListVar assignmentJavaListVar) {
        System.out.println("ast AssignmentJavaListVar ");
        System.out.println("---------------");

    }

    @Override
    public void visit(AssignmentJavaVar assignmentJavaVar) {
        System.out.println("ast AssignmentJavaVar ");

        String varName = assignmentJavaVar.getName();
        System.out.println("ast AssignmentJavaVar Name: "+ assignmentJavaVar.getName());
        checkMultipleDeclarationsVar(assignmentJavaVar.getScopeID(), varName);
        Expr exprVal = assignmentJavaVar.getExprVal();
        if (exprVal.getSelectCore()!=null){
            Main.symbolTable.getVarNotSetTypesSelectSelect().add(new VarNotSetTypeSelect(
                    assignmentJavaVar.getScopeID(),
                    assignmentJavaVar.getName(),
                    exprVal.getSelectCore())
            );
        }
        createSymbol(assignmentJavaVar.getScopeID(), varName, Symbol.getTypeOfVal(exprVal), false);
        System.out.println("---------------");
    }

    @Override
    public void visit(AssignmentJavaVarWithoutDeclare assignmentJavaVarWithoutDeclare) {
        System.out.println("ast AssignmentJavaVar ");
        if (assignmentJavaVarWithoutDeclare.getName()!=null){
            System.out.println("ast AssignmentJavaVar Name: "+ assignmentJavaVarWithoutDeclare.getName());
            checkUndeclaredVariable(assignmentJavaVarWithoutDeclare.getScopeID(), assignmentJavaVarWithoutDeclare.getName());
            checkAssigningAnotherType(assignmentJavaVarWithoutDeclare.getScopeID(), assignmentJavaVarWithoutDeclare.getName(), assignmentJavaVarWithoutDeclare.getExprVal());
        }
//        if (assignmentJavaVarWithoutDeclare.getExprVal().getVarName()!=null){
////            checkUndeclaredVariable(assignmentJavaVarWithoutDeclare.getScopeID(), assignmentJavaVarWithoutDeclare.getExprVal().getVarName());
////            checkUsingUnassignedVariable(assignmentJavaVarWithoutDeclare.getScopeID(), assignmentJavaVarWithoutDeclare.getExprVal().getVarName());
//        }
        System.out.println("---------------");
    }

    @Override
    public void visit(DeclareJavaVar declareJavaVar) {
        System.out.println("ast DeclareJavaVar ");
        System.out.println("---------------");

    }

    @Override
    public void visit(DeclareJavaVarNotAssignment declareJavaVarNotAssignment) {
        System.out.println("ast DeclareJavaVarNotAssignment ");
        for (String  name:declareJavaVarNotAssignment.getNamesVar()) {
            System.out.println("ast DeclareJavaVarNotAssignment namesVar : "+name);
            checkMultipleDeclarationsVar(declareJavaVarNotAssignment.getScopeID(), name);
            createSymbol(declareJavaVarNotAssignment.getScopeID(), name, null, false);
        }
        System.out.println("---------------");
    }

    @Override
    public void visit(DefaultParameters defaultParameters) {
        System.out.println("ast ForJavaRule ");
        String varName = defaultParameters.getParameterName();
        System.out.println("ast DefaultParameters parameterName : "+varName);
        createSymbol(defaultParameters.getScopeID() ,varName , Symbol.getTypeOfVal(defaultParameters.getParameterVal()), true);//todo add select val
        System.out.println("---------------");
    }

    @Override
    public void visit(ParametersList parametersList) {
        System.out.println("ast ParametersList ");
        for (int i = 0; i < parametersList.getParametersNames().size(); i++) {
            String varName = parametersList.getParametersNames().get(i);
            System.out.println("ast ParametersList parametersNames : "+varName);
            createSymbol(parametersList.getScopeID(), varName, null, true);
        }
        System.out.println("---------------");
    }

    @Override
    public void visit(Argument argument) {
        System.out.println("ast Argument ");
        System.out.println("---------------");
    }

    @Override
    public void visit(ArgumentsList argumentsList) {
        System.out.println("ast ArgumentsList ");
        System.out.println("---------------");

    }


    @Override
    public void visit(DoWhileJavaRule doWhileJavaRule) {
        System.out.println("ast DoWhileJavaRule ");
        System.out.println("---------------");

    }

    @Override
    public void visit(ForJavaHeader forJavaHeader) {
        System.out.println("ast ForJavaHeader ");
        System.out.println("---------------");

    }

    @Override
    public void visit(ForJavaRule forJavaRule) {
        System.out.println("ast ForJavaRule ");
        System.out.println("---------------");

    }

    @Override
    public void visit(FunctionJavaHeader functionJavaHeader) {
        System.out.println("ast FunctionJavaHeader ");
        System.out.println("ast FunctionJavaHeader functionName:"+functionJavaHeader.getFunctionName());
        Main.symbolTable.getFunctionDeclare().add(functionJavaHeader.getFunctionName());
        System.out.println("---------------");
    }

    @Override
    public void visit(FunctionJavaRule functionJavaRule) {
        System.out.println("ast FunctionJavaRule ");
        System.out.println("---------------");
    }

    @Override
    public void visit(ArrowFunctionJava arrowFunctionJava) {
        System.out.println("ast ArrowFunctionJava ");
        System.out.println("---------------");

    }

    @Override
    public void visit(FunctionJavaCall functionJavaCall) {
        System.out.println("ast ArrowFunctionJava ");
        System.out.println("ast ArrowFunctionJava functionName : "+functionJavaCall.getFunctionName());
        Main.symbolTable.getFunctionNotDeclare().add(functionJavaCall.getFunctionName());
        System.out.println("---------------");
    }

    @Override
    public void visit(IfOneLineJava ifOneLineJava) {
        System.out.println("ast IfOneLineJava ");
        System.out.println("ast IfOneLineJava is Not? : "+ ifOneLineJava.getNot());
        System.out.println("---------------");

    }

    @Override
    public void visit(IfOneLineReturnJava ifOneLineReturnJava) {
        System.out.println("ast IfOneLineReturnJava ");
        System.out.println("---------------");

    }

    @Override
    public void visit(IfBasicJavaRule ifBasicJavaRule) {
        System.out.println("ast IfBasicJavaRule ");
        System.out.println("---------------");

    }

    @Override
    public void visit(IfJavaRule ifJavaRule) {
        System.out.println("ast IfJavaRule ");
        System.out.println("---------------");

    }

    @Override
    public void visit(PrintJava printJava) {
        System.out.println("ast PrintJava ");
        System.out.println("---------------");
        StringBuilder str = new StringBuilder();
        String varName = printJava.getExprPrint().getVarName();

        str.append("\t\tfor (").append(varName)
                .append(" ").append("_").append(varName)
                .append(" : ").append("new ").append(varName).append("().getData()) {").append("\n")
                .append("\t\t\t").append("System.out.println(_").append(varName).append(");").append("\n")
                .append("\t\t}").append("\n");

        Main.str_Main.append(str);

    }

    @Override
    public void visit(ReturnJava returnJava) {
        System.out.println("ast ReturnJava ");
        System.out.println("---------------");

    }

    @Override
    public void visit(ShortenJavaOperators shortenJavaOperators) {
        System.out.println("ast ShortenJavaOperators ");
        System.out.println("ast ShortenJavaOperators name : "+shortenJavaOperators.getName());
        if (shortenJavaOperators.getOperator()!=null)
            System.out.println("ast ShortenJavaOperators operator : "+shortenJavaOperators.getOperator());
        if (shortenJavaOperators.getExprVal()!=null)
            System.out.println("ast ShortenJavaOperators exprVal : "+shortenJavaOperators.getExprVal());
        System.out.println("---------------");
    }

    @Override
    public void visit(SwitchJavaCase switchJavaCase) {
        System.out.println("ast SwitchJavaCase ");
        System.out.println("---------------");

    }

    @Override
    public void visit(SwitchJavaRule switchJavaRule) {
        System.out.println("ast SwitchJavaRule ");
        System.out.println("ast SwitchJavaRule switchKey : "+ switchJavaRule.getSwitchKey());
        System.out.println("---------------");

    }

    @Override
    public void visit(WhileJavaHeader whileJavaHeader) {
        System.out.println("ast WhileJavaHeader ");
        System.out.println("---------------");

    }

    @Override
    public void visit(WhileJavaRule whileJavaRule) {
        System.out.println("ast WhileJavaRule ");
        System.out.println("---------------");

    }

    @Override
    public void visit(BodyBracketsJava bodyBracketsJava) {
        System.out.println("ast BodyBracketsJava ");
        System.out.println("---------------");

    }

    @Override
    public void visit(ConditionJava conditionJava) {
        System.out.println("ast ConditionJava ");
        System.out.println("---------------");

    }

    @Override
    public void visit(JavaBody javaBody) {
        System.out.println("ast JavaBody ");
        System.out.println("ast JavaBody a have break? = "+javaBody.isAbreak());
        System.out.println("---------------");
    }

    @Override
    public void visit(JavaStmtList javaStmtList) {
        System.out.println("ast JavaStmtList ");
        System.out.println("---------------");

    }

    @Override
    public void visit(Expr expr) {
        System.out.println("ast Expr ");
        if (expr.getSelectCore()!=null)
            System.out.println("ast expr select core");
        if (expr.getLiteralValue()!=null){
            System.out.println("ast expr LiteralValue");
            if (expr.getLiteralValue().getSTRING_LITERAL()!=null)
                System.out.println("ast expr LiteralValue STRING_LITERAL = "+expr.getLiteralValue().getSTRING_LITERAL());
            if (expr.getLiteralValue().getNUMERIC_LITERAL()!=null)
                System.out.println("ast expr LiteralValue NUMERIC_LITERAL = "+expr.getLiteralValue().getNUMERIC_LITERAL());
            if (expr.getLiteralValue().getBOOLEAN_LITERAL()!=null)
                System.out.println("ast expr LiteralValue BOOLEAN_LITERAL = "+expr.getLiteralValue().getBOOLEAN_LITERAL());
        }

        if (expr.getVarName() != null){
            System.out.println("ast expr VarName : "+expr.getVarName());
            checkUndeclaredVariable(expr.getScopeID(), expr.getVarName());
            checkUsingUnassignedVariable(expr.getScopeID(), expr.getVarName());
        }


        if (expr.getUnary_operator()!=null)
            System.out.println("ast expr Unary_operator : "+expr.getUnary_operator());


        if (expr.getFunction_name()!=null){
            System.out.println("ast expr Function_name : "+expr.getFunction_name());
            Main.symbolTable.getFunctionNotDeclare().add(expr.getFunction_name());
        }

        if (expr.getOperator()!=null)
            System.out.println("ast expr Operator : "+expr.getOperator());


        System.out.println("---------------");

    }

    @Override
    public void visit(LiteralValue literalValue) {
        System.out.println("ast LiteralValue ");
        if (literalValue.getBLOB_LITERAL()!=null)
            System.out.println("ast LiteralValue BLOB_LITERAL : "+literalValue.getBLOB_LITERAL());
        if (literalValue.getNUMERIC_LITERAL()!=null)
            System.out.println("ast LiteralValue NUMERIC_LITERAL : "+literalValue.getNUMERIC_LITERAL());
        if (literalValue.getSTRING_LITERAL()!=null)
            System.out.println("ast LiteralValue STRING_LITERAL : "+literalValue.getSTRING_LITERAL());
        System.out.println("---------------");
    }










    @Override
    public void visit(SQL_Statement stmt) {
        System.out.println("ast SQL_Statement ");
    }

    @Override
    public void visit(CreateTable createTable) {
        createTypeFunction(createTable.getTable_name().getName(), createTable.getColumn_defs(), createTable.getType_file(), createTable.getPath());
    }

    @Override
    public void visit(CreateType createType) {
        System.out.println("ast CreateType");
        createTypeFunction(createType.getType_name().getName(), createType.getColumn_defs(), null, null);
    }

    @Override
    public void visit(SelectCore selectCore) {
        System.out.println("ast selectCore");
        String tableNameMasterSelect = selectCore.getTableOrSubQuery().getTableName().getName();
        //ResultColumn
        for (ResultColumn resultColumn : selectCore.getResultColumns()) {
            String tableName;
            String columnName;
            if (resultColumn.isStar()){
                if(resultColumn.getTableNameWhitStart()==null)
                    resultColumn.setTableNameWhitStart(tableNameMasterSelect);
                tableName = resultColumn.getTableNameWhitStart();
                columnName = "*";
            }else {
                if (resultColumn.getColumnName().getTableName() == null)
                    resultColumn.getColumnName().setTableName(tableNameMasterSelect);
                tableName = resultColumn.getColumnName().getTableName();
                columnName = resultColumn.getColumnName().getName();
                CheckSelectUndefinedColumnInTypeOrTable(tableName, columnName, "select");
            }

            if (! tableName.equals(tableNameMasterSelect))
                CheckUsingTableNotJoined(tableName, selectCore.getInnerJoinStmts());
            System.out.println("selectCore table Name: "+tableName);
            System.out.println("selectCore Column Name: "+columnName);
            System.out.println(".....");
        }

        //ResultColumnWithAggregationFunctions
        for (ResultColumnWithAggregationFunction resultColumnWithAggregationFunction : selectCore.getResultColumnWithAggregationFunctions()) {
            String tableName;
            String columnName;
            CheckDeclaredAggregationFunction(resultColumnWithAggregationFunction.getAggregationFunctionName());
            if (resultColumnWithAggregationFunction.getResultColumn().getColumnName().getTableName() == null)
                resultColumnWithAggregationFunction.getResultColumn().getColumnName().setTableName(tableNameMasterSelect);
            tableName = resultColumnWithAggregationFunction.getResultColumn().getColumnName().getTableName();
            columnName = resultColumnWithAggregationFunction.getResultColumn().getColumnName().getName();
            CheckSelectUndefinedColumnInTypeOrTable(tableName, columnName, "select");

            if (! tableName.equals(tableNameMasterSelect))
                CheckUsingTableNotJoined(tableName, selectCore.getInnerJoinStmts());
            System.out.println("selectCore table Name: "+tableName);
            System.out.println("selectCore Column Name: "+columnName);
            System.out.println(".....");
        }




        //WhereStmt
        if (selectCore.getWhereStmt()!=null){
            for (WhereCondition whereCondition:selectCore.getWhereStmt().getWhereConditions()) {
                if (whereCondition.getColumnName().getTableName() == null)
                    whereCondition.getColumnName().setTableName(tableNameMasterSelect);
                String tableName = whereCondition.getColumnName().getTableName();
                String columnName = whereCondition.getColumnName().getName();
                CheckSelectUndefinedColumnInTypeOrTable(tableName, columnName, "Where");
                if (! tableName.equals(tableNameMasterSelect))
                    CheckUsingTableNotJoined(tableName, selectCore.getInnerJoinStmts());
            }
        }

        //InnerJoinStmts
        if (selectCore.getInnerJoinStmts()!=null){
            for (InnerJoinStmt innerJoinStmt:selectCore.getInnerJoinStmts()) {
                checkSelectTableNotCreated(innerJoinStmt.getTableOrSubQuery().getTableName().getName());
                for (JoinCondition joinCondition :innerJoinStmt.getJoinConditions()) {

                    String tableNameFirst = joinCondition.getColumnNameFirst().getTableName();
                    String columnNameFirst = joinCondition.getColumnNameFirst().getName();
                    CheckSelectUndefinedColumnInTypeOrTable(tableNameFirst, columnNameFirst, "Inner Join");
                    if (! tableNameFirst.equals(tableNameMasterSelect) && !tableNameFirst.equals(innerJoinStmt.getTableOrSubQuery().getTableName().getName()))
                        CheckUsingTableNotJoined(tableNameFirst, selectCore.getInnerJoinStmts());

                    String tableNameSecond = joinCondition.getColumnNameSecond().getTableName();
                    String columnNameSecond = joinCondition.getColumnNameSecond().getName();
                    CheckSelectUndefinedColumnInTypeOrTable(tableNameSecond, columnNameSecond, "Inner Join");
                    if (! tableNameSecond.equals(tableNameMasterSelect) && ! tableNameSecond.equals(innerJoinStmt.getTableOrSubQuery().getTableName().getName()))
                        CheckUsingTableNotJoined(tableNameSecond, selectCore.getInnerJoinStmts());
                }
            }

        }

        //GroupBy
        if (selectCore.getColumnGroupBy()!=null){
            if (selectCore.getColumnGroupBy().getTableName() == null)
                selectCore.getColumnGroupBy().setTableName(tableNameMasterSelect);
            String tableName = selectCore.getColumnGroupBy().getTableName();
            String columnName = selectCore.getColumnGroupBy().getName();
            CheckSelectUndefinedColumnInTypeOrTable(tableName, columnName, "GroupBy");
            if (! tableName.equals(tableNameMasterSelect)){
//                CheckUsingColumnGroupByNotInSelect(selectCore.getColumnGroupBy(), selectCore.getResultColumns());
                CheckUsingTableNotJoined(tableName, selectCore.getInnerJoinStmts());
            }
        }

        CheckDuplicateTableInJoin(selectCore.getInnerJoinStmts());
        checkDuplicateColumnNameInSelect(selectCore.getResultColumns());
        checkSelectTableNotCreated(selectCore.getTableOrSubQuery().getTableName().getName());
    }

    @Override
    public void visit(TableName tableName) {
        System.out.println("ast tableName");

    }

    @Override
    public void visit(TypeName typeName) {
        System.out.println("ast typeName");

    }

    @Override
    public void visit(SQL_Statement_List sql_statement_list) {
        System.out.println("ast SQL_Statement_List");

    }

    @Override
    public void visit(ColumnDef columnDef) {
        System.out.println("ast ColumnDef");

    }

    @Override
    public void visit(ResultColumn resultColumn) {
        System.out.println("ast ResultColumn");

    }

    @Override
    public void visit(TableOrSubQuery tableOrSubquery) {
        System.out.println("ast TableOrSubquery ");

    }


    @Override
    public void visit(ExprQuery exprQuery) {
        System.out.println("ast ExprQuery ");
//        if (expr.getColumn_name()!=null)
//            checkUndeclaredVariable(expr.getScopeID(), expr.getColumn_name());
//        checkUsingUnassignedVariable(expr.getScopeID(), expr.getColumn_name());
//        System.out.println("ast expr Column_name : "+expr.getColumn_name());
    }

    @Override
    public void visit(InnerJoinStmt innerJoinStmt) {
        System.out.println("ast InnerJoinStmt ");

    }

    @Override
    public void visit(JoinCondition joinCondition) {
        System.out.println("ast JoinCondition ");

    }

    @Override
    public void visit(WhereCondition whereCondition)
    {
        System.out.println("ast WhereCondition ");

    }

    @Override
    public void visit(WhereStmt whereStmt) {
        System.out.println("ast WhereStmt ");

    }

    @Override
    public void visit(List_literalValue list_literalValue) {

    }

    @Override
    public void visit(AggregationFunction aggregationFunction) {
        System.out.println("ast AggregationFunction ");
        System.out.println("ast AggregationFunction getAggregationFunctionName = "+aggregationFunction.getAggregationFunctionName());
        System.out.println("ast AggregationFunction getJarPath = "+aggregationFunction.getJarPath());
        System.out.println("ast AggregationFunction getClassName = "+aggregationFunction.getClassName());
        System.out.println("ast AggregationFunction getMethodName = "+aggregationFunction.getMethodName());
        System.out.println("ast AggregationFunction getReturnType = "+aggregationFunction.getReturnType());
        for (TypeName typeName: aggregationFunction.getParams()) {
            System.out.println("ast AggregationFunction Params = "+typeName.getName());
        }
        Main.symbolTable.getDeclaredAggregationFunction().add(aggregationFunction);
    }

    @Override
    public void visit(ResultColumnWithAggregationFunction resultColumnWithAggregationFunction) {
        System.out.println("ast ResultColumnWithAggregationFunction");

    }


    private void createTypeFunction(String typeName, ArrayList<ColumnDef> columnDefs, String formatType, String path){
        if (!checkDuplicateColumnNameInCreate(columnDefs)){
            return;
        }
        if (Main.symbolTable.getTypeByVal(typeName)!=null){
            System.out.println("Error 500 type already exist");
            return;
        }
        Type type = new Type(typeName);
        type.setFormatType(formatType);
        type.setPath(path);
        for (ColumnDef columnDef : columnDefs) {
            if (!checkUnExistedColumnType(columnDef.getType_name().getName())){
                return;
            }
            Type ColumnType = Main.symbolTable.getTypeByVal(columnDef.getType_name().getName());
            type.addColumn(columnDef.getColumn_name(), ColumnType);
        }
        Main.symbolTable.addType(type);
    }

    private void createSymbol(int scopeID, String name, Type type, boolean isParam){
        System.out.println("createSymbol "+name);
        Symbol symbol = new Symbol(name);
        symbol.setType(type);
        symbol.setIsParam(isParam);
        Scope scope = Main.symbolTable.getScopeByID(scopeID);
        symbol.setScope(scope);
        scope.addSymbol(name, symbol);
    }



    private void checkUndeclaredVariable(int scopeID, String varName){
        Scope scope = Main.symbolTable.getScopeByID(scopeID);

        if (scope == null || findVarNameInScope(scope, varName, true) == null){
            Main.semanticChecks.getUndeclaredVariable()
                    .add("Variable Undeclared in ScopeID = "+scopeID + " ,var name = "+ varName );
        }
    }

    private boolean checkUnExistedColumnType(String typeName){
        Type ColumnType = Main.symbolTable.getTypeByVal(typeName);
        if (ColumnType == null) {
            Main.semanticChecks.getUnExistedColumnType().add("Error 404 type = "+typeName+" not defined..");
            return false;
        }
        return true;
    }

    private void checkMultipleDeclarationsVar(int scopeID, String varName){
        Scope scope = Main.symbolTable.getScopeByID(scopeID);

        if (scope == null || findVarNameInScope(scope, varName, true) != null){
            Main.semanticChecks.getMultipleDeclarationsVar()
                    .add("Variable already Declarations in ScopeID = "+scopeID + " ,var name = "+ varName );
        }
    }

    private void checkAssigningAnotherType(int scopeID, String varName, Expr val){
        Scope scope = Main.symbolTable.getScopeByID(scopeID);

        Symbol symbol = findVarNameInScope(scope, varName, true);
        if (symbol == null)
            return;
        Type typeVal = Symbol.getTypeOfVal(val);
        if (typeVal == null)
            return;
        String valType = typeVal.getName();//todo get type from var name
        if (symbol.getType()!=null){
            String symbolType = symbol.getType().getName();
            if (!symbolType.equals(valType)){
                Main.semanticChecks.getAssigningAnotherType().add("Assigning var "+varName+" to Another Type: "+varName+" type = "+symbolType+ " but val type "+valType);
            }
        }else {
            symbol.setType(Main.symbolTable.getTypeByVal(valType));
        }
    }

    private void CheckSelectUndefinedColumnInTypeOrTable(String typeOtTableName, String ColumnName, String CheckIn){
        Type type = Main.symbolTable.getTypeByVal(typeOtTableName);
        if (type == null) {
            return;
        }
        if (type.getColumns().get(ColumnName)==null){
            Main.semanticChecks.getSelectUndefinedColumnType().add("Error 404 Column In : " +CheckIn+ "Name : "+ColumnName+" not defined in : "+ typeOtTableName);
        }
    }

    private boolean checkDuplicateColumnNameInCreate(ArrayList<ColumnDef> columnDefs){
        ArrayList<String> columns = new ArrayList<>();
        for (ColumnDef columnDef:columnDefs) {
            for (String c:columns) {
                if (c.equals(columnDef.getColumn_name())){
                    Main.semanticChecks.getDuplicateColumnName().add("ColumnName = "+columnDef.getColumn_name()+" is Duplicate in create query");
                    return false;
                }
            }
            columns.add(columnDef.getColumn_name());
        }
        return true;
    }

    private void checkDuplicateColumnNameInSelect(ArrayList<ResultColumn> resultColumns){
        ArrayList<ResultColumn> resultColumnsCopy = new ArrayList<>();
        for (ResultColumn resultColumn:resultColumns) {
            for (ResultColumn resultColumnCopy:resultColumnsCopy) {
                if (resultColumn.isStar()){
                    if (!resultColumnCopy.isStar()) continue;

                    if (resultColumnCopy.getTableNameWhitStart().equals(resultColumn.getTableNameWhitStart()))
                    {
                        Main.semanticChecks.getDuplicateColumnName().add("ColumnName = "+resultColumn.getTableNameWhitStart()+".* is Duplicate in select query");
                    }
                }else {
                    if (resultColumnCopy.isStar()) continue;

                    if (resultColumnCopy.getColumnName().getName().equals(resultColumn.getColumnName().getName())
                            && resultColumnCopy.getColumnName().getTableName().equals(resultColumn.getColumnName().getTableName()))
                    {
                        Main.semanticChecks.getDuplicateColumnName().add("ColumnName = "+resultColumn.getColumnName().getName()+" is Duplicate in select query");
                    }
                }
            }
            resultColumnsCopy.add(resultColumn);
        }
    }

    private void checkUsingUnassignedVariable(int scopeID, String varName){
        Scope scope = Main.symbolTable.getScopeByID(scopeID);
        if (scope == null)
            return;

        Symbol symbol = findVarNameInScope(scope, varName, true);
        if (symbol == null){
            return;
        }
        if (symbol.getType()==null){
            Main.semanticChecks.getUsingUnassignedVariable().add("Warring!!! var = "+varName+ " is not Unassigned.");
        }

    }

    private void checkSelectTableNotCreated(String typeName){
        if (Main.symbolTable.getTypeByVal(typeName)==null){
            Main.semanticChecks.getSelectTableNotCreated().add("a select type/table = "+typeName+" not created");
        }
    }

    private void CheckUsingColumnGroupByNotInSelect(ColumnName columnNameGroupBy, ArrayList<ResultColumn> resultColumns){
        boolean statusExist = false;
        for (ResultColumn resultColumn:resultColumns) {
            String columnName = resultColumn.getColumnName().getName();
            String tableName = resultColumn.getColumnName().getTableName();
            if (columnNameGroupBy.getName().equals(columnName) && columnNameGroupBy.getTableName().equals(tableName)) {
                statusExist = true;
                break;
            }
        }
        if (!statusExist)
            Main.semanticChecks.getUsingTableNotJoined().add("Error 404 table : "+columnNameGroupBy.getTableName()+"."+columnNameGroupBy.getName()+ " not exist in query Join");


    }



    private void CheckUsingTableNotJoined(String typeOtTableName, ArrayList<InnerJoinStmt> innerJoinStmts){
        boolean statusExist = false;
        for (InnerJoinStmt innerJoinStmt:innerJoinStmts) {
            String tableName = innerJoinStmt.getTableOrSubQuery().getTableName().getName();
            String tableAlias =  innerJoinStmt.getTableOrSubQuery().getTable_alias();//todo
            if (typeOtTableName.equals(tableName) || (typeOtTableName.equals(tableAlias))) {
                statusExist = true;
                break;
            }
        }
        if (!statusExist)
            Main.semanticChecks.getUsingTableNotJoined().add("Error 404 table : "+typeOtTableName+ " not exist in query Join");
    }

    private void CheckDuplicateTableInJoin(ArrayList<InnerJoinStmt> innerJoinStmts){
        for (InnerJoinStmt innerJoinStmt: innerJoinStmts) {
            int visited = 0;
            String nameTableJoin = innerJoinStmt.getTableOrSubQuery().getTableName().getName();
            for (InnerJoinStmt innerJoinStmt2: innerJoinStmts) {
                if (innerJoinStmt2.getTableOrSubQuery().getTableName().getName().equals(nameTableJoin))
                    visited++;
            }
            if (visited>1)
                Main.semanticChecks.getDuplicateTableInJoin().add("table Name = "+nameTableJoin+" is Duplicate in join");
        }
    }

    private void CheckDeclaredAggregationFunction(String AggregationFunctionName){
        for (AggregationFunction aggregationFunction:Main.symbolTable.getDeclaredAggregationFunction()) {
            if (aggregationFunction.getAggregationFunctionName().equals(AggregationFunctionName))
                return;
        }

        Main.semanticChecks.getUndeclaredAggregationFunction().add("un declared Aggregation Function : "+AggregationFunctionName);
    }





    private Symbol findVarNameInScope(Scope scope, String varName, boolean allScopeSearch){
        Symbol symbol = scope.getSymbolMap().get(varName);

        if (symbol == null)
            if (scope.getParent() != null && allScopeSearch)
                symbol = findVarNameInScope(scope.getParent(), varName, true);
        return symbol;
    }



    /*
    scope open and close...
    * function_java_rule
    * switch_stmt
    * arrow_function_java
    * if_java_rule
    * for_java_rule
    * while_java_rule
    * do_while_java_rule
    * */








//    private Type getadsa(SqlParser.Literal_valueContext literal_valueContext){






//        Scope currentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1);
//        Type type = new Type();
//        String typeName = "";
//        if(ctx.variable_definition().expr()
//                .literal_value().NUMERIC_LITERAL() != null){
//            typeName = Type.NUMBER_CONST;
//        }
//        if(ctx.variable_definition()
//                .expr().literal_value().STRING_LITERAL() != null){
//            typeName = Type.STRING_CONST;
//        }
//        type.setName(typeName);
//        varSymbol.setIsParam(false);
//        varSymbol.setName(varName);
//        varSymbol.setScope(currentScope);
//        varSymbol.setType(type);
//        currentScope.addSymbol(varName,varSymbol);
//    }


//    @Override
//    public void visit(ColumnDefault columnDefault) {
//        System.out.println("\nast columnDefault ");
//        if (columnDefault.getAny_name().size()>0)
//            for (int i = 0; i <columnDefault.getAny_name().size() ; i++) {
//                System.out.println(columnDefault.getAny_name().get(i).getName());
//            }
//    }







}



