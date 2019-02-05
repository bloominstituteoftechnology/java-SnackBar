package snackBar;

public class Snack{

    private static int maxId = 0;
    private int id = 0;
    private String name;
    private int quantity;
    private int cost;
    private int vendingMachineID;

    public Snack(String name, int quantity, int cost, int vendingMachineID){
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineID = vendingMachineID;

    }
    // Snack can set name, get quantity, add quantity given quantity, buy snack
    // given quantity, get total cost given a quantity.

    //getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

}