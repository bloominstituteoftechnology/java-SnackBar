package snackbarApp;

public class Main {

    public static void main(String[] args) {
        workWithData();
    }

    private static void workWithData() {
        Snack mySnack = new Snack("Chips", 36, 1.75, 2);
        System.out.println(mySnack.toString());   
    }
}