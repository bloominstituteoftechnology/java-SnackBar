package snackApp;

public class Main
{
    private static void snackEvents()
    {
        System.out.println("Howdy!");

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

    }

    public static void main(String[] args)
    {
        snackEvents();
    }
}