package snackBar;

public class Snack {
    private static int maxId = 0;
    public int id;
    private String name;
    private int quantity;
    private double cost;
    private int machine_id;

    public Snack(String name, int quantity, double cost, int machine_id) {
        id = maxId++;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machine_id = machine_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void buySnack(int quantity) {
        this.quantity -= quantity;
    }

    public double getCost(int quantity) {
        return quantity * cost;
    }

}