package snackbar;
// Customer has id, name, cash on hand
// Customer can add cash, buy given total cash used in purchase, get and set name, get cash on hand.
class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand){
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public void addCashOnHand(double deltaCashOnHand) {
        cashOnHand += deltaCashOnHand;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void buySnack(double cost){
        cashOnHand -= cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}