package java-SnackBar

class Main {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Jane", 45.25);
		Customer custmoer2 = new Customer("Bob", 33.14);

		Vending machine1 = new Vending("Food");
		Vending machine2 = new Vending("Drink");
		Vending machine3 = new Vending("Office");

		Snack snack1 = new Snack("Chips", 1.75, 36);
		Snack snack2 = new Snack("Chocolate", 1.00, 36);
		Snack snack3 = new Snack("Pretzel", 2.00, 30);


	}
}
