package javaSnackBar;

public class Snack
 {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost ;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) 
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity= quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    //methods 
    public void addSnack(int amount){
        this.quantity += amount;
    }
    public void buySnack(int amount)
    {
        this.quantity -= amount;
    }
//getters
    public double getTotalCost() {
    return cost * quantity;
}
    public double getStock(int amount) {
    return cost * amount;
}

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

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }


    //setters
    public void setName(String name)
    {
        this.name = name;
    }
 
    public void setQuantity(int quantity)
    {
        this.quantity= quantity;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId= vendingMachineId;
    }

}