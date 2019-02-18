package snackBar;
// define properties
public class Snack
{

  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int machineId;

  public Snack(String name, int quantity, double cost, int machineId)
  {
    maxId++;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.id = maxId;
    this.machineId = machineId;
  }
  // define getter/setter methods: setName, getQuantity, addQuantity, 
// buySnacks, getCost

  public void setName(String name)
  {
    this.name = name;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public void addQuantity(int quantity)
  {
    if (quantity > 0)
      this.quantity += quantity;
  }

  public void buySnacks(int quantity)
  {
    this.quantity -= quantity;
  }

  public double getCost(int quantity)
  {
    return quantity * cost;
  }
}
