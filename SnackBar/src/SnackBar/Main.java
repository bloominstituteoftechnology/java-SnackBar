package SnackBar;

public class Main
{


	public static void main(String[] args)
	{
		System.out.println("\n ***Its working ***\n");
		System.out.println("Creating Shitty customers");
		ShittyCustomer Jane = new ShittyCustomer("Jane", 45.25);
		ShittyCustomer Bob = new ShittyCustomer("Bob", 33.14);
		System.out.println("Done Creating Shitty customers\n");

		System.out.println("Creating Vending Machines");
		VendingMachine Food = new VendingMachine("food");
		VendingMachine Drink = new VendingMachine("Drink");
		VendingMachine Office = new VendingMachine("Office");
		System.out.println("Done Creating Vending Machines\n");

		System.out.println("Creating Snacks in Food");
		Snack Chips = new Snack("Cheetos", 36, 1.75, Food.getId());
		Snack Chocolate = new Snack("Snickers", 36, 1.00, Food.getId());
		Snack Pretzels = new Snack("Pretzel", 30, 2.00, Food.getId());

		System.out.println("Creating Snacks in Drinks");
		Snack Soda = new Snack("Dr.Pooper", 24, 2.50, Drink.getId());
		Snack Water = new Snack("Arrow Head", 20, 2.75, Drink.getId());
		System.out.println("------***Done Instanciating Objects***------\n");

		System.out.println("Transaction 1");
		System.out.println("Jane Purchases 3 Sodas");
		Jane.setCashOnHand(Jane.getCashOnHand() - 3 * Soda.getCost());
		Soda.setQuantity(Soda.getQuantity() - 3);
		System.out.println("Jane's Cash:" + Jane.getCashOnHand());
		System.out.println("Soda Stock:" + Soda.getQuantity() + "\n");

		System.out.println("Transaction 2");
		System.out.println("Jane Purchases 1 Pretzel");
		Jane.setCashOnHand(Jane.getCashOnHand() - Pretzels.getCost());
		Pretzels.setQuantity(Pretzels.getQuantity() - 1);
		System.out.println("Jane's Cash:" + Jane.getCashOnHand());
		System.out.println("Pretzelz Stock:" + Pretzels.getQuantity() + "\n");

		System.out.println("Transaction 3");
		System.out.println("Bob Purchases 2 Snickers");
		Bob.setCashOnHand(Bob.getCashOnHand() - 2 * Chocolate.getCost());
		Chocolate.setQuantity(Chocolate.getQuantity() - 2);
		System.out.println("Bob's Cash:" + Bob.getCashOnHand());
		System.out.println("Chocolate Stock:" + Chocolate.getQuantity() + "\n");

		System.out.println("Chocolate Stock:" + Chocolate.getQuantity() + "\n");
		System.out.println(Soda.toString() + "\n");
		System.out.println(Pretzels.toString() + "\n");
		System.out.println(Chips.toString() + "\n");

	}
}
