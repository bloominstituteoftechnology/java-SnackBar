package snackbarapplication;

public class Snack 
{
    //fields

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendMId;

    //constructor 

    public Snack(String name, int quantity, double cost, int vendMId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendMId = vendMId;
    }


    //methods

        //getters

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }
    
     public double getCost()
    {
        return cost;
    }

    public int vendMId()
    {
        return vendMId;
    }

    public double getTotalCost(int quantity)
    {
        return cost * quantity;
    }

    //setters 

    public void setName(String name)
    {
        this.name = name;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public void setVendMId(int vendMId)
    {
        this.vendMId = vendMId;
    }

    public void addQuality(int quantity)
    {
        this.quantity= this.quantity + quantity;
    }
    public void buySnack(int quantity)
    {
        this.quantity = this.quantity - quantity;
    }
    
}
