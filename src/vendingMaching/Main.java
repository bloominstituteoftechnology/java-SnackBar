package vendingMaching;

public class Main {
    public static void main(String[] args){
        workWithData();
    }

    private static void workWithData() {

        Customer Jane = new Customer("Jane", 45.25);
        Customer Bob = new Customer("Bob", 33.14);
        
        VendingMachine Food = new VendingMachine("Food");
        VendingMachine Drink = new VendingMachine("Drink");
        VendingMachine Office = new VendingMachine("Office");

        Snack Chips = new Snack("Chips", 36, 1.75, 1);
        Snack Chocolate = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack Pretzel = new Snack("Pretzel", 30, 2.00, 1);

        Snack Soda = new Snack("Soda", 24, 2.50, 2);
        Snack Water = new Snack("Water", 20, 2.75, 2);

        Jane.buySnacks(7.50);
        System.out.println("Janes Cash on hand is: " + Jane.getCash());

        Soda.buysnack(3);
        System.out.println("Quantity of Soda is " + Soda.getQuantity());

        Jane.buySnacks(2);
        System.out.println("Janes Cash on hand is: " + Jane.getCash());

        Pretzel.buysnack(1);

        Bob.buySnacks(5);
        System.out.println("Bob's Cash on hand is: " + Bob.getCash());
        System.out.println("Quantity of Soda is: " + Soda.getQuantity());

        Jane.addCash(10);
        System.out.println("Janes cash on hand is" + Jane.getCash());
        Chocolate.buysnack(1);
        Jane.buySnacks(1);
        System.out.println("Quantity of " + Chocolate.getName() + " is " + Chocolate.getQuantity());

        Pretzel.additems(12);

        Bob.buySnacks(6);
        System.out.println("Bob has " +Bob.getCash());
        Pretzel.buysnack(3);
        System.out.println(Pretzel.getQuantity());

        // Snack kitkatSnack = new Snack("KitKat", 32, 2.99, 1);
        
        // kitkatSnack.additems(2);
        // kitkatSnack.buysnack(3);
        // kitkatSnack.totalcost(5);
    }

}
