package snackBarApp;

public class Customer
{
	private static int maxId = 0;

	public int id;
	public String name;
	public double cashOnHand;

	public Customer (String name, double cashOnHand)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;
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

	public double getCashOnHand ()
	{
		return cashOnHand;
	}

	public void setCashOnHand (double cashOnHand)
	{
		this.cashOnHand = cashOnHand;
	}

	public double buySnacks (double total)
	{
		setCashOnHand(this.cashOnHand - total);
		return cashOnHand;
	}
}
