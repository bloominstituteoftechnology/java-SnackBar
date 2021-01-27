package snackbar;

public class Customer {
  // Fields
  private int maxId;
  private int id;
  private String name;
  private double cashOnHand;

  // Constructor
  public Customer(int maxId, String name, double cashOnHand) {
    this.maxId = maxId;
    this.id = this.maxId + 1;
    this.name = name;
    this.cashOnHand = cashOnHand;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getCashOnHand() {
    return cashOnHand;
  }

  // Setters
  public void setName(String newName) {
    this.name = newName;
  }

  // Methods
  public void addCashOnHand(double cash) {
    this.cashOnHand += cash;
  }

  public void buySnack(double priceOfSnack) {
    this.cashOnHand -= priceOfSnack;
  }
}
