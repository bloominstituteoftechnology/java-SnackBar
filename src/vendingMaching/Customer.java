package vendingMaching;

public class Customer {
    private static int maxId = 1;
    private int id;

    private String name;
    private double cash;

    public Customer (String name, double cash){
        id = maxId;
        maxId++;
        this.name = name;
        this.cash = cash;
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

    public double getCash() {
        return cash;
    }

    public void addCash(double money) {
        cash += money;
        System.out.println(name + " added " + money + " to their wallet.");
    }

    public void buySnacks(double cost) {
        cash -= cost;
        System.out.println(name + " spent " + cost + " on snacks.");
    }
    
}
