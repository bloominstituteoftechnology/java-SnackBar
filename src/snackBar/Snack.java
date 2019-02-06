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

    public String setName(String name) {
        return this.name = name;
    }

    public int getQuantity() {
        return this.quantity = quantity;
    }

    public int addQuantity(int quantity) {
        return this.quantity += quantity;
    }

    public Boolean buySnack() {
        return this.quantity > 0;
    }

    public double getCost() {
        return this.quantity * this.cost;
    }

}