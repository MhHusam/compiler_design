package Java.AST.RuleQueryStmt;

import Java.SymbolTable.AggregationFunction;
import Java.AST.Node;
import Java.AST.RuleQueryStmt.Create.CreateTable;
import Java.AST.RuleQueryStmt.Create.CreateType;
import Java.AST.RuleQueryStmt.Select.SelectCore;
import Java.AST.Visitor.ASTVisitor;

public class SQL_Statement extends Node {

    private CreateTable createTable;
    private CreateType createType;
    private SelectCore selectCore;
    private AggregationFunction aggregationFunction;

    public CreateTable getCreateTable() {
        return createTable;
    }

    public void setCreateTable(CreateTable createTable) {
        this.createTable = createTable;
    }

    public CreateType getCreateType() {
        return createType;
    }

    public void setCreateType(CreateType createType) {
        this.createType = createType;
    }

    public SelectCore getSelectCore() {
        return selectCore;
    }

    public void setSelectCore(SelectCore selectCore) {
        this.selectCore = selectCore;
    }

    public AggregationFunction getAggregationFunction() {
        return aggregationFunction;
    }

    public void setAggregationFunction(AggregationFunction aggregationFunction) {
        this.aggregationFunction = aggregationFunction;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (createTable!=null)
            createTable.accept(astVisitor);
        if (createType!=null)
            createType.accept(astVisitor);
        if (selectCore!=null)
            selectCore.accept(astVisitor);
        if (aggregationFunction!=null)
            aggregationFunction.accept(astVisitor);
    }


    //    private String name="";
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }

}
