package snack;

public class Main

{
  private static void operateSnackBar()
  {
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    Snack chips = new Snack("Chips", 36, 1.75, food.getId());
    Snack chocBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
    Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
    Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
    Snack water = new Snack("Water", 20, 2.75, drink.getId());

    var numItems= 3;
    jane.buySnack(numItems,soda.getCost());
    soda.buySnack(numItems);
    System.out.println(jane.getCashOnHand());
    System.out.println(soda.getQuantity());

    numItems = 1;
    jane.buySnack(numItems, pretzel.getCost());
    pretzel.buySnack(numItems);
    System.out.println(jane.getCashOnHand());
    System.out.println(pretzel.getQuantity());

    numItems = 2;
    bob.buySnack(numItems, soda.getCost());
    soda.buySnack(numItems);
    System.out.println(bob.getCashOnHand());
    System.out.println(soda.getQuantity());

    double extraCash = 10;
    jane.addCash(10);
    System.out.println(jane.getCashOnHand());

    numItems = 1;
    jane.buySnack(numItems, chocBar.getCost());
    chocBar.buySnack(numItems);
    System.out.println(jane.getCashOnHand());
    System.out.println(chocBar.getQuantity());

    numItems = 12;
    pretzel.addQuantity(numItems);
    System.out.println(pretzel.getQuantity());

    numItems = 3;
    bob.buySnack(numItems, pretzel.getCost());
    pretzel.buySnack(numItems);
    System.out.println(bob.getCashOnHand());
    System.out.println(pretzel.getQuantity());

    //for stretch

    System.out.println(pretzel.toString());
    System.out.println(soda.toString());
  }

  public static void main(String[] args)
  {
    operateSnackBar();
  }
}
