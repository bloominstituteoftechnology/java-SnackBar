package javaSnackBar;

/*
    Snack
        In Vending Machine Food
            36 Chips at $1.75
            36 Chocolate Bar at $1.00
            30 Pretzel at $2.00
        In Vending Machine Drink
            24 Soda at $2.50
            20 Water at $2.75
    Vending Machine
        Food
        Drink
        Office
    Customer
        Jane with $45.25
        Bob with $33.14
*/

public class Main 
{   
    private static void workWithData()
    {
        System.out.println("Welcome to snack bar!!!");

        //   public VendingMachine(String name)
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        //String name, double cost, int vendingMachineId
        Snack chips = new Snack("Chips", 1.75, 36, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 1.0, 36, food.getId());
        Snack pretzel = new Snack("Pretzel", 2.0, 30, food.getId());
        Snack soda = new Snack("Soda", 2.5, 24, drink.getId());
        Snack water = new Snack("Water", 2.75, 20, drink.getId());

        //     public Customer(String name, double cashOnHand)
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);
        
        System.out.println();
        soda.buySnack(3);
        jane.buySnacks(soda.getTotalCostWithQuantity(3));
        System.out.println("Customer " + jane.getId() + " cash on hand " + jane.getCashOnHand());
        System.out.println("Quanity of snack " + soda.getId() + " is " + soda.getQuantity());

        System.out.println();
        pretzel.buySnack(1);
        jane.buySnacks(pretzel.getTotalCostWithQuantity(1));
        System.out.println("Customer " + jane.getId() + " cash on hand " + jane.getCashOnHand());        
        System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

        System.out.println();
        soda.buySnack(2);
        bob.buySnacks(soda.getTotalCostWithQuantity(2));
        System.out.println("Customer " + bob.getId() + " cash on hand " + bob.getCashOnHand());        
        System.out.println("Quantity of snack " + soda.getId() + " is " + soda.getQuantity());

        System.out.println();
        jane.addCash(10);
        System.out.println("Customer " + jane.getId() + " cash on hand " + jane.getCashOnHand());

        System.out.println();
        chocolateBar.buySnack(1);
        jane.buySnacks(chocolateBar.getTotalCostWithQuantity(1));
        System.out.println("Customer " + jane.getId() + " cash on hand " + jane.getCashOnHand());
        System.out.println("Quantity of snack " + chocolateBar.getId() + " is " + chocolateBar.getQuantity());

        System.out.println();
        pretzel.addQuantity(12);
        System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

        System.out.println();
        pretzel.buySnack(3);
        bob.buySnacks(pretzel.getTotalCostWithQuantity(3));
        System.out.println("Customer " + bob.getId() + " cash on hand " + bob.getCashOnHand());
        System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());




    } 
    public static void main(String[] args)
    {
        workWithData();
    }
}