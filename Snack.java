public class Snack {
  private int maxId;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  public Snack(int maxId, int id, String name, int quantity, double cost, int vendingMachineId) {
    this.maxId = maxId;
    this.id = id;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  //Getters ad Setters
  public int getMaxId() {
    return maxId;
  }

 public int getId(){
   return id;
 }

  public String name() {
    return name;
  }
public int getQuantity() {
    return quantity;
  }

  public static void main(String[] args) {
    System.out.println("Hello, World.");
  }
}