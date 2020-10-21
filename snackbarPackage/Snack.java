package snackbarPackage;

public class Snack {
    
    // increment id
    private static int maxId = 0;
    
    // fields
    private int id;
    private String name;
    private int quantity;
    private float cost;
    private int machineId;

    // constructor
    public Snack(String name, int quantity, float cost, int machineId) {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
    }

    // getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public float getCost() {
        return cost;
    }
    public int getMachineId() {
        return machineId;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public void setMachineId(int id) {
        this.machineId = id;
    }
}
