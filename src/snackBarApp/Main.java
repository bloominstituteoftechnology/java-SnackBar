package snackBarApp;

public class Main
{

	private static void doWorkSon()
	{
	
		System.out.println("It's Working!, It's Working! --Anakin Skywalker/Dustin Myers");
		System.out.println();	

		Customer cust1 = new Customer("Jane", 45.25);
		Customer cust2 = new Customer("Bob", 33.14);
		
		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		Snack chips = new Snack("Chips", 36, 1.75, food.getName());
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getName());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getName());
		Snack soda = new Snack("Soda", 24, 2.50, drink.getName());
		Snack water = new Snack("Water", 20, 2.75, drink.getName());

		double transaction1 = cust1.buySnacks(soda.getCost() * 3);
		soda.setQuantity(soda.getQuantity() - 3);
		System.out.println(cust1.getName() + "'s cash on hand after  $7.50 in soda = " + transaction1);
		System.out.println("Total soda quantity left after " + cust1.getName() + " bought 3 = " + soda.getQuantity());
		double transaction2 = cust1.buySnacks(pretzel.getCost());
		pretzel.setQuantity(pretzel.getQuantity() - 1);
		System.out.println(cust1.getName() + "'s cash on hand after buying a single pretzel = " + transaction2);
		System.out.println("Total pretzels left after " + cust1.getName() + " bought 1 = " + pretzel.getQuantity());
		double transaction3 = cust2.buySnacks(soda.getCost() * 4);
		soda.setQuantity(soda.getQuantity() - 2);
		System.out.println(cust2.getName() + "'s cash on hand after buying $5 in soda = " + transaction3);
		System.out.println("Total soda quantity left after " + cust2.getName() + " bought 2 = " + soda.getQuantity());
		cust1.setCashOnHand(cust1.getCashOnHand() + 10.00);
		System.out.println(cust1.getName() + "'s total cash on hand after finding $10.00 = " + cust1.getCashOnHand());
		double transaction4 = cust1.buySnacks(chocolateBar.getCost());
		chocolateBar.setQuantity(chocolateBar.getQuantity() - 1);	
		System.out.println(cust1.getName() + "'s cash on hand after buying a Chocolate Bar = " + transaction4);
		System.out.println("Total Chocolate Bars left after " + cust1.getName() + " bought 1 = " + chocolateBar.getQuantity());
		pretzel.setQuantity(pretzel.getQuantity() + 12);
		System.out.println("Total pretzels after adding 12 to quantity = " + pretzel.getQuantity());
		double transaction5 = cust2.buySnacks(pretzel.getCost() * 3);
		pretzel.setQuantity(pretzel.getQuantity() - 3);
		System.out.println(cust2.getName() + "'s cash on hand after buying 3 pretzels = " + transaction5);
		System.out.println("Total pretzels left after " + cust2.getName() + " bought 3 = " + pretzel.getQuantity());
	}

	public static void main (String[] args)
	{
		doWorkSon();
	}
}
