// Customer has id, name, cash on hand
// Customer can add cash, buy given total cash used in purchase, get and set name, get cash on hand.

package snackBar;

public class Customers {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash; 

    public Customers (String name, double cash) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash; 
    }

    // Get Id
    public int getId() {
        return id;
    }

    // Add Cash
    public void addCash(double cash) {
        this.cash += cash; 
    }

    // Get Name
    public String getName() {
        return name;
    }

    // Set Name
    public void setName(String name) {
        this.name = name;
    }

    // Purchase Snack
    public String purchase(Snacks snack, int quantity) {
        int snackQuantity = snack.getQuantity(); 

        if (snackQuantity >= quantity && snackQuantity != 0) {
            double totalCost = snack.getTotal(quantity); 
            if (totalCost <= cash) {
                this.cash -= totalCost; 
                snack.removeQuantity(quantity);
                return name + " purchased " + quantity + " " + snack.getName() + ".";
            } else {
                return "You do not have enough money.";
            }
        } else {
            return "There are " + snackQuantity + " " + snack.getName() + " in the vending machine.";
        }
    }

    // Get Cash
    public double getCash() {
        return cash;
    }
}