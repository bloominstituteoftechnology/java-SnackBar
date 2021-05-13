package snackbarApp;

public class Main {

    public static void main() {
        workWithData();
    }

    private static void workWithData() {
        Snack mySnack = new Snack("Chips", 36, 1.75, 2);
        System.out.println(mySnack.toString());   
    }
}