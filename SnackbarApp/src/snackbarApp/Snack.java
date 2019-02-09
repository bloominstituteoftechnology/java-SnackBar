package snackbarApp;

public class Snack
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingmachineID;

	public Snack (String name, int quantity, double cost, int vendingmachineID)
	{
	    maxId++;
	    this.id = maxId;

	    this.name = name;
	    this.quantity = quantity;
	    this.cost = cost;
	    this.vendingmachineID = vendingmachineID;			
	}

	//getters & setters
	// get quantity
	public int getQuantity()
	{
	     return this.quantity;
	}
	
	public getID()
	{
	     return this.id;
	}

	// get total cost given a quantity
	public int gettotalCost()
	{
	     double totalCost = 0;
	     totalCost = this.cost * buySnack();
	     return totalCost;
	}
	
	// set name
	public void setName(String name)
	}
	     this.name =name;
	}

	// add quantity given quantity
	public void setQuantiy(int quantiy)
	{
	     this.quantity = quantity;
	}

	// buy snack given quantity
	public int buySnack(int quantity)
	{
	     this.quantity = quantity;
	}

}
