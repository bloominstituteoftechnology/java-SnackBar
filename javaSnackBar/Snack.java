package javaSnackBar;

class Snack {
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineID;

	public Snack(String name, double cost, int quantity, int vendingMachineID) {
		this.id += maxId;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.vendingMachineID = vendingMachineID;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double getCost() {
		return cost;
	}

	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}

	public double buySnack(int quantity) {
		double totalCost = getTotalCost(quantity);
		return totalCost;
	}

	public double getTotalCost(int quantity) {
		double total = this.cost * quantity;
		this.quantity -= quantity;
		return total;
	}

}
