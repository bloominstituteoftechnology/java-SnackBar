package snackbar;

public class Snack {
    private static int maxId;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int machineID;

    public Snack(String name, int quantity, double cost, int machineID) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineID = machineID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        if (quantity > 0)
            this.quantity += quantity;
    }

    public void buySnack(Customer customer, VendingMachine vendingMachine, int quantity) {
        if (quantity > 0) {
            customer.buy(this, quantity);
            vendingMachine.sell(this, quantity);
        }
    }

    public double getCost(int quantity) {
        if (quantity > 0)
            return this.cost * quantity;
        return -1;
    }
}