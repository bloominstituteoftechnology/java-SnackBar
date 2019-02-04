package snackBarApp;

public class Snack
{
    private static int maxId = 0;
    public int id;
    public String name;
    public int quantity;
    public double cost;
    public String vendingMachineId;

    // setters
   public Snack(String name, int quantity, double price, String vendingMachineId)
   {
       maxId++;
       id = maxId;
       this.name = name;
       this.quantity = quantity;
       this.cost = price;
       this.vendingMachineId = vendingMachineId;
   }

    public int buySnack(int amount)
    {
        quantity -= amount;
        return quantity;
    }

    //getters
    public int getQuantity()
    {
        return quantity;
    }
    public double getPrice()
    {
        System.out.println(cost * quantity);
        return cost * quantity;
    }
}
