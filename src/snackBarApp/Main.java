package snackBarApp;

import java.text.DecimalFormat;

public class public static void main(String[] args) {
  private static DecimalFormat df = new DecimalFormat("$#,##0.00");

  Customer c1 = new Customer("Jane"45.25);
  Customer c2 = new Customer("Bob",33.14);

  VendingMachines v1 = new VendingMachines("Food");
  VendingMachines v2 = new VendingMachines("Drink");
  VendingMachines v3 = new VendingMachines("Office");

  Snack s1 = new Snack("Chips",36,1.75, v1.getId());
  Snack s2 = new Snack("Chocolate Bar",36,1.00, v1.getId());
  Snack s3 = new Snack("Pretzel",30,2.00, v1.getId());
  Snack s4 = new Snack("Soda",24,2.50, v2.getId());
  Snack s5 = new Snack("Water",20,2.75, v2.getId());

  c1.buySnacks(s4.getTotal(3));
  s4.buySnack(3);
  System.out.println("Customer 1 cash on hand" + df.format(c1.getCash()));
  System.out.println("Quantity of snack 4 is" + s4.getQuantity());
  System.out.println();

  c1.buySnacks(s3.getTotal(1));
  s3.buySnack(1);
  System.out.println("Customer 1 cash on hand" + df.format(c1.getCash()));
  System.out.println("QUantity of snack 3 is " + s3.getQuantity());
  System.out.println();

  c2.buySnacks(s4.getTotal(2));
  s4.buySnack(2);
  System.out.println("Customer 2 cash on hand" + df.format(c2.getCash()));
  System.out.println("Quantity of snack 4 is " + s4.getQuantity());
  System.out.println();

  c1.addCash(10.00);
  System.out.println("Customer 1 cash on hand" + df.format(c1.getCash()));
  System.out.println();

  c1.buySnacks(s2.getTotal(1));
  s2.buySnack(1);
  System.out.println("Customer 1 cash on hand" + df.format(c1.getCash()));
  System.out.println("Quantity of snack 2 is" + s2.getQuantity());
  System.out.println();

  s3.addQuantity(12);
  System.out.println("Quantity of snack 3 is" + s3.getQuantity());
  System.out.println();

  c2.buySnacks(s3.getTotal(3));
  s3.buySnack(3);
  System.out.println("Customer 2 cash on hand " + df.format(c2.getCash()));
  System.out.println("Quantity of snack 3 is " + s3.getQuantity());
  System.out.println();
  

}
