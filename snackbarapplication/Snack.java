package snackbarapplication;

public class Snack
{
  private static int maxId = 0;

  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

// Constructor ✔️
  public Snack(String name, int quantity, double cost, int vendingMachineId)
  {
    maxId++;
    id = maxId;

    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId =  vendingMachineId;
  }

// Getters and Setters
// id✔️
  public int getId()
  {
    return id;
  }

// Name✔️
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }

// Quantity✔️
  public int getQuantity()
  {
    return quantity;
  }
  public void setQuantity(int quantity)
  {
    this.quantity += quantity;
  }

// Cost✔️
  public double getCost()
  {
    return cost;
  }
  public void setCost(double cost)
  {
    this.cost = cost;
  }

// vendingMachineId ✔️
  public int getVendingMachineId()
  {
    return vendingMachineId;
  }
  public void setVendingMachineId(int vendingMachineId)
  {
    this.vendingMachineId = vendingMachineId;
  }

// buySnack✔️
  public void buySnackQuantity(int numToBuy)
  {
    this.quantity -= numToBuy;
  }

// total✔️
  public double getTotal(int quantity)
  {
    return this.cost * quantity;
  }

}