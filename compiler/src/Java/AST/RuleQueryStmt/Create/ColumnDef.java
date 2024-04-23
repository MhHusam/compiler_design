package Java.AST.RuleQueryStmt.Create;
import Java.AST.Node;
import Java.AST.RuleQueryStmt.TypeName;
import Java.AST.Visitor.ASTVisitor;

public class ColumnDef extends Node {
    private String  column_name;
    private TypeName type_name;

    public String getColumn_name() {
        return column_name;
    }

    public void setColumn_name(String column_name) {
        this.column_name = column_name;
    }

    public TypeName getType_name() {
        return type_name;
    }

    public void setType_name(TypeName type_name) {
        this.type_name = type_name;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (type_name!=null)
            type_name.accept(astVisitor);
    }
}
