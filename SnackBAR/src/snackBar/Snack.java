package snackBar;

// Snack has id, name, quantity, cost, vending machine id
public class Snack 
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity; 
    private double cost; 
    private int vendingMachineID; 

    // construtor with params
    public Snack(String name, int quantity, double cost, int vendingMachineID)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineID = vendingMachineID;
    }

    // GETTERS AND SETTERS-------------------------------
    // Snack can set name, get quantity, add quantity given quantity, buy snack given quantity, get total cost given a quantity.

    // method to set name
    public void setName(String name)
    {
        this.name = name;
    }
    
    // method to get quantity 
    public int getQuantity() 
    {
        return quantity;
    }

    // method to add quantity given quantity 
    public void addQuantity(int quantity)
    {
        this.quantity += quantity;
    }

    // method to buy snack given quantity
    public void buySnack(int quantity)
    {
        this.quantity -= quantity;
    }

    // method to get total cost given a quantity
    public double getTotalCost(int quantity)
    {
        return cost * quantity;
    }
}