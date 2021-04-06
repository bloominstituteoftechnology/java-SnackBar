package snackbar;

public class VendingMachine {
  private static int maxid = 1;

  private int id;
  private String name;

  public VendingMachine(String name) {
    this.id = VendingMachine.maxid;
    VendingMachine.maxid++;

    this.name = name;
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

  @Override
  public String toString() {
    return "Vending Machine: " + this.getName();
  }
}
