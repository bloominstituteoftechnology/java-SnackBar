package java-SnackBar;

public class Vending {
    private int id;
    private String name;

    public class Vending(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public String setName(String name) {
        this.name = name;
    }
}