package snackapp;

public class VendingMachine {
    private int maxId = 0;
    private int id;
    private String name;

    public VendingMachine( int id, String name) {
        maxId++;
        this.id = maxId;
        this.name = name;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}