package snackBar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    // CONSTRUCTOR

    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // GETTERS

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    // SETTERS

    public void setName(String name) {
        this.name = name;
    }

    // OTHER METHODS

    public double addCash(double num1) {
        return this.cashOnHand = cashOnHand + num1;
    }

    public double buySnacks(double totalCost)
    {
        return this.cashOnHand = cashOnHand - totalCost;
    }
}