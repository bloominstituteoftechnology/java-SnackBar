package snackbar;

public class Snacks {
    // fields or attributes (each item)
    // balue of ALL fields together is the state of the object
    // integers are lowercase because it is a base type
    // String is uppercase because it is a class. By convention all classes are
    // uppercase

    private static int maxid = 0;
    // static shared across all objects

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingid;
    // camelCase may cause issues later on.. don't use it.

    // the constructor- sets the inital state
    public Snacks(String name, double cost, int quantity, int vendingid) {
        maxid++;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.vendingid = vendingid;
    }

    // methods / behaviors -- getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // methods
    public void addQuantity (int quantity)
    {

        this.quantity = this.quantity + quantity;
    }