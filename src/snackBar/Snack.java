package snackBar;

public class Snack
{

    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingId;

    public Snack(String name, int quantity, double cost, int vendingId)
    {
        maxId++;

        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingId = vendingId;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    // ----- start of quantity of snacks within the vending machine -----
    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void snacksAdd(int added)
    {
        this.quantity = this.quantity + added;
    }

    public void snacksDeduct(int deduct)
    {
        this.quantity = this.quantity - deduct;
    }

    public double totalCost()
    {
        return quantity * cost;
    }
    // ----- end of quantity of snacks within the vending machine -----


    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVendingId()
    {
        return vendingId;
    }

    public void setVendingId(int vendingId)
    {
        this.vendingId = vendingId;
    }


}