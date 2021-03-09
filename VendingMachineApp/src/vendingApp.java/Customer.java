package vendingApp;

public class Customer
{
	private static int maxId = 1;
	private int id;
	private String name;
	private double cashOnHand;



public Customer(String name, double cashOnHand)
{
	id = maxId++;
	this.name = name;
	this.cashOnHand = cashOnHand;
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
	String copyName = this.name;
	this.name = name;
	System.out.println("Name was " + copyName + " now it is " + name);
}

public double getCashOnHand()
{
	return cashOnHand;
}

// Methods

public void addToCashOnHand(double cash)
{
	this.cashOnHand += cash;
	System.out.println("Added $" + cash + " to cash on hand $" + cashOnHand);
}

public void buySnack(double totalCost)
{
	this.cashOnHand -= totalCost;
	System.out.println("Purchased $" + totalCost + "of snacks. Now you have $" + cashOnHand);
}

}
