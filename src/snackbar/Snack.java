package snackbar;

public class Snack
{
	//fields
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineID;

	//construtor
	public Snack(String name, int quantity, double cost, int vendingMachineID)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineID = vendingMachineID;
	}

	//methods
	public void buySnacks(int quantity)
	{
		this.quantity -= quantity;
	}

	public void addQuantity(int quantity)
	{
		this.quantity += quantity;
	}

	//getters
	public int getQuantity()
	{
		return quantity;
	}

	public double getTotalCost(int quantity)
	{
		return cost = quantity;
	}

	//setters
	public void setName(String name)
	{
		this.name = name;
	}
}