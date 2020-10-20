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

    @Override
    public String toString() {
        String rtnString = name + " " + "cash on hand" + " " +  cash;
        return rtnString;
    }
}