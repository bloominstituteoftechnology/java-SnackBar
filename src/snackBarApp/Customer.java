package snackBarApp;

public class Customer {
    private static int maxId = 0;
    public int id;
    public String name;
    public double cash;

    public Customer(String name, double cash) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cash = cash;
    }

    public void addCash(double c) {
        this.cash += c;
    }

    public void buy(double c) {
        this.cash -= c;
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
}
