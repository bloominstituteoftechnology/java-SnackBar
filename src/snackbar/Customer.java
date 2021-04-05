package snackbar;

public class Customer {
  private static int maxid = 1;

  private int id;
  private String name;
  private Double cashonhand;

  public Customer(String name, Double cashonhand) {
    this.id = Customer.maxid;
    Customer.maxid++;

    this.name = name;
    this.cashonhand = cashonhand;
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

  public void addToCashOnHand(Double cashonhand) {
    this.cashonhand += cashonhand;
  }

  public double getCashOnHand() {
    return this.cashonhand;
  }

  public void buySnacks(Double totalcost) {
    this.cashonhand -= totalcost;
  }
}
