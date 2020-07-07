package snackBarApp;

public class Main {
    private static void snacktime(){
        System.out.println("Working!");

        Customer cust1 = new Customer("Teagan", 300);
        Customer cust2 = new Customer("Mike", 700);

        System.out.println(cust1);
        System.out.println(cust2);

        VendingMachine v1 = new VendingMachine("Food/Sweets");
        VendingMachine v2 = new VendingMachine("Sodas");

        System.out.println(v1);
        System.out.println(v2);

        Snack chocolate = new Snack("Choclate", 5, 5.00, v1.getid());
        Snack lays = new Snack("Lays", 5, 1.25, v1.getid());

        Snack mellowyellow = new Snack("Mellow Yellow", 3, 2.50, v2.getid());
        Snack coke = new Snack("Coke", 15, 2.50, v2.getid());

        System.out.println("Sodas: " +mellowyellow+ ", " + coke + ", Food/Sweets: " + chocolate + ", " + lays);


        //Buying Snacks

        double firstbuy = cust1.buySnack(chocolate.getcost() * 2);
        chocolate.setquantity(chocolate.getquantity() -2 );

        double secondbuy = cust2.buySnack(lays.getcost() * 1);
        lays.setquantity(lays.getquantity() -1);

        System.out.println(cust1.getname() + " bought 2 " + chocolate.getname() +" and we now have " + chocolate.getquantity() + " left." );
        System.out.println(cust2.getname() + " bought 1 " + lays.getname() +" and we now have " + lays.getquantity() + " left." );

        cust1.setcashonhand(cust1.getcashonhand() + 5);
        System.out.println(cust1.name + " earned 5 dollars for working for 2 minutes! They now have: " + cust1.getcashonhand()+ " dollars!");

        cust2.setcashonhand(cust2.getcashonhand() + 200);
        System.out.println(cust2.name + " earned 200 dollars for working for 2 minutes! Kinda screwed up! They now have: " + cust2.getcashonhand()+ " dollars!");
    }

    public static void main(String[] args) {
        snacktime();
    }
}