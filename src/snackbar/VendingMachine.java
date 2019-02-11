package snackbar;

// Vending machine has id, name
// Vending Machine set and return name
public class VendingMachine {
    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(String name){
        maxId++;
        this.id = maxId;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}