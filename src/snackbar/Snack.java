package snackbar;

public class Snack
{
	// Fields
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	// Constructor
	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	// Getters
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
		return vendingMachineId;
	}

	// Setters
	public void setName(String name)
	{
		this.name = name;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}

	// Methods
	// add quantity when given how many to add
	public void addQuantity(int quantity)
	{
		this.quantity += quantity;
	}

	// buy snack when given how many to add
	public void buySnack(int quantity)
	{
		this.quantity -= quantity;
	}

	// get total cost given a quantity
	public void getTotalCost(int quantity)
	{
		return this.cost * quantity;
	}
}