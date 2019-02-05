package snackbar;

public class Customer {
    private static int maxId;
    private int id;
    private String name;
    private double cash;
    private Snack stock[];

    public Customer(String name, double cash) {
        stock = new Snack[1000];
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cash = cash;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public void addCash(int cash) {
        this.cash += cash;
    }

    public boolean buy(Snack item, int quantity) {
        if (cash > item.getCost(quantity)) {
            for (int i = 0; i <= quantity; i++) {
                stock[i] = item;
            }
            cash -= item.getCost(quantity);
            return true;
        }
        return false;
    }
}