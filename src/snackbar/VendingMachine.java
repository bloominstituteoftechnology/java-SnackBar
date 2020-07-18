package snackbar;

public class VendingMachine {
  
  private static int maxId = 0;

  private int id;
  private String name;

  VendingMachine(String name) {
    maxId++;
    id = maxId;
    setName(name);
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

  @Override
  public String toString() {
    return "Vending Machine ID: " + id + "\nVending Machine Name: " + name;
  }
}