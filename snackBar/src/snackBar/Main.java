package snackBar;

public class Main
{
  private static void doStuff()
  {

    VendingMachine vm1 = new VendingMachine("Big Snax");
    Customer jane = new Customer("Jane", 37.75);
    Customer bob = new Customer("Bob", 28.14);

    Snack soda = new Snack(21, vm1.getId(), 0, "Soda");
    Snack pretzel = new Snack(29, vm1.getId(), 0, "Pretzel");

  }

  public static void main(String[] args)
  {
    doStuff();
  }
}