package Java.AST.RuleJavaStmt.doWhile_stmt;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.RuleJavaStmt.BodyBracketsJava;
import Java.AST.RuleJavaStmt.JavaBody;
import Java.AST.RuleJavaStmt.while_stmt.WhileJavaHeader;

public class DoWhileJavaRule extends JavaBody {
    private BodyBracketsJava bodyBracketsJava;
    private WhileJavaHeader whileJavaHeader;

    public BodyBracketsJava getBodyBracketsJava() {
        return bodyBracketsJava;
    }

    public void setBodyBracketsJava(BodyBracketsJava bodyBracketsJava) {
        this.bodyBracketsJava = bodyBracketsJava;
    }

    public WhileJavaHeader getWhileJavaHeader() {
        return whileJavaHeader;
    }

    public void setWhileJavaHeader(WhileJavaHeader whileJavaHeader) {
        this.whileJavaHeader = whileJavaHeader;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        bodyBracketsJava.accept(astVisitor);
        whileJavaHeader.accept(astVisitor);
    }
}
