package snackBar;

public class Main {
    private static void initializeData() {
        System.out.println("Initializing App");
    }

    private static void data() {
        Customer customer1 = new Customer("Jane", 37.75);

        System.out.println(customer1);
    }

    public static void main(String[] args) {
        initializeData();
        data();
    }
}