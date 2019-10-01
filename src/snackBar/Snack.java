package snackBar;

public class Snack
{
    //fields
        private static int maxId =0;
        private int id;
        private String name;
        private int quantity;
        private double cost;
        private int vendingMachineId;

        //constructor-initial state of the object
    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id=maxId;

        this.name=name;
        this.quantity=quantity;
        this.cost=cost;
        this.vendingMachineId=vendingMachineId;
    }
    //getters and setters
    public int getId(){
     return id;
    }
            //setter
    public void setName(String name){
        this.name=name;
        //this keyword tells the arg that name arg is going to be assigned to this.name which is the field of the obj.
        //void means that it returns nothing
    }
            //getting
    public String getName(){
        return name;
        //a get will always return something
    }    
    public void setCost(double cost){
        this.cost=cost;
    }
    public double getCost(){
        return cost;
    }    
    public void setVendingMachineId(int vendingMachineId){
        this.vendingMachineId=vendingMachineId;
    }
    public int getVendingMachineId(){
        return vendingMachineId;
    }
    public int getQuantity(){
        return quantity;
    }
    public int addQuantity(int amount){
        //dont forget to put the TYPE in the params, "int" here.
        return quantity + amount;
    } 
    public int subQuantity(int amount){
        //dont forget to put the TYPE in the params, "int" here.
        return quantity - amount;
    }
    public double buyASnack(double cash, double cost){
        return ((double)cash - (double)cost); //100 needs to be changed to customers money amount
    }
    public double totalCost(double cost, int quantity){
        return cost * quantity;
    }

}




