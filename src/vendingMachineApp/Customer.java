package vendingMachineApp;

public class Customer {
  private static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash) {
    maxId++;
    id = maxId;

    this.name = name;
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

  public void addCash(double amt) {
    this.cash += amt;
  }

  public double getCash() {
    return cash;
  }

  public void buySnacks(double totalCost) {
    this.cash -= totalCost;
  }
}
