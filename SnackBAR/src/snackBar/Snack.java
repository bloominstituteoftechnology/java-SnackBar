package snackBar; 

public class Snack 
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity; 
    private double cost; 
    private int vendingMachineID; 

    public Snack (String name, int quantity, double cost, int vendingMachineID)
    {
        madId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineID = vendingMachineID;
    }

    // method set to set name of snack
    public void setName(String name)
    {
        this.name = name;
    }
    
    // method set to get name of snacks
    public String getName()
    {
        return name; 
    } 
    
    // method set to get quantity 
    public double getQuantity() 
    {
        return quantity;
    }

    // method for setting quantity
    public void setQuantity(double quantity)
    {
        this.quantity = quantity;
    }

    // buy snack given quantity
    
    
    // method to get cost 
    public double getCost()
    {
        return cost;
    }

    // get total cost given a quantity
    public double getTotalCost(int quantity)
    {
        return this.cost * quantity;
    }
}