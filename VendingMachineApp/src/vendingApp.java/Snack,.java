package vendingApp;

public class Snack {

    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int VendingMachineId;
    private String vendingMachineName;

    public Snack(String name, int quantity, double cost, int VendingMachineId, String VendingMachineName) {
        this.name = name;
        this.id = maxId++;
        this.quantity = quantity;
        this.cost = cost;
        this.VendingMachineId = VendingMachineId;
        this.vendingMachineName = VendingMachineName;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

} // class closing bracket
