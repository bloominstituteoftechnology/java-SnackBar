package snackBar;

public class Snack{
	private static int maxId = 0;
	private int id;
	private String name; 
	private int quantity;
	private double cost;
	private int vendingId;

	public Snack(String name, int quantity, double cost, int vendingId){
		maxId++;
		id =maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost; 
		this.vendingId = vendingId;

	}


	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public double getCost(){
		return cost; 
	}

	public void setCost(int cost){
		this.cost = cost;
	}

	public int getVendingId(){
		return vendingId;
	}

	public int setVendingId(int vendingId){
		return this.vendingId = vendingId;
	}

	public int getQuantity(){
		return quantity;
	}

	public int addQuantity(int quantity){
		return this.quantity =+ quantity;
	}

	public int buySnack(int quantity){
		return this.quantity -= quantity;
	}

	public double getCost(double quantity){
		return quantity * this.cost;
	}
}