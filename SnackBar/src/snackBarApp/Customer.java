package snackBarApp;

public class Customer {
    private static int maxId = 0;

    public int id;
    public String name;
    public double cashonhand;



    public Customer(String name, double cashonhand) {
        maxId++;
        id=maxId;
        this.name = name;
        this.cashonhand= cashonhand;
    }


    //Getters
    public String getname() {
        return name;
    }

    public double getcashonhand(){
        return cashonhand;
    }

    //Setters
    public void setname(String name) {
        this.name = name;
    }

    public void setcashonhand(double cashonhand) {
        this.cashonhand = cashonhand;
    }

    
    public double buySnack(double price) {
        setcashonhand(cashonhand - price);
        return cashonhand;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Cash: " + cashonhand;
    }
}