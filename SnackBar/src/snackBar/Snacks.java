// Snack has id, name, quantiy, cost, vending machine id
// Snack can set name, get quantity, add quantity given quantity, buy snack given quantity, get total cost given a quantity.

package snackBar;

public class Snacks {
    private static int maxId = 0;
    public int id; 
    public String name; 
    public int quantity; 
    public double cost;
    public int vendingMachineId;

    public Snacks (String name, int quantity, double cost, int vendingMachineId) {
        maxId++
        id = maxId; 
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // Set Snack Name 
    public void setName(String name) {
        this.name = name;
    }

    // Get Quantity 
    public int getQuantity() {
        return quantity; 
    }

    // Add Quantity
    public void addQuanity(int quantity) {
        this.quantity += quantity;
    }

    // Buy Snack
    public void buySnack(int quantity) {
        if (this.quantity != 0) {
            if (this.quantity - quantity >= 0) {
                this.quantity -= quantity;
            }
        } 
    }

    // Get Total Cost
    public double getTotal(int quantity) {
        return cost * quantity;
    }
}