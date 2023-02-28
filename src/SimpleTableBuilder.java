import java.util.*;
import java.util.ArrayList;

public class SimpleTableBuilder extends LittleBaseListener {

    // HashMap<String, String[]> global = new HashMap<>();
    // HashMap<String, String[]> temp = new HashMap<>();
    SymbolTable curr = new SymbolTable("GLOBAL");

    @Override public void enterProgram(LittleParser.ProgramContext ctx) {
        //1. Make a new symbol table for "Global"
        //2. Add it to the list of symbol Tables
        //3. Push it to the scope stack
    }

    @Override public void enterString_decl(LittleParser.String_declContext ctx) {
        //1. extract the name, type, and value
        String[] name = new String[]  {ctx.id().getText()};
        String type = "STRING";
        String value = ctx.str().getText();
        String[] type_value = new String[] {type, value};

        curr.insert(name, type_value);

        //global.put(name,type_value);
    }

     @Override public void enterVar_decl(LittleParser.Var_declContext ctx) {
        String name = ctx.id_list().getText();
        String[] vars = name.split(",");
        String[] type = new String[] {ctx.var_type().getText()};

        curr.insert(vars, type);
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
