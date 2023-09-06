package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {
    
    @Override
    public void start(Stage window) {
        TextField text = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        VBox box = new VBox();
        
        box.getChildren().addAll(text, button, label);
        
        button.setOnAction(event ->
            label.setText(text.getText()));
        
        Scene view = new Scene(box);
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
