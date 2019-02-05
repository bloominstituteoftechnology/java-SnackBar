package snackBar;

public class Main 
{
  private static void workWithData()
  {
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    Vmachine v1 = new Vmachine("Food");
    Vmachine v2 = new Vmachine("Drink");
    Vmachine v3 = new Vmachine("Office");

    Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
    Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
    Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
    Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
    Snack s5 = new Snack("Water", 20, 2.75, v2.getId());


    System.out.println("*** Query Data ***");
    // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
    System.out.println(s4);
    // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
    // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
    // Customer 1 finds $10. Print Customer 1 Cash on Hand.
    // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
    // Snack 3 gets 12 more. Print quantity of snack 3.
    // Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
  }
  public static void main(String[] args)
  {
    workWithData();
  }
}