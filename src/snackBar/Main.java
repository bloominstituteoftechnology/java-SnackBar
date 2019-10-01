package snackBar;

import snackBar.Snack;
import snackBar.VendingMachine;

public class Main
{
    public static void main(String[] args)
    {
        //the things you want to happen should happen in here
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("chocolate bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("pretzel", 30, 2.00, food.getId());

        Snack soda = new Snack("soda", 24, 2.50, drink.getId());
        Snack water = new Snack("water", 20, 2.75, drink.getId());
     
     
        System.out.println("*** NUMBER 1 ***");

        double janeCash = jane.getCash();
        int snacksLeft = soda.subQuantity(4);
        double cashSpent = 4* soda.getCost();
        System.out.println("Jane's Starting Cash: ");
        System.out.println(janeCash);
        System.out.println("Snack Cost: ");
        System.out.println(cashSpent);
        System.out.println("Snacks left: ");
        System.out.println(snacksLeft);
        double newBalance = ((double)janeCash - (double)cashSpent);
        System.out.println(newBalance);

        System.out.println("*** NUMBER 2 ***");

        double cashSpent2 = 1* pretzel.getCost();
        int snacksLeft2 = pretzel.subQuantity(1);
        System.out.println("New Balance" + (newBalance - cashSpent2));
        System.out.println("New Snack Amount" + (snacksLeft2));

        System.out.println("*** NUMBER 3 ***");

        double cashSpent3 = 2* soda.getCost();
        double bobsNewBalance = (bob.getCash()-cashSpent3);
        System.out.println("Bob's New Balance: " + bobsNewBalance);
        System.out.println("New Snack Amount" + soda.subQuantity(2));

        System.out.println("*** NUMBER 4 ***");
        double janeCash10 = jane.addCash(10.00, jane.getCash());
        System.out.println("Jane finds $10!" + janeCash10);

        System.out.println("*** NUMBER 5 ***");
        System.out.println("Jane buys 1 chocolate bar :" + (janeCash10 - (1* chocolateBar.getCost())));
        System.out.println("Choc balance " + chocolateBar.subQuantity(1));

        System.out.println("Adding 12 snacks to pretzel: " + pretzel.addQuantity(12));
        System.out.println("***Number 7***");
        System.out.println("Bob's new balance after 3 pretzels: " + (bobsNewBalance - (3* pretzel.getCost())));
        System.out.println("Pretzel Balance: " + (snacksLeft2 - pretzel.subQuantity(3)));  
    }
}