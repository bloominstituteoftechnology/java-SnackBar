package snackbarapplication;

public class Snack 
{
    //fields

    private static int maxId = 0;
    private int id;
    private String name;
    private int quality;
    private double cost;
    private int vendMId;


    //methods

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
    public String setName(String name)
    {
        this.name = name;
    }

    public double getCost()
    {
        return cost;
    }
    public double setCost(double cost)
    {
        this.cost = cost;
    }

}
