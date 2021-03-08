package snackbarapplication;

public class Customer 
{
    //feilds 
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    //constructor
    private Custormer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //getters

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
}
