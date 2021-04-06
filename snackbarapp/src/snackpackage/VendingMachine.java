package snackpackage;

public class VendingMachine
{
	public static int maxId = 0;
	public int id;
	public String name;

	public VendingMachine(String name)
	{
		maxId++;
		id = maxId;
		this.name = name;
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

	@Override
	public String toString()
	{
		return " id " + id + " name " + name;
	}
}

