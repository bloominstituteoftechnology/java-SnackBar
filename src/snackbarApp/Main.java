package snackbarApp;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hi");
        workWithData();
    }

    public static void workWithData()
    {
        //create customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        System.out.println(jane.getName());

        //create vending machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        System.out.println(food.getId() + " " + food.getName());

        //food vending machine
        Snack chips = new Snack("Chips", 1.75, 1, 36);
        Snack chocolate = new Snack("Chocolate Bar", 1.00, 1, 36);
        Snack pretzel = new Snack("Pretzel", 2.00, 1, 30);

        //drink vending machine
        Snack soda = new Snack("Soda", 2.50, 2, 24);
        Snack water = new Snack("Water", 2.75, 2, 20);

        System.out.println(chips.getCost() + " " + chips.getName());

        //processing 
        System.out.println("\n****order 1*****\n");
        soda.buySnack(3);
        jane.removeCash(soda.getCost(3));
        System.out.println(jane.getName() + " bought 3 " + soda.getName() + "s at the cost of $" + soda.getCost(3));
        System.out.println("There are " + soda.getQuantity() + " Soda left");
        System.out.println("Jane has $" + jane.getCash() + " left in the bank");

        System.out.println("\n****order 2*****\n");
        pretzel.buySnack(1);
        jane.removeCash(pretzel.getCost(1));
        System.out.println(jane.getName() + " bought 1 " + pretzel.getName() + "s at the cost of $" + pretzel.getCost(1));
        System.out.println("There are " + pretzel.getQuantity() + " Pretzel left");
        System.out.println("Jane has $" + jane.getCash() + " left in the bank");

        System.out.println("\n****order 3*****\n");
        soda.buySnack(2);
        bob.removeCash(soda.getCost(2));
        System.out.println(bob.getName() + " bought 2 " + soda.getName() + "s at the cost of $" + soda.getCost(2));
        System.out.println("There are " + soda.getQuantity() + " Soda left");
        System.out.println("Bob has $" + bob.getCash() + " left in the bank");

        System.out.println("\n****event*****\n");
        jane.addCash(10);
        System.out.println("Jane just found $10");
        System.out.println("Jane has $" + jane.getCash() + " left in the bank");

        System.out.println("\n****order 4*****\n");
        chocolate.buySnack(1);
        jane.removeCash(chocolate.getCost(1));
        System.out.println(jane.getName() + " bought 1 " + chocolate.getName() + "s at the cost of $" + chocolate.getCost(2));
        System.out.println("There are " + chocolate.getQuantity() + " Chocolate left");
        System.out.println("Jane has $" + jane.getCash() + " left in the bank");

        System.out.println("\n****event*****\n");
        pretzel.addQuantity(12);
        System.out.println("12 Pretzels were added to Inventory");
        System.out.println("There are " + pretzel.getQuantity() + " pretzels in the machine");

        System.out.println("\n****order 5*****\n");
        pretzel.buySnack(3);
        bob.removeCash(pretzel.getCost(3));
        System.out.println(bob.getName() + " bought 3 " + pretzel.getName() + "s at the cost of $" + pretzel.getCost(3));
        System.out.println("There are " + pretzel.getQuantity() + " Pretzel left");
        System.out.println("Bob has $" + bob.getCash() + " left in the bank");

        //stretch tasks
        System.out.println("\n****inventory printout*****\n");
        System.out.println("name | machine | quantity | value");
        System.out.println(chips.getName() + " | " + food.getName() + " | " + chips.getQuantity() + " | " + chips.getCost(chips.getQuantity())); 
        System.out.println(chocolate.getName() + " | " + food.getName() + " | " + chocolate.getQuantity() + " | " + chocolate.getCost(chocolate.getQuantity())); 
        System.out.println(pretzel.getName() + " | " + food.getName() + " | " + pretzel.getQuantity() + " | " + pretzel.getCost(pretzel.getQuantity())); 
        System.out.println(soda.getName() + " | " + drink.getName() + " | " + soda.getQuantity() + " | " + soda.getCost(soda.getQuantity())); 
        System.out.println(water.getName() + " | " + drink.getName() + " | " + water.getQuantity() + " | " + water.getCost(water.getQuantity())); 
    }
}