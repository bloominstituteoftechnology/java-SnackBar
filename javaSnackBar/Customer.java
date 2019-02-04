package javaSnackBar;

class Customer {
	private static int maxId = 0;
	public int id;
	public String name;
	public double cash;

	Customer(String name, double cash) {
		this.name = name;
		this.cash = cash;
		this.id += maxId;
	}
	public void addCash(double cash) {
		this.cash += cash;
	}

	public double buy(double cash) {
		this.cash -= cash;
		return cash;
	}

	public String getName() {
		return name;
	}

	public static void setName(String name) {
		// this.name = name;
	}

	public double getCash() {
		return cash;
	}

}
