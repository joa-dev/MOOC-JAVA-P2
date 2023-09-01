
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
public class Pipe<T> {
    ArrayList<T> pipe;
    
    public Pipe(){
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        pipe.add(value);
    }
    
    public T takeFromPipe() {
        if (pipe.isEmpty()) {
            return null;
        } else {
            T value = pipe.get(0);
            pipe.remove(0);
            return value;
        }
    }
    
    public boolean isInPipe() {
        return pipe.isEmpty() ? false : true;
    }
    
}
