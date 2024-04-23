package Java;

import Java.AST.Parse;
import Java.AST.Visitor.BaseASTVisitor;
import Java.Base.BaseVisitor;
import Java.CodeGenerated.ConvertToLowLevel;
import Java.CodeGenerated.GenerateClass;
import Java.SemanticChecksRequirements.SemanticChecks;
import Java.SymbolTable.*;
import gen.SqlLexer;
import gen.SqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static SymbolTable symbolTable = new SymbolTable();
    public static SemanticChecks semanticChecks = new SemanticChecks();
    public static StringBuilder str_Main = new StringBuilder();

    public static void main(String[] args) {

        symbolTable.addType(new Type(Type.BOOLEAN_CONST));
        symbolTable.addType(new Type(Type.NUMBER_CONST));
        symbolTable.addType(new Type(Type.STRING_CONST));
        symbolTable.addType(new Type(Type.SELECT_EMPTY));

        try {
            String source = "sample.txt";
            CharStream cs = fromFileName(source);
            SqlLexer lexer = new SqlLexer(cs);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            SqlParser parser = new SqlParser(token);
            ParseTree tree = parser.parse();

            Parse p = (Parse) new BaseVisitor().visit(tree);
            p.accept(new BaseASTVisitor());


        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------scope------------");
        for (Scope scope:symbolTable.getScopes()) {
            System.out.println(scope.getId());
        }
        System.out.println("----------types------------");
        for (Type type:symbolTable.getDeclaredTypes()) {
            System.out.println(type.getName());
        }

        checkDeclareFunction();

        System.out.println("===============================");
        System.out.println("=======semanticChecks==========");
        System.out.println("===============================");
        System.out.println("--------undeclaredVariable-----------");
        for (String s:semanticChecks.getUndeclaredVariable()) {
            System.out.println(s);
        }
        System.out.println("--------multipleDeclarationsVar-----------");
        for (String s:semanticChecks.getMultipleDeclarationsVar()) {
            System.out.println(s);
        }
        System.out.println("--------UnExistedColumnType-----------");
        for (String s:semanticChecks.getUnExistedColumnType()) {
            System.out.println(s);
        }
        System.out.println("--------assigningAnotherType-----------");
        for (String s:semanticChecks.getAssigningAnotherType()) {
            System.out.println(s);
        }
        System.out.println("--------selectUndefinedColumnType-----------");
        for (String s:semanticChecks.getSelectUndefinedColumnType()) {
            System.out.println(s);
        }
        System.out.println("--------duplicateColumnName-----------");
        for (String s:semanticChecks.getDuplicateColumnName()) {
            System.out.println(s);
        }
        System.out.println("--------usingUnassignedVariable-----------");
        for (String s:semanticChecks.getUsingUnassignedVariable()) {
            System.out.println(s);
        }
        System.out.println("--------selectTableNotCreated-----------");
        for (String s:semanticChecks.getSelectTableNotCreated()) {
            System.out.println(s);
        }
        System.out.println("--------callingUndeclaredMethod-----------");
        for (String s:semanticChecks.getCallingUndeclaredMethod()) {
            System.out.println(s);
        }
        System.out.println("--------UsingTableNotJoined-----------");
        for (String s:semanticChecks.getUsingTableNotJoined()) {
            System.out.println(s);
        }
        System.out.println("--------UsingTableNotJoined-----------");
        for (String s:semanticChecks.getUsingColumnGroupByNotInSelect()) {
            System.out.println(s);
        }
        System.out.println("--------DuplicateTableInJoin-----------");
        for (String s:semanticChecks.getDuplicateTableInJoin()) {
            System.out.println(s);
        }
        System.out.println("--------UndeclaredAggregationFunction-----------");
        for (String s:semanticChecks.getUndeclaredAggregationFunction()) {
            System.out.println(s);
        }

        if (checkSemanticChecks()){
            GenerateClass generateClass = new GenerateClass();
            generateClass.run();




            System.out.println("==========Main==============\n");
            StringBuilder str = new StringBuilder();
            str.append("package com.company;\n" +
                    "\n" +
                    "import java.io.File;\n" +
                    "import java.lang.reflect.InvocationTargetException;\n" +
                    "import java.lang.reflect.Method;\n" +
                    "import java.net.MalformedURLException;\n" +
                    "import java.net.URL;\n" +
                    "import java.net.URLClassLoader;\n" +
                    "import java.util.ArrayList;\n" +
                    "import java.util.List;\n\n"+
                    "public class Main {\n" +
                    "\n" +
                    "    public static void main(String[] args) {\n\n");
            str.append(str_Main);
            str.append("\n\n\t}");

            str.append("public static Object callAgg(ArrayList<Double> list, String JarPath, String JarName, String ClassName, String MethodName) {\n" +
                    "\t\ttry {\n" +
                    "\n" +
                    "\t\t\tURLClassLoader myClassLoader = new URLClassLoader(\n" +
                    "\t\t\t\t\tnew URL[]{new File(JarPath + JarName).toURI().toURL()},\n" +
                    "\t\t\t\t\tMain.class.getClassLoader()\n" +
                    "\t\t\t);\n" +
                    "\n" +
                    "\t\t\tClass<?> myClass = Class.forName(ClassName, true, myClassLoader);\n" +
                    "\t\t\tMethod mySingeltonGetterMethod = myClass.getMethod(\"get\" + ClassName,\n" +
                    "\t\t\t\t\tnull);\n" +
                    "\t\t\tObject myObject = mySingeltonGetterMethod.invoke(null);\n" +
                    "\t\t\treturn myObject.getClass().getMethod(MethodName, List.class)\n" +
                    "\t\t\t\t\t.invoke(myObject, list);\n" +
                    "\t\t} catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException | MalformedURLException e) {\n" +
                    "\t\t\te.printStackTrace();\n" +
                    "\t\t}\n" +
                    "\t\treturn null;\n" +
                    "\t}");


            str.append("\n}");

            System.out.println(str);


            String path = "C:\\code\\CompilerCGTest\\src\\com\\company\\Main.java";
            File file = new File(path);
            BufferedWriter output;
            try {
                if (!file.createNewFile()){
                    System.out.println("Error Create File Main...");
                    return;
                }
                output = new BufferedWriter(new FileWriter(file));
                output.write(str.toString());
                output.close();
            } catch ( IOException e ) {
                e.printStackTrace();
            }
        }

    }

    private static void checkDeclareFunction(){
        for (String nameFunctionNotDeclare:symbolTable.getFunctionNotDeclare()) {
            if (!symbolTable.getFunctionDeclare().contains(nameFunctionNotDeclare)){
                semanticChecks.getCallingUndeclaredMethod().add("call function not declare : "+nameFunctionNotDeclare);
            }
        }
    }

    private static boolean checkSemanticChecks(){
        return semanticChecks.getUndeclaredVariable().size() == 0
                && semanticChecks.getMultipleDeclarationsVar().size() == 0
                && semanticChecks.getUnExistedColumnType().size() == 0
                && semanticChecks.getAssigningAnotherType().size() == 0
                && semanticChecks.getSelectUndefinedColumnType().size() == 0
                && semanticChecks.getDuplicateColumnName().size() == 0
                && semanticChecks.getUsingUnassignedVariable().size() == 0
                && semanticChecks.getSelectTableNotCreated().size() == 0
                && semanticChecks.getCallingUndeclaredMethod().size() == 0
                && semanticChecks.getUsingTableNotJoined().size() == 0
                && semanticChecks.getUsingColumnGroupByNotInSelect().size() == 0
                && semanticChecks.getDuplicateTableInJoin().size() == 0
                && semanticChecks.getUndeclaredAggregationFunction().size() == 0;
    }
}
