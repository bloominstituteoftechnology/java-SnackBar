package snackBarApp;

public class Snack
{
    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int machineId;

    // constructor
    public Snack(String name, int quantity, double cost, int machineId)
    {
        this.id = ++maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getId()
    {
        return id;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void addQuantity(int amount)
    {
        quantity += amount;
    }
    public double getCost()
    {
        return cost;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public int getMachineId()
    {
        return machineId;
    }
    public void setMachineId(int machineId)
    {
        this.machineId = machineId;
    }
    public double buySnacks(int amount)
    {
        quantity -= amount;
        return amount * cost;
    }
    public double getTotal(int amount)
    {
        return amount * cost;
    }
}
