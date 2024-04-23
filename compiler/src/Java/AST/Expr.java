package Java.AST;

import Java.AST.RuleQueryStmt.Select.SelectCore;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class Expr extends Node {

    private ArrayList<Expr> exprs =new ArrayList<>();
    private SelectCore selectCore;
    private LiteralValue literalValue;
    private String varName;
    private String unary_operator;
    private String Operator;
    private String function_name;


    public ArrayList<Expr> getExprs() {
        return exprs;
    }

    public SelectCore getSelectCore() {
        return selectCore;
    }

    public void setSelectCore(SelectCore selectCore) {
        this.selectCore = selectCore;
    }

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

    public String getUnary_operator() {
        return unary_operator;
    }

    public void setUnary_operator(String unary_operator) {
        this.unary_operator = unary_operator;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public String getFunction_name() {
        return function_name;
    }

    public void setFunction_name(String function_name) {
        this.function_name = function_name;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (Expr expr : exprs) {
            expr.accept(astVisitor);
        }

        if (selectCore != null)
            selectCore.accept(astVisitor);
        if (literalValue != null)
            literalValue.accept(astVisitor);
    }



}
