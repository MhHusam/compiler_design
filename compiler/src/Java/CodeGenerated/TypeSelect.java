package Java.CodeGenerated;

import Java.AST.RuleQueryStmt.Select.InnerJoinStmt;
import Java.AST.RuleQueryStmt.Select.SelectCore;
import Java.SymbolTable.Type;

import java.util.ArrayList;

public class TypeSelect extends Type {

    private SelectCore selectCore;
    private ArrayList<String> tablesUsed = new ArrayList<>();

    public TypeSelect(String name, SelectCore selectCore) {
        super(name);
        this.selectCore = selectCore;

        tablesUsed.add(selectCore.getTableOrSubQuery().getTableName().getName());
        for (InnerJoinStmt innerJoinStmt:selectCore.getInnerJoinStmts()) {
            tablesUsed.add(innerJoinStmt.getTableOrSubQuery().getTableName().getName());
        }
    }

    public ArrayList<String> getTablesUsed() {
        return tablesUsed;
    }

    public SelectCore getSelectCore() {
        return selectCore;
    }

}
