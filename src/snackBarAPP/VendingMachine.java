package snackBarAPP;

class VendingMachine {
    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(String name) {
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
}