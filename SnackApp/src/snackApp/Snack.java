package snackApp;

public class Snack
{
    
    // Incrementing static id to create unique ids per object
    private static int maxId = 0;

    // Snack has id, name, quantity, cost, vending machine id
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;


    // The constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {

        // Set current id, then increment maxid
        id = maxId;
        maxId++;

        // Load the arguments into the object
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }



    //Snack can set name, get quantity, add quantity given quantity, buy snack given quantity, get total cost given a quantity

    // Getter methods
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

    public int getVendId()
    {
        return vendingMachineId;
    }

    public double getCost(int quantity)
    {
        return quantity * cost;
    }

    // Setter methods

    public void setName(String name)
    {
        this.name = name;
    }

    public void addQuantity(int quantity) 
    {
        this.quantity += quantity;
    }

    public void buySnack(int quantity)
    {
        // Determine if there are enough of this snack to buy the requested amount
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            System.out.println("The machine dispenses " + quantity + " " + this.name + ".");
        }
        else {
            System.out.println("There aren't that many " + this.name + "!");
        }
    }





}