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


        System.out.println(jane.getName() + " " + "cash on hand" + " " + jane.getCash());
        System.out.println("Quantity of" + " " + soda.getName() + " " + "is" + " " + soda.getQuantity());
        System.out.println(bob.getName() + " " + "cash on hand" + " " + bob.getCash());
        System.out.println("Quantity of" + " " + pretzel.getName() + " " + "is" + " " + pretzel.getQuantity());
    }

    public static void main(String[] args) {
        initializeData();
        data();
    }
}