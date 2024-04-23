package Java.AST.RuleQueryStmt.Select;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class WhereCondition extends Node {
    private ColumnName columnName;
    private String conditionOperations;
    private ExprQuery exprQueryVal;

    public ColumnName getColumnName() {
        return columnName;
    }

    public void setColumnName(ColumnName columnName) {
        this.columnName = columnName;
    }

    public String getConditionOperations() {
        return conditionOperations;
    }

    public void setConditionOperations(String conditionOperations) {
        this.conditionOperations = conditionOperations;
    }

    public ExprQuery getExprQueryVal() {
        return exprQueryVal;
    }

    public void setExprQueryVal(ExprQuery exprQueryVal) {
        this.exprQueryVal = exprQueryVal;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if (exprQueryVal != null)
            exprQueryVal.accept(astVisitor);

    }
}
