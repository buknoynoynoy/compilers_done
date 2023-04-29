import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;

public class SimpleTableBuilder extends LittleBaseListener {

    //MAKE CONTENTS ARRAY WITH NAME TYPE AND VALUE AN ARRAYLIST HOLDING EACH THING
    //JAVA STORES THE REFERENCE HENCE IT DOESNT WORK SO PLS ADD

    int count = 1;

    Stack<SymbolTable> tableStack = new Stack<SymbolTable>();
    ArrayList<SymbolTable> tables = new ArrayList<>();

    public static String[] splitFunc(String input) {
        // {varName, type}
        String[] result = new String[2];
        if (input.startsWith("INT")) {
            result[1] = "INT";
            result[0] = input.substring(3);
        } else if (input.startsWith("FLOAT")) {
            result[1] = "FLOAT";
            result[0] = input.substring(5);
        }
        return result;
    }

    @Override public void enterProgram(LittleParser.ProgramContext ctx) {
        //1. Make a new symbol table for "Global"
        //2. Add it to the list of symbol Tables
        //3. Push it to the scope stack
        SymbolTable curr = new SymbolTable("GLOBAL");
        tableStack.push(curr);
        tables.add(tableStack.peek());
        //System.out.println(tables.toString());


    }

    @Override public void exitProgram(LittleParser.ProgramContext ctx) { 
        //System.out.println(tables.toString());
    }


    @Override public void enterString_decl(LittleParser.String_declContext ctx) {
        //1. extract the name, type, and value
        String name = ctx.id().getText();
        String type = "STRING";
        String value = ctx.str().getText();
        String[] type_value = new String[] {type, value};

        tableStack.peek().insert(name, type_value);

        //tables.remove(tableStack.peek());

        //global.put(name,type_value);
    }

    //get the information about the regular variables, not strings
    @Override public void enterVar_decl(LittleParser.Var_declContext ctx) {
        String names = ctx.id_list().getText();
        //splits each name from the list and stores them in an array
        String[] vars = names.split(",");
        //assigns the type to an array in order to pass to the symbol table
        String type = ctx.var_type().getText();

        String key;

        for (int i = 0; i < vars.length; i++) {
            String[] varContents = new String[1];
            key = vars[i];
            varContents[0] = type;

            //System.out.println(Arrays.toString(varContents)); //checks contents of varContents array

            //System.out.println("no_table-"+count + Arrays.toString(varContents));     //checks the tuple being input to map
            if(tableStack.peek().local.containsKey(key))
            {
                System.out.println("DECLARATION ERROR " + key);
                System.exit(0);
            }
            tableStack.peek().insert(key, varContents);
        }
            //tables.add(tableStack.peek());
    }

    //get the information about the function
    @Override public void enterFunc_decl(LittleParser.Func_declContext ctx) {
        //gets the name of the function
        String name = ctx.id().getText();
        SymbolTable curr = new SymbolTable(name);
        //gets the parameters of the function
        String parameters =  ctx.param_decl_list().getText();
        String[] splits = parameters.split(",");

        String[] varDecl = new String[2];
        String[] varInfo = new String[1];

        for (int i = 0; i < splits.length; i++) {
            varDecl = splitFunc(splits[i]); //{name, type}
            varInfo[0] = varDecl[1];
            curr.insert(varDecl[0], varInfo);
        }

        tableStack.push(curr);

        tables.add(curr);

        //System.out.println(tables.toString());

        // System.out.println("from enterFuncDecl:");
        // prettyPrint();

    }

    @Override public void exitFunc_decl(LittleParser.Func_declContext ctx) {
        tableStack.pop();
    }

    //check the contents of the if statements
    @Override public void enterIf_stmt(LittleParser.If_stmtContext ctx) {
        try {
            SymbolTable curr = new SymbolTable("BLOCK " + count);

            count++;

            tableStack.push(curr);

            tables.add(curr);
        } catch (Exception e) {

        }
    }

    @Override public void exitIf_stmt(LittleParser.If_stmtContext ctx) {
        tableStack.pop();
    }

    //check the contents of the else parts of the contents
    @Override public void enterElse_part(LittleParser.Else_partContext ctx) {
        if(ctx.children != null)
        {
            SymbolTable curr = new SymbolTable("BLOCK " + count);
            //gets the content of the else part of the if statements
            try {
                count++;

                tableStack.push(curr);

                tables.add(curr);
            } catch (Exception e) {
                //do nothing
            }
        }
        
        //System.out.println("else part: " + content);
    }

    @Override public void enterWhile_stmt(LittleParser.While_stmtContext ctx) { 
        try {
            SymbolTable curr = new SymbolTable("BLOCK " + count);

            count++;

            tableStack.push(curr);

            tables.add(curr);
        } catch (Exception e) {

        }
    }

    @Override public void exitWhile_stmt(LittleParser.While_stmtContext ctx) { 
        tableStack.pop();
    }

    @Override public void enterAssign_stmt(LittleParser.Assign_stmtContext ctx) {
        //prints out the assignment statements
        String assign = ctx.getText();
        System.out.println(assign);
    }

    @Override public void enterExpr(LittleParser.ExprContext ctx) {
        //enterExpr gets the assignment after the expression, for example: a:=1, the assignment is 1, and enterExpr is assigned 1.
        String enterExpr = ctx.getText();
        System.out.println("IN ENTEREXPR (enterExpr String): " + enterExpr);
    }

    public void prettyPrint() {

        // for (SymbolTable symtb : tables) {
        //     System.out.println(symtb.name);

        // }
        for (SymbolTable symtb2 : tables) {
            System.out.println("Symbol table " + symtb2.name);
            symtb2.printTable();
            System.out.println();
        }

    }
}
