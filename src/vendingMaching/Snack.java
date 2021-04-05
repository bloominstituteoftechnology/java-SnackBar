package vendingMaching;

public class Snack {
    private static int maxId = 1;
    private int id;

    private String name;
    private int quantity;
    private double cost;
    private int vendingid;

    public Snack (String name, int quantity,double cost, int vendingid) {
        id = maxId;
        maxId++;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingid = vendingid;
    }

    public int getId() {
        return id;
    }

    public getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public getVendingid() {
        return vendingid;
    }

    public void setVendingid(int vendingid) {
        this.vendingid = vendingid;
    }

    @Override
    public String toString() {
        return "Snack { \n" +
        "id: " + id + "\n" +
        "name: " + name "\n}";
    }

    // public int Additem(int item) {
    //     return 
    // }

}
