package Java.AST.RuleQueryStmt.Select;

import Java.AST.LiteralValue;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class List_literalValue extends Node {

    private ArrayList<LiteralValue> literalValues = new ArrayList<>();

    public ArrayList<LiteralValue> getLiteralValues() {
        return literalValues;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (LiteralValue literalValue: literalValues) {
            literalValue.accept(astVisitor);
        }
    }
}
