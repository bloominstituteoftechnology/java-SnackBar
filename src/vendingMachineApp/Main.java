package vendingMachineApp;

public class Main {
  private static void workWithData() {
    //instantiate objects
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine vm1 = new VendingMachine("Food");
    VendingMachine vm2 = new VendingMachine("Drink");
    VendingMachine vm3 = new VendingMachine("Office");

    //snacks in Food machine
    Snack s1 = new Snack("Chips", 36, 1.75, vm1.id);
    Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vm1.id);
    Snack s3 = new Snack("Pretzel", 30, 2.00, vm1.id);

    //snacks in Drink machine
    Snack s4 = new Snack("Soda", 24, 2.50, vm2.id);
    Snack s5 = new Snack("Water", 20, 2.75, vm2.id);

    //Customer 1 (Jane) buys 3 of snack 4 (Soda)
    c1.buySnacks(s4.getTotalCost(3));
    s4.buySnack(3);
    //Print Customer 1 (Jane) Cash on hand.
    System.out.println("Jane cash on hand $" + c1.getCash());
    //Print quantity of snack 4 (Soda)
    System.out.println("Quantity of Soda is " + s4.getQuantity());
    
    //Customer 1 (Jane) buys 1 of snack 3 (Pretzel)
    c1.buySnacks(s3.getTotalCost(1));
    s3.buySnack(1);
    //Print Customer 1 (Jane) Cash on hand.
    System.out.println("Jane cash on hand $" + c1.getCash());
    //Print quantity of snack 3 (Pretzel).
    System.out.println("Quantity of Pretzel is " + s3.getQuantity());

    //Customer 2 (Bob) buys 2 of snack 4 (Soda).
    c2.buySnacks(s4.getTotalCost(2));
    s4.buySnack(2);
    //Print Customer 2 (Bob) Cash on Hand.
    System.out.println("Bob cash on hand $" + c2.getCash());
    //Print quantity of snack 4 (Soda).
    System.out.println("Quantity of Soda is " + s4.getQuantity());

    //Customer 1 (Jane) finds $10.
    c1.addCash(10.00);
    //Print Customer 1 (Jane) Cash on Hand.
    System.out.println("Jane cash on hand $" + c1.getCash());

    //Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
    c1.buySnacks(s2.getTotalCost(1));
    s2.buySnack(1);
    //Print Customer 1 (Jane) Cash on Hand.
    System.out.println("Jane cash on hand $" + c1.getCash());
    //Print quantity of snack 2 (Chocolate Bar).
    System.out.println("Quantity of Chocolate Bar is " + s2.getQuantity());

    //Add 12 more items to snack 3 (Pretzel).
    s3.addQuantity(12);
    //Print quantity of snack 3 (Pretzel).
    System.out.println("Quantity of Pretzel is " + s3.getQuantity());

    //Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
    c2.buySnacks(s3.getTotalCost(3));
    s3.buySnack(3);
    //Print Customer 2 (Bob) Cash on hand.
    System.out.println("Bob cash on hand $" + c2.getCash());
    //Print quantity of snack 3 (Pretzel).
    System.out.println("Quantity of Soda is " + s3.getQuantity());

    //Display each snack with
      //Name
      //Vending Machine Name
      //Quantity on hand
      //Total cost of all of the quantities of this snack on hand
    //Format all dollar amount like $1,234.56
      //Starts with a dollar sign
      //comma separating group of 3 numbers
      //rounded to the nearest cents, hundredths place
    // System.out.println("Snack: " + s1.getName());
    // System.out.println("Vending Machine: " + )
  }
  public static void main(String[] args) {
    workWithData();  
  }
}

