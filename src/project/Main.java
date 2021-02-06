package project;

public class Main {
    private static void snackBar() {
        System.out.println("Welcome to Dylan's Snack bar");
        Snack snack1 = new Snack("Reese's", 10, 1.50, 1);
        System.out.println(snack1);

    }

    public static void main(String[] arg) {
        // all this method does is call somthing else
        snackBar();
    }
}