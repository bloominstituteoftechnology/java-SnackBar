package snackbar;

public class Customer
{
	// fields
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashOnHand;

	//constructor 
	public Customer(String name, double cashOnHand)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.cashOnHand = cashOnHand;

	}

	//methods
	public void addCash(double cashOnHand)
	{
		this.cashOnHand = cashOnHand;
	}

	public void buySnacks(int quantity, Snack snack)
	{
		snack.buySnacks(quantity);
		this.cashOnHand -= snack.getTotalCost(quantity);
	}

	// gettters
	public String getName()
	{
		return name;
	}

	public double getCash()
	{
		return cashOnHand;
	}

	//setters
	public void setName(String name)
	{
		this.name = name;
	}
}



	