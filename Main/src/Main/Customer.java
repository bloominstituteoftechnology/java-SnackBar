package Main;

public class Customer {
  private static int maxId = 1;
  private int id;
  private String name;
  private double cashOnHand;

  public Customer(String name, double cashOnHand) {
    id = maxId;
    maxId++;
    this.name = name;
    this.cashOnHand = cashOnHand;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getCashOnHand() {
    return cashOnHand;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCashOnHand(double cashOnHand) {
    this.cashOnHand = cashOnHand;
  }

  public void buySnacks(double snacks) {
    this.cashOnHand -= snacks;
  }

  public static void main(String[] args) {

 
  }
}
