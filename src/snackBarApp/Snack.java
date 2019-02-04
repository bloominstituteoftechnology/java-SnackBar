package snackBarApp;

public class Snack
{
    public int id;
    public String name;
    public int quantity;
    public double cost;
    public int vendingMachineId;

    // setter
    public Snack(String name, int quantity, double cost, int vendingMachineId
    {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }
    //getters
    public int getQuantity()
    {
        return quantity;
    }
}
