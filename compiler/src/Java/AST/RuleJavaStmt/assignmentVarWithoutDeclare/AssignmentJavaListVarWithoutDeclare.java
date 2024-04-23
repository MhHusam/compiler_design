package Java.AST.RuleJavaStmt.assignmentVarWithoutDeclare;

import Java.AST.RuleJavaStmt.JavaBody;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class AssignmentJavaListVarWithoutDeclare extends JavaBody {
    private ArrayList<AssignmentJavaVarWithoutDeclare> assignmentJavaVars = new ArrayList<>();

    public ArrayList<AssignmentJavaVarWithoutDeclare> getAssignmentJavaVars() {
        return assignmentJavaVars;
    }

    public void setAssignmentJavaVars(ArrayList<AssignmentJavaVarWithoutDeclare> assignmentJavaVars) {
        this.assignmentJavaVars = assignmentJavaVars;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (AssignmentJavaVarWithoutDeclare assignmentJavaVar : assignmentJavaVars) {
            assignmentJavaVar.accept(astVisitor);
        }
    }
}
