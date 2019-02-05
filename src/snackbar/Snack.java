/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snackbar;

/**
 *
 * @author habib
 */
public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity = 0;
    private double cost;
    private int vendMachId;
    
    public Snack (String name, int quantity, double cost) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public void setQuantity (int quantity) {
        this.quantity += quantity;
    }
    
    public void setCost (double cost) {
        this.cost = cost;
    }
    
    public int getQuantity () {
        return quantity;
    }
    
//    public void buySnack (int quantity) {
//        this.quantity -= quantity;
//    }
    
    public double getTotalCost (int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            cost = quantity * this.cost;
            return cost;
        }
        throw new UnsupportedOperationException();
    }
}