/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.Domain;

/**
 *
 * @author joa-dev
 */
public class Flight {

    private Airplane airplane;
    private Place departure;
    private Place target;

    public Flight(Airplane airplane, Place departure, Place target) {
        this.airplane = airplane;
        this.departure = departure;
        this.target = target;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Place getDeparture() {
        return departure;
    }

    public void setDeparture(Place departure) {
        this.departure = departure;
    }

    public Place getTarget() {
        return target;
    }

    public void setTarget(Place target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return airplane.toString() + " (" + departure.toString() + "-" + target.toString() + ")";
    }
}
