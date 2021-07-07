package snackBar;

public class Customer 
{
  public static int maxId = 0;
  public int id;
  public String name;
  public double cash;

  public Customer (String name, double cash)
  {
    this.name = name;
    this.cash = cash;
  }
  // add cash, buy given total cash used in purchase
  public void addCash(double cash)
  {
    this.cash = this.cash + cash;
  }

  // get and set name, get cash on hand. 
  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public double getCash()
  {
    return cash;
  }
}