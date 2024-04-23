package Java.AST.RuleQueryStmt.Create;

import Java.AST.RuleQueryStmt.SQL_Statement;
import Java.AST.RuleQueryStmt.TypeName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class CreateType extends SQL_Statement {
    private TypeName type_name;
    private ArrayList<ColumnDef> column_defs = new ArrayList<>();

    public TypeName getType_name() {
        return type_name;
    }

    public void setType_name(TypeName type_name) {
        this.type_name = type_name;
    }


    public ArrayList<ColumnDef> getColumn_defs() {
        return column_defs;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (type_name!=null)
            type_name.accept(astVisitor);

        for (ColumnDef columnDef:column_defs) {
            columnDef.accept(astVisitor);
        }

    }
}
