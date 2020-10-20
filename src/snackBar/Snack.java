package snackBar;

public class Snack {

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private int cost;
    private int vending_id;

    public Snack(String name, int quantity, int cost, int vending_id) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vending_id = vending_id;
    }

    // methoeds
}