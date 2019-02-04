package java-SnackBar

class Snack {
	private static int maxId = 0;
	public int id;
	public String name;
	public int quantity;
	public int cost;
	public int vendingMachineID;

	public Snack(String name, double cost, int quantity) {
		this.id += maxId;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public static void addQuantity(int quantity) {
		this.quantity += quantity;
	}

	public static double buySnack(int quantity) {
		int totalCost = getTotalCost(quantity);
		return totalCost;
	}

	public static double getTotalCost(int quantity) {
		int total = this.cost * quantity;
		return total;
	}

}
