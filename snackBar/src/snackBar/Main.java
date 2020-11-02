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

    Snack chips = new Snack("Chips",36, vm1.getId(), 1.75);
    Snack chocolate = new Snack("Chocolate Bar", 36, vm1.getId(), 1.00);
    Snack pretzel = new Snack("Pretzel", 30, vm1.getId(), 2.00);
    Snack soda = new Snack("Soda", 24, vm2.getId(), 2.50);
    Snack water = new Snack("Water", 20, vm2.getId(), 2.75);

    
    System.out.println(jane);
    System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());

    System.out.println(jane);
    System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());

    System.out.println(bob);
    System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());
  }

  public static void main(String[] args)
  {
    doStuff();
  }
}