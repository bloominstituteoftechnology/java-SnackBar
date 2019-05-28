package snackbarApp;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cost;
    private int vendingMachineId;
    private int quantity;

    public Snack (String name, double cost, int vendingMachineId, int quantity)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
        this.quantity = quantity;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public Integer getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int amount)
    {
        this.quantity += amount;
    }

    public void buySnack(int amount)
    {
        this.quantity -= amount;
    }

    public double getCost(int amount)
    {
        return amount * this.cost;
    }
}