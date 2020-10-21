package snackBar;

public class Snack {

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vending_id;

    public Snack(String name, int quantity, double cost, int vending_id) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vending_id = vending_id;
    }

    // methoeds

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getVending_id() {
        return vending_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setVending_id(int vending_id) {
        this.vending_id = vending_id;
    }

//    add quantity when given how many to add (add to quantity)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    buy snack when given how many to buy ()

//    get total cost given a quantity
}