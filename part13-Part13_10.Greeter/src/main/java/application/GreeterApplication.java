package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public void start(Stage window) {
        //First scene
        GridPane firstView = new GridPane();
        Label instructions = new Label("Enter your name and start.");
        TextField inputText = new TextField();
        Button start = new Button("Start");
        firstView.add(instructions, 0, 0);
        firstView.add(inputText, 0, 1);
        firstView.add(start, 0, 2);
        //Styling
        firstView.setPrefSize(250, 250);
        firstView.setAlignment(Pos.CENTER);
        firstView.setVgap(10);
        firstView.setHgap(10);
        firstView.setPadding(new Insets(15, 15, 15, 15));

        //Second scene
        StackPane secondView = new StackPane();
        Label welcome = new Label();
        //Styling
        secondView.setPrefSize(200, 200);
        secondView.setAlignment(Pos.CENTER);
        secondView.getChildren().add(welcome);

        Scene firstScene = new Scene(firstView);
        Scene secondScene = new Scene(secondView);

        //Event handling
        start.setOnAction(event -> {
            //input.append(inputText.getText());
            String input = inputText.getText();
            welcome.setText("Welcome " + input + "!");
            window.setScene(secondScene);
        });

        window.setScene(firstScene);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}