package snackBar; 

// Vending machine has id, name
public class VendingMachine
{
    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine (String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    // GETTERS AND SETTERS--------------------------
    // Vending Machine set and return name

    // method to get name
    public String getName()
    {
        return name;
    }

    // method to set name
    public void setName(String name)
    {
        this.name = name;
    }
}