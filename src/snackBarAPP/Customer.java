package snackBarAPP;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double budget;

    public Customer(String name, double budget) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.budget = budget;
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

    public boolean hasSufficientFunds(double expense) {
        return expense < budget ? true : false;
    }

    public void buyProduct(double expense) {
        this.budget = budget - expense;
    }

    public void addFunds(double extraFunds) {
        this.budget = budget + extraFunds;
    }
}