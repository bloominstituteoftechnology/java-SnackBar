package snackBarApp;

public class Main
{
    public static void playWithData()
    {
        Customer jane = new Customer("Jane", 45.25);  
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");        
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        VendingMachine[] machines = {food, drink, office};

        Snack pretzel = new Snack("Pretzel", 30, 2, food.getId());
        Snack bar = new Snack("Chocolate Bar", 36, 1, food.getId());
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack soda = new Snack("Soda", 24, 2.5, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        Snack[] snacks = {chips, bar, pretzel, soda, water}; 

        jane.buySnacks(soda.buySnacks(3));
        System.out.println("Jane cash on hand " + formatDollar(jane.getCash()));
        System.out.println("Quantity of Soda is " + soda.getQuantity());

        jane.buySnacks(pretzel.buySnacks(1));
        System.out.println("\nJane cash on hand " + formatDollar(jane.getCash()));
        System.out.println("Quantity of Pretzels is " + pretzel.getQuantity());

        bob.buySnacks(soda.buySnacks(2));
        System.out.println("\nBob cash on hand " + formatDollar(bob.getCash()));
        System.out.println("Quantity of Soda is " + soda.getQuantity());
        
        jane.addCash(10);
        System.out.println("\nJane cash on hand " + formatDollar(jane.getCash()));
        
        jane.buySnacks(bar.buySnacks(1));
        System.out.println("\nJane cash on hand " + formatDollar(jane.getCash()));
        System.out.println("Quantity of Choclate Bars is " + bar.getQuantity());

        pretzel.addQuantity(12);
        System.out.println("\nQuantity of Pretzels is " + pretzel.getQuantity());

        bob.buySnacks(pretzel.buySnacks(3));
        System.out.println("\nBob cash on hand " + formatDollar(bob.getCash()));
        System.out.println("Quantity of Pretzels is " + formatDollar(pretzel.getQuantity()));

        for (Snack i : snacks)
        {
            System.out.println("\nSnack: " + i.getName());
            System.out.println("Vending Machine: " + machines[i.getMachineId() - 1].getName());
            System.out.println("Quantity: " + i.getQuantity());
            System.out.println("Total Cost: " + formatDollar(i.getTotal(i.getQuantity())));
        }
    }
    public static String formatDollar(double amount)
    {
        return String.format("$%.2f", amount);
    }
    public static void main(String Args[])
    {
        playWithData();
    }
}
