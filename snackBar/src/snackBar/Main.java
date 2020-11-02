package snackBar;

public class Main
{
  private static void doStuff()
  {

    VendingMachine vm1 = new VendingMachine("Food");
    VendingMachine vm2 = new VendingMachine("Drink");
    VendingMachine vm3 = new VendingMachine("Office");

    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    Snack chips = new Snack("Chips", 36, vm1.getId(), 1.75);
    Snack chocolate = new Snack("Chocolate Bar", 36, vm1.getId(), 1.00);
    Snack pretzel = new Snack("Pretzel", 30, vm1.getId(), 2.00);
    Snack soda = new Snack("Soda", 24, vm2.getId(), 2.50);
    Snack water = new Snack("Water", 20, vm2.getId(), 2.75);

    jane.removeCash(soda.getTotalCost(3));
    soda.buy(3);
    System.out.println(jane);
    System.out.println(soda.getQuantityString());
    System.out.println();

    jane.removeCash(pretzel.getTotalCost(1));
    pretzel.buy(1);
    System.out.println(jane);
    System.out.println(pretzel.getQuantityString());
    System.out.println();

    bob.removeCash(soda.getTotalCost(2));
    soda.buy(2);
    System.out.println(bob);
    System.out.println(soda.getQuantityString());
    System.out.println();

    jane.addCash(10);
    System.out.println(jane);
    System.out.println();

    jane.removeCash(chocolate.getTotalCost(1));
    chocolate.buy(1);
    System.out.println(jane);
    System.out.println(chocolate.getQuantityString());
    System.out.println();

    pretzel.restock(12);
    System.out.println(pretzel.getQuantityString());
    System.out.println();

    bob.removeCash(pretzel.getTotalCost(3));
    pretzel.buy(3);
    System.out.println(bob);
    System.out.println(pretzel.getQuantityString());
  }

  public static void main(String[] args)
  {
    doStuff();
  }
}