/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joa-dev
 */
public class Container {
    private int liquid;
    
    public Container() {
        this.liquid = 0;
    }
    
    public int contains() {
        return liquid;
    }
    
    public void add(int amount) {
        if (amount > 0) {
             liquid += amount;
        }
        
        if (liquid > 100) {
            liquid = 100;
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            liquid -= amount;
        }
        
        if (liquid < 0) {
            liquid = 0;
        }
    }
    
    public String toString() {
        return contains() + "/100";
    }
}