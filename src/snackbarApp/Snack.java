package snackbarApp;

public class Snack
{
    // fields -- aka state --> information

    private static int maxId = 0;
    private static int vendingMachineId = 0;

    private int id;
    private String name;
    private double quantity;
    private double cost;

    // constructor -- initial state of all our objs

    public Snack(String name, double quantity, double cost )
    {
        maxId++;
        vendingMachineId++;

        
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    // methods -- behaviors --> things to do
    // methonds -- getters and setters (allows us to get or set these fields)
    public int getId()
    {
        return id;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setQuantity(double quantity)
    {
        this.quantity = quantity;
    }

    public double getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost) 
    {
        this.cost = cost;
    }
    
    //regular methods
    // public String getSnackName()
    // {
    //     return fname + " " + lname;
    // }

    public void addQuantity(double add)
    {
        this.quantity += quantity;
    }

    public double getCost(double quantity) 
    {
        return quantity * cost;
    }

    public void setCost(int cost)
    {
        this.cost = cost;
    }

    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
        "name: " + name + "\n" +
        "quantity: " + quantity + "\n" +
        "cost: " + cost + "\n";

        return rtnStr;
    } 
}