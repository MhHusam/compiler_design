package Java.SemanticChecksRequirements;

import java.util.ArrayList;

public class SemanticChecks {
    private ArrayList<String> undeclaredVariable = new ArrayList<>();
    private ArrayList<String> unExistedColumnType = new ArrayList<>();
    private ArrayList<String> multipleDeclarationsVar = new ArrayList<>();
    private ArrayList<String> assigningAnotherType = new ArrayList<>();
    private ArrayList<String> selectUndefinedColumnType = new ArrayList<>();
    private ArrayList<String> duplicateColumnName = new ArrayList<>();
    private ArrayList<String> usingUnassignedVariable = new ArrayList<>();
    private ArrayList<String> selectTableNotCreated = new ArrayList<>();
    private ArrayList<String> callingUndeclaredMethod = new ArrayList<>();
    private ArrayList<String> usingTableNotJoined = new ArrayList<>();
    private ArrayList<String> usingColumnGroupByNotInSelect = new ArrayList<>();
    private ArrayList<String> duplicateTableInJoin = new ArrayList<>();
    private ArrayList<String> undeclaredAggregationFunction = new ArrayList<>();

    public ArrayList<String> getUndeclaredVariable() {
        return undeclaredVariable;
    }

    public ArrayList<String> getUnExistedColumnType() {
        return unExistedColumnType;
    }

    public ArrayList<String> getMultipleDeclarationsVar() {
        return multipleDeclarationsVar;
    }

    public ArrayList<String> getAssigningAnotherType() {
        return assigningAnotherType;
    }

    public ArrayList<String> getSelectUndefinedColumnType() {
        return selectUndefinedColumnType;
    }

    public ArrayList<String> getDuplicateColumnName() {
        return duplicateColumnName;
    }

    public ArrayList<String> getUsingUnassignedVariable() {
        return usingUnassignedVariable;
    }

    public ArrayList<String> getSelectTableNotCreated() {
        return selectTableNotCreated;
    }

    public ArrayList<String> getCallingUndeclaredMethod() {
        return callingUndeclaredMethod;
    }

    public ArrayList<String> getUsingTableNotJoined() {
        return usingTableNotJoined;
    }

    public ArrayList<String> getUsingColumnGroupByNotInSelect() {
        return usingColumnGroupByNotInSelect;
    }

    public ArrayList<String> getDuplicateTableInJoin() {
        return duplicateTableInJoin;
    }

    public ArrayList<String> getUndeclaredAggregationFunction() {
        return undeclaredAggregationFunction;
    }
}
