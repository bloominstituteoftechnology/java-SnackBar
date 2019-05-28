package snackBar;

public class Snack {

 private static int maxId=0;
 private int id;
 private String name;
 private int quantity;
 private double cost;
 private int vendingId;

 public Snack(String name,double cost,int vendingId,int quantity){

    maxId++;
    id=maxId;

    this.name=name;
    this.cost=cost;
    this.vendingId=vendingId;
    this.quantity=quantity;


 }

 public int getId(){

    return id;
 }


 public String getName(){

    return name;
 }

 public void setName(String name){

    this.name=name;
 }



 public void setCost(int cost){

    this.cost=cost;
 }

 public double getCost(){

    return cost;
 }

 public int getVendingId(){

    return vendingId;
 }

 public void setVendingId(int vendingId){

    this.vendingId=vendingId;
 }



 public int getQuantity(){

    return quantity;
 }

 public void addQuantity(int quantity){
     if(quantity>0)
     this.quantity+=quantity;
 }

 public void buySnack(int quantity){

    this.quantity-=quantity;
 }

 public double getTotalCost(int quantity){
     
    return quantity*cost;


 }

    
}