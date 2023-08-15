
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joa-dev
 */
public class Warehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.products = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        return products.getOrDefault(product, -99);
    }

    public int stock(String product) {
        if (stock.get(product) != null) {
            return stock.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (stock.get(product) != null && stock.get(product) >= 1) {
            int temp = stock.get(product);
            temp--;
            stock.put(product, temp);
            return true;
        } else {
            return false;
        }
    }
    
    public Set<String> products() {
        Set<String> productsNames = new HashSet<>();
        for (String key : products.keySet()) {
            productsNames.add(key);
        }
        return productsNames;
    }
}
