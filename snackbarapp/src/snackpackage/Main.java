package snackpackage;

//Snacks
//Vending Machine
//Customers
public class Main
{
	// private static void workWithData()
	// {
	// 	System.out.println("TESTING 2 3 4");
	// }

	public static void main(String[] args)
	{
		//initiating dollar state
		Customer c1 = new Customer("Al", 65.45);
		Customer c2 = new Customer("Jenny", 76.49);
		Customer c3 = new Customer("Joseph", 34.73);

		//initializing vending state
		VendingMachine vend1 = new VendingMachine("Food");
		VendingMachine vend2 = new VendingMachine("Beverage");
		VendingMachine vend3 = new VendingMachine("Other");

		//initialize snack state
		Snack s1 = new Snack("Muffin", 2, 1.50, vend1.getId());
		Snack s2 = new Snack("Water", 1, 1.75, vend2.getId());
		Snack s3 = new Snack("Almond Joy", 2, .50, vend3.getId());

		//purchasing a snack
		c1.buySnack(s1.getTotal(2));
		s1.buySnack(2);

		c2.buySnack(s2.getTotal(1));
		s2.buySnack(1);

		c3.buySnack(s3.getTotal(2));
		s2.buySnack(2);


		//System Print
		System.out.println( c1.getName() + " has " + c1.getDollars() + " dollars left");
		System.out.println("There are " + s1.getQuantity() + " " + s1.getName() + "s left");

		System.out.println( c2.getName() + " has " + c2.getDollars() + " dollars left");
		System.out.println("There are " + s2.getQuantity() + " " + s2.getName() + "s left");

		System.out.println( c3.getName() + " has " + c3.getDollars() + " dollars left");
		System.out.println("There are " + s3.getQuantity() + " " + s3.getName() + "s left");


		//adding snacks 
		s1.addQuantity(20);
		System.out.println(s1.getName() + " is now refilled to " + s1.getQuantity());
		//testing add with a buy
		c3.buySnack(s1.getTotal(5));
		s1.buySnack(5);

		System.out.println( c3.getName() + " has " + c3.getDollars() + " dollars left");
		System.out.println("There are " + s1.getQuantity() + " " + s1.getName() + "s left");
	}
}