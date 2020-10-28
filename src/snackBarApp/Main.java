package snackBarApp;

public class Main {

  private static DecimalFormat df = new DecimalFormat("$#, ##0.00");
  public static void main(String[] args) {

    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine v1 = new VendingMachine("Food");
    VendingMachine v2 = new VendingMachine("Drink");
    VendingMachine v3 = new VendingMachine("Office");

/////// are we supposed to set the vmId here^^?

    Snack s1 = new Snack("Chips", 36, 1.75, s1.getId());
    Snack s2 = new Snack("Chocolate", 36, 1.00, s2.getId());
    Snack s3 = new Snack("Pretzel", 30, 2.00, s3.getId());
    Snack s4 = new Snack("Soda", 24, 2.50, s4.getId());
    Snack s5 = new Snack("Water", 20, 2.75, s5.getId());

    /////////
//1
    // System.out.println(c1.cash - 3(s4.cost));
    // System.out.println(s4.quantity - 3);

        c1.buySnacks(s4.getTotal(3));
        s4.buySnack(3);
        System.out.println("Customer 1 cash on hand " + df.format(c1.getCash()));
        System.out.println("Quantity of snack 4 is " + s4.getQuantity());
        System.out.println();
//2
    // System.out.println(c1.cash - s3.cost);
    // System.out.println(s3.quantity - 1);

    c1.buySnacks(s3.getTotal(1));
    s3.buySnack(1);
    System.out.println("Customer 1 cash on hand " + df.format(c1.getCash()));
    System.out.println("Quanity of snack 3 is " + s3.getQuantity());
    System.out.println();
//3
    // System.out.println(c2.cash - 2(s4.cost));
    // System.out.println(c4.quantity - 2);

    c2.buySnacks(s4.getTotal(2));
    s4.buySnack(2);
    System.out.println("Customer 2 cash on hand " + df.format(c2.getCash()));
    System.out.println("Quantity of snack 4 is " + s4.getQuantity());
    System.out.println();
//4
    // System.out.println(c1.cash + 10);

    c1.addCash(10.00);
    System.out.println("Customer 1 cash on hand " + df.format(c1.getCash()));
    System.out.println();
//5
    // System.out.println(c1.cash - s2.cost);
    // System.out.println(s2.quantity - 1);

    c1.buySnacks(s2.getTotal(1));
    s2.buySnack(1);
    System.out.println("Customer 1 cash on hand " + df.format(c1.getCash()));
    System.out.println("Quantity of snack 2 is " + s2.getQuantity());
    System.out.println();
//6
    // System.out.println(s3.quantity + 12);

    s3.addQuantity(12);
    System.out.println("Quantity of snack 3 is " + s3.getQuantity());
    System.out.println();
//7
    // System.out.println(c2.cash - 3(s3.cost));
    // System.out.println(s3.quantity - 3);

    c2.buySnacks(s3.getTotal(3));
    s3.buySnack(3);
    System.out.println("customer 2 cash on hand " + df.format(c2.getCash()));
    System.out.println("Quantity of snack 3 is " +  s3.getQuantity());
    System.out.println();
  }

}
