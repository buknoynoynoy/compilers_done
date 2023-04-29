import java.util.*;

public class SymbolTable {
    String name;
    public LinkedHashMap<String, String[]> local = new LinkedHashMap<>(100);

    public SymbolTable(String tableName) {
        this.name = tableName;
    }

    //replicates put, but accounts for both String, Float, and Int
    public void insert(String varName, String[] contents) {
        local.put(varName, contents);

    }

    

    @Override
    public String toString() {
        return "SymbolTable [name=" + name + "]";
    }

    //Print the Symbol Table
    public void printTable() {
        //print all symbol tables in the order they were created
        for (Map.Entry<String,String[]> mapElement : local.entrySet()) {
            String key = mapElement.getKey();
 
            String[] value = mapElement.getValue();

            //System.out.println(key + Arrays.toString(value));
 
            if (value.length > 1 && (key != null)) {
                System.out.println("name " + key + " type " + value[0] + " value " + value[1]);
            }
            else if (key != null) {
                System.out.println("name " + key + " type " + value[0]);
            }
        } //end print
    }

    public String searchType(String variable) {
        //print all symbol tables in the order they were created
        for (Map.Entry<String,String[]> mapElement : local.entrySet()) {
            String[] type = mapElement.getValue();
            String name=  mapElement.getKey();

            if (name.equals(variable)) {
                return type[0];
            }
        } //end print

        return null;
    }
}
