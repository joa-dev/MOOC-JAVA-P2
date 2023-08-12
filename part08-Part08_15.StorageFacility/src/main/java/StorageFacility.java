
import java.util.ArrayList;
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
public class StorageFacility {

    HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (storage.containsKey(unit)) {
            storage.get(unit).add(item);
        } else {
            storage.put(unit, new ArrayList<String>());
            storage.get(unit).add(item);
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        if (storage.containsKey(storageUnit)) {
            return storage.get(storageUnit);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String storageUnit, String item) {
        if (storage.get(storageUnit).contains(item)) {
            storage.get(storageUnit).remove(item);
        }
        if (storage.get(storageUnit).isEmpty()) {
            storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> stU = new ArrayList<>();
        for (String key : storage.keySet()) {
            if (storage.get(key).isEmpty()) {
                continue;
            }
            stU.add(key);
        }
        return stU;
    }
}
