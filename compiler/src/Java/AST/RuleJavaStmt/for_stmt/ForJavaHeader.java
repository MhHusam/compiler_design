package Java.AST.RuleJavaStmt.for_stmt;

import Java.AST.Node;
import Java.AST.RuleJavaStmt.assignmentVarWithoutDeclare.AssignmentJavaListVarWithoutDeclare;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.RuleJavaStmt.ConditionJava;
import Java.AST.RuleJavaStmt.assignmentVar.AssignmentJavaListVar;
import Java.AST.RuleJavaStmt.shortenOperators.ShortenJavaOperators;

public class ForJavaHeader extends Node {

    private AssignmentJavaListVar assignmentJavaListVar;//var i = 0
    private AssignmentJavaListVarWithoutDeclare assignmentJavaListVarWithoutDeclare;//i = 0

    private ConditionJava conditionJava;
    private ShortenJavaOperators shortenJavaOperatorsFor;


    public AssignmentJavaListVar getAssignmentJavaListVar() {
        return assignmentJavaListVar;
    }

    public void setAssignmentJavaListVar(AssignmentJavaListVar assignmentJavaListVar) {
        this.assignmentJavaListVar = assignmentJavaListVar;
    }

    public void setAssignmentJavaListVarWithoutDeclare(AssignmentJavaListVarWithoutDeclare assignmentJavaListVarWithoutDeclare) {
        this.assignmentJavaListVarWithoutDeclare = assignmentJavaListVarWithoutDeclare;
    }

    public AssignmentJavaListVarWithoutDeclare getAssignmentJavaListVarWithoutDeclare() {
        return assignmentJavaListVarWithoutDeclare;
    }

    public ConditionJava getConditionJava() {
        return conditionJava;
    }

    public void setConditionJava(ConditionJava conditionJava) {
        this.conditionJava = conditionJava;
    }

    public ShortenJavaOperators getShortenJavaOperatorsFor() {
        return shortenJavaOperatorsFor;
    }

    public void setShortenJavaOperatorsFor(ShortenJavaOperators shortenJavaOperatorsFor) {
        this.shortenJavaOperatorsFor = shortenJavaOperatorsFor;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (assignmentJavaListVar!=null)
            assignmentJavaListVar.accept(astVisitor);
        if (assignmentJavaListVarWithoutDeclare!=null)
            assignmentJavaListVarWithoutDeclare.accept(astVisitor);
        conditionJava.accept(astVisitor);
        shortenJavaOperatorsFor.accept(astVisitor);
    }

}
