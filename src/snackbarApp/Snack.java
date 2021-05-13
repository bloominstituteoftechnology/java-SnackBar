package snackbarApp;

public class Snack {
    // fields
    private static int maxId = 1;
    private int id;

    private String name;
    private int quantity;
    private double cost;
    private int vendingmachineid;

    // Constructor
    public Snack(
        String name, 
        int quantity,
        double cost, 
        int vendingmachineid) {
            id = maxId;
            maxId++;
            this.name = name;
            this.quantity = quantity;
            this.cost = cost;
            this.vendingmachineid = vendingmachineid;
    }

    // Getter and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getVendingMachineId() {
        return vendingmachineid;
    }
    public void setVendingMachineId(int vendingmachineid) {
        this.vendingmachineid = vendingmachineid;
    }

    public int getid(){
        return id;
    }


    public void addQuantity(int addedSnacks){
        this.setQuantity(this.getQuantity() + addedSnacks);
    }

    public void buySnack(int boughtSnacks){
        this.setQuantity(this.getQuantity() - boughtSnacks);
    }

    public double getTotalCost(){
        return getQuantity() * getCost();
    }

    @Override
    public String toString(){
        return "Quantity of " + this.getName() + " " + "is " + this.getQuantity();
    }
}
