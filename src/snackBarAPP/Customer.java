package snackBarAPP;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String fname;
    private String lname;
    private double budget;

    public Customer(String fname, String lname, double budget) {
        maxId++;
        this.id = maxId;
        this.fname = fname;
        this.lname = lname;
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return fname + lname;
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