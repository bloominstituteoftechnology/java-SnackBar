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
public class VendMach {
    private static int maxId = 0;
    private int id;
    private String name;
    
    public VendMach (String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }
    
    public String getName () {
        return name;
    }
    
    public int getId () {
        return id;
    }
    
    public void setName (String name) {
        this.name = name;
    }
}