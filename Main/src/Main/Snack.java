package Main;

public class Snack {
  private static int maxId = 1;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  public Snack(String name, int quantity, double cost, int vendingMachineId) {
    id = maxId;
    maxId++;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  public int getId() {
    return id;
  }

  public String name() {
    return name;
  }

  public double cost() {
    return cost;
  }

  public int getQuantity() {
    return quantity;
  }

  public int getVendingMachineId(){
    return vendingMachineId;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setVendingMachineId(int vendingMachineId) {
    this.vendingMachineId = vendingMachineId;
  }

  public static void main(String[] args) {
  }
}