package snack;

public class Customer
{
  private int maxId = 0;
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

  public void addCash(double addlCash)
  {
    this.cashOnHand += addlCash;
  }

  public void buySnack(int snackQuantity, double snackCost)
  {
    this.cashOnHand -= snackCost*snackQuantity;
  }

  public void setName(String Name)
  {
    this.name = name;
  }

  public String getName()
  {
    return this.name;
  }

  public double getCashOnHand()
  {
    return this.cashOnHand;
  }
}
