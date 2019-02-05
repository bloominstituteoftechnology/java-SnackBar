package snackApp;

//this is the main class that will do the work

public class Main
{
	private static void workWithData()
	{
		VendingMachine v1 = new VendingMachine("Food");//instaniate this new object with string name
		VendingMachine v2 = new VendingMachine("Drink");
		VendingMachine v3 = new VendingMachine("Office");

//set up customer info object
		Customer c1 = new Customer("Jane", 45.25); //when instanstiate the object the parameters need to be in teh sma eorder
		Customer c2 = new Customer("Bob", 33.14);

		Snack snack1 = new Snack("Chips", 1.75, v1.getId()); //c1.id and h1.get() are methods and needs parameters
		Snack snack2 = new Snack("Chocolate Bar", 1.00, v1.getId());
		Snack snack3= new Snack("Pretzel", 2.00, v1.getId());
//print out
		System.out.println("*** Query Data ***");
		System.out.println(v1); // print out the object in string form


	}

	public static void main(String[] args) //main class that will static(not instanstiate as obj)
	{
		workWithData(); //returns values, but needs to create worksWithData method

	}
}
