package snackBar;

public class Main{


	private static void workWithData(){

	Customer jane = new Customer("Jane",45.25);
	Customer bob = new Customer("Bob", 33.14);

	VendingMachine food = new VendingMachine("Food");
	VendingMachine drink = new VendingMachine("Drink");
	VendingMachine office = new VendingMachine("Office");

	Snack chips = new Snack("Chips", 36, 1.75, food.getId());
	Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
	Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

	Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
	Snack water = new Snack("Water", 20, 2.75, drink.getId());

	soda.buySnack(3);
	jane.buySnacks(soda.getCost(3.0));

	System.out.println();
	System.out.println(" Customer " +  jane.getId() + " cash on hand" + " $ " + jane.getCashOnHand());
	System.out.println(" Quantity of snack " + soda.getId() + " is " + soda.getQuantity());
	System.out.println();

	pretzel.buySnack(1);
	jane.buySnacks(pretzel.getCost(1.0));

	System.out.println();
	System.out.println("Customer " + jane.getId() + " cash on hand" + "$" + jane.getCashOnHand());
	System.out.println("Quantity of snack " + pretzel.getId() + "is" + soda.getQuantity());
	System.out.println();

	soda.buySnack(2);
	bob.buySnacks(soda.getCost(2.0));

	System.out.println();
	System.out.println("Customer" + bob.getId() + " cash on hand" + "$" + bob.getCashOnHand());
	System.out.println("Quantity of snack" + soda.getId() + "is" + soda.getQuantity());
	System.out.println();

	jane.addCashOnHand(10.00);

	System.out.println("Customer " + jane.getId() + " cash on hand " + "$" + jane.getCashOnHand());
	System.out.println();

	chocolateBar.buySnack(1);
	jane.buySnacks(chocolateBar.getCost(1.0));

	System.out.println();
	System.out.println("Customer" + jane.getId() + " cash on hand " + jane.getCashOnHand());
	System.out.println("Quantity of snack" + chocolateBar.getId() + "is" + chocolateBar.getQuantity());
	System.out.println();

	pretzel.addQuantity(12);

	System.out.println("Quantity of snack" + pretzel.getId() + " is " + pretzel.getQuantity());
	System.out.println();

	pretzel.buySnack(3);
	bob.buySnacks(pretzel.getCost(3.0));

	System.out.println();
	System.out.println("Customer" + bob.getId() + " cash on hand" + "$" + bob.getCashOnHand());
	System.out.println("Quantity of snack" + pretzel.getId() + "is"+ pretzel.getQuantity());
	System.out.println();

	}

	//public static void Main(String[] args){
	//	workWithData();
	//}

	public static void main(String[] args){
		workWithData();
	}
}