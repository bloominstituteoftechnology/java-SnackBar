package snackbarApp;

public class VendingMachine {
    //fields

    private static int maxId = 1;
    private int id;

    private String name;

    public VendingMachine(String name) {
        id = maxId;
        maxId++;
        this.name = name;
    }

    //Getters and Setters

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getid(){
        return id;
    }
}
