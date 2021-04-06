package snackpackage;

public class Snack 
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	//Snack Methods

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public int getVendingMachineId()
	{
		return vendingMachineId;
	}

	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}

	public void addQuantity(int amount)
	{
		this.quantity = this.quantity + amount;
	}

	public void buySnack(int amount)
	{
		this.quantity = this.quantity - amount;
	}

	public double getTotal(int amount)
	{
		double totalCost = this.cost * amount;
		return totalCost;
	}
}