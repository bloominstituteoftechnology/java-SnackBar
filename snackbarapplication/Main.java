package snackbarapplication;
public class Main
{
  private static void workWithData()
  {
    System.out.println("Initial compile is working");

    // Customers: Jane + Bob (String name, double cashOnHand)
      Customer cust1 = new Customer("Jane", 45.25);
      Customer cust2 = new Customer("Bob", 33.14);

   // VendingMachine food, drink and office~!
      VendingMachine food = new VendingMachine("Food");
      VendingMachine drink = new VendingMachine("Drink");
      VendingMachine office = new VendingMachine("Office");

  // Snack (String name, int quantity, double cost, int vendingMachineId)
      Snack chips = new Snack("Chips", 36, 1.75, food.getId());
      Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
      Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
      Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
      Snack water = new Snack("Water", 20, 2.75, drink.getId());


  // PROCESSING
      var quantityOfItems = 3;
      cust1.buySnack(quantityOfItems, soda.getCost());
      soda.buySnackQuantity(quantityOfItems);
      System.out.println();
      System.out.println(cust1 + " cash on hand " + "$" + cust1.getCashOnHand());
      System.out.println("Quantity of snack 4  is " + soda.getQuantity());

      quantityOfItems = 1;
      cust1.buySnack(quantityOfItems, pretzel.getCost());
      pretzel.buySnackQuantity(quantityOfItems);
      System.out.println();
      System.out.println(cust1 + " cash on hand " + "$" + cust1.getCashOnHand());
      System.out.println("Quantity of snack 3 is " + pretzel.getQuantity());

      quantityOfItems = 2;
      cust2.buySnack(quantityOfItems, soda.getCost());
      soda.buySnackQuantity(quantityOfItems);
      System.out.println();
      System.out.println(cust2 + " cash on hand " + "$" + cust2.getCashOnHand());
      System.out.println("Quantity of snack 4  is " + soda.getQuantity());

      double foundMoney = 10;
      cust1.addCash(foundMoney);
      System.out.println();
      System.out.println(cust1 + " cash on hand " + "$" + cust1.getCashOnHand());

      quantityOfItems = 1;
      cust1.buySnack(quantityOfItems, chocolateBar.getCost());
      chocolateBar.buySnackQuantity(quantityOfItems);
      System.out.println();
      System.out.println(cust1 + " cash on hand " + "$" + cust1.getCashOnHand());
      System.out.println("Quantity of snack 2  is " + chocolateBar.getQuantity());

      quantityOfItems = 12;
      pretzel.setQuantity(quantityOfItems);
      System.out.println();
      System.out.println("Quantity of snack 3 is " + pretzel.getQuantity());

      quantityOfItems = 3;
      cust2.buySnack(quantityOfItems, pretzel.getCost());
      pretzel.buySnackQuantity(quantityOfItems);
      System.out.println();
      System.out.println(cust2 + " cash on hand " + "$" + cust2.getCashOnHand());
      System.out.println("Quantity of snack 3 is " + pretzel.getQuantity());

      System.out.println();
      System.out.println("******* STRETCH GOALS *******");
      System.out.println();

      System.out.println("Snack: " + chips.getName());
      System.out.println("Vending Machine: " + food.getName());
      System.out.println("Quantity: " + chips.getQuantity());
      System.out.println("Total Cost: " + "$" + chips.getTotal(chips.getQuantity()));
      System.out.println();

      System.out.println("Snack: " + chocolateBar.getName());
      System.out.println("Vending Machine: " + food.getName());
      System.out.println("Quantity: " + chocolateBar.getQuantity());
      System.out.println("Total Cost: " + "$" + chocolateBar.getTotal(chocolateBar.getQuantity()));
      System.out.println();

      System.out.println("Snack: " + pretzel.getName());
      System.out.println("Vending Machine: " + food.getName());
      System.out.println("Quantity: " + pretzel.getQuantity());
      System.out.println("Total Cost: " + "$" + pretzel.getTotal(pretzel.getQuantity()));
      System.out.println();

      System.out.println("Snack: " + soda.getName());
      System.out.println("Vending Machine: " + drink.getName());
      System.out.println("Quantity: " + soda.getQuantity());
      System.out.println("Total Cost: " + "$" + soda.getTotal(soda.getQuantity()));
      System.out.println();

      System.out.println("Snack: " + water.getName());
      System.out.println("Vending Machine: " + drink.getName());
      System.out.println("Quantity: " + water.getQuantity());
      System.out.println("Total Cost: " + "$" + water.getTotal(water.getQuantity()));
      System.out.println();




  }

  public static void main(String[] args)
  {
    workWithData();
  }

}