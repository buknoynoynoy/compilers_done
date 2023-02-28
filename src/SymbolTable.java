import java.util.*;

public class SymbolTable {
    String name;
    private HashMap<String, String[]> local = new HashMap<>();

    public SymbolTable(String inputName) {
        this.name = inputName;
    }

    //replicates put, but accounts for both String, Float, and Int
    public void insert(String[] name, String[] typeValue) {
        //if it is a string with type and value, input as string
        if (typeValue.length > 1) {
            String tempName = name[0];
            local.put(tempName, typeValue);
        } else {
            for (int i = 0; i < name.length; i++) {
                //System.out.println(vars[i]+", "+type);
                local.put(name[i], typeValue);
            }
        }
    }

    //Print the Symbol Table
    public void printTable() {
        //print all symbol tables in the order they were created
        for (Map.Entry<String,String[]> mapElement : local.entrySet()) {
            String key = mapElement.getKey();
 
            String[] value = mapElement.getValue();
 
            if (value.length > 1) {
                System.out.println("name " + key + " type " + value[0] + " value " + value[1]);
            }
            else {
                System.out.println("name " + key + " type " + value[0]);
            }
        } //end print
    }
}
