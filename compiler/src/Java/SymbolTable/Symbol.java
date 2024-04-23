package Java.SymbolTable;

import Java.AST.Expr;
import Java.AST.RuleQueryStmt.Create.ColumnDef;
import Java.AST.RuleQueryStmt.Select.ResultColumn;
import Java.AST.RuleQueryStmt.Select.SelectCore;
import Java.Main;
import gen.SqlParser;

public class Symbol {

    private String name;
    private Type type;
    private Scope scope;
    private boolean isParam = false;

    public Symbol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Scope getScope() {
        return scope;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public boolean getIsParam() {
        return isParam;
    }

    public void setIsParam(boolean param) {
        isParam = param;
    }


    public static Type getTypeOfVal(Expr expr){

        if (expr.getVarName()!=null){
            String varName = expr.getVarName();
            if (expr.getScopeID()!= -1){
                Scope scope = Main.symbolTable.getScopeByID(expr.getScopeID());
                Symbol symbol = SymbolTable.findVarNameInScope(scope, varName, true);
                if (symbol == null)
                    return null;
                if (symbol.getType()!=null)
                    return symbol.getType();
            }
        }

        if (expr.getSelectCore()!=null){
            return Main.symbolTable.getTypeByVal(Type.SELECT_EMPTY);

        }

        if (expr.getLiteralValue()==null)
            return null;

        if(expr.getLiteralValue().getNUMERIC_LITERAL()!= null){
            return Main.symbolTable.getTypeByVal(Type.NUMBER_CONST);
        }
        if(expr.getLiteralValue().getSTRING_LITERAL()!= null){
            return Main.symbolTable.getTypeByVal(Type.STRING_CONST);
        }
        if(expr.getLiteralValue().getBOOLEAN_LITERAL()!= null){
            return Main.symbolTable.getTypeByVal(Type.BOOLEAN_CONST);
        }
        return null;
    }


    private static Type getTypeFromSelect(String varName, SelectCore selectCore){

        Type type = new Type(varName+"123");

        for (ResultColumn resultColumn:selectCore.getResultColumns()) {
            Type columnType = getTypeFromType(resultColumn.getColumnName().getName(), resultColumn.getColumnName().getTableName());
            type.addColumn(resultColumn.getColumnName().getName(), columnType);
        }
        Main.symbolTable.addType(type);
        return type;
    }



    private static Type getTypeFromType(String colName, String typeName){
        Type type = Main.symbolTable.getTypeByVal(typeName);
        return type.getColumns().get(colName);
    }

}
