
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joa-dev
 */
public class Box implements Packable {
    private double initialCapacity;
    private double capacity;
    
    private ArrayList<Packable> packables;
    
    public Box(double initialCapacity) {
        this.initialCapacity = initialCapacity;
        this.capacity = initialCapacity;
        this.packables = new ArrayList<>();
    }
    
    public void add(Packable pack) {
        if (capacity >= pack.weight()) {
            packables.add(pack);
            capacity -= pack.weight();
        }
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for (Packable pack : packables) {
            weight += pack.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + packables.size() + " items, total weight " + weight() + " kg";
    }
    
}
