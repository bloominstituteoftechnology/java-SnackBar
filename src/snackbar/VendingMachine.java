package snackbar;

public class VendingMachine {
    private static int maxId;
    private static int currentStock;
    private int id;
    private String name;
    private Snack stock[];

    public VendingMachine(String name) {
        stock = new Snack[1000];
        maxId++;
        this.id = maxId;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean sell(Snack item, int quantity) {
        Snack[] testStock = stock;
        boolean testBool = false;

        for (int i = 0; i < testStock.length; i++) {
            if (testStock[i] == item) {
                testStock[i] = null;
                testBool = true;
            }
        }
        if (!testBool) {
            return false;
        }
        stock = testStock;
        return true;
    }

    public boolean stockItem(Snack item, int quantity) {
        if (currentStock + quantity > 999)
            return false;
        for (int i = 0; i < quantity; i++) {
            stock[currentStock] = item;
            currentStock++;
        }
        return true;
    }
}
