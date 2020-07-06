package snackBar.java;

public class Snack{
	private static int maxId = 0;
	private String name; 
	private int quantity;
	private double cost;
	private int vendingId;

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public void String setName(String name){
		this.name = name;
	}

	public double getCost(){
		return cost; 
	}

	public void double setCost(int cost){
		this.cost = cost;
	}

	public int getVendingId(){
		return vendingId;
	}

	public int setVendingId(int vendingId){
		this.vendingId = vendingId;
	}

	public int getQuantity(){
		return quantity;
	}

	public int addQuantity(int quantity){
		this.quantity =+ quantity;
	}

	public int buySnack(int quantity){
		this.quantity -= quantity;
	}

	public double getCost(double quantity){
		return quanity * this.cost
	}


}