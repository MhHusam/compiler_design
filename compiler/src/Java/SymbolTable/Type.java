package Java.SymbolTable;

import java.util.HashMap;
import java.util.Map;

public class Type {

    public Type(String name) {
        this.name = name;
    }

    protected String name;
    protected Map<String, Type> columns = new HashMap<String, Type>();//todo protected
    private String path;
    private String formatType;



    public final static String NUMBER_CONST     = "number";
    public final static String STRING_CONST     = "string";
    public final static String BOOLEAN_CONST    = "boolean";
    public final static String SELECT_EMPTY     = "selectEmpty";


    public String getName() {
        return name;
    }

    public void setColumns(Map<String, Type> columns) {
        this.columns = columns;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Type> getColumns() {
        return columns;
    }

    public void addColumn(String name, Type type){
        columns.put(name, type);
    }

    public String getPath() {
        return path;
    }

    public String getFormatType() {
        return formatType;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }
}
