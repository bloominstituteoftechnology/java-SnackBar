package snackbarApp;

public class Main
{   // instantiating new Objs
    public static void workWithData()
    {
       Customer c1 = new Customer("Jane", 45.25);
       Customer c2 = new Customer("Bob", 33.14);

       VendingMachine v1 = new VendingMachine("Food");
       VendingMachine v2 = new VendingMachine("Drink");
       VendingMachine v3 = new VendingMachine("Office");

       Snack s1 = new Snack("Chips", 36, 1.75);
       Snack s2 = new Snack("Chocolate bar", 36, 1.00);
       Snack s3 = new Snack("Pretzel", 30, 2.00);
    //    Snack s4 = new Snack("Soda", quantity, cost);

        System.out.println("*** Data ***");
        System.out.println(c1);
        System.out.println(s1);

        System.out.println("*** Data Types - Numbers ***");
        System.out.println("Original divided 5 " + c1.cash / 5);

        jane.addSnack(3, soda);
        System.out.println("Jane cash: " + jane.getCash());
        System.out.println(soda.getQuantity() + "Soda left");
    }
    //psvm
    public static void main(String[] args)
    {
        workWithData();
    }
}