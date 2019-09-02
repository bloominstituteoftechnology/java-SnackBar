package snackapp;

public class Main {
    private static void processSnackapp(){
        Customer Jane = new Customer(1, "Jane", 45.25);
        Customer Bob = new Customer(2, "Bob", 33.14);

        VendingMachine Food = new VendingMachine(1, "Food");
        VendingMachine Drink = new VendingMachine(2, "Drink");
        VendingMachine Office = new VendingMachine(3, "Office");

        Snack Chips = new Snack(1, "chips", 36, 1.76, Food.getId());
        Snack ChocolateBar = new Snack(2, "chocolate bar", 36, 1.00, Food.getId());
        Snack Pretzel = new Snack(3, "pretzel", 30, 2.00, Food.getId());

        Snack Soda = new Snack(4, "soda", 24, 2.50, Drink.getId());
        Snack Water = new Snack(5, "water", 20, 2.75, Drink.getId());

        Jane.buySnack(Soda.getCost(3));
        Soda.buySnack(3);
        System.out.println("there are "+Soda.getQuantity()+" left in the drink machine");
        System.out.println("jane has $"+Jane.getCash()+" left");
        System.out.println("--------------ENDOFPROBLEM1-------------");
        Jane.buySnack(Pretzel.getCost(1));
        Pretzel.buySnack(1);
        System.out.println("jane has $"+Jane.getCash()+" left");
        System.out.println("there are "+Pretzel.getQuantity()+" left in the snack machine");
        System.out.println("--------------ENDOFPROBLEM2-------------");
        Bob.buySnack(Soda.getCost(2));
        Soda.buySnack(2);
        System.out.println("there are "+ Soda.getQuantity() + " left in the drink machine");
        System.out.println("Bob has $"+Bob.getCash()+" left");
        System.out.println("--------------ENDOFPROBLEM3-------------");
        System.out.println("oh, sweet, jane found ten bucks!");
        Jane.addCash(10.00);
        System.out.println("Jane now has $" +Jane.getCash());
        System.out.println("--------------ENDOFPROBLEM4-------------");
        Jane.buySnack(ChocolateBar.getCost(1));
        ChocolateBar.buySnack(1);
        System.out.println("Jane now has $" +Jane.getCash());
        System.out.println("there is "+ ChocolateBar.getQuantity()+" more purchases of choco-bars remaining.");
        System.out.println("--------------ENDOFPROBLEM5-------------");
        System.out.println("restocking pretzels!");
        Pretzel.addQuantity(12);
        System.out.println("new stock for Pretzels =" + Pretzel.getQuantity());
        System.out.println("--------------ENDOFPROBLEM6-------------");
        Bob.buySnack(Pretzel.getCost(3));
        Pretzel.buySnack(3);
        System.out.println("Bob's cash on hand is $"+ Bob.getCash());
        System.out.println("there are "+Pretzel.getQuantity()+" Pretzels left");
        System.out.println("--------------ENDOFPROBLEM7-------------");


        System.out.println("--------------STRETCH----------------");
        System.out.println("ALL SNACKS");
        System.out.println(Chips.getName()+" can be found in "+Food.getName()+" there are "+Chips.getQuantity()+" left, and it would cost $"+Chips.getCost(Chips.getQuantity())+" to buy them all");
        System.out.println(ChocolateBar.getName()+" can be found in "+Food.getName()+" there are "+ChocolateBar.getQuantity()+" left, and it would cost $"+ChocolateBar.getCost(ChocolateBar.getQuantity())+" to buy them all");
        System.out.println(Pretzel.getName()+" can be found in "+Food.getName()+" there are "+Pretzel.getQuantity()+" left, and it would cost $"+Pretzel.getCost(Pretzel.getQuantity())+" to buy them all");
        System.out.println(Soda.getName()+" can be found in "+Drink.getName()+" there are "+Soda.getQuantity()+" left, and it would cost $"+Soda.getCost(Soda.getQuantity())+" to buy them all");
        System.out.println(Water.getName()+" can be found in "+Drink.getName()+" there are "+Water.getQuantity()+" left, and it would cost $"+Water.getCost(Water.getQuantity())+" to buy them all");
        System.out.println("--------------END-STRETCH----------------");
    }
    public static void main(String[] args) {
        processSnackapp();
    }
}