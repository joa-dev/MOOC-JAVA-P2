
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehicleRegistry.get(licensePlate) == null) {
            vehicleRegistry.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate licensePlate) {
        return vehicleRegistry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (vehicleRegistry.containsKey(licensePlate)) {
            vehicleRegistry.remove(licensePlate, vehicleRegistry.get(licensePlate));
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates() {
        for (LicensePlate key : vehicleRegistry.keySet()) {
            System.out.println(key.toString());
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : vehicleRegistry.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }
}
