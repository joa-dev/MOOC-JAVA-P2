/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.Domain.Airplane;
import FlightControl.Domain.Flight;
import FlightControl.Domain.Place;
import FlightControl.Logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author joa-dev
 */
public class UserInterface {

    private FlightControl flightControl;
    private Scanner scanner;

    public UserInterface(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void startAssetControl() {
        while (true) {
            System.out.println("Airport Asset Control");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            String input = scanner.nextLine();

            if (input.equals("1")) {
                addAirplane();
            } else if (input.equals("2")) {
                addFlight();
            } else if (input.equals("x")) {
                break;
            }
        }
    }

    public void addAirplane() {
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity: ");
        int capacity = Integer.valueOf(scanner.nextLine());

        flightControl.addAirplane(new Airplane(id, capacity));
    }

    public void addFlight() {
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println("Give the departure airport id: ");
        String departureSt = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String targetSt = scanner.nextLine();

        Airplane airplane = flightControl.getAirplane(id);
        Place departure = new Place(departureSt);
        Place target = new Place(targetSt);

        flightControl.addFlight(new Flight(airplane, departure, target));
    }
    
    
    //PART 2
    public void startFlightControl() {
        while (true) {
            System.out.println("Flight Control");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            String input = scanner.nextLine();

            if (input.equals("1")) {
                flightControl.printAirplanes();
            } else if (input.equals("2")) {
                flightControl.printFlights();
            } else if (input.equals("3")) {
                printAirplaneDetails();
            } else if (input.equals("x")) {
                break;
            }
        }
    }
    
    public void printAirplaneDetails() {
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println(flightControl.getAirplane(id).toString());
    }
}
