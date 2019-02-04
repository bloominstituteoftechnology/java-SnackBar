package java-SnackBar

class Vending {
	private static int maxId = 0;
	public int id;
	public String name;

	public Vending(String name) {
		this.id += maxId;
		this.name = name;
	}

	public static String getName() {
		return name;
	}

	public int getID() {
		return id;
	}
}
