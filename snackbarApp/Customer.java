package snackbarApp;

public class Customer {
    private static int maxId = 1;
    private int id;

    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        id = maxId;
        maxId++;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }
    
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCash(double cash){
        cashOnHand = cashOnHand + cash;
    }

    public double getCashOnHand() {
        return  cashOnHand;
    }

    public void buySnack(double cost){
        cashOnHand = cashOnHand - cost;
    }

}
