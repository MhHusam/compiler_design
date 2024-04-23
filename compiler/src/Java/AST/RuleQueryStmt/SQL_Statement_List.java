package Java.AST.RuleQueryStmt;

import Java.AST.Node;
import Java.AST.RuleQueryStmt.Create.CreateTable;
import Java.AST.RuleQueryStmt.Create.CreateType;
import Java.AST.RuleQueryStmt.Select.SelectCore;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class SQL_Statement_List extends Node {

    private ArrayList<SQL_Statement> sql_statements = new ArrayList<>();

    public ArrayList<SQL_Statement> getSql_statements() {
        return sql_statements;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (SQL_Statement sql_statement : sql_statements) {
            sql_statement.accept(astVisitor);
        }
    }



}
