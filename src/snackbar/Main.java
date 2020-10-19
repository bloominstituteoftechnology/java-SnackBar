package snackbar;

public class Main {
    public static void main(String args[])
    {
        Customer jane = new Customer( "Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, 1);
        Snack bar = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);

        Snack soda = new Snack("Soda", 24, 2.50, 2);
        Snack water = new Snack("Water", 20, 2.75, 2);

        jane.buySnacks(soda.getCost() * 4);
        soda.buySnack(4);
        System.out.println(jane.getName() + " has " + jane.getCash() + " cash left");
        System.out.println("there are " + soda.getQuantity() + " sodas left");

        jane.buySnacks(pretzel.getCost());
        pretzel.buySnack(1);
        System.out.println(jane.getName() + " has " + jane.getCash() + " cash left");
        System.out.println("there are " + pretzel.getQuantity() + " pretzels left");

        bob.buySnacks(soda.getCost() * 2);
        soda.buySnack(2);
        System.out.println(bob.getName() + " has " + bob.getCash() + " cash left");
        System.out.println("there are " + soda.getQuantity() + " sodas left");

        jane.addCash(10.00);
        System.out.println(jane.getName() + " found 10.00 and now has " + jane.getCash());

        jane.buySnacks(bar.getCost() * 2);
        bar.buySnack(2);
        System.out.println(jane.getName() + " has " + jane.getCash() + " cash left");
        System.out.println("there are " + bar.getQuantity() + " Chocolate Bars left");

        pretzel.addQuantity(12);
        System.out.println("there are " + pretzel.getQuantity() + " pretzels left");

        bob.buySnacks(pretzel.getCost() * 3);
        pretzel.buySnack(3);
        System.out.println(bob.getName() + " has " + bob.getCash()  + " cash left");
        System.out.println("there are " + pretzel.getQuantity() + " pretzels left");
        
        chips.getQuantity();
        water.getCost();
        food.getId();
        drink.getId();
        office.getName();

    }
}
