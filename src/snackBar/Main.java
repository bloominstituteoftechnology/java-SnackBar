package snackBar;

public class Main {
    private static void initializeData() {
        System.out.println("Initializing App");
    }

    private static void data() {
        // instantiate customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // instantiate vending machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // instantiate snacks
        Snack chips = new Snack("Chips", 36 ,1.75, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        // subtract the cost of Soda * three with with jane initial's money on hand
        jane.setCash(jane.getCash() - soda.getCost() * 3);
        // print our the jane's money on hand
        System.out.println(jane.getName() + " " + "cash on hand" + " " + jane.getCash());
        // subtract three from soda
        soda.setQuantity(soda.getQuantity() - 3);
        // print out the quantity of sodas left
        System.out.println("Quantity of" + " " + soda.getName() + " " + "is" + " " + soda.getQuantity());

        // subtract the cost of pretzel * 1 with with jane initial's money on hand
        jane.setCash(jane.getCash() - pretzel.getCost());
        // print our the jane's money on hand
        System.out.println(jane.getName() + " " + "cash on hand" + " " + jane.getCash());
        pretzel.setQuantity(pretzel.getQuantity() - 1);
        System.out.println("Quantity of" + " " + pretzel.getName() + " " + "is" + " " + pretzel.getQuantity());

        bob.setCash(bob.getCash() - soda.getCost() * 2);
        System.out.println(bob.getName() + " " + "cash on hand" + " " + bob.getCash());
        soda.setQuantity(soda.getQuantity() - 2);
        System.out.println("Quantity of" + " " + soda.getName() + " " + "is" + " " + soda.getQuantity());

        jane.setCash(jane.getCash() + 10);
        System.out.println(jane.getName() + " " + "cash on hand" + " " + jane.getCash());

        jane.setCash(jane.getCash() - chocolate.getCost());
        System.out.println(jane.getName() + " " + "cash on hand" + " " + jane.getCash());
        chocolate.setQuantity(chocolate.getQuantity() - 1);
        System.out.println("Quantity of" + " " + chocolate.getName() + " " + "is" + " " + chocolate.getQuantity());

        pretzel.setQuantity(pretzel.getQuantity() + 12);
        System.out.println("Quantity of" + " " + pretzel.getName() + " " + "is" + " " + pretzel.getQuantity());

        bob.setCash(bob.getCash() - pretzel.getCost() * 3);
        System.out.println(bob.getName() + " " + "cash on hand" + " " + bob.getCash());
        pretzel.setQuantity(pretzel.getQuantity() - 3);
        System.out.println("Quantity of" + " " + pretzel.getName() + " " + "is" + " " + pretzel.getQuantity());

    }

    public static void main(String[] args) {
        initializeData();
        data();
    }
}