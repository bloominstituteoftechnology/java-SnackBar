package javaSnackBar1;

public class Customer {


    
private int id;
private String name;
private double cash;


public Customer(String name, double cash){
 
    maxId++;
    id = maxId;
    this.name = name;
    this.cash = cash;
}

public int getId(){
    return id;
}

public String getName(){
    return name;
}

public double getCash(){
    return cash;
}

}

