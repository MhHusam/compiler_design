package Java.AST.RuleQueryStmt.Select;

import Java.AST.Node;
import Java.AST.RuleQueryStmt.TableName;
import Java.AST.Visitor.ASTVisitor;

public class ResultColumn extends Node {
    private boolean star = false;
    private String tableNameWhitStart;
    private ColumnName columnName;

    public String getTableNameWhitStart() {
        return tableNameWhitStart;
    }

    public void setTableNameWhitStart(String tableNameWhitStart) {
        this.tableNameWhitStart = tableNameWhitStart;
    }

    public ColumnName getColumnName() {
        return columnName;
    }

    public void setColumnName(ColumnName columnName) {
        this.columnName = columnName;
    }

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (columnName!=null)
            columnName.accept(astVisitor);
    }
}
