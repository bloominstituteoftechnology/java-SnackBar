package snackbar;

public class Main {
    private static void workWithData() {
        Customer customer1 = new Customer("Jane", 45.25);
        Customer customer2 = new Customer("Bob", 33.14);

        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("Office");

        Snack snack1 = new Snack("Chips", 1.75);
        Snack snack2 = new Snack("Chocolate Bar", 1.00);
        Snack snack3 = new Snack("Pretzel", 2.00);
        Snack snack4 = new Snack("Soda", 2.50);
        Snack snack5 = new Snack("Water", 2.75);

        vm1.stockItem(snack1, 36);
        vm1.stockItem(snack2, 36);
        vm1.stockItem(snack3, 30);
        vm2.stockItem(snack4, 24);
        vm2.stockItem(snack5, 20);

        System.out.println("Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.");
        snack4.buySnack(customer1, vm2, 4);
        System.out.println("Snack 4: " + vm2.getItemStock(snack4) + '\n');

        System.out.println("Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.");
        snack3.buySnack(customer1, vm1, 1);
        System.out.println("Snack 3: " + vm1.getItemStock(snack3) + '\n');

        System.out.println("Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.");
        snack4.buySnack(customer2, vm2, 2);
        System.out.println("Snack 4: " + vm2.getItemStock(snack4) + '\n');

        System.out.println("Customer 1 finds $10. Print Customer 1 Cash on Hand.");
        customer1.addCash(10);
        System.out.println("Customer 1 cash: " + customer1.getCash() + '\n');

        System.out.println("Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.");
        snack2.buySnack(customer1, vm1, 1);
        System.out.println("Customer 1 cash: " + customer1.getCash() + "  |  Snack 2: " + vm1.getItemStock(snack2) + '\n');

        System.out.println("Snack 3 gets 12 more. Print quantity of snack 3.");
        vm1.stockItem(snack3, 12);
        System.out.println("Snack 3: " + vm1.getItemStock(snack3) + '\n');

        System.out.println("Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.");
        snack3.buySnack(customer2, vm1, 3);
        System.out.println("Customer 2 cash: " + customer2.getCash() + "  |  Snack 3: " + vm1.getItemStock(snack3) + '\n');
    }

    public static void main(String[] args) {
        workWithData();
    }
}