package Java.AST.RuleQueryStmt.Select;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class WhereStmt extends Node {

    private ArrayList<WhereCondition> whereConditions = new ArrayList<>();

    public ArrayList<WhereCondition> getWhereConditions() {
        return whereConditions;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        for (WhereCondition whereCondition:whereConditions) {
            whereCondition.accept(astVisitor);
        }

    }
}
