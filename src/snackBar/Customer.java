package snackBar;
import snackBar.Snack;


public class Customer{
    //fields
    private static int maxId = 0;
	private int id;
	private String name;
	private double cash; // real number - float
 
    //constructor
    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;
        this.name=name;
        this.cash=cash;
    }
    //methods/getters/setters
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCash(){
        return cash;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCash(double cash){
        this.cash=cash;
    }
    public double addCash(double newCash, double cash){
        return newCash + cash;

    }
    public double buyWithCash(double cash, double totalCost){
        return cash - totalCost;
    }
}
