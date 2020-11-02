package snackBar;

public class Customer
{
  private static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash)
  {
    this.name = name;
    this.cash = cash;
    id = maxId++;
  }

  public int getId()
  {
    return id;
  }

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

  public void removeCash(double removed)
  {
    cash -= removed;
  }

  @Override
  public String toString()
  {
    return name + " cash on hand $" + cash;
  }
}
