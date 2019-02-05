/* 

Instantiate 2 customers

i. Jane with $45.25
ii. Bob with $33.14

Instantiate 3 Vending Machines

i. Food
ii. Drink
iii. Office

Instantiate 5 snacks

In Vending Machine Food

i. 36 Chips at $1.75
ii. 36 Chocolate Bar at $1.00
iii. 30 Pretzel at $2.00

In Vending Machine Drink

i. 24 Soda at $2.50
ii. 20 Water at $2.75
*/ 

package snackBar;

public class Main {
    private static void snackBar() {
        Customers Jane = new Customers("Jane", 45.25);
        Customers Bob = new Customers("Bob", 33.14);

        VendingMachines Food = new VendingMachines("Food");
        VendingMachines Drink = new VendingMachines("Drink");
        VendingMachines Office = new VendingMachines("Office");

        Snacks Chips = new Snacks("Chips", 36, 1.75, Food.id);
        Snacks ChocolateBar = new Snacks("Chocolate Bar", 36, 1.00, Food.id);
        Snacks Pretzel = new Snacks("Pretzel", 30, 2.00, Food.id);
        Snacks Soda = new Snacks("Soda", 24, 2.50, Drink.id);
        Snacks Water = new Snacks("Water", 20, 2.75, Drink.id);
    }

    public static void main(String[] args) {
        snackBar();
    }
}



