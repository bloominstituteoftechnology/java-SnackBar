package Main;

public class Main {
    public static void main(String[] args) throws Exception {
        //Instantiating VendingMachine Objects
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");
        // Instantiating Customer Objects
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);
        //Instantiating Snack Objects
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        //Jane buys 2 sodas
        jane.buySnacks(soda.cost() * 3);
        //Deduct qty
        soda.setQuantity(soda.getQuantity() - 3);
        System.out.println("Jane's cash on hand is $" + jane.getCashOnHand() + "\n");
        System.out.println("Quantity of soda is " + soda.getQuantity() + "\n");
        
        //Jane buys 1 pretzel
        jane.buySnacks(pretzel.cost());
        //Deduct qty
        pretzel.setQuantity(pretzel.getQuantity() - 1);
        System.out.println("Jane's cash on hand is $" + jane.getCashOnHand() + "\n");
        System.out.println("Quantity of pretzel is " + pretzel.getQuantity() + "\n");

        //Bob buys 2 sodas
        bob.buySnacks(soda.cost() * 2);
        //deduct soda
        soda.setQuantity(soda.getQuantity() - 2);
        System.out.println("Bob's cash on hand is $" + bob.getCashOnHand() + "\n");
        System.out.println("Quantity of soda is " + soda.getQuantity() + "\n");

        //Jane finds $10.00 and adds it to cash on hand
        jane.setCashOnHand(jane.getCashOnHand() + 10.00);
        System.out.println("Jane's cash on hand is $" + jane.getCashOnHand() + "\n");

        //Janes buys 1 chocolate bar
        jane.buySnacks(chocolateBar.cost());
        //deduct chocolate bar
        chocolateBar.setQuantity(chocolateBar.getQuantity() - 1);
        System.out.println("Jane's cash on hand is $" + jane.getCashOnHand() + "\n");
        System.out.println("Quantity of chocolate bar is " + chocolateBar.getQuantity() + "\n");

        //Add 12 more pretzels
        pretzel.setQuantity(pretzel.getQuantity() + 12);
        System.out.println("Quantity of pretzel is " + pretzel.getQuantity() + "\n");

        //Bob buys 3 pretzels
        bob.buySnacks(pretzel.cost() * 3);
        //deduct 3 pretzels
        pretzel.setQuantity(pretzel.getQuantity() - 3);
        System.out.println("Bob's cash on hand is $" + bob.getCashOnHand() + "\n") ;
        System.out.println("Quantity of pretzel is " + pretzel.getQuantity() + "\n");

        System.out.println(office.name() + "\n");

        /* STRETCH */
        //Chips
        System.out.println("Snack: " + chips.name() + "\n" +
                "Vending Machine: " + food.name() + "\n"+
                "Quantity: " + chips.getQuantity() + "\n" +
                "Total Cost: $" + String.format("%.2f", chips.getQuantity() * chips.cost()) + "\n");

        //Chocolate Bar
        System.out.println("Snack: " + chocolateBar.name() + "\n"
                + "Vending Machine: " + food.name() + "\n"
                + "Quantity: " + chocolateBar.getQuantity() + "\n");

        //Pretzel
        System.out.println("Snack: " + pretzel.name() + "\n"
                + "Vending Machine: " + food.name() + "\n"
                + "Quantity: " + pretzel.getQuantity() + "\n" 
                + "Total Cost: $" + String.format("%.2f", pretzel.getQuantity() * pretzel.cost()) + "\n");

        // Soda
        System.out.println("Snack: " + soda.name() + "\n"
                + "Vending Machine: " + drink.name() + "\n"
                + "Quantity: " + soda.getQuantity() + "\n" 
                + "Total Cost: $" + String.format("%.2f", soda.getQuantity() * soda.cost()) + "\n");

        // Water
        System.out.println("Snack: " + water.name() + "\n"
                + "Vending Machine: " + drink.name() + "\n"
                + "Quantity: " + water.getQuantity() + "\n" + 
                "Total Cost: $" + String.format("%.2f", water.getQuantity() * water.cost()));
    }
}
 