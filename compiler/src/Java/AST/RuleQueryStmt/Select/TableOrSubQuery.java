package Java.AST.RuleQueryStmt.Select;

import Java.AST.Node;
import Java.AST.RuleQueryStmt.TableName;
import Java.AST.Visitor.ASTVisitor;

public class TableOrSubQuery extends Node {

    private TableName tableName;
    private String  table_alias;

    public TableName getTableName() {
        return tableName;
    }

    public void setTableName(TableName tableName) {
        this.tableName = tableName;
    }

    public String getTable_alias() {
        return table_alias;
    }

    public void setTable_alias(String table_alias) {
        this.table_alias = table_alias;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (tableName!=null)
            tableName.accept(astVisitor);
    }
}
