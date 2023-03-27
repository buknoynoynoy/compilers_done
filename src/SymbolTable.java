import java.util.*;

public class SymbolTable {
    String name;
    private LinkedHashMap<String, String[]> local = new LinkedHashMap<>(100);

    public SymbolTable(String tableName) {
        this.name = tableName;
    }

    //replicates put, but accounts for both String, Float, and Int
    public void insert(String varName, String[] contents) {
        local.put(varName, contents);

    }

    //Print the Symbol Table
    public void printTable() {
        //print all symbol tables in the order they were created
        for (Map.Entry<String,String[]> mapElement : local.entrySet()) {
            String key = mapElement.getKey();
 
            String[] value = mapElement.getValue();

            //System.out.println(key + Arrays.toString(value));
 
            if (value.length > 2 && (key != null)) {
                System.out.println("name " + key + " type " + value[0] + " value " + value[1]);
            }
            else if (key != null) {
                System.out.println("name " + key + " type " + value[0]);
            }
        } //end print
    }

    public boolean isInTable(String variable) {
        boolean exists = false;
                //print all symbol tables in the order they were created
        for (Map.Entry<String,String[]> mapElement : local.entrySet()) {
            String[] value = mapElement.getValue();

            if (value[0].equals(variable)) {
                exists = true;
            }
        } //end print

        return exists;
    }
}
