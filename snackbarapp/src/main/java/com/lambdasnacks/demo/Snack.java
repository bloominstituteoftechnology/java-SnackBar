package com.lambdasnacks.demo;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double price;
    private int vendingMachineId;

    public Snack(String name, int quantity, double price, int vendingMachineId) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.vendingMachineId = vendingMachineId;
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

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public void addQuantity(int amount)
    {
        this.quantity = this.quantity + amount;
    }

    public void buySnack(int amount)
    {
        this.quantity = this.quantity - amount;
    }

    public double getTotal(int amount)
    {
        double totalPrice = this.price * amount;
        return totalPrice;
    }
}
