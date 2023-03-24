import java.util.*;

public class SymbolTable {
    String name;
    private HashMap<String, String[]> local = new HashMap<>();

    public SymbolTable(String inputName) {
        this.name = inputName;
    }

    //replicates put, but accounts for both String, Float, and Int
    public void insert(String tableName, String[] contents) {
        //if it is a string with type and value, input as string
        //System.out.println("SYMBOLTABLE.JAVA: " + "Contents: " + Arrays.toString(contents));
        local.put(tableName, contents);
        //this.printTable();
    }

    //Print the Symbol Table
    public void printTable() {
        //print all symbol tables in the order they were created
        for (Map.Entry<String,String[]> mapElement : local.entrySet()) {
            String key = mapElement.getKey();
 
            String[] value = mapElement.getValue();

            //System.out.println(key + Arrays.toString(value));
 
            if (value.length > 2) {
                System.out.println("name " + value[0] + " type " + value[1] + " value " + value[2]);
            }
            else {
                System.out.println("name " + value[0] + " type " + value[1]);
            }
        } //end print
    }
}
