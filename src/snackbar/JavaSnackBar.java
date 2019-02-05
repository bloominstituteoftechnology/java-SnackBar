/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snackbar;

/**
 *
 * @author habib
 */
public class JavaSnackBar {

    /**
     * @param args the command line arguments
     */
    private static void workWithData() {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);
        
        VendMach v1 = new VendMach("Food");
        VendMach v2 = new VendMach("Drink");
        VendMach v3 = new VendMach("Office");
        
        Snack s1 = new Snack("Chips",36,1.75,v1.getId());
        Snack s2 = new Snack("Chocolate Bar",36,1.00,v1.getId());
        Snack s3 = new Snack("Pretzel",30,2.00,v1.getId());
        Snack s4 = new Snack("Soda",24,2.50,v2.getId());
        Snack s5 = new Snack("Water",20,2.75,v2.getId());
        
        System.out.println("\t Query Data \t");
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        workWithData();
    }
}