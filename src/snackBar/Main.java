package snackBar;

class Main {
  private static void executeMain() {
    // instantiate Jane and Bob
    Customer Jane = new Customer("Jane", 45.25);
    Customer Bob = new Customer("Bob", 33.14);

    // instantiate 3 vending machines
    VendingMachine Food = new VendingMachine("Food");
    VendingMachine Drink = new VendingMachine("Drink");
    VendingMachine Office = new VendingMachine("Office");

    // instantiate 5 snacks
    Snack Chips = new Snack("Chips", 36, 1.75, Food.getId());
    Snack ChocolateBar = new Snack("Chocolate Bar", 36, 1.00, Food.getId());
    Snack Pretzel = new Snack("Pretzel", 30, 2.00, Food.getId());
    Snack Soda = new Snack("Soda", 24, 2.50, Drink.getId());
    Snack Water = new Snack("Water", 20, 2.75, Drink.getId());

    Jane.buySnack(Soda.getCost(3));
    Soda.buySnacks(3);
    System.out.println("Customer 1 bought 3 of snack 4");
    System.out.println("Customer 1 Cash on hand: " + Jane.getCashOnHand());
    System.out.println("Snack 4 quantity: " + Soda.getQuantity());
  }

  public static void main(String[] args) {
    executeMain();
  }
}
