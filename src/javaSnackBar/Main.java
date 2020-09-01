package javaSnackBar;
/*
   Snack
   Vending Machine
   Customer 
*/
public class Main
{
    private static void snackBar()
    {

        Customer one = new Customer("Jane", 42.25);
        Customer two = new Customer("Bob", 33.14 );

        VendingMachine machine1 = new VendingMachine("Food");
        VendingMachine machine2 = new VendingMachine("Drink");
        VendingMachine machine3 = new VendingMachine("Office");

        Snack snack1 = new Snack("Chips", 36, 1.75, machine1.getId());
        Snack snack2 =new Snack("Chocolate", 36, 1.00, machine1.getId());
        Snack snack3 = new Snack("Pretzel", 30, 2.00, machine1.getId());

        Snack drink1= new Snack("Soda", 24, 2.50, machine2.getId());
        Snack drink2 = new Snack("Water", 20, 2.75, machine2.getId());

        //processing

        System.out.println("Welcome to my app");

        System.out.println("Jane buys three sodas");
        one.buySnack(drink1, 3);

        System.out.println("Jane has " + one.getCashOnHand());
        System.out.println("There are " + drink1.getQuantity() + " sodas left.");

        System.out.println("\n Jane buys a bag of pretzels");
        one.buySnack(snack3, 1);
        System.out.println("Jane has " + one.getCashOnHand());
        System.out.println("There are " + snack3.getQuantity() + " pretzels left.");

        System.out.println("\n Bob buys two sodas");
        two.buySnack(drink1, 2);
        System.out.println("Bob has " + two.getCashOnHand());
        System.out.println("There are " + drink1.getQuantity() + " sodas left.");

        System.out.println("\n Jane finds $10");
        one.addTotal(10);
        System.out.println("Jane has " + one.getCashOnHand());

        System.out.println("\n Jane buys two chocolate bars");
        one.buySnack(snack2, 2);
        System.out.println("Jane has " + one.getCashOnHand());
        System.out.println("There are " + snack2.getQuantity() + " Chocolate bars left.");

        System.out.println("\n Pretzels restocked");
        snack3.addSnack(12);
        System.out.println("Quantity of  " + snack3.getQuantity() + " Pretzels left.");

        System.out.println("\n Bob buys three bags of pretzels");
        two.buySnack(snack3, 3);
        System.out.println("Bob has " + two.getCashOnHand());
        System.out.println("There are " + snack2.getQuantity() + " pretzels left.");

    }
    public static void main(String[] args)
    {
       snackBar(); 
    }
}

