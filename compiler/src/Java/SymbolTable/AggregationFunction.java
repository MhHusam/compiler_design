package Java.SymbolTable;

import Java.AST.Node;
import Java.AST.RuleQueryStmt.TypeName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class AggregationFunction extends Node {
    protected String AggregationFunctionName;
    protected String JarPath;
    protected String ClassName;
    protected String MethodName;
    protected String returnType;
    private ArrayList<TypeName> params = new ArrayList<>();


    public String getAggregationFunctionName() {
        return AggregationFunctionName;
    }

    public void setAggregationFunctionName(String aggregationFunctionName) {
        AggregationFunctionName = aggregationFunctionName;
    }

    public String getJarPath() {
        return JarPath;
    }

    public void setJarPath(String jarPath) {
        JarPath = jarPath;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getMethodName() {
        return MethodName;
    }

    public void setMethodName(String methodName) {
        MethodName = methodName;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public ArrayList<TypeName> getParams() {
        return params;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}