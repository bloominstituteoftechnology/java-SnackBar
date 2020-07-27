package snackbar;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine vm1 = new VendingMachine("Food");
    VendingMachine vm2 = new VendingMachine("Drink");
    VendingMachine vm3 = new VendingMachine("Office");
    
    Map<Integer, VendingMachine> machines = new HashMap<>();
    machines.put(vm1.getId(), vm1);
    machines.put(vm2.getId(), vm2);
    machines.put(vm3.getId(), vm3);

    Snack s1 = new Snack("Chips", 36, 1.75, 1);
    Snack s2 = new Snack("Chocolate Bar", 36, 1, 1);
    Snack s3 = new Snack("Pretzel", 30, 2, 1);
    Snack s4 = new Snack("Soda", 24, 2.5, 2);
    Snack s5 = new Snack("Water", 20, 2.75, 2);

    List<Snack> snacks = new ArrayList<>();

    snacks.add(s1);
    snacks.add(s2);
    snacks.add(s3);
    snacks.add(s4);
    snacks.add(s5);

    c1.buySnacks(s4.buySnack(3));
    System.out.println(c1);
    System.out.println(s4.printQuantity());

    c1.buySnacks(s3.buySnack(1));
    System.out.println(c1);
    System.out.println(s3.printQuantity());

    c2.buySnacks(s4.buySnack(2));
    System.out.println(c2);
    System.out.println(s4.printQuantity());

    c1.addCash(10);
    System.out.println(c1);
    System.out.println();
    
    c1.buySnacks(s2.buySnack(1));
    System.out.println(c1);
    System.out.println(s2.printQuantity());

    s3.addQuantity(12);
    System.out.println(s3.printQuantity());

    c2.buySnacks(s3.buySnack(3));
    System.out.println(c2);
    System.out.println(s3.printQuantity());

    for (Snack s : snacks) {
      System.out.println(s.stretch(machines.get(s.getVendingMachineid()).getName()));
    }
  }
}