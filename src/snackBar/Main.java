package snackBar;

public class Main {
    public static void main(String[] args) {
        // set up two customers
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        // set up 3 VendingMachines
        VendingMachines v1 = new VendingMachines("Food");
        VendingMachines v2 = new VendingMachines("Drink");
        VendingMachines v3 = new VendingMachines("Office");

        // set up 5 snacks
        Snacks s1 = new Snacks(v1.getId(), "Chips", 1.75, 36);
        Snacks s2 = new Snacks(v1.getId(), "Chocolate Bar", 1.00, 36);
        Snacks s3 = new Snacks(v1.getId(), "Pretzel", 2.00, 30);

        Snacks s4 = new Snacks(v2.getId(), "Soda", 2.50, 24);
        Snacks s5 = new Snacks(v2.getId(), "Water", 2.75, 20);

        // Customer 1 buys 3 of snack 4 (hint: figure out cost of 3 snack 4s - Customer
        // 1 spends that amount, Snack 4 loses 3 quantity).
        // Print Customer 1 Cash on hand. Print quantity of snack 4.
        c1.buy(s4.getTotalCost(3));
        s4.buySnack(3);
        System.out.println("Customer 1 cash on hand " + c1.getCash());
        System.out.println("Quantity of snack 4 is  " + s4.getQuantity());
        System.out.println();

        // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity
        // of snack 3.
        c1.buy(s3.getTotalCost(1));
        s3.buySnack(1);
        System.out.println("Customer 1 cash on hand " + c1.getCash());
        System.out.println("Quanity of snack 3 is " + s3.getQuantity());
        System.out.println();

        // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity
        // of snack 4.
        c2.buy(s4.getTotalCost(2));
        s4.buySnack(2);
        System.out.println("Customer 2 cash on hand " + c2.getCash());
        System.out.println("Quantity of snack 4 is " + s4.getQuantity());
        System.out.println();

        // Customer 1 finds $10. Print Customer 1 Cash on Hand.
        c1.addCash(10.00);
        System.out.println("Customer 1 cash on hand " + c1.getCash());
        System.out.println();

        // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity
        // of snack 2.
        c1.buy(s2.getTotalCost(1));
        s2.buySnack(1);
        System.out.println("Customer 1 cash on hand " + c1.getCash());
        System.out.println("Quantity of snack 2 is " + s2.getQuantity());
        System.out.println();

        // Snack 3 gets 12 more. Print quantity of snack 3.
        s3.addQuantity(12);
        System.out.println("Quantity of snack 3 is " + s3.getQuantity());
        System.out.println();

        // Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity
        // of snack 3.
        c2.buy(s3.getTotalCost(3));
        s3.buySnack(3);
        System.out.println("customer 2 cash on hand " + c2.getCash());
        System.out.println("Quantity of snack 3 is " + s3.getQuantity());
        System.out.println();

        // Stretch Goals
        System.out.println("Stretch Goals\n");

        System.out.println("Snack: " + s1.getName());
        System.out.println("Vending Machine: " + v1.getName());
        System.out.println("Quantity: " + s1.getQuantity());
        System.out.println("Total Cost: " + s1.getTotalCost(s1.getQuantity()));
        System.out.println();

        System.out.println("Snack: " + s2.getName());
        System.out.println("Vending Machine: " + v1.getName());
        System.out.println("Quantity: " + s2.getQuantity());
        System.out.println("Total Cost: " + s2.getTotalCost(s2.getQuantity()));
        System.out.println();

        System.out.println("Snack: " + s3.getName());
        System.out.println("Vending Machine: " + v1.getName());
        System.out.println("Quantity: " + s3.getQuantity());
        System.out.println("Total Cost: " + s3.getTotalCost(s3.getQuantity()));
        System.out.println();

        System.out.println("Snack: " + s4.getName());
        System.out.println("Vending Machine: " + v2.getName());
        System.out.println("Quantity: " + s4.getQuantity());
        System.out.println("Total Cost: " + s4.getTotalCost(s4.getQuantity()));
        System.out.println();

        System.out.println("Snack: " + s5.getName());
        System.out.println("Vending Machine: " + v2.getName());
        System.out.println("Quantity: " + s5.getQuantity());
        System.out.println("Total Cost: " + s5.getTotalCost(s5.getQuantity()));
        System.out.println();
    }
}