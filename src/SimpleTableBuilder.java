import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;

public class SimpleTableBuilder extends LittleBaseListener {

    //MAKE CONTENTS ARRAY WITH NAME TYPE AND VALUE AN ARRAYLIST HOLDING EACH THING
    //JAVA STORES THE REFERENCE HENCE IT DOESNT WORK SO PLS ADD

    int count = 0;

    Stack<String> tableStack = new Stack<String>();


    // HashMap<String, String[]> global = new HashMap<>();
    // HashMap<String, String[]> temp = new HashMap<>();
    SymbolTable curr = new SymbolTable("GLOBAL");
    
    ArrayList<String> functions = new ArrayList<>();
    ArrayList<SymbolTable> tables = new ArrayList<>();

    @Override public void enterProgram(LittleParser.ProgramContext ctx) {
        //1. Make a new symbol table for "Global"
        //2. Add it to the list of symbol Tables
        //3. Push it to the scope stack

    }

    @Override public void enterString_decl(LittleParser.String_declContext ctx) {
        //1. extract the name, type, and value
        String name = ctx.id().getText();
        String type = "STRING";
        String value = ctx.str().getText();
        String[] type_value = new String[] {name, type, value};

        curr.insert("no_table_strings-"+count, type_value);
        count++;

        //global.put(name,type_value);
    }

    //get the information about the regular variables, not strings
    @Override public void enterVar_decl(LittleParser.Var_declContext ctx) {
        String names = ctx.id_list().getText();
        //splits each name from the list and stores them in an array
        String[] vars = names.split(",");
        //assigns the type to an array in order to pass to the symbol table
        String type = ctx.var_type().getText();

        for (int i = 0; i < vars.length; i++) {
            String[] varContents = new String[2];
            varContents[0] = vars[i];
            varContents[1] = type;

            //System.out.println(Arrays.toString(varContents)); //checks contents of varContents array

            //System.out.println("no_table-"+count + Arrays.toString(varContents));     //checks the tuple being input to map

            curr.insert("no_table-"+count, varContents);
            count++;
        }

    }

    //get the information about the function
    @Override public void enterFunc_decl(LittleParser.Func_declContext ctx) {
        //gets the name of the function
        String name = ctx.id().getText();
        //gets the parameters of the function
        String parameters = ctx.param_decl_list().getText();
        //gets the internal content of the function
        String content = ctx.func_body().getText();

        //System.out.println("parameters: " + parameters);
        functions.add(name);

    }

    @Override public void exitFunc_decl(LittleParser.Func_declContext ctx) {
        String func = ctx.id().getText();
    }

    //check the contents of the if statements
    @Override public void enterIf_stmt(LittleParser.If_stmtContext ctx) {
        //gets the internal contents of the if statement
        try {
            String content = ctx.stmt_list().getText();
        } catch (Exception e) {

        }
        //System.out.println("if contents: " + content);
    }

    //check the contents of the else parts of the contents
    @Override public void enterElse_part(LittleParser.Else_partContext ctx) {
        //gets the content of the else part of the if statements
        try {
            String content = ctx.stmt_list().getText();
        } catch (Exception e) {
            //do nothing
        }
        //System.out.println("else part: " + content);
    }

    public void prettyPrint() {
        // //print all symbol tables in the order they were created
        // for (Map.Entry<String,String[]> mapElement : global.entrySet()) {
        //     String key = mapElement.getKey();
 
        //     // Adding some bonus marks to all the students
        //     String[] value = mapElement.getValue();
 
        //     // Printing above marks corresponding to
        //     // students names
        //     System.out.println("name " + key + " type " + value[0] + " value " + value[1]);
        // } //end global print

        // for (Map.Entry<String,String[]> mapElement : temp.entrySet()) {
        //     String key = mapElement.getKey();
 
        //     // Adding some bonus marks to all the students
        //     String[] value = mapElement.getValue();
 
        //     // Printing above marks corresponding to
        //     // students names
        //     System.out.println("name " + key + " type " + value[0]);
        //} //end global print

        curr.printTable();

    }
}
