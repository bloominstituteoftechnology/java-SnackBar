package snackbarApp;

public class Snack {
    private static int maxId = 1;
    private int id;

    private String name;
    private int  quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        id = maxId;
        maxId++;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setName(double cost) {
        this.cost = cost;
    }
        
    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int merch) {
        quantity = quantity + merch;
    }

    public void buyQuantity(int merch) {
        quantity = quantity - merch;
    }
    
    public int getVendingmachingId() {
        return vendingMachineId;
    }

    public void setName(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public int getId() {
        return id;
    }

    public double buySnack(int merch) {
        return merch * cost;
    }
      
    @Override public String toString() {
        return 
            "Snack:" + name + "\n"+
            "Vending Machine:" + vendingMachineId + "\n" +
            "Quantity:" + quantity + "\n" +
            "Total Cost:$" + quantity*cost;
    }
}
