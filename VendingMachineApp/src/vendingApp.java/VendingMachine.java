package vendingApp;

public class VendingMachine {

    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(int maxId, String name, int id) {
        maxId++;
        this.id = maxId;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public setName(String name){
        this.name =name;

    }

} // closing bracket for class