package Java.AST;

//import Java.AST.Visitor.ASTVisitor;

import Java.AST.Visitor.ASTVisitor;

public class Node {

    private int scopeID = -1;
    private int line;
    private int col;

    public void setLine(int line) {
        this.line = line;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getLine() {
        return line;
    }

    public int getCol() {
        return col;
    }

    public void setScopeID(int scopeID) {
        this.scopeID = scopeID;
    }

    public int getScopeID() {
        return scopeID;
    }

    public void accept(ASTVisitor astVisitor){}
}
