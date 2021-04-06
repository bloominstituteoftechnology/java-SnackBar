package snackbar;

public class Snack {
  private static int maxid = 1;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingmachineid;

  public Snack(String name, int quantity, Double cost, int vendingmachineid) {
    this.id = Snack.maxid;
    Snack.maxid++;

    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingmachineid = vendingmachineid;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getCost() {
    return this.cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public int getVendingMachineId() {
    return this.vendingmachineid;
  }

  public void setVendingMachineId(int vendingmachineid) {
    this.vendingmachineid = vendingmachineid;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void addQuantity(int quantity) {
    this.quantity += quantity;
  }

  public void buyQuantity(int quantity) {
    this.quantity -= quantity;
  }

  public Double getTotalCost(int quantity) {
    return this.cost * quantity;
  }
}
