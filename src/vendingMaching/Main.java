package vendingMaching;

public class Main {
    public static void main(String[] args){
        workWithData();
    }

    private static void workWithData() {

        Snack kitkatSnack = new Snack("KitKat", 32, 2.99, 1);
        
        kitkatSnack.additems(2);
        kitkatSnack.buysnack(3);
        kitkatSnack.totalcost(5);
    }
}
