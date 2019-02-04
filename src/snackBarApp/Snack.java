package snackBarApp;

public class Snack
{
    public int id;
    public String name;
    public int quantity;
    public double cost;
    public int vendingMachineId;

    // setters
   public setName(String name)
   {
       this.name = name;
   }

   public addQuantity(int quantity)
   {
       this.quantity = quantity;
   }

   public price(double price)
   {
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
