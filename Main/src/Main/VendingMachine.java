package Main;

public class VendingMachine {
  private static int maxId = 1;
  private int id;
  private String name;

  public VendingMachine(String name) {
    id = maxId;
    maxId++;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String name() {
    return name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {

  }
}
