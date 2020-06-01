package snackBar;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        Vending v1 = new Vending("Food");
        Vending v2 = new Vending("Drink");
        Vending v3 = new Vending("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.id);
        Snack s2 = new Snack("Chocolate", 36, 1.00, v1.id);
        Snack s3 = new Snack("Pretzel", 39, 2.00, v1.id);
        Snack s4 = new Snack("Soda", 24, 2.50, v2.id);
        Snack s5 = new Snack("Water", 20, 2.75, v2.id);


        c1.buySnack(3, s4);
        System.out.println("****Processing 1****");
        System.out.println("Customer 1's cash on hand: " + c1.getCash());
        System.out.println("Quantity of snack 4 left: " + s4.getQuantity());

        c1.buySnack(1, s3);
        System.out.println("****Processing 2****");
        System.out.println("Customer 1's cash on hand: " + c1.getCash());
        System.out.println("Quantity of snack 3 left: " + s3.getQuantity());

        c2.buySnack(2, s4);
        System.out.println("****Processing 3****");
        System.out.println("Customer 2's cash on hand: " + c2.getCash());
        System.out.println("Quantity of snack 4 left: " + s4.getQuantity());

        c1.addCash(10);
        System.out.println("****Processing 4****");
        System.out.println("Customer 1's cash on hand: " + c1.getCash());

        c1.buySnack(1, s2);
        System.out.println("****Processing 5");
        System.out.println("Customer 1's cash on hand: " + c1.getCash());
        System.out.println("Quantity of snack 2 left: " + s2.getQuantity());

        s3.addQuantity(12);
        System.out.println("****Processing 6****");
        System.out.println("Quantity of snack 3 left: " + s3.getQuantity());

        c2.buySnack(3, s3);
        System.out.println("****Processing 7****");
        System.out.println("Customer 2's cash on hand: " + c2.getCash());
        System.out.println("Quantity of snack 3 left: " + s3.getQuantity());
    }
}