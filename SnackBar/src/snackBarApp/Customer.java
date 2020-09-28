package snackBarApp;

public class Customer
{
    private static int maxId = 0;

    private int id;
    private String name;
    private float cash;
    
    public Customer(String name, float cash)
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
    public void addCash(int amount)
    {
        cash += amount;
    }
    public getCash()
    {
        return cash;
    }
    public buySnacks(int total) {
        cash -= total;
    }
}
