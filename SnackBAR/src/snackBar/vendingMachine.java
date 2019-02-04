package snackBar; 

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

    // method set to get name
    public String getName()
    {
        return name;
    }
}