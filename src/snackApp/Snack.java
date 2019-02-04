package snackApp;

public class snackApp
{
	private static int maxId =0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack (String name, int quantity, double cost, int vendingMachineId)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name + " ";
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int quantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public  int cost()
	{
		return cost;
	}

	public void setCost(int cost)
	{
		this.cost = cost;
	}

}
