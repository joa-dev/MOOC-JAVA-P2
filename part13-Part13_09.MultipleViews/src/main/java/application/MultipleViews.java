package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{
    
    @Override
    public void start(Stage window) {
        
        //First Scene
        BorderPane first = new BorderPane();
        Label firstText = new Label("First view!");
        Button firstButton = new Button("To the second view!");
        first.setTop(firstText);
        first.setCenter(firstButton);
        
        //Second Scene
        VBox second = new VBox();
        Button secondButton = new Button("To the third view!");
        Label secondText = new Label("Second view!");
        second.getChildren().addAll(secondButton, secondText);
        
        //Third Scene
        GridPane third = new GridPane();
        Label thirdText = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        third.add(thirdText, 0, 0);
        third.add(thirdButton, 1, 1);
        
        //Scene constructors
        Scene firstScene = new Scene(first);
        Scene secondScene = new Scene(second);
        Scene thirdScene = new Scene(third);
                
        //Events
        firstButton.setOnAction(event -> window.setScene(secondScene));
        secondButton.setOnAction(event -> window.setScene(thirdScene));
        thirdButton.setOnAction(event -> window.setScene(firstScene));
        
        //Start
        window.setScene(firstScene);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}