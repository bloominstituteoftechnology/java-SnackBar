package snackbar;


public class Snack {
    private int id;
    public String name;
    public int quantity;
    public double cost;
    public int VendingMachineId;

    public Snack(String name, int quantity, double cost, int VendingMachineId) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int q) {
        this.quantity += q;
    }

    public void buySnack(int q) {
        this.quantity -= q;
    }

    public double getCost(int q) {
        return this.cost * q;
    }
}
