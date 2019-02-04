package snackApp;

public class Machine
{

    // Incrementing static id to create unique ids per object
    private static int maxId = 0;

    // Vending machine has id, name
    private int id;
    private String name;


    // The constructor
    public Machine(String name)
    {
        // Set id, then increment max id
        id = maxId;
        maxId++;
        // Load the name into the object
        this.name = name;

    }

    // Vending Machine set and return name

    // Getter methods

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    // Setter methods

    public void setName(String name)
    {
        this.name = name;
    }

}


