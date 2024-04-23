package Java.AST.RuleJavaStmt.print;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.Expr;
import Java.AST.RuleJavaStmt.JavaBody;

public class PrintJava extends JavaBody {
    private Expr exprPrint;

    public Expr getExprPrint() {
        return exprPrint;
    }

    public void setExprPrint(Expr exprPrint) {
        this.exprPrint = exprPrint;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        exprPrint.accept(astVisitor);
    }
}

