package snackBarApp;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double balance;

    public Customer(String name, double balance)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public double getCashOnHand()
    {
        return balance;
    }

    public void addCash(double addedCash)
    {
        this.balance = balance + addedCash;
    }

    public void purchaseSnack(int quantity, double cost)
    {
        this.balance = balance - (quantity * cost);
    }

    public void setName()
    {
        this.name = name;
    }

}