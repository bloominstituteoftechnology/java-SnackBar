package snackBarApp;

public class Main {
  public static void main(String[] args) {

    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine v1 = new VendingMachine("Food", v1.id);
    VendingMachine v2 = new VendingMachine("Drink", v2.id);
    VendingMachine v3 = new VendingMachine("Office", v3.id);

/////// are we supposed to set the vmId here^^?

    Snack s1 = new Snack("Chips", 36, 1.75, s1.getVmId("Food"));
    Snack s2 = new Snack("Chocolate", 36, 1.00, s2.getVmId("Food"));
    Snack s3 = new Snack("Pretzel", 30, 2.00, s3.getVmId("Food"));

    Snack s4 = new Snack("Soda", 24, 2.50, s4.getVmId("Drink"));
    Snack s5 = new Snack("Water", 20, 2.75, s5.getVmId("Drink"));

    /////////
//1
    System.out.println(c1.cash - 3(s4.cost));
    System.out.println(s4.quantity - 3);
//2
    System.out.println(c1.cash - s3.cost);
    System.out.println(s3.quantity - 1);
//3
    System.out.println(c2.cash - 2(s4.cost));
    System.out.println(c4.quantity - 2);
//4
    System.out.println(c1.cash + 10);
//5
    System.out.println(c1.cash - s2.cost);
    System.out.println(s2.quantity - 1);
//6
    System.out.println(s3.quantity + 12);
//7
    System.out.println(c2.cash - 3(s3.cost));
    System.out.println(s3.quantity - 3);
  }
}
