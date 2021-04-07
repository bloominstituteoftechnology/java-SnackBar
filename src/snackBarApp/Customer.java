package snackBarApp;

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

  public String getName()
  {
    return name;
  }

  public double getCash()
  {
    return cash;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void addCash(double amount)
  {
    this.cash = this.cash + amount;
  }

  public void buySnacks(double amount)
  {
    this.cash = this.cash - amount;
  }

}
