import java.util.*;
import java.util.ArrayList;

public class SimpleTableBuilder extends LittleBaseListener {

    HashMap<String, String[]> global = new HashMap<>();
    HashMap<String, String[]> temp = new HashMap<>();

    @Override public void enterProgram(LittleParser.ProgramContext ctx) {
        //1. Make a new symbol table for "Global"
        //2. Add it to the list of symbol Tables
        //3. Push it to the scope stack
    }

    @Override public void enterString_decl(LittleParser.String_declContext ctx) {
        //1. extract the name, type, and value
        String name = ctx.id().getText();
        String type = "String";
        String value = ctx.str().getText();
        String[] type_value = new String[] {type, value};

        global.put(name,type_value);
    }

     @Override public void enterVar_decl(LittleParser.Var_declContext ctx) {
        String name = ctx.id_list().getText();
        String[] vars = name.split(",");
        String[] type = new String[] {ctx.var_type().getText()};

        for (int i = 0; i < vars.length; i++) {
            //System.out.println(vars[i]+", "+type);
            temp.put(vars[i], type);
        }
    }

    public void prettyPrint() {
        //print all symbol tables in the order they were created
        for (Map.Entry<String,String[]> mapElement : global.entrySet()) {
            String key = mapElement.getKey();
 
            // Adding some bonus marks to all the students
            String[] value = mapElement.getValue();
 
            // Printing above marks corresponding to
            // students names
            System.out.println("name " + key + " type " + value[0] + " value " + value[1]);
        } //end global print

        for (Map.Entry<String,String[]> mapElement : temp.entrySet()) {
            String key = mapElement.getKey();
 
            // Adding some bonus marks to all the students
            String[] value = mapElement.getValue();
 
            // Printing above marks corresponding to
            // students names
            System.out.println("name " + key + " type " + value[0]);
        } //end global print
    }
}
