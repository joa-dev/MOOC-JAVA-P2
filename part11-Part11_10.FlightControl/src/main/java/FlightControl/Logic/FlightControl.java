/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.Logic;

import FlightControl.Domain.Airplane;
import FlightControl.Domain.Place;
import FlightControl.Domain.Flight;
import java.util.HashMap;

/**
 *
 * @author joa-dev
 */
public class FlightControl {

    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public Airplane getAirplane(String id) {
        return airplanes.get(id);
    }

    public void addAirplane(Airplane airplane) {
        airplanes.put(airplane.getId(), airplane);
    }

    public void addFlight(Flight flight) {
        flights.put(flight.toString(), flight);
    }
    
    public void printAirplanes() {
        this.airplanes.values().stream()
                .forEach(airplane -> System.out.println(airplane.toString()));
    }
    
    public void printFlights() {
        this.flights.values().stream()
                .forEach(flight -> System.out.println(flight.toString()));
    }

}
