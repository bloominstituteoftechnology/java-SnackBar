package java-SnackBar;

public class Snack {
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int machine_id;

    public Snack(String name, int quantity, double cost, int machine_id) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machine_id = machine_id;
    }

    public String setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        this.quantity = quantity;
    }

    public int addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public int buySnack() {
        return this.quantity > 0;
    }

    public double getCost() {
        return this.quantity * this.cost;
    }

}