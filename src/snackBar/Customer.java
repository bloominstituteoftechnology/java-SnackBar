package snackBar;

public class Customer {
    private static int maxId = 0;
    public int id;
    private String name;
    private double cash;

    public Customer(String name, double cash) {
        id = maxId++;
        this.name = name;
        this.cash = cash;
    }

    public double addCash(double cash) {
        return this.cash += cash;
    }

    public void buySnack(int quantity, Snack snack) {
        snack.buySnack(quantity);
        this.cash -= snack.getCost(quantity);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }
}