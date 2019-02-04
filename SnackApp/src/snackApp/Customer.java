package snackApp;

public class Customer 
{

    // Incrementing static id to create unique ids per object
    private static int maxId = 0;

    // Customer has id, name, cash on hand
    private int id;
    private String name;
    private double cashOnHand;

    // The constructor
    public Customer(String name, double cashOnHand)
    {
        // Set current id, then increment maxid
        id = maxId;
        maxId++;

        // Load name and cash into object
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // Customer can add cash, buy given total cash used in purchase, get and set name, get cash on hand.

    // Getter methods

    public String getName()
    {
        return name;
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }


    // Setter methods

    public void setName(String name)
    {
        this.name = name;
    }

    public void buyStuff(double cost)
    {

        // if/else to check if the customer has enough money
        if ( cost <= cashOnHand ) {
            cashOnHand -= cost;
            System.out.println(name + " spends $" + cost + ".");
        }
        else {
            System.out.println(name + " doesn't have enough money!");
        }
    }

    public void addCash(double cash)
    {
        cashOnHand += cash;
    }


    
}


