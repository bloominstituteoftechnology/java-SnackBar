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

    public void addCash(double num1) {
        this.cashOnHand = cashOnHand + num1;
    }

    public void buySnacks(double totalCost)
    {
        this.cashOnHand = cashOnHand - totalCost;
    }
}