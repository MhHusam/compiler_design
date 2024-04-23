package Java.AST.RuleQueryStmt.Select;

import Java.AST.Node;

public class ColumnName extends Node {
    private String name;
    private String tableName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
