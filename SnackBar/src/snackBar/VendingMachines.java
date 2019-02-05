// Vending machine has id, name
// Vending Machine set and return name

package snackBar; 

public class VendingMachines {
    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachines(String name) {
        maxId++; 
        id = maxId;
        this.name = name;
    }

    // Get Id
    public int getId() {
        return id;
    }

    // Get Name
    public String getName() {
        return name;
    }

    // Set Name
    public void setName(String name) {
        this.name = name;
    }
}