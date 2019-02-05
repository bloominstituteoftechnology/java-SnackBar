package snackBarApp;

public class Main
{
    private static void workWithData()
    {
       Customer c1 = new Customer("Jane", 45.25);
       Customer c2 = new Customer("Bob", 33.14);
       System.out.println("customer 1 " + c1);
       System.out.println("Customer 2 " + c2);

       VendingMachine v1 = new VendingMachine("Food");
       VendingMachine v2 = new VendingMachine("Drink");
       VendingMachine v3 = new VendingMachine("Office");
       System.out.println(v1);
       System.out.println(v2);
       System.out.println(v3);


       Snack s1 = new Snack("Chips", 36, 1.75, v1.getName());
       Snack s2 = new Snack("Chocolate Bar",36, 1.00, v1.getName());
       Snack s3 = new Snack("Chips", 30, 1.75, v1.getName());
       System.out.println("Snack 1 price: " + s1.getPrice(1));
       System.out.println("Snack 2 price: " + s2.getPrice(1));
       System.out.println("Snack 3 price: " + s3.getPrice(1));

       Snack s4 = new Snack("Soda", 24, 2.50, v2.getName());
       Snack s5 = new Snack("Water", 20, 2.75, v2.getName());
       System.out.println(s4);
       System.out.println(s5);

       System.out.println("Customer 1 cash on hand BEFORE buying 3 s1 snack: " + c1.getCashOnHand());
       double customer1Buy = c1.buy(s1.getPrice(3));
       System.out.println("Customer 1 cash on hand AFTER buying 3 s1 snack: " + c1.getCashOnHand());
       System.out.println("Customer 1 cash on hand BEFORE buying 1 s3 snack: " + c1.getCashOnHand());
       customer1Buy = c1.buy(s3.getPrice(1));
       System.out.println("Customer 1 cash on hand AFTER buying 1 s3 snack: " + c1.getCashOnHand());
       System.out.println("Customer 2 cash on hand BEFORE buying 2 s4 snack: " + c2.getCashOnHand());
       double customer2Buy = c2.buy(s4.getPrice(2));
       System.out.println("Customer 2 cash on hand AFTER buying 2 s4 snack: " + c2.getCashOnHand());
       System.out.println("Customer 1 cash on hand BEFORE 10 usd found: " + c1.getCashOnHand());
       c1.addCash(10.00);
       System.out.println("Customer 1 cash on hand after found 10 usd: " + c1.getCashOnHand());
       System.out.println("-------------------------------------\n");
       customer1Buy =  c1.buy(s3.getPrice(3));
       System.out.println("Customer 1 cash on hand: " + c1.getCashOnHand());
       System.out.println("Snack 3 on hand before adding 12: " + s3.getQuantity());
       s3.addSnack(12);
       System.out.println("Snack 3 on hand after adding 12: " + s3.getQuantity());
       customer2Buy = c2.buy(s3.getPrice(3));
       System.out.println("Customer 2 cash on hand: " + c1.getCashOnHand());
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}
