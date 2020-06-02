package snackBarApp;

// Customer, maxId, id, name, cash on hand

public class Customer
{
	private static int maxId = 0;

	private int id;
	private String name;
	private double wallet;


	public Customer(String name, double wallet)
	{

		maxId++;
		id = maxId;

		this.name = name;
		this.wallet = wallet;
	}





// get method

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getWallet()
	{
		return wallet;
	}
// set method
	public void setName(String name)
	{
		this.name = name;
	}

/*  public void setWallet(double wallet)
	{
	this.wallet = wallet;
	}
*/


// add cash to cash on hand
	public void moneyAdd(double added)
	{
		this.wallet = this.wallet + added;
	}


// buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount
	public void moneySpent(double deduct)
	{
		this.wallet = this.wallet - deduct;
	}

	 @Override
    public String toString()
    {
        String returnString = "id: " + id + "\n" + 
   	                            "Customer: " + name + "\n" +
                                "Wallet: " + wallet + "\n";
        return returnString;
    }
}


