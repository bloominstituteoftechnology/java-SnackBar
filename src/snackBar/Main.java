package snackBar;

public class Main {
    private static void insertMoney() {
        Customer customer1 = new Customer ("Jane", 45.25);
        Customer customer2 = new Customer ("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        customer1.buySnack(3, soda);
        System.out.println("Jane has $" + customer1.getCashOnHand() + " in cash");
        System.out.println("Sodas remaining: " + soda.getQuantity());
        System.out.println("##########################");

        customer1.buySnack(1, pretzel);
        System.out.println("Jane has $" + customer1.getCashOnHand() + " in cash");
        System.out.println("Pretzels remaining: " + pretzel.getQuantity());
        System.out.println("##########################");

        customer2.buySnack(2, soda);
        System.out.println("Bob has $" + customer2.getCashOnHand() + " in cash");
        System.out.println("Sodas remaining: " + soda.getQuantity());
        System.out.println("##########################");

        customer1.addCash(10.00);
        System.out.println("Jane has $" + customer1.getCashOnHand() + " in cash");
        System.out.println("##########################");

        customer1.buySnack(1, chocolate);
        System.out.println("Jane has $" + customer1.getCashOnHand() + " in cash");
        System.out.println("Chocolate Bars remaining: " + chocolate.getQuantity());
        System.out.println("##########################");

        pretzel.addQuantity(12);
        System.out.println("Pretzels remaining: " + pretzel.getQuantity());
        System.out.println("##########################");

        customer2.buySnack(3, pretzel);
        System.out.println("Bob has $" + customer2.getCashOnHand() + " in cash");
        System.out.println("Pretzels remaining: " + pretzel.getQuantity());
    }

     public static void main(String[] args)
    {
        insertMoney();
    }
}