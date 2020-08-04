package snackBar;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;
        this.name =  name;
        this.quantity =  quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // GETTERS

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public int getVendingMachinId()
    {
        return vendingMachineId;
    }

    // SETTERS

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCost(int cost)
    {
        this.cost = cost;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    // OTHER METHODS

    // add quantity when given how many to add
    public void addQuantity(int num1)
    {
        this.quantity = quantity + num1;
    }

    // buy snack when given how many to buy


    public double totalCost(double amnt)
    {
        double totalCost = this.cost * amnt;
        return totalCost;
    }

    public void buySnack(int num1)
    {
        this.quantity = quantity - num1;
    }
}