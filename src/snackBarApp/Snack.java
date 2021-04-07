package snackBarApp;

public class Snack
{

  private static int maxId = 0;

  private int id;

  private String name;

  private int quantity;

  private double cost;

  private int vendId;

  public Snack(
  String name,
  int quantity,
  double cost,
  int vendId)
  {
    maxId++;
    id = maxId;

    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendId = vendId;
  }

  public int getId(){
    return id;
  }

  public String getName()
  {
    return name;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public double getCost()
  {
    return cost;
  }

  public int getVendId()
  {
    return vendId;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setCost(double cost)
  {
    this.cost = cost;
  }

  public void setVendId()
  {
    this.vendId = vendId;
  }

  public void addQuantity(int amount)
  {
    this.quantity = this.quantity + amount;
  }

  public void buySnack(int amount)
  {
    this.quantity = this.quanitity - amount;
  }

  public double getTotal(int amount)
  {
    double totalCost = this.cost * amount;
    return totalCost;
  }

}
