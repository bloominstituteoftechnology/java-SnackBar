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

    public void addCash(double cash)
    {
        this.cash = cash;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public void addSnack(int quantity, Snack snack)
    {
        snack.addSnack(quantity);
        this.cash -= snack.getCost(quantity);
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