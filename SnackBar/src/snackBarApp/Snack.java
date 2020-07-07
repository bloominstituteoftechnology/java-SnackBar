package snackBarApp;

public class Snack {
    private static int maxId = 0;
    
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingmachineID;



    public Snack(String name, int quantity, double cost, int vendingmachineID) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingmachineID = vendingmachineID;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getname() {
        return name;
    }
    public int getquantity() {
        return quantity;
    }
    public double getcost() {
        return cost;
    }
    public int getvendingmachineID() {
        return vendingmachineID;
    }
    //Setters
    public void setname(String name) {
        this.name = name;
    }
    public void setcost(double cost) {
        this.cost = cost;
    }
    public void setvendingmachineID(int vendingmachineID) {
        this.vendingmachineID = vendingmachineID;
    }
    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name;
    }
}