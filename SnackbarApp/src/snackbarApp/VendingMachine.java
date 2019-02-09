package snackbarApp;

public class VendingMachine
{
	private static int maxId = 0;
	private int id;
	private String name;
	
	// to set vending machine id
	public VendingMachine(String name)
	{
	    maxId++;
	    id = maxId;
	    this.name = name;
	}

	// get vending machine id
	public int getVendingMachineID()
	{
	     return id;
	}	


	// get vending machine name

	public String getName()
	{
	     return name;
	}
}