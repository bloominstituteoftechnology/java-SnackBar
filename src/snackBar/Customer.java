package snackBar;

class Customer
{
  private static int maxId = 0;
  private int id;
  private String name;
  private double cashOnHand;

  public Customer(String name, double cashOnHand)
  {
    maxId++;
    id = maxId;
    this.name = name;
    this.cashOnHand = cashOnHand;
  }

  public void addCashOnHand(double cash)
  {
    this.cashOnHand += cash;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void buySnack(double cost)
  {
    this.cashOnHand -= cost;
  }

  public double getCashOnHand()
  {
    return cashOnHand;
  }
}
