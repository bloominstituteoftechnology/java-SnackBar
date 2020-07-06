package SnackBar;

public class Customer
{
    private static int maxId=0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash) {
        this.cash = cash;
        this.name = name;

        maxId++;
        this.id = maxId;
    }
        public int getId()
        {
            return id;
        }

        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }

        public void addCash(double amount)
        {
                this.cash = cash + amount;
        }
        public double getCash()
        {
            return cash;
        }

        public void buySnacks(double amount)
            {
                this.cash -= amount;
            }

}