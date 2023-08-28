package FlightControl;

import FlightControl.Logic.FlightControl;
import FlightControl.ui.UserInterface;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl fc = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(fc, scanner);
        
        ui.startAssetControl();
        
        ui.startFlightControl();
    }
}
/*
flightControl - includes the main program class that is needed to start the program
flightControl.domain - includes the classes that represent concepts of the problem domain: Airplane, Flight, and Place
flightControl.logic - includes the functionality that is used to control the application
flightControl.ui - includes the textual user interface
*/
