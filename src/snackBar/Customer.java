package snackBar;

public class Customer {
    private static int maxId = 0;
    private int id;

    private String name;
    private double cash;

    public Customer(String name, double cash) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
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

    public void addCash(double cash) {
        this.cash = this.cash + cash;
    }

    public void buy(double cash) {
        this.cash = this.cash - cash;
    }
}