package snackBar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    // CONSTRUCTOR

    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // GETTERS

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }

    // SETTERS

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCashOnHand(double cashOnHand)
    {
        this.cashOnHand = cashOnHand;
    }
}