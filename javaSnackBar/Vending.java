package javaSnackBar;

class Vending {
	private static int maxId = 0;
	private int id;
	private String name;

	public Vending(String name) {
		this.id += maxId;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return id;
	}
}
