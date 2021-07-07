package javaSnackBar1;

public class Main
{
    public static void main(String[] args)
    {
                Customer cus1 = new Customer("Jane", 45.25);
                Customer cus2 = new Customer("Bob", 33.14);

                VendingMachine vm1 = new VendingMachine("Food");
                VendingMachine vm2 = new VendingMachine("Drink");
                VendingMachine vm3 = new VendingMachine("Office");

                // public Snack(String name, int quantity, double cost, int vendingMachineId)
                Snack snk1 = new Snack("Chips", 36, 1.75, vm1.getId());
                Snack snk2 = new Snack("Chocolate Bar", 36, 1.00, vm1.getId());
                Snack snk3 = new Snack("Pretzel", 30, 2.00, vm1.getId());

                Snack snk4 = new Snack("Soda", 24, 2.50, vm2.getId());
                Snack snk5 = new Snack("Water", 20, 2.75, vm2.getId());

                // System.out.println();
                cus1.buy(snk4.buySnack(3));
                System.out.println(cus1.getCash()); // should be 7.50
                System.out.println(snk4.getQuantity()); // should be 21
    }
}