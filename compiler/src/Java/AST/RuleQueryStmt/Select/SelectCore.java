package Java.AST.RuleQueryStmt.Select;

import Java.AST.Expr;
import Java.AST.RuleQueryStmt.SQL_Statement;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class SelectCore extends SQL_Statement {
    private ArrayList<ResultColumn> resultColumns = new ArrayList<>();
    private ArrayList<ResultColumnWithAggregationFunction> resultColumnWithAggregationFunctions = new ArrayList<>();
    private TableOrSubQuery tableOrSubQuery;
    private ArrayList<InnerJoinStmt> innerJoinStmts = new ArrayList<>();
    private WhereStmt whereStmt;
    private ColumnName columnGroupBy;

    public ArrayList<ResultColumn> getResultColumns() {
        return resultColumns;
    }

    public ArrayList<InnerJoinStmt> getInnerJoinStmts() {
        return innerJoinStmts;
    }




    public void setResultColumns(ArrayList<ResultColumn> resultColumns) {
        this.resultColumns = resultColumns;
    }

    public TableOrSubQuery getTableOrSubQuery() {
        return tableOrSubQuery;
    }

    public void setTableOrSubQuery(TableOrSubQuery tableOrSubQuery) {
        this.tableOrSubQuery = tableOrSubQuery;
    }

    public WhereStmt getWhereStmt() {
        return whereStmt;
    }

    public void setWhereStmt(WhereStmt whereStmt) {
        this.whereStmt = whereStmt;
    }

    public ColumnName getColumnGroupBy() {
        return columnGroupBy;
    }

    public void setColumnGroupBy(ColumnName columnGroupBy) {
        this.columnGroupBy = columnGroupBy;
    }

    public ArrayList<ResultColumnWithAggregationFunction> getResultColumnWithAggregationFunctions() {
        return resultColumnWithAggregationFunctions;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        for (ResultColumn resultColumn : resultColumns) {
            resultColumn.accept(astVisitor);
        }

        for (ResultColumnWithAggregationFunction resultColumnWithAggregationFunction : resultColumnWithAggregationFunctions) {
            resultColumnWithAggregationFunction.accept(astVisitor);
        }

        if (tableOrSubQuery!=null)
            tableOrSubQuery.accept(astVisitor);

        if (whereStmt!=null)
            whereStmt.accept(astVisitor);

        if (columnGroupBy!=null)
            columnGroupBy.accept(astVisitor);
    }

}
