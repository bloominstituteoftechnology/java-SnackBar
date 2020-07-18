package snackbar;

import java.text.DecimalFormat;

public class Customer {
  
  private static DecimalFormat df = new DecimalFormat("$#,##0.00");
  private static int maxId = 0;

  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash) {
    maxId++;
    this.id = maxId;
    setName(name);
    this.cash = cash;
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

  public double getCash() {
    return cash;
  }

  public void addCash(double moreCash) {
    cash += moreCash;
  }

  public void buySnacks(double totalCost) {
    cash -= totalCost;
  }

  @Override
  public String toString() {
    return "Customer " + id + " cash on hand " + df.format(cash);
  }
}