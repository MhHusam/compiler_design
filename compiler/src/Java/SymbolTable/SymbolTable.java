package Java.SymbolTable;

import java.util.ArrayList;
import java.util.Stack;


public class SymbolTable {


    private ArrayList<Scope> scopes = new ArrayList<>();

    private Stack<Scope> stackScopes = new Stack<>();

    private ArrayList<Type> declaredTypes = new ArrayList<>();

    private ArrayList<AggregationFunction> declaredAggregationFunction = new ArrayList<AggregationFunction>();

    private ArrayList<VarNotSetTypeSelect> varNotSetTypesSelectSelect = new ArrayList<>();

    private ArrayList<String> functionNotDeclare = new ArrayList<>();
    private ArrayList<String> functionDeclare = new ArrayList<>();

    public ArrayList<String> getFunctionNotDeclare() {
        return functionNotDeclare;
    }

    public ArrayList<String> getFunctionDeclare() {
        return functionDeclare;
    }

    public ArrayList<VarNotSetTypeSelect> getVarNotSetTypesSelectSelect() {
        return varNotSetTypesSelectSelect;
    }

    //---------scopes-----------
    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(ArrayList<Scope> scopes) {
        this.scopes = scopes;
    }

    public void addScope(Scope scope){
        this.scopes.add(scope);
    }

    public Stack<Scope> getStackScopes() {
        return stackScopes;
    }

    public Scope getScopeByID(int id){
        for (Scope scope : scopes) {
            if (scope.getId()==id) {
                return scope;
            }
        }
        return null;
    }

    public ArrayList<AggregationFunction> getDeclaredAggregationFunction() {
        return declaredAggregationFunction;
    }

    //---------Types-----------
    public ArrayList<Type> getDeclaredTypes() {
        return declaredTypes;
    }

    public void addType(Type type){
        this.declaredTypes.add(type);
    }

    public Type getTypeByVal(String name){
        for (Type declaredType : declaredTypes) {
            if (declaredType.getName().equals(name)) {
                return declaredType;
            }
        }
        return null;
    }


    //----------var------------
    public static Symbol findVarNameInScope(Scope scope, String varName, boolean allScopeSearch){
        Symbol symbol = scope.getSymbolMap().get(varName);

        if (symbol == null)
            if (scope.getParent() != null && allScopeSearch)
                symbol = findVarNameInScope(scope.getParent(), varName, true);
        return symbol;
    }

}
