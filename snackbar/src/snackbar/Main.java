package snackbar;

public class Main {
    private static void initializedApp() {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine vm1 = new VendingMachine("Food");
        VendingMAchine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, vm1.id);
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vm1.id);
        Snack s3 = new Snack("Pretzel", 30, 2.00, vm1.id);
        Snack s4  = new Snack ("Soda", 24, 2.50, vm2.id);
        Snack s5 = new Snack ("Water", 20, 2.75, vm2.id);

        c1.buy(s4.getCost(3));
        s4.buySnack(3);
        printDetails(c1, s4, 3);

        c1.buy(s3.getCost(1));
        s3.buySnack(1);
        printDetails(c1, s3, 1);

        c2.buy(s4.getCost(2));
        s4.buySnack(2);
        printDetails(c2, s4, 2);

        c1.addCash(10);
        System.out.println(c1.name + " found $10!");
        System.out.println(c1.name + " now has $" + c1.cash + "\n");

        c1.buy(s2.getCost(1));
        s2.buySnack(1);
        printDetails(c1, s2, 1);

        s3.addQuantity(12);
        System.out.println("12 " + s3.name + "s added!");
        System.out.println(s3.getQuantity() + " " + s3.name + "s remaining.\n");

        c2.buy(s3.getCost(3));
        s3.buySnack(3);
        printDetails(c2, s3, 3);
    }

    
    private static void printDetails(Customer c, Snack s, int q) {
        System.out.println(c.name + " bought " + q + " " + s.name + "s");
        System.out.println(c.name + " has $" + c.cash + " remaining.");
        System.out.println(s.getQuantity() + " " + s.name + "s remaining.\n");
    }

    public static void main(String[] args) {
        initializeApp();
    }
}