package java-SnackBar;

public class Customer {
    private int id;
    private String name;
    private double cash;

    public class Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
    }

    public double addCash(double cash) {
        this.cash += cash;
    }

    public double buyProduct() {
        return this.cash;
    }

    public getName() {
        return this.name;
    }

    public setName(String name) {
        this.name = name;
    }

    public getCash() {
        return this.cash;
    }
}