package SnackBar;

public class Snack
{
	private static int maxID = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineID;

	public Snack(String name, int id, int quantity, double cost, int vendingMachineID)
	{
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineID = -vendingMachineID;
	}


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

	public int getVendingMachineID()
	{
		return vendingMachineID;
	}

	//	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
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

	public void setVendingMachineID(int vendingMachineID)
	{
		this.vendingMachineID = vendingMachineID;
	}
}
