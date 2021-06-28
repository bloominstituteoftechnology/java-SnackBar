package snackBar;

public class Main
{
    public static void workWithData()
    {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food Vending Machine");
        VendingMachine v2 = new VendingMachine("Drink Vending Machine");
        VendingMachine v3 = new VendingMachine("Office Vending Machine");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2, v1.getId());

        Snack s4 = new Snack("Soda", 36, 1.75, v2.getId());
        Snack s5 = new Snack("Water", 36, 1.75, v2.getId());

        System.out.println("*** Query Data***");
        
        // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        c1.moneySpent(s4.getCost() * 3);
        s4.snacksDeduct(3);
        System.out.println(c1.getName() + " has " + "$" + c1.getWallet() + " left. " + "There are " + s4.getQuantity() + " " + s4.getName() + "s left.");

        // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        c1.moneySpent(s3.getCost() * 1);
        s3.snacksDeduct(1);
        System.out.println(c1.getName() + " has " + "$" + c1.getWallet() + " left. " + "There are " + s3.getQuantity() + " " + s3.getName() + "s left.");

        // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        c2.moneySpent(s4.getCost() * 2);
        s4.snacksDeduct(2);
        System.out.println(c2.getName() + " has " + "$" + c2.getWallet() + " left. " + "There are " + s4.getQuantity() + " " + s4.getName() + "s left." );

        // Customer 1 finds $10. Print Customer 1 Cash on Hand.
        c1.moneyAdd(10);
        System.out.println(c1.getName() + " finds $10, and now has $" + c1.getWallet() + " left.");

        // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        c1.moneySpent(s2.getCost() * 1);
        s2.snacksDeduct(1);
        System.out.println(c1.getName() + " has " + "$" + c1.getWallet() + " left. " + "There are " + s2.getQuantity() + " " + s2.getName() + "s left.");

        // Add 12 more items to snack 3. Print quantity of snack 3.
        s3.snacksAdd(12);
        System.out.println("12 more " + s3.getName() + " have been added. There are now " + s3.getQuantity() + " " + s3.getName() + "s left.");

        // Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
        c2.moneySpent(s3.getCost() * 3);
        s3.snacksDeduct(3);
        System.out.println(c2.getName() + " has $" + c2.getWallet() + " left. " + "There are " + s3.getQuantity() + " " + s3.getName() + "s left.");

        /* Stretch Goals: Display each snack with
            * Name
            * Vending Machine Name
            * Quantity on hand
            * Total cost of all of the quantities of this snack on hand */
        
        // System.out.println(s1.getName() + " is in " + v1.getName() + ". "
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}