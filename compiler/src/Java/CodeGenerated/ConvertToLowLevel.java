package Java.CodeGenerated;

import Java.SymbolTable.Type;

import java.util.ArrayList;
import java.util.Map;

public class ConvertToLowLevel {

    public static Map<String , Type> getLowLevel(Type type, Map<String , Type> mapLowLevel, ArrayList<String> levelName){
        for (Map.Entry<String, Type> column : type.getColumns().entrySet()) {
            if (checkTypeIsHighLevel(column.getValue())){

                levelName.add(column.getKey());
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

    public static boolean checkTypeIsHighLevel(Type type){
        String typeName = type.getName();
        return !typeName.equals(Type.NUMBER_CONST) && !typeName.equals(Type.STRING_CONST) && !typeName.equals(Type.BOOLEAN_CONST);
    }


}
