package snackBar;

public class Vending {
    private static int maxId = 0;
    public int id;
    private String name;

    public Vending(String name) {
        id = maxId++;
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
       this.name = name;
    }
}