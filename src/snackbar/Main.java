package snackbar;

public class Main {

  public static void main(String[] args) {
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine vm1 = new VendingMachine("Food");
    VendingMachine vm2 = new VendingMachine("Drink");
    VendingMachine vm3 = new VendingMachine("Office");
    
    // Snack(String name, int quantity, double cost, int vendingMachineid) 

    Snack s1 = new Snack("Chips", 36, 1.75, 1);
    Snack s2 = new Snack("Chocolate Bar", 36, 1, 1);
    Snack s3 = new Snack("Pretzel", 30, 2, 1);
    Snack s4 = new Snack("Soda", 24, 2.5, 2);
    Snack s5 = new Snack("Water", 20, 2.75, 2);

    c1.buySnacks(s4.buySnack(3));
    System.out.println(c1);
    System.out.println(s4.printQuantity());

    c1.buySnacks(s3.buySnack(1));
    System.out.println(c1);
    System.out.println(s3.printQuantity());

    c2.buySnacks(s4.buySnack(2));
    System.out.println(c2);
    System.out.println(s4.printQuantity());

    c1.addCash(10);
    System.out.println(c1);
    System.out.println();
    
    c1.buySnacks(s2.buySnack(1));
    System.out.println(c1);
    System.out.println(s2.printQuantity());

    s3.addQuantity(12);
    System.out.println(s3.printQuantity());

    c2.buySnacks(s3.buySnack(3));
    System.out.println(c2);
    System.out.println(s3.printQuantity());

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
  }
}