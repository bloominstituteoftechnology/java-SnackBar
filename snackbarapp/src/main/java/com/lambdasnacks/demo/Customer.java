package com.lambdasnacks.demo;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double dollars;

    public Customer(String name, double dollars)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.dollars = dollars;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getDollars()
    {
        return dollars;
    }

    public void setDollars(double dollars)
    {
        this.dollars = dollars;
    }

    public void addDollars(double amount)
    {
        this.dollars = this.dollars + amount;
    }

    public void buySnack(double amount)
    {
        this.dollars = this.dollars - amount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dollars=" + dollars +
                '}';
    }
}
