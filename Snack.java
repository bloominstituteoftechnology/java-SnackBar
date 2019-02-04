package java-SnackBar

class Snack {
	private static int maxId = 0;
	public int id;
	public String name;
	public int quantity;
	public int cost;
	public int vendingMachineID;

	public Snack(String name, int cost) {
		this.id += maxId;
		this.name = name;
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public static void addQuantity(int quantity) {
		this.quantity += quantity;
	}

	public static int buySnack(int quantity) {
		int totalCost = getTotalCost(quantity);
		return totalCost;
	}

	public static int getTotalCost(int quantity) {
		int total = this.cost * quantity;
		return total;
	}

}
