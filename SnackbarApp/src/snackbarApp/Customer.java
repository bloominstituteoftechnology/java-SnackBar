package snackbarApp;

public class Customer
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashonhand;
	
	public Customer ( String name, double cashonhand)
	{
	     maxId++;
	     id = maxId;
	     this.name = name;
	     this.cashonhand = cashonhand;
	}

	//  get & set name
	public void setName(String name)
	{
	     this.name = name;
	}
	
	public getName()
	{
	     return name;
	}
	
	// get cash on hand
	public getCashOnHand()
	{
	     return cashonhand;
	}

	// can add cash
	public addCash(double addcash)
	{
	     cashonhand += addCash;
	}

	// buy given total cash used in purchase
	public totalCash(double totalCash)
	{
 	     double cashLeft;	     
	     cashLeft = cashonhand - totalCash;
	     return cashLeft;
	}	

}