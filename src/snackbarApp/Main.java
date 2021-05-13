package snackbarApp;

public class Main {

    public static void main(String[] args) {
        workWithData();
    }

    private static void workWithData() {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, 1);
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);

        Snack soda = new Snack("Soda", 24, 2.50, 2);
        Snack water = new Snack("Water", 20, 2.75, 2);

        jane.buySnacks(soda.getTotalCost(3));
        System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
        System.out.println("Quantity of soda is " + soda.getQuantity());

        jane.buySnacks(pretzel.getTotalCost(1));
        System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
        System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

        bob.buySnacks(soda.getTotalCost(2));
        System.out.println("Bob's cash on hand is " + bob.getCashOnHand());
        System.out.println("Quantity of soda is " + soda.getQuantity());

        jane.addCashOnHand(10.00);
        System.out.println("Jane's cash on hand is " + jane.getCashOnHand());

        jane.buySnacks(chocolateBar.getTotalCost(1));
        System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
        System.out.println("Quantity of choco bar is " + chocolateBar.getQuantity());

        pretzel.addQuantity(12);
        System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

        bob.buySnacks(pretzel.getTotalCost(3));
        System.out.println("bob's cash on hand is " + bob.getCashOnHand());
        System.out.println("Quantity of pretzel is " + pretzel.getQuantity());
    }
}