package snackBar;

public class Snack {

    // fields
    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;

        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // methods - getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public String getQuantity() {
        return "There are " + quantity + " " + name + "s remaining.";
    }

    // methods - regular

    public String addQuantity(int quantity) {
        this.quantity += quantity;
        return quantity + " " + name + "s were added.";
    }

    public double buySnack(int quantity) {
        this.quantity -= quantity;
        return cost * quantity;
    }

    public double total(int quantity) {
        return cost * quantity;
    }

    public String toString(String vendingMachineName) {
        String rtnStr = "Name: " + name + "\n" + "Vending Machine Name: " + vendingMachineName + "\n" + "Quantity: "
                + quantity + "\n" + "Total cost of all " + name + "s: " + total(quantity) + "\n";
        return rtnStr;
    }

}