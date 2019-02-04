package snackBarApp;

public class Main
{
    private static void workWithData()
    {
       Customer c1 = new Customer("Jane", 45.25);
       Customer c2 = new Customer("Bob", 33.14);
       System.out.println("customer 1 " + c1);
       System.out.println("Customer 2 " + c2);

       VendingMachine v1 = new VendingMachine("Food");
       VendingMachine v2 = new VendingMachine("Drink");
       VendingMachine v3 = new VendingMachine("Office");
       System.out.println(v1);
       System.out.println(v2);
       System.out.println(v3);

       
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}
