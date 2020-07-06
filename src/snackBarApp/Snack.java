package snackBarApp;

public class Snack
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private String vendingMachineId;

	public Snack (String name, int quantity, double cost, String vendingMachineId)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	public int getId ()
	{
		return id;
	}

	public String getName ()
	{
		return name;
	}

	public void setName (String name)
	{
		this.name = name;
	}

	public int getQuantity ()
	{
		return quantity;
	}

	public void setQuantity (int quantity)
	{
		this.quantity = quantity;
	}

	public double getCost ()
	{
		return cost;
	}

	public void setCost (double cost)
	{
		this.cost = cost;
	}

	public String getVendingMachineId ()
	{
		return vendingMachineId;
	}

	public void setVendingMachineId (String vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}
}
