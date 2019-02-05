package snackbar;

public class Customer {
    private static int maxId;
    private int id;
    private String name;
    private double cash;
    private Snack stock[];

    public Customer(String name, int cash) {
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