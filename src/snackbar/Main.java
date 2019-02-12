package snackbar;

class Main {
    private static void doTheThing(){
//        Instantiate 2 customers
//        Jane with $45.25
        Customer Jane = new Customer("Jane", 45.25);
//        Bob with $33.14
        Customer Bob = new Customer("Bob", 33.14);
//        Instantiate 3 Vending Machines
//        Food
        VendingMachine Food = new VendingMachine("Food");
//        Drink
        VendingMachine Drink = new VendingMachine("Drink");
//        Office
        VendingMachine Office = new VendingMachine("Office");
//        Instantiate 5 snacks
//        In Vending Machine Food
//        36 Chips at $1.75
        Snack Chips = new Snack("Chips", 36, 1.75, Food.getId());
//        36 Chocolate Bar at $1.00
        Snack ChocolateBar = new Snack("Chocolate Bar", 36, 1.00, Food.getId());
//        30 Pretzel at $2.00
        Snack Pretzel = new Snack("Pretzel", 30, 2.00, Food.getId());
//        In Vending Machine Drink
//        24 Soda at $2.50
        Snack Soda = new Snack("Soda", 24, 2.50, Drink.getId());
//        20 Water at $2.75
        Snack Water = new Snack("Water", 20, 2.75, Drink.getId());


//        Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        Jane.buySnack(Soda.getCost(3));
        Soda.buySnacks(3);
        System.out.println("Customer 1 bought 3 of snack 4");
        System.out.println("Customer 1 Cash on hand: " + Jane.getCashOnHand());
        System.out.println("Snack 4 quantity: " + Soda.getQuantity());

//        Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        Jane.buySnack(Pretzel.getCost(1));
        Pretzel.buySnacks(1);
        System.out.println("Customer 1 bought 1 of snack 3");
        System.out.println("Customer 1 Cash on hand: " + Jane.getCashOnHand());
        System.out.println("Snack 3 quantity: " + Pretzel.getQuantity());

//        Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        Bob.buySnack(Soda.getCost(2));
        Soda.buySnacks(2);
        System.out.println("Customer 2 bought 2 of snack 4");
        System.out.println("Customer 2 Cash on hand: " + Bob.getCashOnHand());
        System.out.println("Snack 4 quantity: " + Soda.getQuantity());

//        Customer 1 finds $10. Print Customer 1 Cash on Hand.
        Jane.addCashOnHand(10.00);
        System.out.println("Customer 1 found money on the floor!");
        System.out.println("Customer 1 Cash on hand: " + Jane.getCashOnHand());

//        Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        Jane.buySnack(ChocolateBar.getCost(2));
        ChocolateBar.buySnacks(2);
        System.out.println("Customer 1 bought 1 of snack 2");
        System.out.println("Customer 1 Cash on hand: " + Jane.getCashOnHand());
        System.out.println("Snack 2 quantity: " + ChocolateBar.getQuantity());

//        Snack 3 gets 12 more. Print quantity of snack 3.
        Pretzel.addQuantity(12);
        System.out.println("Snack 3 had snacks added!");
        System.out.println("Snack 3 quantity: " + Pretzel.getQuantity());

//        Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
        Bob.buySnack(Pretzel.getCost(3));
        Pretzel.buySnacks(3);
        System.out.println("Customer 2 bought 3 of snack 3");
        System.out.println("Customer 2 Cash on hand: " + Bob.getCashOnHand());
        System.out.println("Snack 3 quantity: " + Pretzel.getQuantity());

    }
    public static void main(String[] args){
        doTheThing();
    }
}