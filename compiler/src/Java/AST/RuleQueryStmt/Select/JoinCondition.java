package Java.AST.RuleQueryStmt.Select;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class JoinCondition extends Node {
    private ColumnName columnNameFirst;
    private ColumnName columnNameSecond;

    public void setColumnNameFirst(ColumnName columnNameFirst) {
        this.columnNameFirst = columnNameFirst;
    }

    public void setColumnNameSecond(ColumnName columnNameSecond) {
        this.columnNameSecond = columnNameSecond;
    }

    public ColumnName getColumnNameFirst() {
        return columnNameFirst;
    }

    public ColumnName getColumnNameSecond() {
        return columnNameSecond;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        columnNameFirst.accept(astVisitor);
        columnNameSecond.accept(astVisitor);
    }
}
