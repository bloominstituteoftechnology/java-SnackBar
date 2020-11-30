package snackbarapp;

import java.text.DecimalFormat;

public class Main
{

    private static DecimalFormat df = new DecimalFormat("$#,##0.00");

    private static void main(String[] args)
    {
      //starting cash on hand values
      Customer c1 = new Customer("Jane", 45.25);
      Customer c2 = new Customer("Bob", 33.14);

      //vending machines
      VendingMachines v1 = new VendingMachines("Food");
      VendingMachines v2 = new VendingMachines("Drink");
	    VendingMachines v3 = new VendingMachines("Office");

      //buySnacks
      Snack s1 = new Snack("Chips",36, 1.75, v1.getId());
      Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
      Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
      Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
      Snack s5 = new Snack("Water",20, 2.75, v2.getId());

      c1.buySnacks(s4.getTotal(3));
        s4.buySnack(3);
        System.out.println("Customer 1 cash on hand " + df.format(c1.getCash()));
        System.out.println("Quantity of snack 4 is " + s4.getQuantity());
        System.out.println();

      c1.buySnacks(s3.getTotal(1));
        s3.buySnack(1);
        System.out.println("Customer 1 cash on hand " + df.format(c1.getCash()));
        System.out.println("Quanity of snack 3 is " + s3.getQuantity());
        System.out.println();

      c2.buySnacks(s4.getTotal(2));
        s4.buySnack(2);
        System.out.println("Customer 2 cash on hand " + df.format(c2.getCash()));
        System.out.println("Quantity of snack 4 is " + s4.getQuantity());
        System.out.println();

      c1.addCash(10.00);
        System.out.println("Customer 1 cash on hand " + df.format(c1.getCash()));
        System.out.println();

      c1.buySnacks(s2.getTotal(1));
        s2.buySnack(1);
        System.out.println("Customer 1 cash on hand " + df.format(c1.getCash()));
        System.out.println("Quantity of snack 2 is " + s2.getQuantity());
        System.out.println();

      s3.addQuantity(12);
        System.out.println("Quantity of snack 3 is " + s3.getQuantity());
        System.out.println();

      c2.buySnacks(s3.getTotal(3));
        s3.buySnack(3);
        System.out.println("customer 2 cash on hand " + df.format(c2.getCash()));
        System.out.println("Quantity of snack 3 is " +  s3.getQuantity());
        System.out.println();

      // stretch goals display all details

      System.out.println("Stretch Goals\n");

      System.out.println("Snack: " + s1.getName());
      System.out.println("Vending Machine: " + v1.getName());
      System.out.println("Quantity: " + s1.getQuantity());
      System.out.println("Total Cost: " + df.format(s1.getTotal(s1.getQuantity())));
      System.out.println();

      System.out.println("Snack: " + s2.getName());
      System.out.println("Vending Machine: " + v1.getName());
      System.out.println("Quantity: " + s2.getQuantity());
      System.out.println("Total Cost: " + df.format(s2.getTotal(s2.getQuantity())));
      System.out.println();

      System.out.println("Snack: " + s3.getName());
      System.out.println("Vending Machine: " + v1.getName());
      System.out.println("Quantity: " + s3.getQuantity());
      System.out.println("Total Cost: " + df.format(s3.getTotal(s3.getQuantity())));
      System.out.println();

      System.out.println("Snack: " + s4.getName());
      System.out.println("Vending Machine: " + v2.getName());
      System.out.println("Quantity: " + s4.getQuantity());
      System.out.println("Total Cost: " + df.format(s4.getTotal(s4.getQuantity())));
      System.out.println();

      System.out.println("Snack: " + s5.getName());
      System.out.println("Vending Machine: " + v2.getName());
      System.out.println("Quantity: " + s5.getQuantity());
      System.out.println("Total Cost: " + df.format(s5.getTotal(s5.getQuantity())));
      System.out.println();
    }
}
