package snackBar;

public class Snacks {
    private static int maxId = 0;
    private int id;

    private int vendId;
    private String name;
    private int quantity;
    private double cost;

    public int getVendId() {
        return vendId;
    }

    public void setVendId(int vendId) {
        this.vendId = vendId;
    }

    public Snacks(int vendId, String name, double cost, int quantity) {
        maxId++;
        this.id = maxId;
        this.vendId = vendId;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public void buySnack(int quantity) {
        this.quantity = this.quantity - quantity;
    }

    public double getTotalCost(int quantity) {
        return cost * quantity;
    }
}