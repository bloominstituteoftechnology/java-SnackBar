package SnackBar;

public class Main
{
    private static void workWithData()
    {
        System.out.println("Snack Bar start");
        //create vending machine
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");
        //create snacks
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());
        //create customer
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);
        //Processing
        System.out.println(jane.getName() + " has $" + jane.getCash());
        System.out.println(soda.getName() + " has " + soda.getQuantity() + " left");
        System.out.println("Jane buys 3 sodas");
        jane.buySnacks(soda.costOfPurchase(3));
        soda.purchased(3);
        System.out.println(jane.getName() + " has $" + jane.getCash());
        System.out.println(soda.getName() + " has " + soda.getQuantity() + " left");
        System.out.println("Jane buys 1 Pretzel");
        jane.buySnacks(pretzel.costOfPurchase(1));
        pretzel.purchased(1);
        System.out.println(jane.getName() + " has $" + jane.getCash());
        System.out.println(pretzel.getName() + " has " + pretzel.getQuantity() + " left");
        System.out.println("Bob has $" + bob.getCash());
        System.out.println("Bob buys 2 Sodas");
        bob.buySnacks(soda.costOfPurchase(2));
        soda.purchased(2);
        System.out.println(bob.getName() + " has $" + bob.getCash());
        System.out.println(soda.getName() + " has " + soda.getQuantity() + " left");
        System.out.println("Jane finds $10");
        jane.addCash(10);
        System.out.println("Jane has $" + jane.getCash());
        System.out.println("Jane 1 chocolate bar");
        jane.buySnacks(chocolateBar.costOfPurchase(2));
        chocolateBar.purchased(2);
        System.out.println("Jane has $" + jane.getCash() + " left");
        System.out.println("ChocolateBar has quantity " + chocolateBar.getQuantity());
        System.out.println("Added 12 pretzels");
        pretzel.addItems(12);
        System.out.println("Pretzel has quantity " + pretzel.getQuantity());
        System.out.println("Bob buys 3 pretzel");
        bob.buySnacks(pretzel.costOfPurchase(3));
        pretzel.purchased(3);
        System.out.println("Bob has $" + bob.getCash());
        System.out.println("Pretzel has quantity " + pretzel.getQuantity());
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}