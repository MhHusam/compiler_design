package Java.AST.RuleQueryStmt.Select;

import Java.AST.LiteralValue;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class ExprQuery extends Node {
    private LiteralValue literalValue;
    private String varName;
    private List_literalValue list_literalValue;

    public LiteralValue getLiteralValue() {
        return literalValue;
    }

    public void setLiteralValue(LiteralValue literalValue) {
        this.literalValue = literalValue;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public void setList_literalValue(List_literalValue list_literalValue) {
        this.list_literalValue = list_literalValue;
    }

    public List_literalValue getList_literalValue() {
        return list_literalValue;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (literalValue != null)
            literalValue.accept(astVisitor);
    }
}
