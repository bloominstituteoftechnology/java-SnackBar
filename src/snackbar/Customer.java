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
public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash = 0;
    
    public Customer (String name, double cash) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    }
    
    public void setCash (double cash) {
        this.cash += cash;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public double getCash () {
        return cash;
    }
    
    public String getName () {
        return name;
    }
    
    public void makePurchase(int quantity, Snack snack) {
//        System.out.println("\n\n" + snack.getTotalCost(quantity) +" cash "+cash);
        if (cash >= snack.getTotalCost(quantity) && quantity <= snack.getQuantity()) {
//            System.out.println("in the conditional statement");
            cash -= snack.getTotalCost(quantity);
            snack.buySnack(quantity);
        } else {
            if (cash < snack.getTotalCost(quantity))
                throw new UnsupportedOperationException("Not enough cash");
            if (quantity > snack.getQuantity())
                throw new UnsupportedOperationException("Not enough quantity");
        }
    }
    
}