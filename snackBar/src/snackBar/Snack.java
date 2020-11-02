package snackBar;

public class Snack
{
  private static int maxId = 0;
  private int id, quantity, vendingMachineId;
  private double cost;
  private String name;

  public Snack(String name, int quantity, int vendingMachineId, double cost)
  {
    id = maxId++;
    this.quantity = quantity;
    this.vendingMachineId = vendingMachineId;
    this.cost = cost;
    this.name = name;
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

  public int getVendingMachineId()
  {
    return vendingMachineId;
  }

  public void setVendingMachineId(int id)
  {
    this.vendingMachineId = id;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public void restock(int additional)
  {
    quantity += additional;
  }

  public double buy(int removed)
  {
    quantity -= removed;
    return getTotalCost(removed);
  }

  public double getTotalCost(int amount)
  {
    return cost * amount;
  }

  public String getQuantityString()
  {
    return "Quantity of " + name + " is " + quantity;

  }

  @Override
  public String toString()
  {
    return "Quantity of " + name + " is " + quantity;
  }
}
