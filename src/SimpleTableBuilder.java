import java.util.*;
import java.util.ArrayList;

public class SimpleTableBuilder extends LittleBaseListener {
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
        System.out.println(name + ", " + type + ", " + value);
    }

     @Override public void enterVar_decl(LittleParser.Var_declContext ctx) {
         String name = ctx.id_list().getText();
         String type = ctx.var_type().getText();

        //  String type = 
        //  String value = ctx.str().getText();
        //  System.out.println(name + ", " + type + ", " + value);
         System.out.println(name +", "+type);
    }

    public void prettyPrint() {
        //print all symbol tables in the order they were created
    }
}
