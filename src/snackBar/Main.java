package snackBar;

public class Main {
    private static void initializeData() {
        System.out.println("Initializing App");
    }

    private static void data() {
        Customer customer1 = new Customer("Jane", 37.75);
        Customer customer2 = new Customer("Jane", 35.75);
        Customer customer3 = new Customer("Bob", 28.14);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
    }

    public static void main(String[] args) {
        initializeData();
        data();
    }
}