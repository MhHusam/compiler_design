package Java.SymbolTable;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    private static int countID = 1;
    private int id;
    private Scope parent;
    private Map<String, Symbol> symbolMap = new LinkedHashMap<>();
    private Map<String, Symbol> symbolNotAssMap = new LinkedHashMap<>();

    public Scope(Scope parent) {
        this.parent = parent;
        this.id = countID++;
    }

    public int getId() {
        return id;
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public Map<String, Symbol> getSymbolMap() {
        return symbolMap;
    }

    public void setSymbolMap(Map<String, Symbol> symbolMap) {
        this.symbolMap = symbolMap;
    }
    public void addSymbol(String name, Symbol symbol) {
        this.symbolMap.put(name,symbol);
    }
}
