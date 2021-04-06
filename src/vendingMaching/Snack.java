package vendingMaching;

public class Snack {
    private static int maxId = 1;
    private int id;

    private String name;
    private int quantity;
    private double cost;
    private int vendingid;

    public Snack (String name, 
                 int quantity,
                 double cost, 
                 int vendingid) {

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
        return  cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendingid() {
        return vendingid;
    }

    public void setVendingid(int vendingid) {
        this.vendingid = vendingid;
    }

    public void additems(int item) {
        quantity += item;
        System.out.println("Quantity of " + name + " is now " + quantity);
    }

    public void buysnack(int item) {
        quantity -= item;
        System.out.println(item + " of " + name + " were purchesed!" );
    }

    public void totalcost(int item) {
        cost *= item;
        System.out.println(item + " of " + name + " costs " + cost);
    }

}
