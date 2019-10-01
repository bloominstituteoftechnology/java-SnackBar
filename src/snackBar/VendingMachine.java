package snackBar;

public class VendingMachine{
    //fields
    //if these have an error you may be missing and getter/setter
    private static int maxId =0;
    private int id;
    private String name;
    //constructor
    public VendingMachine(String name){
        maxId++;
        id=maxId;

        this.name=name;
        
    }
        //getters and setters
        //getter example
    public int getId(){
    return id;
    }
    //setter example
    public void setName(String name){
    this.name=name;
    //this keyword tells the arg that name arg is going to be assigned to this.name which is the field of the obj.
    //void means that it returns nothing
    }
    public String getName(){
        return name;
    }
}