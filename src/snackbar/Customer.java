package snackbar;

public class Customer
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashOnHand;
	private Boolean addCash;
	private int buyTotalUsed;

	public Customer(String name, double cashOnHand, Boolean addCash, int buyTotalUsed)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.cashOnHand = cashOnHand;
		this.addCash = addCash;
		this.buyTotalUsed = buyTotalUsed;
	}

	public int getCashOnHand()
	{
		return cashOnHand;
	}

	public void setCashOnHand()
	{
		this.cashOnHand = cashOnHand;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Boolean getAddCash()
	{
		return addCash;
	}

	public void setAddCash(Boolean addCash)
	{
		this.addCash = addCash;
	}

	public int getBuyTotalUsed()
	{
		return getBuyTotalUsed;
	}

	public void setBuyTotalUsed;
	{
		this.buyTotalUsed = buyTotalUsed;
	}

	@Override
	public String toString()
	{
		String rtnStr = "id: " + id + "\n" +
						"name: " + name + "\n" +
						"cashOnHand: " + cashOnHand + "\n" +
						"addCash: " + addCash + "\n" +
						"buyTotalUsed: " + buyTotalUsed + "\n";
		return rtnStr;
	}



}