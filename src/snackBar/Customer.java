package snackBar;

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

    public double getWallet()
    {
        return wallet;
    }

    // public void setWallet(double wallet)
    // {
    //     this.wallet = wallet;
    // }

    public void moneyAdd(double added)
    {
        this.wallet = this.wallet + added;
    }

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