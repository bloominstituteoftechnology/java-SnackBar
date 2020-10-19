package snackbar;

public class Snack {
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
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.vendingMachineId = vendingMachineId;

    }

    public int getId()
    {
        return id;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int i)
    {
        quantity = quantity + i;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public double getTotalCost(double total)
    {
        return cost * total;
    }

    public void buySnack(int buy)
    {
        this.quantity = quantity - buy;
    }
    
}


