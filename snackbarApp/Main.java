package snackbarApp;

public class Main {
    public static void main(String[] args) {
        workwithData();
    }
    private static void workwithData() {
        System.out.println();
        
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());      

        System.out.println("Customer Jane buys 3 Sodas");
        soda.buyQuantity(3);
        jane.buySnack(soda.buySnack(3));
        System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
        System.out.println("Quantity of soda is " + soda.getQuantity() + "\n");

        System.out.println("Jane buys 1 Pretzel");
        pretzel.buyQuantity(1);
        jane.buySnack(pretzel.buySnack(1));
        System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
        System.out.println("Quantity of pretzel is " + pretzel.getQuantity() + "\n");

        System.out.println("Bob buys 2 sodas");
        soda.buyQuantity(2);
        bob.buySnack(soda.buySnack(2));
        System.out.println("Bob's cash on hand is " + bob.getCashOnHand());
        System.out.println("Quantity of soda is " + soda.getQuantity() + "\n");
        
        System.out.println("Jane finds $10.00 and add's it to her cash on hand");
        jane.addCash(10.00);
        System.out.println("Jane's cash on hand is " + jane.getCashOnHand() + "\n");

        System.out.println("Jane buys 1 chocolate bar");
        chocolateBar.buyQuantity(1);
        jane.buySnack(chocolateBar.buySnack(1));
        System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
        System.out.println("Quantity of chocolate bar is " + chocolateBar.getQuantity() + "\n");

        System.out.println("Add 12 more pretzels");
        pretzel.addQuantity(12);
        System.out.println("Quantity of pretzel is " + pretzel.getQuantity() + "\n");

        System.out.println("Bob buys 3 pretzels");
        pretzel.buyQuantity(3);
        bob.buySnack(pretzel.buySnack(3));
        System.out.println("Bob's cash on hand is " + bob.getCashOnHand());
        System.out.println("Quantity of pretzel is " + pretzel.getQuantity() + "\n");
        
        System.out.println(chips.toString() + "\n");
        System.out.println(chocolateBar.toString() + "\n");
        System.out.println(pretzel.toString() + "\n");
        System.out.println(soda.toString() + "\n");
        System.out.println(water.toString() + "\n");
    }
    
}
