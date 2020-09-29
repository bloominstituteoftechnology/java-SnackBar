package snackBar;

public class Main 
{
    private static void openSnackBar()
    {
        // Instantiate 2 customers
        // Jane with $45.25 & Bob with $33.14
        Customer c1 = new Customer("Jane", 45.25); // name, cashOnHand
        Customer c2 = new Customer("Bob", 33.14); // name, cashOnHand

        // Instantiate 3 Vending Machines
        // Food, Drink & Office
        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("Office");
        
        // Instantiate 5 snacks in Vending Machine Food
        // SNACK 1 = 36 Chips at $1.75
        Snack s1 = new Snack("Chips", 36, 1.75, vm1.getId());
        // SNACK 2 = 36 Chocolate Bar at $1.00
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vm1.getId());
        // SNACK 3 = 30 Pretzel at $2.00
        Snack s3 = new Snack("Pretzel", 30, 2.00, vm1.getId());

        // In Vending Machine Drink
        // SNACK 4 = 24 Soda at $2.50
        Snack s4 = new Snack("Soda", 24, 2.50, vm2.getId());
        // SNACK 5 = 20 Water at $2.75
        Snack s5 = new Snack("Water", 20, 2.75, vm2.getId());

        // Processing-------------------------------
        // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        c1.buySnack(3, s4);
        System.out.println("*** Customer 1 Jane Data ***");
        System.out.println("Jane's Cash on Hand: " + c1.getCash());
        System.out.println("Qty of Snack 4: " + s4.getQuantity());
        System.out.println("---------------------");

        // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        c1.buySnack(1, s3);
        System.out.println("*** Customer 1 Jane Data ***");
        System.out.println("Jane's Cash on Hand: " + c1.getCash());
        System.out.println("Qty of Snack 3: " + s3.getQuantity());
        System.out.println("---------------------");

        // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        c2.buySnack(2, s4);
        System.out.println("*** Customer 2 Bob Data ***");
        System.out.println("Bob's Cash on Hand: " + c2.getCash());
        System.out.println("Qty of Snack 4: " + s4.getQuantity());
        System.out.println("---------------------");

        // Customer 1 finds $10. Print Customer 1 Cash on Hand.
        c1.addCash(10.00);
        System.out.println("*** Customer 1 Data ***");
        System.out.println("Jane's Cash on Hand: " + c1.getCash());
        System.out.println("---------------------");

        // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        c1.buySnack(1, s2);
        System.out.println("*** Customer 1 Data ***");
        System.out.println("Customer 1's Cash on Hand: " + c1.getCash());
        System.out.println("Qty of Snack 2: " + s2.getQuantity());
        System.out.println("---------------------");

        // Snack 3 gets 12 more. Print quantity of snack 3.
        s3.addQuantity(12);
        System.out.println("*** Snack Data ***");
        System.out.println("Qty of Snack 3: " + s3.getQuantity());
        System.out.println("---------------------");

        // Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
        c2.buySnack(3, s3);
        System.out.println("*** Customer 2 Data ***");
        System.out.println("Bob's Cash on Hand: " + c2.getCash());
        System.out.println("Qty of Snack 3: " + s3.getQuantity());
        System.out.println("---------------------");
    }

    public static void main(String[] args)
    {
        openSnackBar();
    }
}