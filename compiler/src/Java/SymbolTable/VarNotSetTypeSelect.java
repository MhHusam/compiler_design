package Java.SymbolTable;

import Java.AST.RuleQueryStmt.Select.*;
import Java.CodeGenerated.ConvertToLowLevel;
import Java.CodeGenerated.TypeSelect;
import Java.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VarNotSetTypeSelect {
    private int scopeID;
    private String varName;
    private SelectCore selectCore;

    public VarNotSetTypeSelect(int scopeID, String varName, SelectCore selectCore) {
        this.scopeID = scopeID;
        this.varName = varName;
        this.selectCore = selectCore;
    }

    public void buildType(){
        //convert Start to columns
        selectCore.setResultColumns(convertStartToColumns(selectCore.getResultColumns()));



        Symbol symbol = Main.symbolTable.getScopeByID(scopeID).getSymbolMap().get(varName);
        String nameNewType = symbol.getName();

        TypeSelect newType = new TypeSelect(nameNewType, selectCore);
        newType.setColumns(createColumns(selectCore.getResultColumns()));




        for (ResultColumnWithAggregationFunction resultColumnWithAggregationFunction:selectCore.getResultColumnWithAggregationFunctions()) {
            Type type = null;
            for (AggregationFunction aggregationFunction : Main.symbolTable.getDeclaredAggregationFunction()) {
                if (aggregationFunction.getAggregationFunctionName().equals(resultColumnWithAggregationFunction.getAggregationFunctionName()))
                    type = Main.symbolTable.getTypeByVal(aggregationFunction.getReturnType());
            }
            //cnt
            newType.getColumns().put(resultColumnWithAggregationFunction.getReturnColumn(), type);

            String nameColumn = resultColumnWithAggregationFunction.getResultColumn().getColumnName().getName();
            String tableColumn = resultColumnWithAggregationFunction.getResultColumn().getColumnName().getTableName();
            Type typeColumn = getTypeColumn(nameColumn, tableColumn);
            newType.getColumns().put(tableColumn+"$"+nameColumn, typeColumn);
        }
        symbol.setType(newType);
        Main.symbolTable.getDeclaredTypes().add(newType);
    }

    private ArrayList<ResultColumn> convertStartToColumns(ArrayList<ResultColumn> resultColumns){
        ArrayList<ResultColumn> newResultColumns = new ArrayList<>();
        for (ResultColumn resultColumn:resultColumns) {
            if (resultColumn.isStar()){
                String tableName = resultColumn.getTableNameWhitStart();
                Map<String, Type> columns = Main.symbolTable.getTypeByVal(tableName).getColumns();
                for (Map.Entry<String, Type> column : columns.entrySet()) {
                    ResultColumn newResultColumn = new ResultColumn();
                    ColumnName columnName = new ColumnName();
                    columnName.setName(column.getKey());
                    columnName.setTableName(tableName);
                    newResultColumn.setColumnName(columnName);
                    newResultColumns.add(newResultColumn);
                }
            }else{
                newResultColumns.add(resultColumn);
            }
        }
        return newResultColumns;
    }

    private Map<String , Type> createColumns(ArrayList<ResultColumn> resultColumns){
        Map<String , Type> newColumns = new HashMap<>();
        for (ResultColumn resultColumn : resultColumns) {
            String nameColumn = resultColumn.getColumnName().getName();
            String tableColumn = resultColumn.getColumnName().getTableName();
            Type typeColumn = getTypeColumn(nameColumn, tableColumn);
            if (ConvertToLowLevel.checkTypeIsHighLevel(typeColumn)){
                ArrayList<String> typeNames = new ArrayList<>();
                typeNames.add(tableColumn);
                typeNames.add(nameColumn);
                newColumns.putAll(ConvertToLowLevel.getLowLevel(typeColumn, new HashMap<>(), typeNames));
            }else {
                newColumns.put(tableColumn+"$"+nameColumn, typeColumn);
            }
        }

        return newColumns;
    }

    private Type getTypeColumn(String nameColumn, String tableName){
        return Main.symbolTable.getTypeByVal(tableName).getColumns().get(nameColumn);
    }


//    private String generatedNameClass(ArrayList<InnerJoinStmt> innerJoinStmts){
//        StringBuilder nameClass = new StringBuilder("");
//        for (InnerJoinStmt innerJoinStmt:innerJoinStmts) {
//            nameClass.append("_");
//            nameClass.append(innerJoinStmt.getTableOrSubQuery().getTableName().getName());
//        }
//        return nameClass.toString();
//    }

}
