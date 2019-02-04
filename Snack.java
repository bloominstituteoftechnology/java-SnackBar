package javaSnackBar;

class Snack {
	private static int maxId = 0;
	public int id;
	public String name;
	public int quantity;
	public double cost;
	public int vendingMachineID;

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

	public static double buySnack(int quantity) {
		double totalCost = getTotalCost(quantity);
		return totalCost;
	}

	public double getTotalCost(int quantity) {
		double total = this.cost * quantity;
		return total;
	}

}
