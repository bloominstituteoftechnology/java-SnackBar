package snackApp;

public class Main
{
    private static void snackEvents()
    {

        // Instantiate objects
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);
        Machine m1 = new Machine("Food");
        Machine m2 = new Machine("Drink");
        Machine m3 = new Machine("Office");
        Snack s1 = new Snack("Chips", 36, 1.75, m1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, m1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, m1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, m2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, m2.getId());


        //Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        c1.buyStuff(s4.getMultiCost(3));
        s4.buySnack(3);
        System.out.println(c1.getName() + " has $" + c1.getCashOnHand() + " left.");
        System.out.println(s4.getQuantity() + " " + s4.getName() + " remain in the machine.");
        //Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        c1.buyStuff(s3.getMultiCost(1));
        s3.buySnack(1);
        System.out.println(c1.getName() + " has $" + c1.getCashOnHand() + " left.");
        System.out.println(s3.getQuantity() + " " + s3.getName() + " remain in the machine.");
        //Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        c2.buyStuff(s4.getMultiCost(2));
        s4.buySnack(2);
        System.out.println(c2.getName() + " has $" + c2.getCashOnHand() + " left.");
        System.out.println(s4.getQuantity() + " " + s4.getName() + " remain in the machine.");
        //Customer 1 finds $10. Print Customer 1 Cash on Hand.
        c1.addCash(10.00);
        System.out.println(c1.getName() + " now has $" + c1.getCashOnHand() + "!"); 
        //Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        c1.buyStuff(s2.getMultiCost(1));
        s2.buySnack(1);
        System.out.println(c1.getName() + " has $" + c1.getCashOnHand() + " left.");
        System.out.println(s2.getQuantity() + " " + s2.getName() + " remain in the machine.");
        //Snack 3 gets 12 more. Print quantity of snack 3.
        s3.addQuantity(12);
        System.out.println("The machine's supply of " + s3.getName() + " is now " + s3.getQuantity());
        //Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
        c2.buyStuff(s3.getMultiCost(3));
        s3.buySnack(3);
        System.out.println(c2.getName() + " has $" + c2.getCashOnHand() + " left.");
        System.out.println(s3.getQuantity() + " " + s3.getName() + " remain in the machine.");


    }

    public static void main(String[] args)
    {
        snackEvents();
    }
}