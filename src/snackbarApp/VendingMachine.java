package snackbarApp;

public class VendingMachine
{
    private static int maxId = 0;
    public int id;
    public String name;

    public VendingMachine(String name)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}