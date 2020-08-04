package snackBar;


public class Main
{
    private static void workWithData()
    {

        // INSTANTIATIONS
        Customer cust1 = new Customer("Jane", 45.25);
        Customer cust2 = new Customer("Bob", 33.14);

        VendingMachine vM1 = new VendingMachine("Food");
        VendingMachine vM2 = new VendingMachine("Drink");
        VendingMachine vM3 = new VendingMachine("Office");

        Snack snack1 = new Snack("Chips", 36, 1.75, vM1.getId());
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, vM1.getId());
        Snack snack3 = new Snack("Pretzel", 30, 2.00, vM1.getId());
        Snack snack4 = new Snack("Soda", 24, 2.50, vM2.getId());
        Snack snack5 = new Snack("Water", 20, 2.75, vM2.getId());


        // PROCESSING
        System.out.println("Customer 1 Cash on hand: " + cust1.buySnacks(snack4.totalCost(3.00)));
        snack4.buySnack(3);
        System.out.println("Quantity of Snack4 (Soda) is: " + snack4.getQuantity());

        System.out.println("Customer 1 Cash on hand: " + cust1.buySnacks(snack3.totalCost(1)));
        snack3.buySnack(1);
        System.out.println("Quantity of Snack3 (Pretzel) is: " + snack3.getQuantity());

        System.out.println("Customer 2 Cash on hand: " + cust2.buySnacks(snack4.totalCost(2)));
        snack4.buySnack(2);
        System.out.println("Quantity of Snack4 (Soda) is: " + snack4.getQuantity());

        System.out.println("Customer 1 Cash on hand: " + cust1.addCash(10));

        System.out.println("Customer 1 Cash on hand" + cust1.buySnacks(snack2.totalCost(1)));
        snack2.buySnack(1);
        System.out.println("Quantity of Snack 2 (Chocolate Bar) is:" + snack2.getQuantity());

        snack3.addQuantity(12);
        System.out.println("Quantity of Snack 3 (Pretzel) is:" + snack3.getQuantity());

        System.out.println("Customer 2 Cash on hand is :" + cust2.buySnacks(snack3.totalCost(3)));
        snack3.buySnack(3);
        System.out.println("Quantity of Snack 3 is :" + snack3.getQuantity());
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}