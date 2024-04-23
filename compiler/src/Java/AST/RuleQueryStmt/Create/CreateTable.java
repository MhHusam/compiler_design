package Java.AST.RuleQueryStmt.Create;

import Java.AST.RuleQueryStmt.TableName;
import Java.AST.RuleQueryStmt.SQL_Statement;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class CreateTable extends SQL_Statement {
    private TableName table_name;
    private ArrayList<ColumnDef> column_defs = new ArrayList<>();
    private String type_file;
    private String path;

    public TableName getTable_name() {
        return table_name;
    }

    public void setTable_name(TableName table_name) {
        this.table_name = table_name;
    }

    public ArrayList<ColumnDef> getColumn_defs() {
        return column_defs;
    }

    public String getType_file() {
        return type_file;
    }

    public void setType_file(String type_file) {
        this.type_file = type_file;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (table_name!=null){
            table_name.accept(astVisitor);
        }
        for (ColumnDef columnDef:column_defs) {
            columnDef.accept(astVisitor);
        }

    }
}
