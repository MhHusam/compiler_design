package Java.AST.RuleQueryStmt.Select;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class ResultColumnWithAggregationFunction extends Node {

    private String returnColumn;
    private String AggregationFunctionName;
    private ResultColumn resultColumn;


    public String getReturnColumn() {
        return returnColumn;
    }

    public void setReturnColumn(String returnColumn) {
        this.returnColumn = returnColumn;
    }

    public String getAggregationFunctionName() {
        return AggregationFunctionName;
    }

    public void setAggregationFunctionName(String aggregationFunctionName) {
        AggregationFunctionName = aggregationFunctionName;
    }

    public ResultColumn getResultColumn() {
        return resultColumn;
    }

    public void setResultColumn(ResultColumn resultColumn) {
        this.resultColumn = resultColumn;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (resultColumn!=null)
            resultColumn.accept(astVisitor);
    }
}
