package snackBarApp;

public class Main {
  public static void main(String[] args) {

    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine v1 = new VendingMachine("Food", v1.getId());
    VendingMachine v2 = new VendingMachine("Drink", v2.getId());
    VendingMachine v3 = new VendingMachine("Office", v3.getId());
/////// are we supposed to set the vmId here^^?

    Snack s1 = new Snack("Chips", 36, 1.75, s1.getVmId());
    Snack s2 = new Snack("Chocolate", 36, 1.00, s2.getVmId());
    Snack s3 = new Snack("Pretzel", 30, 2.00, s3.getVmId());

    Snack s4 = new Snack("Soda", 24, 2.50, s4.getVmId());
    Snack s5 = new Snack("Water", 20, 2.75, s5.getVmId());


    System.out.println(snack1);
  }
}
