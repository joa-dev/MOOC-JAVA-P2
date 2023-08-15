
import java.util.Map;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joa-dev
 */
public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        } else {
            cart.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int total = 0;
        for (Item x : cart.values()) {
            total += x.price();
        }
        return total;
    }

    public void print() {
        for (Item x : cart.values()) {
            System.out.println(x.toString());
        }
    }

}
