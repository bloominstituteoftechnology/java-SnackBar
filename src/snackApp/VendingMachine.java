package snackApp;  //uses the same package of the project

public class VendingMachine //create class that is all can see
{
	private static int maxId = 0; //id that is same throughout project
	private int id; //id that is specific to this project
	private String name;

//create a constructor class
	public VendingMachine (String name) //constructor class that takes a single parameter
	{
		maxId++;
		id = maxId; //do not need this method cause theres only one id that is being use by individual person
		this.name = name; //use this key word to refers to the parameter name
	}
//create getter and setter method
	public int getId() //getter to retrieve id
	{
		return id;
	}

	public String getName() //get name and return name string
	{
		return name; //setter or return name
	}
}
