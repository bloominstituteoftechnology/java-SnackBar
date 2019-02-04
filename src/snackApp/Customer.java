package snackApp;

public class Customer
{
	private static int maxId = 0;  //create class
	public int id;  //anyone can access it and it needs to be id
	public String fname; //anyone can access name
	public String lname;
	public int cashOnHand;

public Customer (String fname, String lname, int cashOnHand) /*Constructor class and add paramater list*/
	 {
		 	maxId++; /*tracks the customer Id  maxId = maxId +1 */
		 	id = maxId;

		 	this.fname = fname;
		 	this.lname = lname;
		 	this.cashOnHand = cashOnHand;

	 }

	 //getters and setters - get information and set the info
	 public int getId() //getter the id - must return a integer value
	 {
	 		return id; //returns integer id number
	 }

	 public String getName() //getter a method that setter or returns employee name
	 {
	 		return fname + " " + lname; //returns name in concanated string
	 }

	 public void setFname(String fname) //
	 {
	 		this.fname = fname; //
	 }

	 public void setLname(String lname) //
	 {
	 		this.lname = lname; //
	 }

	 public int getCashOnHand()
	 {
	 		return cashOnHand;
	 }

	 public void setCashOnHand(int cashOnHand)
	 {
	 		this.cashOnHand = cashOnHand;
	 }

}
