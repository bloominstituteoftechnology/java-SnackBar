package snackBar;

public class Customer {

    // data
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    // constructor
    public Customer(String name, double cash) {

        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    }


        // methoeds

    // getters:
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    // setters:

    public void setName(String name) {
        this.name = name;
    }


//    add cash to cash on hand

//    Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount
    public void setCash(double cash) {
        this.cash = cash;
    }



    @Override
    public String toString() {
        String rtnString = name + " " + "cash on hand" + " " +  cash;
        return rtnString;
    }
}