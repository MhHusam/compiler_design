package Java.SymbolTable;

import Java.AST.RuleQueryStmt.Select.ColumnName;
import Java.AST.RuleQueryStmt.Select.InnerJoinStmt;
import Java.AST.RuleQueryStmt.Select.ResultColumn;
import Java.AST.RuleQueryStmt.Select.SelectCore;
import Java.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VarNotSetTypeSelectOld {
    private int scopeID;
    private String varName;
    private SelectCore selectCore;

    public VarNotSetTypeSelectOld() {

    }

    public VarNotSetTypeSelectOld(int scopeID, String varName, SelectCore selectCore) {
        this.scopeID = scopeID;
        this.varName = varName;
        this.selectCore = selectCore;
    }

    public void setType(){
        ArrayList<ResultColumn> resultColumnsAfterReplaceStart = new ArrayList<>(convertStartToColumns(selectCore.getResultColumns()));
        selectCore.getResultColumns().clear();
        selectCore.getResultColumns().addAll(resultColumnsAfterReplaceStart);

        Symbol symbol = Main.symbolTable.getScopeByID(scopeID).getSymbolMap().get(varName);
        String nameNewType = symbol.getName() +"_"+ selectCore.getTableOrSubQuery().getTableName().getName()
                +generatedNameClass(selectCore.getInnerJoinStmts());

        Type newType = CreateCustomType(nameNewType, selectCore.getResultColumns());
        symbol.setType(newType);
        Main.symbolTable.getDeclaredTypes().add(newType);

        System.out.println("new Type Columns:");
        for (Map.Entry<String, Type> column : newType.getColumns().entrySet()) {
            System.out.println(column.getValue().getName() +"  "+ column.getKey());
        }
        System.out.println("=====================");
    }

    private String generatedNameClass(ArrayList<InnerJoinStmt> innerJoinStmts){
        StringBuilder nameClass = new StringBuilder("");
        for (InnerJoinStmt innerJoinStmt:innerJoinStmts) {
            nameClass.append("_");
            nameClass.append(innerJoinStmt.getTableOrSubQuery().getTableName().getName());
        }
        return nameClass.toString();
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


    private Type CreateCustomType(String nameNewType, ArrayList<ResultColumn> resultColumns){
        Type newType = new Type(nameNewType);
        Map<String , Type> mapLowLevel = new HashMap<>();
        for (ResultColumn resultColumn : resultColumns) {
            String nameColumn = resultColumn.getColumnName().getName();
            String tableColumn = resultColumn.getColumnName().getTableName();
            Type typeColumn = getTypeColumn(nameColumn, tableColumn);
            if (checkTypeIsHighLevel(typeColumn)){
                ArrayList<String> levelName = new ArrayList<>();
                levelName.add(tableColumn);
                mapLowLevel.putAll(getLowLevel(typeColumn, new HashMap<>(), levelName));
            }else {
                mapLowLevel.put(tableColumn+"."+nameColumn, typeColumn);
            }
        }
        newType.getColumns().putAll(mapLowLevel);
        return newType;
    }


    private Map<String , Type> getLowLevel(Type type,  Map<String , Type> mapLowLevel, ArrayList<String> levelName){
        levelName.add(type.getName());
        for (Map.Entry<String, Type> column : type.getColumns().entrySet()) {
            if (checkTypeIsHighLevel(column.getValue())){
                mapLowLevel.putAll(getLowLevel(column.getValue(), mapLowLevel, levelName));
                levelName.remove(levelName.size()-1);
            }else {
                StringBuilder nameColumn = new StringBuilder();
                for (String s : levelName)
                    nameColumn.append(s).append("$");
                mapLowLevel.put(nameColumn+column.getKey(), column.getValue());
            }
        }
        return mapLowLevel;
    }

    private Type getTypeColumn(String nameColumn, String tableName){
        return Main.symbolTable.getTypeByVal(tableName).getColumns().get(nameColumn);
    }

    private boolean checkTypeIsHighLevel(Type type){
        String typeName = type.getName();
        return !typeName.equals(Type.NUMBER_CONST) && !typeName.equals(Type.STRING_CONST) && !typeName.equals(Type.BOOLEAN_CONST);
    }


    public void convertTableToLowLevel(){
        for (Type type:Main.symbolTable.getDeclaredTypes()) {
            if (type.getPath()!=null){
                Map<String , Type> mapLowLevel = new HashMap<>();
                for (Map.Entry<String, Type> column : type.getColumns().entrySet()) {
                    if (checkTypeIsHighLevel(column.getValue())){
                        ArrayList<String> levelName = new ArrayList<>();
                        mapLowLevel.putAll(getLowLevel(column.getValue(), mapLowLevel, levelName));
                        levelName.remove(levelName.size()-1);
                    }else {
                        mapLowLevel.put(column.getKey(), column.getValue());
                    }
                }
//                Map<String ,Type> columns = getLowLevel(type, new HashMap<>(), new ArrayList<>());
                type.setColumns(mapLowLevel);
            }
        }
    }

}
