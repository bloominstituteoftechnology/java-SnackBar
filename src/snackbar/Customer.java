package snackbar;

public class Customer {
  // Fields
  private String name;
  private double money;

  // Constructor
  public Customer(String name, double money) {
    this.name = name;
    this.money = money;
  }

  // Getters
  public String getName() {
    return name;
  }

  public double getMoney() {
    return money;
  }

  // Setters
  public void setName(String newName) {
    this.name = newName;
  }

  public void setMoney(double newMoney) {
    this.money = newMoney;
  }

}
