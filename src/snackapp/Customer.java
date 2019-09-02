package snackapp;

public class Customer {
    private int maxId = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(int id, String name, double cash){
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cash = cash;
    }
    public void addCash(double addedCash) {
        this.cash += addedCash;
    }
    public void buySnack(double totalCash) {
        if (this.cash >= totalCash) {
        this.cash -= totalCash;
        } else {
            System.out.println("not enough money for that");
        }
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCash(){
        return this.cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }
}