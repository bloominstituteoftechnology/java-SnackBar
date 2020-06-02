package snackBarApp;

public class Snack
{
	private static int maxId = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingmachineid;
// Snack, maxId, Id, name, quantity, cost, vendingmachineid
	public Snack(String name, int quantity, double cost, int vendingmachineid)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingmachineid = vendingmachineid;
	}
// get methods
	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public double getCost()
	{
		return cost;
	}

	public int getVendingMachineId()
	{
		return vendingmachineid;
	}


// set methods
	public void setName(String name)
	{
		this.name = name;
	}

	public void setQuantity(int quantity)
	{
	 	this.quantity = quantity;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public void setVendingMachineId(int vendingmachineid)
	{
		this.vendingmachineid = vendingmachineid;
	}



// get and add quantity

	public void snacksAdd(int added)
	{
		 this.quantity = this.quantity + added;
	}



// buy snack
	public void snacksDeduct(int deduct)
	{
		this.quantity = this.quantity - deduct;
	}


// get total cost
	public double totalCost()
	{
		return quantity * cost;
	}

}












