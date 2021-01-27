package snackbar;

public class VendingMachine {
  // Class attributes
  private int maxId;
  private int id;
  private String name;

  // Constructor
  public VendingMachine(int maxId, String name) {
    this.maxId = maxId;
    this.id = this.maxId + 1;
    this.name = name;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  // Setters
  public void setName(String newName) {
    this.name = newName;
  }
}
