package javaSnackBar;

class Main {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Jane", 45.25);
		Customer custmoer2 = new Customer("Bob", 33.14);

		Vending machine1 = new Vending("Food");
		Vending machine2 = new Vending("Drink");
		Vending machine3 = new Vending("Office");

		Snack snack1 = new Snack("Chips", 1.75, 36, machine1.getID());
		Snack snack2 = new Snack("Chocolate", 1.00, 36, machine1.getID());
		Snack snack3 = new Snack("Pretzel", 2.00, 30, machine1.getID());
		Snack snack4 = new Snack("Soda", 2.50, 24, machine2.getID());
		Snack snack5 = new Snack("Water", 2.75, 20, machine2.getID());

		double customer1Buys = snack4.buySnack(3) ;
		customer1.buy(customer1Buys);
		System.out.println("Customer 1 cash on hand: " + customer1.getCash());
		System.out.println("Quantity of snack 4: " + snack4.getQuantity());

	}
}
