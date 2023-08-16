
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joa-dev
 */
public class Herd implements Movable {
    private List<Organism> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public String toString() {
        String temp = "";
        for (Organism i : herd) {
            temp += i.toString() + "\n";
        }
        return temp;
    }
    
    public void addToHerd(Movable movable) {
        herd.add((Organism) movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Organism i : herd) {
            i.move(dx, dy);
        }
    }
    
    
}
