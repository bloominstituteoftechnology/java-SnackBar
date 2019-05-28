package snackbar;

public class VendingMachine
{
	//fields
	private static int maxId = 0;
	private int id;
	private String name;

	//construtor
	public VendingMachine(String name)
	{
		maxId++;
		id = maxId;
		this.name = name;
	}

	//getters
	public String getName()
	{
		return name;
	}

	public int getId()
	{
		return id;
	}

	//setters
	public void setName(String name)
	{
		this.name = name;
	}
}