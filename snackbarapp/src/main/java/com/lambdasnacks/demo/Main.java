package com.lambdasnacks.demo;

public class Main
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer("Mike", 21.22);
        Customer c2 = new Customer ("Rebecca", 12.43);
        Customer c3 = new Customer("Phil", 36.45);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Beverage");
        VendingMachine v3 = new VendingMachine("Candy");

        Snack s1 = new Snack ("Chip", 10, 1.00, v1.getId());
        Snack s2 = new Snack ("Jolly Rancher", 40, .50, v2.getId());
        Snack s3 = new Snack ("Orange Juice", 12, 2.00, v3.getId());

        // Trying to buy a snack

        c1.buySnack(s1.getTotal(3));
        s1.buySnack(3);

        c2.buySnack(s2.getTotal(1));
        s2.buySnack(1);

        c3.buySnack(s3.getTotal(2));
        s2.buySnack(2);

        //Testing if everything works
        System.out.println( c1.getName() + " has " + c1.getDollars() + " dollars left");
        System.out.println("There are " + s1.getQuantity() + " " + s1.getName() + "s left");

        System.out.println( c2.getName() + " has " + c2.getDollars() + " dollars left");
        System.out.println("There are " + s2.getQuantity() + " " + s2.getName() + "s left");

        System.out.println( c3.getName() + " has " + c3.getDollars() + " dollars left");
        System.out.println("There are " + s3.getQuantity() + " " + s3.getName() + "s left");

        //adding snacks to the vending machine
        s1.addQuantity(20);
        System.out.println(s1.getName() + " is now refilled to " + s1.getQuantity());

        //testing adding snacks with buy
        c3.buySnack(s1.getTotal(5));
        s1.buySnack(5);

        System.out.println( c3.getName() + " has " + c3.getDollars() + " dollars left");
        System.out.println("There are " + s1.getQuantity() + " " + s1.getName() + "s left");
    }
}
