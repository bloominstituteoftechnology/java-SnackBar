package snackpackage;

public class Customer 
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double dollars;

	public Customer(String name, double dollars)
	{
		maxId++;
		id=maxId;
		this.name = name;
		this.dollars = dollars;
	}

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

	public double getDollars()
	{
		return dollars;
	}

	public void addDollars(double amount)
	{
		this.dollars = this.dollars + amount;
	}

	public void buySnack(double amount)
	{
		this.dollars = this.dollars - amount;
	}
}