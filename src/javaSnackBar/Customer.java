package javaSnackBar;

public class Customer {
    private static int maxId=0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id=maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //methods
    public void addTotal(double amount)
    {
        this.cashOnHand += amount;
    }
    public void buySnack(Snack name, int amount)
    {
         name.buySnack(amount);
         this.cashOnHand -= name.getStock(amount);
    }
    public int id()
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

    public void setName(String name)
    {
        this.name= name;
    }
    public void setCashOnHand(double cashOnHand)
    {
        this.cashOnHand = cashOnHand;
    }
}