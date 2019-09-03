package snackBar;

public class Customer {

    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCashOnHand() {
        return name + " now has $" + cashOnHand + ".";
    }

    public String addCash(double amount) {
        this.cashOnHand += amount;
        return name + " added $" + amount + ".";
    }

    public String buy(double purchase) {
        if (cashOnHand >= purchase) {
            cashOnHand -= purchase;
        }
        return cashOnHand >= purchase ? name + " spent $" + purchase + "." : name + " doesn't have enough money.";
    }

}