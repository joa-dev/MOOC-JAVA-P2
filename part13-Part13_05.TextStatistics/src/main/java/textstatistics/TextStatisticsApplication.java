package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        layout.setCenter(new TextArea());
        
        HBox bottomText = new HBox();
        bottomText.getChildren().add(new Label("Letters: 0"));
        bottomText.getChildren().add(new Label("Words: 0"));
        bottomText.getChildren().add(new Label("The longest word is:"));
        
        layout.setBottom(bottomText);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
