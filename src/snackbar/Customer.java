package snackbar;

public class Customer {
    
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    }

    public int getId()
    {
        return id;
    }

    public double getCash()
    {
        return cash;
    }

    public void addCash(double i)
    {
        this.cash = cash + i;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void buySnacks(double cost)
    {
        this.cash = cash - cost;
    }
}


