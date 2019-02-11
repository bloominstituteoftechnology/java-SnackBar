package snackbar;

public class Snack {
//    Snack has id, name, quantity, cost, vending machine id
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack( String name, int quantity, double cost, int vendingMachineId){
        maxId++;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.id = maxId;
        this.vendingMachineId = vendingMachineId;
    }
//    Snack can set name, get quantity, add quantity given quantity, buy snack given quantity, get total cost given a quantity.

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int delta){
        quantity += delta;
    }

    public void buySnacks(int quantity){
        this.quantity -= quantity;
    }

    public double getCost(int quantity) {
        return quantity * cost;
    }
}