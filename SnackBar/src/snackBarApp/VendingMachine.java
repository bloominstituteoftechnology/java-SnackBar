package snackBarApp;

public class VendingMachine {
    private static int maxId = 0;

    public int id;
    public String name;



    public VendingMachine(String name) {
        maxId++;
        id= maxId;
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public int getid() {
        return id;
    }

    public void setname(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Vending Machine ID: " + id;
    }
}