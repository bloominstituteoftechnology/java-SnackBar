package snackBar;

public class Main
{
  private static void doStuff()
  {

    VendingMachine vm1 = new VendingMachine("Food");
    VendingMachine vm2 = new VendingMachine("Drink");
    VendingMachine vm3 = new VendingMachine("Office");
    VendingMachine[] vms =
    { vm1, vm2, vm3 };

    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    Snack chips = new Snack("Chips", 36, vm1.getId(), 1.75);
    Snack chocolate = new Snack("Chocolate Bar", 36, vm1.getId(), 1.00);
    Snack pretzel = new Snack("Pretzel", 30, vm1.getId(), 2.00);
    Snack soda = new Snack("Soda", 24, vm2.getId(), 2.50);
    Snack water = new Snack("Water", 20, vm2.getId(), 2.75);

    jane.removeCash(soda.buy(3));
    System.out.println(jane);
    System.out.println(soda.getQuantityString());
    System.out.println();

    jane.removeCash(pretzel.buy(1));
    System.out.println(jane);
    System.out.println(pretzel.getQuantityString());
    System.out.println();

    bob.removeCash(soda.buy(2));
    System.out.println(bob);
    System.out.println(soda.getQuantityString());
    System.out.println();

    jane.addCash(10);
    System.out.println(jane);
    System.out.println();

    jane.removeCash(chocolate.buy(1));
    System.out.println(jane);
    System.out.println(chocolate.getQuantityString());
    System.out.println();

    pretzel.restock(12);
    System.out.println(pretzel.getQuantityString());
    System.out.println();

    bob.removeCash(pretzel.buy(3));
    System.out.println(bob);
    System.out.println(pretzel.getQuantityString());
    System.out.println();

    printSnack(chips, vms);
    printSnack(chocolate, vms);
    printSnack(pretzel, vms);
    printSnack(soda, vms);
    printSnack(water, vms);
  }

  private static void printSnack(Snack snack, VendingMachine[] vms)
  {
    int qty = snack.getQuantity();
    int vmId = snack.getVendingMachineId();
    System.out.println("Snack: " + snack.getName());
    System.out.println("Quantity: " + qty);
    String vmName="";
    for (int i = 0; i < vms.length; i++)
    {
      if (vms[i].getId() == vmId)
      {
        vmName = vms[i].getName();
        break;
      }
    }
    System.out.println("Vending Machine: " + vmName);
    System.out.printf("Total Cost: $%,.2f\n", snack.getTotalCost(qty));
    System.out.println();
  }

  public static void main(String[] args)
  {
    doStuff();
  }
}