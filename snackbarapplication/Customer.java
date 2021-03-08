package snackbarapplication;

public class Customer
{
// Customer fields✔️
  private int maxId = 0;

  private int id;
  private String name;
  private double cashOnHand;

//Constructor✔️
  public Customer(String name, double cashOnHand)
  {
    maxId++;
    id = maxId;

    this.name = name;
    this.cashOnHand = cashOnHand;
  }

// getter and Setters
// id ✔️
  public int getId()
  {
    return id;
  }

// name ✔️
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }

// cashOnHand ✔️
  public double getCashOnHand()
  {
    return cashOnHand;
  }
  public void setCashOnHand(double cashOnHand)
  {
    this.cashOnHand = cashOnHand;
  }

// Methods ✔️
// Add cashOnHand
  public void addCash(double addCash)
  {
    this.cashOnHand += addCash;
  }

// Buy snacks✔️
  public void buySnack(int snackQuantity, double snackCost)
  {
    this.cashOnHand -= snackCost * snackQuantity;
  }

  @Override
  public String toString()
  {
    return "Customer: " + name;

  }


}