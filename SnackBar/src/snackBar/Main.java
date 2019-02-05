package snackBar;

public class Main {
    private static void snackBar() {
        // Instantiate 2 customers
        
        //i. Jane with $45.25
        // ii. Bob with $33.14

        Customers Jane = new Customers("Jane", 45.25);
        Customers Bob = new Customers("Bob", 33.14);

        // Instantiate 3 Vending Machines
        
        // i. Food
        // ii. Drink
        // iii. Office

        VendingMachines Food = new VendingMachines("Food");
        VendingMachines Drink = new VendingMachines("Drink");
        VendingMachines Office = new VendingMachines("Office");

        // Instantiate 5 snacks
        
        // In Vending Machine Food
        
        // i. 36 Chips at $1.75
        // ii. 36 Chocolate Bar at $1.00
        // iii. 30 Pretzel at $2.00
        
        // In Vending Machine Drink
        
        // i. 24 Soda at $2.50
        // ii. 20 Water at $2.75

        Snacks Chips = new Snacks("Chips", 36, 1.75, Food.getId());
        Snacks ChocolateBar = new Snacks("Chocolate Bar", 36, 1.00, Food.getId());
        Snacks Pretzel = new Snacks("Pretzel", 30, 2.00, Food.getId());
        Snacks Soda = new Snacks("Soda", 24, 2.50, Drink.getId());
        Snacks Water = new Snacks("Water", 20, 2.75, Drink.getId());
        
        // Customer 1 buys 3 of snack 4.
        System.out.println(Jane.purchase(Soda, 4));

        // Print Customer 1 Cash on hand.
        System.out.println("Jane has $" + Jane.getCash() + ".");

        // Print quantity of snack 4.
        System.out.println("There are " + Soda.getQuantity() + " " +  Soda.getName() + ".");
        
        // Customer 1 buys 1 of snack 3.
        System.out.println(Jane.purchase(Pretzel, 1));

        // Print Customer 1 Cash on hand.
        System.out.println("Jane has $" + Jane.getCash() + ".");

        // Print quantity of snack 3.
        System.out.println("There are " + Pretzel.getQuantity() + " " +  Pretzel.getName() + ".");
        
        // Customer 2 buys 2 of snack 4.
        System.out.println(Bob.purchase(Soda, 2));

        // Print Customer 2 Cash on Hand.
        System.out.println("Bob has $" + Bob.getCash() + ".");

        // Print quantity of snack 4.
        System.out.println("There are " + Soda.getQuantity() + " " +  Soda.getName() + ".");

        // Customer 1 finds $10.
        Jane.addCash(10);

        // Print Customer 1 Cash on Hand.
        System.out.println("Jane has $" + Jane.getCash() + ".");
        
        // Customer 1 buys 1 of snack 2.
        System.out.println(Jane.purchase(ChocolateBar, 1));

        // Print Customer 1 Cash on Hand.
        System.out.println("Jane has $" + Jane.getCash() + ".");
        
        // Print quantity of snack 2.
        System.out.println("There are " + ChocolateBar.getQuantity() + " " +  ChocolateBar.getName() + ".");

        // Snack 3 gets 12 more.
        Pretzel.addQuantity(12);

        // Print quantity of snack 3.
        System.out.println("There are " + Pretzel.getQuantity() + " " +  Pretzel.getName() + ".");

        // Customer 2 buys 3 of snack 3.
        System.out.println(Bob.purchase(Pretzel, 3));

        // Print Customer 2 Cash on hand.
        System.out.println("Bob has $" + Bob.getCash() + ".");

        // Print quantity of snack 3.
        System.out.println("There are " + Pretzel.getQuantity() + " " +  Pretzel.getName() + ".");
    }

    public static void main(String[] args) {
        snackBar();
    }
}



