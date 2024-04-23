package Java.AST.RuleJavaStmt.assignmentVarWithoutDeclare;

import Java.AST.Expr;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class AssignmentJavaVarWithoutDeclare extends Node {
    private String name;
    private Expr ExprVal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expr getExprVal() {
        return ExprVal;
    }

    public void setExprVal(Expr exprVal) {
        ExprVal = exprVal;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        ExprVal.accept(astVisitor);
    }
}

