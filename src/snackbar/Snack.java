package snackbar;

public class Snack {
  // Fields
  private int maxId;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  // Constructor
  public Snack(int maxId, String name, int quantity, double cost, int vendingMachineId) {
    this.maxId = maxId;
    this.id = this.maxId + 1;
    this.name = name;
    this.cost = cost;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getCost() {
    return cost;
  }

  public int getVendineMachineId() {
    return vendingMachineId;
  }

  public double getTotalCost(int quantityToBuy) {
    return quantityToBuy * cost;
  }

  // Setters
  public void setName(String newName) {
    this.name = newName;
  }

  public void setCost(double newCost) {
    this.cost = newCost;
  }

  public void setVendingMachineId(int vendingMachineId) {
    this.vendingMachineId = vendingMachineId;
  }
}
