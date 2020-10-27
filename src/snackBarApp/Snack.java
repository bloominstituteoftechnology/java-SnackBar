package snackBarApp;

public class Snack {
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vmId;


  public Snack(int maxId, String name, int quantity, double cost, int vmId)
  maxId++;
  this.id = maxId;
  this.name = name;
  this.quantity = quantity;
  this.cost = cost;
  this.vmId = vmId;
}
  // Getters & Setters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getCost() {
    return cost;
  }

  public int getVmId() {
    return vmId;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public void setVmId(int id)  {
    this.vmId = vmId;
  }

  //////////////
  public double getTotalCost() {
    return cost * quantity;
  }

  public int addQuantity(int num) {
    return quantity + num;
  }
///////>>ask about buy snack method and what differentiates it from add quantity?

}
