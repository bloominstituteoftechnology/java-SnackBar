package snack;

public class Snack
{
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineID;

  public Snack(String name, int quantity, double cost, int vendingMachineID)
  {
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineID = vendingMachineID;
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

  public double getCost()
  {
    return cost;
  }

  public void setCost(double cost)
  {
    this.cost = cost;
  }

  public int getVendingMachineID()
  {
    return vendingMachineID;
  }

  public void setVendingMachineID(int vendingMachineID)
  {
    this.vendingMachineID = vendingMachineID;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public void addQuantity(int quantity)
  {
    this.quantity += quantity;
  }

  public void buySnack(int numToBuy)
  {
    this.quantity -= numToBuy;
  }

  public double getTotal(int quantity)
  {
    return (this.cost) * quantity;
  }

  @Override
  public String toString()
  {
    String rtnStr = "Name: " + name + "\n"+
                    "Vending Machine ID: " + vendingMachineID + "\n" +
                    "Quantity on-hand: " + quantity + "\n" +
                    "Total Cost of qty on-hand " + quantity*cost + "\n";
    return rtnStr;
  }
}
