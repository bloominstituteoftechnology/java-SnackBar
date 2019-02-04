// Customer has id, name, cash on hand
// Customer can add cash, buy given total cash used in purchase, get and set name, get cash on hand.

package snackBar;

public class Customers {
    private static int maxId = 0;
    private  String name = name;
    private double cash; 

    public Customers (String name, double cash) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash; 
    }

    // Add Cash
    public addCash(double cash) {
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

    // Purchase Item
    public void purchase(double cost) {
        this.cash -= cost;
    }

    // Get Cash
    public int getCash() {
        return cash;
    }
}