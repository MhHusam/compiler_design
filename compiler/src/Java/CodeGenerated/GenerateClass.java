package Java.CodeGenerated;

import Java.AST.LiteralValue;
import Java.AST.RuleQueryStmt.Select.*;
import Java.Main;
import Java.SymbolTable.AggregationFunction;
import Java.SymbolTable.Type;
import Java.SymbolTable.VarNotSetTypeSelect;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GenerateClass {

    private String space = " ";
    private String newLine = "\n";
    private String tap = "\t";

    private void clearDirectoryMain(File dir) {
        for (File file: dir.listFiles()) {
            if (file.isFile() )
                file.delete();
        }
    }

    public void run(){

        for (VarNotSetTypeSelect varNotSetTypeSelect : Main.symbolTable.getVarNotSetTypesSelectSelect()) {
            varNotSetTypeSelect.buildType();
        }
//        convertTableToLowLevel();
        String pathDelete = "C:\\code\\CompilerCGTest\\src\\com\\company";

        clearDirectoryMain(new File(pathDelete));
        for (Type type : Main.symbolTable.getDeclaredTypes()) {
            if (type.getName().equals(Type.BOOLEAN_CONST) || type.getName().equals(Type.STRING_CONST)
                    || type.getName().equals(Type.NUMBER_CONST) || type.getName().equals(Type.SELECT_EMPTY))
                continue;
            System.out.println("\n____________ class ____________");
            String classData = createClass(type);
            System.out.println(classData);


            String path = "C:\\code\\CompilerCGTest\\src\\com\\company\\"+type.getName()+".java";
            File file = new File(path);
            BufferedWriter output;
            try {
                if (!file.createNewFile()){
                    System.out.println("Error Create File " + type.getName());
                    return;
                }
                output = new BufferedWriter(new FileWriter(file));
                output.write(classData);
                output.close();
            } catch ( IOException e ) {
                e.printStackTrace();
            }
        }
    }

//    private void convertTableToLowLevel(){
//        for (Type type: Main.symbolTable.getDeclaredTypes()) {
//            if (type.getPath()!=null){
//                type.setColumns(ConvertToLowLevel.getLowLevel(type, new HashMap<>(), new ArrayList<>()));
//            }
//        }
//    }




    private String createClass(Type type){
        StringBuilder str = new StringBuilder();
        str.append("\n" + "package" + " " + "com.company;" +
                "\n" +
                "import com.google.gson.Gson;\n" +
                "import com.google.gson.reflect.TypeToken;\n" +
                "\n" +
                "import java.io.BufferedReader;\n" +
                "import java.io.FileReader;\n" +
                "import java.lang.reflect.Type;\n" +
                "import java.io.IOException;\n" +
                "import java.util.Arrays;\n" +
                "import java.util.ArrayList;" +
                "import com.google.gson.Gson;\n" +
                        "import com.google.gson.JsonElement;\n" +
                        "import com.google.gson.JsonObject;\n" +
                        "import com.google.gson.reflect.TypeToken;\n" +
                        "import com.google.gson.stream.JsonReader;"+
                "\n" +
                "public class").append(space).append(type.getName())
                .append("{" + "\n" + "\n")
                .append(createVariables(type))
                .append(createOverrideToStringFunction(type));


        if (type instanceof TypeSelect){
            TypeSelect typeSelect = (TypeSelect) type;
            return  str.toString()+
                    createArrayListTables(typeSelect)+
                    createFunctionsFillData(typeSelect)+
                    createFunctionGetResult(typeSelect)+
                    createGroupByFunction(typeSelect)+
                    createConditionFunction(typeSelect)+
                    createAggFunction(typeSelect)+
                    "}"+
                    "\n";

        }else {
            return  str.toString()+
                    createVariablePathAndType(type) +
                    createFunctionLoad(type) +
                    "}"+
                    "\n";
        }

    }

    private String createVariables(Type type){
        StringBuilder str = new StringBuilder();
        for (Map.Entry<String, Type> column : type.getColumns().entrySet()) {
            str.append("\t").append("public").append(" ").append(replaceTypeToStanderJava(column.getValue().getName()))
                    .append(" ").append(column.getKey()).append(";");
            str.append("\n");
        }
        str.append(newLine);
        return str.toString();
    }

    private String createVariablePathAndType(Type type){
        StringBuilder str = new StringBuilder();
        if (type.getPath()!=null){
            str.append("\n");
            str.append("\t").append("private").append(" ").append("String").append(" ").append("path = ").append(type.getPath()).append(";");
            str.append("\n");
        }
        return str.toString();
    }

    private String replaceTypeToStanderJava(String s){
        if (s.equals(Type.STRING_CONST))
            return "String";
        if (s.equals(Type.NUMBER_CONST))
            return "double";
        if (s.equals(Type.BOOLEAN_CONST))
            return "Boolean";
        return s;
    }

    private String createFunctionLoad(Type type){
        if (type.getPath()==null){
            return "";
        }

        return "    public ArrayList<"+type.getName()+"> getData(){\n" +
                "        return "+ (type.getFormatType().equals("\"json\"")? "loadFromJson();\n" : "loadFromCSV();\n" )+
                "    }"+
                "\n"+
                (type.getFormatType().equals("\"json\"")? createFunctionLoadFromJson(type) : createFunctionLoadFromCSV(type) )+
                "\n";
    }

    private String createFunctionLoadFromCSV(Type type){
        String nameObj = "_"+type.getName();
        StringBuilder str = new StringBuilder();
        str.append("\n");
        str.append(tap).append("public ArrayList<").append(type.getName()).append("> loadFromCSV(){");
        str.append("\n");
        str.append(tap).append(tap).append("ArrayList<").append(type.getName()).append("> list = new ArrayList<>();");
        str.append("\n");
        str.append(tap).append("    try {\n" +
                "            String line;\n" +
                "            boolean firstRow = true;\n" +
                "            BufferedReader br = new BufferedReader(new FileReader(path));\n" +
                "            while ((line = br.readLine()) != null) {\n" +
                "                if (firstRow) {\n" +
                "                    firstRow = false;\n" +
                "                    continue;\n" +
                "                }\n" +
                "                String[] items = line.split(\",\");");
        str.append("\n");
        str.append(tap).append(tap).append(tap).append(tap).append(type.getName()).append(" ").append(nameObj).append(" = new ").append(type.getName()).append("();");
        str.append("\n");

        int idx = 0;
        ArrayList<Integer> indexes = getIndexesForCsv(type);
        for (Map.Entry<String, Type> column : type.getColumns().entrySet()) {
            str.append(tap).append(tap).append(tap).append(tap)
                    .append(nameObj).append(".").append(column.getKey()).append(" = ").append(getCSV_ParseTo(column.getValue().getName(), indexes.get(idx)));
            str.append("\n");
            idx++;
        }
        str.append(tap).append(tap).append(tap).append(tap).append("list.add(").append(nameObj).append(");");
        str.append("\n");
        str.append(tap).append(tap).append(tap).append("}\n" +
                "        } catch (IOException e) {\n" +
                "            e.printStackTrace();\n" +
                "        }\n" +
                "        return list;\n" +
                "    }");
        return str.toString();
    }

    private String createFunctionLoadFromJson(Type type){
        StringBuilder str = new StringBuilder();
        str.append("\n");
        str.append(tap).append(tap).append("ArrayList<").append(type.getName()).append("> list = new ArrayList<>();");
        str.append(tap).append(tap).append("ArrayList<").append(type.getName()).append("> list = new ArrayList<>();");
         str.append("public ArrayList<"+type.getName()+"> getList() {\n" +
                 "        return list;\n" +
                 "    }\n" +
                 "\n" +
                 "    public void setList(ArrayList<"+type.getName()+"> list) {\n" +
                 "        this.list = list;\n" +
                 "    }");
        str.append(tap).append("public ArrayList<").append(type.getName()).append("> loadFromJson(){");
        str.append("\n");
        str.append("\n");
        str.append("   try{\n" +
                "\n" +
                "        \t"+type.getName()+" "+type.getName()+"=new "+type.getName()+"();\n" +
                "\n" +
                "            Type listType = new TypeToken<ArrayList<"+type.getName()+">>(){}.getType();\n" +
                "            BufferedReader br = new BufferedReader(new FileReader(path));\n" +
                "            Gson gson = new Gson();\n" +
                "\t\t\tJsonReader reader=new JsonReader(new FileReader(path));\n" +
                "            JsonObject jsonObject=gson.fromJson(reader,JsonObject.class);\n" +
                "            JsonElement jsonElement=jsonObject.get(\""+type.getName()+"\");\n" +
                "            "+type.getName()+"[]"+type.getName()+"1=gson.fromJson(jsonElement,"+type.getName()+"[].class);\n" +
                "           "+type.getName()+".setList(new ArrayList<>(Arrays.asList("+type.getName()+"1)));\n" +
                "            list="+type.getName()+".getList();\n" +
                "           // list = gson.fromJson(br, listType);\n" +
                "        } catch (Exception ex) {\n" +
                "            System.out.println(ex.toString());\n" +
                "        }\n" +
                "        return list;\n" +
                "    }");
        return str.toString();
    }



    private String getCSV_ParseTo(String typeVar, int index){
        if (typeVar.equals(Type.STRING_CONST))
            return "items["+index+"];";
        if (typeVar.equals(Type.NUMBER_CONST))
            return "Double.parseDouble(items["+index+"]);";
        return "Boolean.parseBoolean(items["+index+"]);";
    }

    private String getJson_ParseTo(String typeVar){
        if (typeVar.equals(Type.STRING_CONST))
            return ".getString(";
        if (typeVar.equals(Type.NUMBER_CONST))
            return ".getDouble(";
        return ".getBoolean(";
    }

    private String assessmentVarFromJson(String nameVar, String typeVar){
        StringBuilder str = new StringBuilder();
        str.append("arr.getJSONObject(i)");
        String[] splits = nameVar.split("\\$");

        for (int i = 0; i < splits.length; i++) {
            if (i+1<splits.length){
                str.append(".getJSONObject(").append("\"").append(splits[i]).append("\"").append(")");
            }else {
                str.append(getJson_ParseTo(typeVar)).append("\"").append(splits[i]).append("\"").append(");");
            }
        }
        return str.toString();
    }

    private String assessmentVarFromJson(String nameVar){
        StringBuilder str = new StringBuilder();
        String[] splits = nameVar.split("\\$");
        str.append("_");
        for (int i = 0; i < splits.length; i++) {
            str.append(splits[i]);
            if (i!=splits.length-1)
                str.append(".");
        }
        str.append(";");
        return str.toString();
    }



    private ArrayList<Integer> getIndexesForCsv(Type type){
        ArrayList<Integer> indexes = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(type.getPath().substring(1, type.getPath().length()-1)));
            String line = br.readLine();
            String[] items = line.split(",");
            ArrayList<String> strings = new ArrayList<>(Arrays.asList(items));
            for (Map.Entry<String, Type> column : type.getColumns().entrySet()) {
                indexes.add(strings.indexOf(column.getKey()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return indexes;
    }


    private String createArrayListTables(TypeSelect typeSelect){
        StringBuilder str = new StringBuilder();
        for (String nameType : typeSelect.getTablesUsed()) {
            str.append(createOneArrayListTable(nameType));
        }
        str.append(createOneArrayListTable(typeSelect.getName()));
        str.append(newLine);
        return str.toString();
    }

    private String createOneArrayListTable(String nameType){
        return tap+"private ArrayList<"+nameType+"> list_"+nameType+" = new ArrayList<>();\n";
    }

    private String createFunctionsFillData(TypeSelect typeSelect){
        StringBuilder str = new StringBuilder();
        str.append(tap).append("private void fillData(){").append(newLine);
        for (String nameType : typeSelect.getTablesUsed()) {
            str.append(createOneFillData(nameType));
        }
        str.append(tap).append("}").append(newLine).append(newLine);
        return str.toString();
    }

    private String createOneFillData(String nameType){
        return tap+tap+"list_"+nameType+".addAll(new "+nameType+"().getData());"+newLine;
    }

    private String createFunctionGetResult(TypeSelect typeSelect){
        StringBuilder str = new StringBuilder();
        str.append(tap).append("public").append(space);
        if (typeSelect.getSelectCore().getColumnGroupBy() != null) {
            ColumnName columnNameGroupBy = typeSelect.getSelectCore().getColumnGroupBy();
            Type typeColumn = Main.symbolTable.getTypeByVal(columnNameGroupBy.getTableName()).getColumns().get(columnNameGroupBy.getName());
            str.append("HashMap<").append(replaceTypeToStanderJava(typeColumn.getName())).append(", ")
                    .append("ArrayList<").append(typeSelect.getName()).append(">>").append(space);
        }else {
            str.append("ArrayList<").append(typeSelect.getName()).append(">").append(space);
        }
        str.append("getData(){").append(newLine);
        str.append(tap).append(tap).append("fillData();");
        str.append(newLine);
        str.append(createHeaderForeachTableUsed(typeSelect));
        str.append(createIfConditionFunctionCall(typeSelect));
        str.append(createFillDataToGetResult(typeSelect));//tttt
        str.append(createEndIfConditionFunctionCall(typeSelect));
        str.append(createEndForeachTableUsed(typeSelect));

        for (Map.Entry<String, Type> column : typeSelect.getColumns().entrySet()) {
            if (!column.getKey().contains("$")){
                str.append(newLine);
                str.append(tap).append(tap).append(column.getKey()).append("_agg(list_").append(typeSelect.getName()).append(");");
                str.append(newLine);
            }
        }

        if (typeSelect.getSelectCore().getColumnGroupBy() != null) {
            str.append(tap).append(tap).append("return").append(space).append("groupBy();");
        }else {
            str.append(tap).append(tap).append("return list_").append(typeSelect.getName()).append(";");
        }
        str.append(newLine);
        str.append(tap).append("}");
        str.append(newLine);
        str.append(newLine);
        return str.toString();
    }

    private String createHeaderForeachTableUsed(TypeSelect typeSelect){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < typeSelect.getTablesUsed().size(); i++) {
            String nameType = typeSelect.getTablesUsed().get(i);
            str.append(tap);
            str.append(tap);
            for (int j = 0; j < i; j++) {
                str.append(tap);
            }
            str.append("for (").append(nameType).append(space).append("_").append(nameType).append(":list_").append(nameType).append(") {");
            str.append(newLine);
        }
        return str.toString();
    }

    private String createEndForeachTableUsed(TypeSelect typeSelect){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < typeSelect.getTablesUsed().size(); i++) {
            str.append(tap);
            for (int j = typeSelect.getTablesUsed().size()-i; j > 0; j--) {
                str.append(tap);
            }
            str.append("}");
            str.append(newLine);
        }
        return str.toString();
    }

    private String createIfConditionFunctionCall(TypeSelect typeSelect){
        StringBuilder str = new StringBuilder();
        str.append(tap);
        str.append(tap);
        for (int i = 0; i < typeSelect.getTablesUsed().size(); i++) {
            str.append(tap);
        }
        str.append("if (conditions(");
        for (String typeName :typeSelect.getTablesUsed()) {
            str.append("_").append(typeName);
            str.append(", ");
        }
        str.replace(str.lastIndexOf(", "), str.length(), "");//remove last ", "
        str.append(")){");
        str.append(newLine);
        return str.toString();
    }

    private String createEndIfConditionFunctionCall(TypeSelect typeSelect){
        StringBuilder str = new StringBuilder();
        str.append(tap);
        str.append(tap);
        for (int i = 0; i < typeSelect.getTablesUsed().size(); i++) {
            str.append(tap);
        }
        str.append("}");
        str.append(newLine);
        return str.toString();
    }

    private String createConditionFunction(TypeSelect typeSelect){
        StringBuilder str = new StringBuilder();
        str.append(tap);
        str.append("private boolean conditions(");
        for (String nameTableUsed : typeSelect.getTablesUsed()) {
            str.append(nameTableUsed).append(space).append("_").append(nameTableUsed).append(", ");
        }
        str.replace(str.lastIndexOf(", "), str.length(), "");//remove last ", "
        str.append("){");
        str.append(newLine);
        str.append(createConditionBodyFunction(typeSelect));
        str.append(tap).append(tap).append("return true;");
        str.append(newLine);
        str.append(tap).append("}");
        str.append(newLine);
        return str.toString();
    }

    private String createConditionBodyFunction(TypeSelect typeSelect){
        StringBuilder str = new StringBuilder();
        for (InnerJoinStmt innerJoinStmt:typeSelect.getSelectCore().getInnerJoinStmts()) {
            for (JoinCondition joinCondition : innerJoinStmt.getJoinConditions()) {
                ColumnName first = joinCondition.getColumnNameFirst();
                ColumnName second = joinCondition.getColumnNameSecond();
                str.append(tap).append(tap).append("if(!(").append("_").append(first.getTableName()).append(".").append(first.getName());
                String typeVar = Main.symbolTable.getTypeByVal(first.getTableName()).getColumns().get(first.getName()).getName();
                if (typeVar.equals(Type.NUMBER_CONST) || typeVar.equals(Type.BOOLEAN_CONST))
                    str.append(" == ");
                else
                    str.append(".equals(");

                str.append("_").append(second.getTableName()).append(".").append(second.getName());

                if (!typeVar.equals(Type.NUMBER_CONST) && !typeVar.equals(Type.BOOLEAN_CONST))
                    str.append(")");

                str.append("))");
                str.append(newLine).append(tap).append(tap).append(tap).append("return false;");
                str.append(newLine);
            }
        }

        if(typeSelect.getSelectCore().getWhereStmt()!=null)
        for (WhereCondition whereCondition : typeSelect.getSelectCore().getWhereStmt().getWhereConditions()) {
            ColumnName columnCondition = whereCondition.getColumnName();
            str.append(tap).append(tap).append("if(!(");

            if (whereCondition.getConditionOperations().equals("in")){

                str.append("Arrays.asList(");
                ExprQuery exprQuery = whereCondition.getExprQueryVal();

                for (LiteralValue literalValue:exprQuery.getList_literalValue().getLiteralValues()) {
                    if (literalValue.getBOOLEAN_LITERAL()!=null)
                        str.append(literalValue.getBOOLEAN_LITERAL());
                    if (literalValue.getNUMERIC_LITERAL()!=null)
                        str.append(literalValue.getNUMERIC_LITERAL());
                    if (literalValue.getSTRING_LITERAL()!=null){
                        String exprQ = literalValue.getSTRING_LITERAL();
                        String newExprQ = "\""+exprQ.substring(1,exprQ.length()-1)+"\"";
                        str.append(newExprQ);
                    }
                    str.append(", ");
                }
                str.replace(str.lastIndexOf(", "), str.length(), "");//remove last ", "
                str.append(").contains(");
                str.append("_").append(columnCondition.getTableName()).append(".").append(columnCondition.getName()).append(")");
            }else {
                str.append("_").append(columnCondition.getTableName()).append(".").append(columnCondition.getName());
                if (whereCondition.getConditionOperations().equals("="))
                    if (whereCondition.getExprQueryVal().getLiteralValue()!=null
                            && whereCondition.getExprQueryVal().getLiteralValue().getSTRING_LITERAL()!=null){
                        str.append(".equals(");
                    }else
                        str.append(" == ");

                else if (whereCondition.getConditionOperations().equals("like"))
                    str.append(".contains(");
                else
                    str.append(space).append(whereCondition.getConditionOperations()).append(space);

                ExprQuery exprQuery = whereCondition.getExprQueryVal();
                if (exprQuery.getLiteralValue()!=null){
                    if (exprQuery.getLiteralValue().getBOOLEAN_LITERAL()!=null)
                        str.append(exprQuery.getLiteralValue().getBOOLEAN_LITERAL());
                    if (exprQuery.getLiteralValue().getNUMERIC_LITERAL()!=null)
                        str.append(exprQuery.getLiteralValue().getNUMERIC_LITERAL());
                    if (exprQuery.getLiteralValue().getSTRING_LITERAL()!=null){
                        String exprQ = exprQuery.getLiteralValue().getSTRING_LITERAL();
                        String newExprQ = "\""+exprQ.substring(1,exprQ.length()-1)+"\"";
                        str.append(newExprQ);
                    }
                }else {
                    str.append(exprQuery.getVarName());
                }

//                if (whereCondition.getConditionOperations().equals("like") || whereCondition.getConditionOperations().equals("in"))
//                    str.append(")");
                if (whereCondition.getExprQueryVal().getLiteralValue()!=null
                        && whereCondition.getExprQueryVal().getLiteralValue().getSTRING_LITERAL()!=null)
                {
                    str.append(")");
                }
            }

            str.append("))");

            str.append(newLine).append(tap).append(tap).append(tap).append("return false;");
            str.append(newLine);
        }


        return str.toString();
    }





    private String createFillDataToGetResult(TypeSelect typeSelect){
        StringBuilder str = new StringBuilder();
        str.append(getTabFromFunctionGetResult(typeSelect))
                .append(typeSelect.getName()).append(space).append("_").append(typeSelect.getName())
                .append(space).append("= new").append(space).append(typeSelect.getName()).append("();");
        str.append(newLine);
        str.append(fillDataSelectNew(typeSelect));
        str.append(newLine);
        return str.toString();
    }

    private String fillDataSelectNew(TypeSelect typeSelect){
        StringBuilder str = new StringBuilder();
        for (Map.Entry<String, Type> column : typeSelect.getColumns().entrySet()) {
            if (!column.getKey().contains("$")) continue;

            str.append(getTabFromFunctionGetResult(typeSelect))
                    .append("_").append(typeSelect.getName()).append(".").append(column.getKey()).append(" = ");
            str.append(assessmentVarFromJson(column.getKey()));
            str.append("\n");
        }


        str.append(newLine);
        str.append(getTabFromFunctionGetResult(typeSelect))
                .append("list_").append(typeSelect.getName()).append(".add(").append("_").append(typeSelect.getName()).append(");");
        return str.toString();
    }


    private String getTabFromFunctionGetResult(TypeSelect typeSelect){
        StringBuilder str = new StringBuilder();
        str.append(tap);
        str.append(tap);
        str.append(tap);
        for (int i = 0; i < typeSelect.getTablesUsed().size() ; i++) {
            str.append(tap);
        }
        return str.toString();
    }





    private String createGroupByFunction(TypeSelect typeSelect){
        if (typeSelect.getSelectCore().getColumnGroupBy()==null)
            return newLine;
        StringBuilder str = new StringBuilder();
        str.append(tap).append("private").append(space);
        ColumnName columnNameGroupBy = typeSelect.getSelectCore().getColumnGroupBy();
        Type typeColumn = Main.symbolTable.getTypeByVal(columnNameGroupBy.getTableName()).getColumns().get(columnNameGroupBy.getName());
        str.append("HashMap<").append(replaceTypeToStanderJava(typeColumn.getName())).append(", ")
                .append("ArrayList<").append(typeSelect.getName()).append(">>").append(space);
        str.append("groupBy(){").append(newLine);
        str.append(tap).append(tap).append("HashMap<").append(replaceTypeToStanderJava(typeColumn.getName())).append(", ")
                .append("ArrayList<").append(typeSelect.getName()).append(">>").append(space);
        str.append("map = new HashMap<>();");
        str.append(newLine);
        str.append(tap).append(tap).append("for (").append(typeSelect.getName()).append(space).append("_").append(typeSelect.getName())
                .append(":").append("list_").append(typeSelect.getName()).append(") {");
        str.append(newLine);
        str.append(tap).append(tap).append(tap).append("map.computeIfAbsent(").append("_").append(typeSelect.getName()).append(".")
                .append(columnNameGroupBy.getTableName()).append("$").append(columnNameGroupBy.getName()).append(", k -> new ArrayList<>());");
        str.append(newLine);
        str.append(tap).append(tap).append(tap).append("map.get(").append(columnNameGroupBy.getTableName()).append("$").append(columnNameGroupBy.getName()).append(")")
                .append(".add(").append("_").append(typeSelect.getName()).append(");");
        str.append(newLine);
        str.append(tap).append(tap).append("}");
        str.append(newLine);
        str.append(tap).append(tap).append("return map;");
        str.append(newLine);
        str.append(tap).append("}");
        str.append(newLine);
        str.append(newLine);
        return str.toString();
    }


    private String createOverrideToStringFunction(Type type){
        StringBuilder str = new StringBuilder();

        str.append("    @Override\n" +
                "    public String toString() {\n" +
                "        StringBuilder str = new StringBuilder();\n" +
                "        str.append(\"---- ").append(type.getName()).append("----\");");
        str.append(newLine);
        str.append(tap).append(tap).append("str.append(\"\\n\");");
        str.append(newLine);
        for (Map.Entry<String, Type> column : type.getColumns().entrySet()) {
            str.append(tap).append(tap).append("str.append(\"").append(column.getKey()).append(" = \").append(").append(column.getKey()).append(");");
            str.append(newLine);
            str.append(tap).append(tap).append("str.append(\"\\n\");");
            str.append(newLine);
        }
        str.append(newLine);
        str.append(tap).append(tap).append("return str.toString();");
        str.append(newLine);
        str.append(tap).append("}");
        str.append(newLine);
        return str.toString();
    }

    private String createAggFunction(TypeSelect typeSelect){
        StringBuilder str = new StringBuilder();
        for (ResultColumnWithAggregationFunction resultColumnWithAggregationFunction:typeSelect.getSelectCore().getResultColumnWithAggregationFunctions()) {
            str.append(createOneAggFunction(typeSelect, resultColumnWithAggregationFunction));
            str.append(newLine);
            str.append(newLine);
        }
        return str.toString();
    }

    private String createOneAggFunction(TypeSelect typeSelect, ResultColumnWithAggregationFunction resultColumnWithAggregationFunction){
        StringBuilder str = new StringBuilder();
        str.append(newLine);
        str.append(newLine);
        str.append(tap).append("private void").append(space).append(resultColumnWithAggregationFunction.getReturnColumn())
                .append("_agg(").append("ArrayList<").append(typeSelect.getName()).append("> list){");
        str.append(newLine);
        str.append("\t\tArrayList<Double> my_list = new ArrayList<>();\n");
        str.append(tap).append(tap).append("for (").append(typeSelect.getName()).append(space).append("_").append(typeSelect.getName()).append(" : ").append("list)");
        str.append(newLine);
        ColumnName columnName = resultColumnWithAggregationFunction.getResultColumn().getColumnName();
        str.append(tap).append(tap).append(tap).append("my_list.add(").append("_").append(typeSelect.getName()).append(".")
                .append(columnName.getTableName()).append("$").append(columnName.getName()).append(");");
        str.append(newLine);
        str.append(tap).append(tap).append("Double d = (Double) Main.callAgg(my_list, ");

        AggregationFunction aggFunction = null;
        for (AggregationFunction aggregationFunction : Main.symbolTable.getDeclaredAggregationFunction()) {
            if (aggregationFunction.getAggregationFunctionName().equals(resultColumnWithAggregationFunction.getAggregationFunctionName())){
                aggFunction = aggregationFunction;
                break;
            }
        }
        str.append(aggFunction.getJarPath()).append(", ");
        str.append("\"").append(aggFunction.getAggregationFunctionName()).append(".jar\"").append(", ");
        str.append(aggFunction.getClassName()).append(", ");
        str.append(aggFunction.getMethodName()).append("); ");
        str.append(newLine);

        str.append(tap).append(tap).append("for (").append(typeSelect.getName()).append(space).append("_").append(typeSelect.getName()).append(" : ").append("list)");
        str.append(newLine);
        str.append(tap).append(tap).append(tap).append("_").append(typeSelect.getName()).append(".").append(resultColumnWithAggregationFunction.getReturnColumn())
                .append("= d;");
        str.append(newLine);
        str.append(tap).append("}");
        str.append(newLine);
        return str.toString();
    }
}
