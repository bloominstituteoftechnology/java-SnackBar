package snackbarApp;

public class Customer
{
    private static int maxId = 0;

    public int id;
    public String name;
    public double cash;

    public Customer(String name, double cash)
    {
        maxId++;
        this.id = maxId;

        this.name = name;
        this.cash = cash;

    }
    
    public void addCash(double add)
    {
        // double moreCash;
        // moreCash = cash + cash;

    }

    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                        "name: " + name + "\n" +
                        "cash: " + cash + "\n";

        return rtnStr;
    }
}