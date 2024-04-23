package Java.AST;

import Java.AST.RuleQueryStmt.SQL_Statement;
//import Java.AST.Visitor.ASTVisitor;
import Java.AST.RuleQueryStmt.SQL_Statement_List;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.RuleJavaStmt.JavaStmtList;

import java.util.ArrayList;
import java.util.List;

public class Parse extends Node{
    private List<SQL_Statement_List> sql_statement_lists = new ArrayList<>();
    private List<JavaStmtList> javaStmtLists = new ArrayList<>();


    public List<SQL_Statement_List> getSql_statement_lists() {
        return sql_statement_lists;
    }

    public List<JavaStmtList> getJavaStmtLists() {
        return javaStmtLists;
    }

    public void setJavaStmtLists(List<JavaStmtList> javaStmtLists) {
        this.javaStmtLists = javaStmtLists;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (SQL_Statement_List sql_statement_list : this.sql_statement_lists) {
            sql_statement_list.accept(astVisitor);
        }
        for (JavaStmtList javaStmtList : javaStmtLists) {
            javaStmtList.accept(astVisitor);
        }
    }


    //    @Override
//    public void accept(ASTVisitor astVisitor){
//        astVisitor.visit(this);
////        this.sqlStmts.forEach( stmt -> stmt.accept(astVisitor));
//        for(int i = 0 ; i < this.sqlStmts.size() ; i++){
//            this.sqlStmts.get(i).accept(astVisitor);
//        }
//    }
}
