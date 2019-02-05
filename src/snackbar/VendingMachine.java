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
        int count = 0;

        for (int i = 0; i < testStock.length; i++) {
            if (testStock[i] == item && count < quantity) {
                testStock[i] = null;
                testBool = true;
                count++;
            }
        }
        if (!testBool) {
            return false;
        }
        stock = testStock;
        return true;
    }

    public boolean stockItem(Snack item, int quantity) {
        int total = currentStock + quantity;
        if (total > 999) {
            System.out.println("Stock failed:" + item.getName());
            return false;
        }
        for (int i = currentStock; i < total; i++) {
            stock[currentStock] = item;
            currentStock++;
        }
        return true;
    }

    public int getItemStock(Snack item) {
        int count = 0;
        for (int i = 0; i < currentStock; i++) {
            if (stock[i] instanceof Snack && (stock[i].getName() == item.getName())) {
                count++;
            }
        }
        return count;
    }
}
