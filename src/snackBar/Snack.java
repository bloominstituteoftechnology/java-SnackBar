package snackBar;

public class Snack
{
  private static int maxId = 0;
  public int id;
  public String name;
  public int quant;
  public double cost;
  public int vmachineId;

  public Snack (String name, int quant, double cost, int vmachineId) 
  {
    maxId++;
    id = maxId;
    this.name = name; 
    this.quant = quant;
    this.cost = cost;
    this.vmachineId = vmachineId;
  }

  // Snack can set name, get quantity
  public void setName(String name)
  {
    this.name = name;
  }

  public int getQuant()
  {
    return quant;
  }

  // add quantity given quantity, buy snack given quantity
  public void addQuant(int quant)
  {
    this.quant = this.quant + quant;
  }

  public void buySnack(int quant)
  {
    if (quant <= this.quant) {
      this.quant = this.quant - quant;
      System.out.println("Here are " + quant + " " + this.name);
    }
    else {
      System.out.println("Out of stock");
    }
  }

  //get total cost given a quantity.
  public double getTotalcost(int quant)
  {
    return quant * cost;
  }
}