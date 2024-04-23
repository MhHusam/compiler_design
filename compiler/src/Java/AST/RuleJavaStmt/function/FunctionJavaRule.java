package Java.AST.RuleJavaStmt.function;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.RuleJavaStmt.JavaBody;
import Java.AST.RuleJavaStmt.JavaStmt;

import java.util.ArrayList;

public class FunctionJavaRule extends JavaStmt {
    private FunctionJavaHeader functionJavaHeader;
    private ArrayList<JavaBody> javaBodies = new ArrayList<>();

    public FunctionJavaHeader getFunctionJavaHeader() {
        return functionJavaHeader;
    }

    public void setFunctionJavaHeader(FunctionJavaHeader functionJavaHeader) {
        this.functionJavaHeader = functionJavaHeader;
    }

    public ArrayList<JavaBody> getJavaBodies() {
        return javaBodies;
    }

    public void setJavaBodies(ArrayList<JavaBody> javaBodies) {
        this.javaBodies = javaBodies;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        functionJavaHeader.accept(astVisitor);
        for (JavaBody javaBody : javaBodies) {
            javaBody.accept(astVisitor);
        }
    }

}
