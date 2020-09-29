package snackBar;

// Customer has id, name, cash on hand
public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer (String name, double cashOnHand)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // GETTERS AND SETTERS------------------------------
    //Customer can add cash, buy given total cash used in purchase, get and set name, get cash on hand. 

    // method to add cash
    public void addCash(double cashOnHand)
    {
        this.cashOnHand += cashOnHand;
    }

    // method to buy given total cash used in purchase
    public void buySnack(int quantity, Snack snack) 
    {
        snack.buySnack(quantity);
        this.cashOnHand -= snack.getTotalCost(quantity);
    }

    // method to get name
    public String getName()
    {
        return name;
    }

    // method to set name
    public void setName(String name)
    {
        this.name = name;
    }

    // method to get cash on hand 
    public double getCash()
    {
        return cashOnHand;
    }
}


