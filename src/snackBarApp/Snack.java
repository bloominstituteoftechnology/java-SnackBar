package snackBarApp;

public class Snack
{
    private static maxId = 0;
    public int id;
    public String name;
    public int quantity;
    public double cost;
    public int vendingMachineId;

    // setters
   public Snack(String name, int quantity, double price)
   {
       maxId++;
       id = maxId;
       this.name = name;
       this.quantity = quantity;
       this.price = price;
   }



    //getters
    public int getQuantity()
    {
        return quantity;
    }
    public double getPrice()
    {
        System.out.println(price * quantity);
        return price * quantity;
    }
}
