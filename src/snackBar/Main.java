package snackBar;

public class Main {

    public static void workWithData() {
        // Vending machines
        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        // Customers
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        // Snacks
        Snack s1 = new Snack("Chips", 36, 1.75, 1);
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack s3 = new Snack("Pretzel", 36, 2.00, 1);
        Snack s4 = new Snack("Soda", 36, 2.50, 2);
        Snack s5 = new Snack("Water", 36, 2.75, 2);

        System.out.println("\n=========================\n First Set of Processing \n=========================\n");
        System.out.println(c1.buy(s4.buySnack(3)));
        System.out.println(c1.getCashOnHand());
        System.out.println(s4.getQuantity());

        System.out.println("\n==========================\n Second Set of Processing \n==========================\n");
        System.out.println(c1.buy(s3.buySnack(1)));
        System.out.println(c1.getCashOnHand());
        System.out.println(s3.getQuantity());

        System.out.println("\n=========================\n Third Set of Processing \n=========================\n");
        System.out.println(c2.buy(s4.buySnack(4)));
        System.out.println(c2.getCashOnHand());
        System.out.println(s4.getQuantity());

        System.out.println("\n==========================\n Fourth Set of Processing \n==========================\n");
        System.out.println(c1.addCash(4));
        System.out.println(c2.getCashOnHand());

        System.out.println("\n=========================\n Fifth Set of Processing \n=========================\n");
        System.out.println(c1.buy(s2.buySnack(1)));
        System.out.println(c1.getCashOnHand());
        System.out.println(s2.getQuantity());

        System.out.println("\n=========================\n Sixth Set of Processing \n=========================\n");
        System.out.println(s3.addQuantity(12));
        System.out.println(s3.getQuantity());

        System.out.println("\n===========================\n Seventh Set of Processing \n===========================\n");
        System.out.println(c2.buy(s3.buySnack(3)));
        System.out.println(c2.getCashOnHand());
        System.out.println(s3.getQuantity());

        System.out.println("\n=========\n Stretch \n=========\n");
        System.out.println(s1.toString(v1.getName()));
        System.out.println(s2.toString(v1.getName()));
        System.out.println(s3.toString(v1.getName()));
        System.out.println(s4.toString(v2.getName()));
        System.out.println(s5.toString(v2.getName()));
    }

    public static void main(String[] args) {
        workWithData();
    }

}