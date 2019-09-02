package snackapp;

public class Snack {
    private int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingID;

    public Snack(int id, String name, int quantity, double cost, int vendingID) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingID = vendingID;
    }
    public int getId() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getVendingID() {
        return vendingID;
    }
    public void setVendingID(int vendingID) {
        this.vendingID = vendingID;
    }
    public void addQuantity(int quantityToAdd) {
        this.quantity += quantityToAdd;
    }
    public void buySnack(int amountToBuy) {
        this.quantity -= amountToBuy;
    }
    public double getCost(int amountToBuy) {
        return this.cost = cost * amountToBuy;
    }
}

