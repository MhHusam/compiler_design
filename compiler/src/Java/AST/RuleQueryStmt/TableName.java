package Java.AST.RuleQueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class TableName extends Node {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
