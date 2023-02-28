import java.util.*;

public class SymbolTable {
    String name;
    private HashMap<String, String[]> local = new HashMap<>();

    public SymbolTable(String inputName) {
        this.name = inputName;
    }

    public void insert(String[] name, String[] typeValue) {
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

    public void printTable() {
        //print all symbol tables in the order they were created
        for (Map.Entry<String,String[]> mapElement : local.entrySet()) {
            String key = mapElement.getKey();
 
            // Adding some bonus marks to all the students
            String[] value = mapElement.getValue();
 
            // Printing above marks corresponding to
            // students names
            if (value.length > 1) {
                System.out.println("name " + key + " type " + value[0] + " value " + value[1]);
            }
            else {
                System.out.println("name " + key + " type " + value[0]);
            }
        } //end global print
    }
}
