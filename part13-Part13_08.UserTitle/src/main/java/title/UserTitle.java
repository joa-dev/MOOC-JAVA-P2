package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application {

    @Override
    public void start(Stage window) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        //it didn't work with Parameters, but without it, it works(?)
        window.setTitle(input);
        window.show();
    }
}
