package Java.AST.RuleQueryStmt.Select;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class InnerJoinStmt extends Node {
    private TableOrSubQuery tableOrSubQuery;
    private ArrayList<JoinCondition> joinConditions = new ArrayList<>();

    public TableOrSubQuery getTableOrSubQuery() {
        return tableOrSubQuery;
    }

    public void setTableOrSubQuery(TableOrSubQuery tableOrSubQuery) {
        this.tableOrSubQuery = tableOrSubQuery;
    }

    public ArrayList<JoinCondition> getJoinConditions() {
        return joinConditions;
    }

    public void setJoinConditions(ArrayList<JoinCondition> joinConditions) {
        this.joinConditions = joinConditions;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (tableOrSubQuery!=null)
            tableOrSubQuery.accept(astVisitor);
        for (JoinCondition joinCondition:joinConditions) {
            joinCondition.accept(astVisitor);
        }
    }
}
