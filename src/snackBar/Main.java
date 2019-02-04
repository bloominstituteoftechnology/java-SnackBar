package snackBar;

public class Main
{
	private static void openForBusiness()
	{
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		VendingMachine v1 = new VendingMachine("Food");
		VendingMachine v2 = new VendingMachine("Drink");
		VendingMachine v3 = new VendingMachine("Office");

		Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
		Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());

		Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
		Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

		c1.buySnack(3, s4);
		System.out.println("Customer 1 Cash on hand: " + c1.getCash());
		System.out.println("Quantity of snack 4: " + s4.getQuantity());
		System.out.println("***********");

		c1.buySnack(1, s3);
		System.out.println("Customer 1 Cash on hand: " + c1.getCash());
		System.out.println("Quantity of snack 3: " + s3.getQuantity());
		System.out.println("***********");

		c2.buySnack(2, s4);
		System.out.println("Customer 2 Cash on hand: " + c2.getCash());
		System.out.println("Quantity of snack 4: " + s4.getQuantity());
		System.out.println("***********");

		c1.addCash(10.00);
		System.out.println("Customer 1 Cash on hand: " + c1.getCash());
		System.out.println("***********");

		c1.buySnack(1, s2);
		System.out.println("Customer 1 Cash on hand: " + c1.getCash());
		System.out.println("Quantity of snack 2: " + s2.getQuantity());
		System.out.println("***********");

		s3.addQuantity(12);
		System.out.println("Quantity of snack 3: " + s3.getQuantity());
		System.out.println("***********");

		c2.buySnack(3, s3);
		System.out.println("Customer 2 Cash on hand: " + c2.getCash());
		System.out.println("Quantity of snack 3: " + s3.getQuantity());
		System.out.println("***********");
	}

	public static void main(String[] args)
	{
		openForBusiness();
	}
}