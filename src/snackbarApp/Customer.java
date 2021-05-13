package snackbarApp;

public class Customer {
    //fields
    private static int maxId = 1;
    private int id;

    private String name;
    private double cashonhand;

    //Constructor

    public Customer(String name, double cashonhand){
        id = maxId;
        maxId++;
        this.name = name;
        this.cashonhand = cashonhand;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public double getCashOnHand() {
        return cashonhand;
    }
    public void setCashOnHand(double cashonhand) {
        this.cashonhand = cashonhand;
    }

    public void addCashOnHand(double cash){
        this.setCashOnHand(getCashOnHand() + cash);
    }

    public int getid(){
        return id;
    }

    public void buySnacks(double snackCost){
        setCashOnHand(cashonhand - snackCost);
    }

}
