package snackbar;

import java.text.DecimalFormat;

public class Snack {

  private static DecimalFormat df = new DecimalFormat("$#,##0.00");
  private static int maxId = 0;

  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineid;

  public Snack(String name, int quantity, double cost, int vendingMachineid) {
    maxId++;
    id = maxId;
    setName(name);
    this.quantity = quantity;
    setCost(cost);
    setVendingMachineid(vendingMachineid); 
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public int getVendingMachineid() {
    return vendingMachineid;
  }

  public void setVendingMachineid(int vendingMachineid) {
    this.vendingMachineid = vendingMachineid;
  }

  public void addQuantity(int amountToAdd) {
    quantity += amountToAdd;
  }

  public double buySnack(int amountToBuy) {
    quantity -= amountToBuy;
    return cost * amountToBuy;
  }

  public double totalCost() {
    return cost * quantity;
  }

  public String printQuantity() {
    return "Quantity of snack " + id + " is " + quantity + '\n';
  }

  @Override
  public String toString() {
    return "Snack: " + name + "\nVending Machine: " + vendingMachineid + "\nQuantity: " + quantity + "\nTotal Cost: " + df.format(totalCost()) + "\n";
  }

  public String stretch(String vendingMachineName) {
    return "Snack: " + name + "\nVending Machine: " + vendingMachineName + "\nQuantity: " + quantity + "\nTotal Cost: " + df.format(totalCost()) + "\n";
  }
}