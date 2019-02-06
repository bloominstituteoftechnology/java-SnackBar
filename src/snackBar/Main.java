package snackBar;

public class Main {
    public static void main(String[] args) {
        Customer Jane = new Customer("Jane", 45.25);
        Customer Bob = new Customer("Bob", 33.14);

        Vending v1 = new Vending("Food");
        Vending v2 = new Vending("Drink");
        Vending v3 = new Vending("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.id);
        Snack s2 = new Snack("Chocolate", 36, 1.00, v1.id);
        Snack s3 = new Snack("Pretzel", 39, 2.00, v1.id);
        Snack s4 = new Snack("Soda", 24, 2.50, v2.id);
        Snack s5 = new Snack("Water", 20, 2.75, v2.id);

        System.out.println("Data Below");
        System.out.println()
    }
}