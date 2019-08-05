package SnackBar;

public class Snack {
	private static int maxId = 0; // shared across all the objects

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;


	public Snack(String name, int quantity, double cost, int vendingMachineId ) {
		maxId++; // creates a new employee. Id + 1
		id = maxId; // Remembers the last Id that was created.

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	// Getters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getCost() {
		return cost;
	}
	public int getVendingMachineId() {
		return vendingMachineId;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setVendingMachineId(int vendingMachineId) {
		this.vendingMachineId = vendingMachineId;
	}

	@Override
	public String toString()
	{
		String rtnStr = "Name: " + name + "\n" + "Vending Machine ID: " + vendingMachineId + "\n" + "Quantity On Hand: " + quantity + "\n" + "Total Cost of Stock: " + cost * quantity;
		return rtnStr;
	}
}
