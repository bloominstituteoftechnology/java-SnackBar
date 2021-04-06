package Main;

public class Main {
    public static void main(String[] args) throws Exception {
        //Instantiating VendingMachine Objects
        VendingMachine food = new VendingMachine("food");
        VendingMachine drink = new VendingMachine("drink");
        VendingMachine office = new VendingMachine("office");
        // Instantiating Customer Objects
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);
        //Instantiating Snack Objects
        Snack chips = new Snack("chips", 36, 1.75);
        Snack chocolateBar = new Snack("chocolateBar", 36, 1.00);
        Snack pretzel = new Snack("pretzel", 30, 2.00);
        Snack soda = new Snack("soda", 24, 2.50);
        Snack water = new Snack("water", 20, 2.75);

        System.out.println("Jane's cash on hand is $" + jane.getCashOnHand());
        System.out.println("Quantity of soda is " + soda.getQuantity());
        
        //Jane buys pretzel
        jane.buySnacks(pretzel.cost());
        System.out.println("Jane's cash on hand is $" + jane.getCashOnHand());

        System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

        System.out.println("Bob's cash on hand is $" + bob.getCashOnHand());
        System.out.println("Quantity of soda is " + soda.getQuantity());

        //Jane finds $10.00 and adds it to cash on hand
        jane.setCashOnHand(jane.getCashOnHand() - 10.00);
        System.out.println("Jane's cash on hand is $" + jane.getCashOnHand());

        //Janes buys 1 chocolate bar
        jane.buySnacks(chocolateBar.cost());
        System.out.println("Jane's cash on hand is $" + jane.getCashOnHand());

        System.out.println(chocolateBar.getQuantity());

        //Add 12 more pretzels
        pretzel.setQuantity(pretzel.getQuantity() + 12);
        System.out.println(pretzel.getQuantity());

        //Bob buys 3 pretzels
        bob.buySnacks(pretzel.cost() * 3);
        System.out.println("Bob's cash on hand is $" + bob.getCashOnHand());

        System.out.println(pretzel.getQuantity());

        /* STRETCH */
        System.out.println("print");
    }
}
 