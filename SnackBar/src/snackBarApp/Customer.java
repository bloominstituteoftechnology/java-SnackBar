package snackBarApp;

public class Customer
{
    private static int maxId = 0;

    private int id;
    private String name;
    private double cash;
    
    public Customer(String name, double cash)
    {
        id = ++maxId;
        this.name = name;
        this.cash = cash;
    }
    public int getid()
    {
        return id;
    }
    public void setName(String name)
    {
      this.name = name;
    }
    public String getName()
    {
      return name;
    }
    public void addCash(double amount)
    {
        cash += amount;
    }
    public double getCash()
    {
        return cash;
    }
    public void buySnacks(double total) {
        cash -= total;
    }
}
