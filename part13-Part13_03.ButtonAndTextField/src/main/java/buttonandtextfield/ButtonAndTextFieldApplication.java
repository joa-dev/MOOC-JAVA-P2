package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {
    
    @Override
    public void start(Stage window) {
        Button button = new Button("Some Button");
        TextField textInput = new TextField("I don't need text but I can load it");
        
        FlowPane components = new FlowPane();
        components.getChildren().add(button);
        components.getChildren().add(textInput);
        
        Scene view = new Scene(components);
        
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
