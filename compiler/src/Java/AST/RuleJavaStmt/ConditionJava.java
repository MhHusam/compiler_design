package Java.AST.RuleJavaStmt;

import Java.AST.Expr;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class ConditionJava extends Node{
    private ArrayList<Expr> exprs = new ArrayList<>();

    public ArrayList<Expr> getExprs() {
        return exprs;
    }


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (Expr expr:exprs) {
            expr.accept(astVisitor);
        }
    }
}
