package snackBarApp;;

public class VendingMachine
{
    private static int maxId = 0;

    public int id;
    public String name;

    public void setName(String name)
    {
        this.id = maxId++;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}