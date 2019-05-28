package snackbar;

public class Main
{
	private static void openSnackBar()
	{
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);
	
		
		VendingMachine v1 = new VendingMachine("Food");
		VendingMachine v2 = new VendingMachine("Drink");
		VendingMachine v3 = new VendingMachine("Office");


		Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
		Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());


		Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
		Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

		//Processing
		c1.buySnacks(3, s4);
        System.out.println("*** Customer 1 Jane Data ***");
        System.out.println("Jane's Cash on Hand: " + c1.getCash());
        System.out.println("Qty of Snack 4: " + s4.getQuantity());
        System.out.println("---------------------");

         // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        c1.buySnacks(1, s3);
        System.out.println("*** Customer 1 Jane Data ***");
        System.out.println("Jane's Cash on Hand: " + c1.getCash());
        System.out.println("Qty of Snack 3: " + s3.getQuantity());
        System.out.println("---------------------");

         // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        c2.buySnacks(2, s4);
        System.out.println("*** Customer 2 Bob Data ***");
        System.out.println("Bob's Cash on Hand: " + c2.getCash());
        System.out.println("Qty of Snack 4: " + s4.getQuantity());
        System.out.println("---------------------");

         // Customer 1 finds $10. Print Customer 1 Cash on Hand.
        c1.addCash(10.00);
        System.out.println("*** Customer 1 Data ***");
        System.out.println("Jane's Cash on Hand: " + c1.getCash());
        System.out.println("---------------------");

         // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        c1.buySnacks(1, s2);
        System.out.println("*** Customer 1 Data ***");
        System.out.println("Customer 1's Cash on Hand: " + c1.getCash());
        System.out.println("Qty of Snack 2: " + s2.getQuantity());
        System.out.println("---------------------");

         // Snack 3 gets 12 more. Print quantity of snack 3.
        s3.addQuantity(12);
        System.out.println("*** Snack Data ***");
        System.out.println("Qty of Snack 3: " + s3.getQuantity());
        System.out.println("---------------------");

         // Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
        c2.buySnacks(3, s3);
        System.out.println("*** Customer 2 Data ***");
        System.out.println("Bob's Cash on Hand: " + c2.getCash());
        System.out.println("Qty of Snack 3: " + s3.getQuantity());
        System.out.println("---------------------");
    }

     public static void main(String[] args)
    {
        openSnackBar();
    }
} 


