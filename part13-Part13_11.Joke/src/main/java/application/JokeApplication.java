package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    public void start(Stage window) {
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        Label label = new Label("What do you call a bear with no teeth?");

        BorderPane textContainer = new BorderPane();

        HBox menu = new HBox();
        menu.setSpacing(10);
        menu.getChildren().addAll(joke, answer, explanation);

        textContainer.setTop(menu);
        textContainer.setBottom(label);

        joke.setOnAction(event -> label.setText("What do you call a bear with no teeth?"));
        answer.setOnAction(event -> label.setText("A gummy bear."));
        explanation.setOnAction(event -> label.setText("Because it doesn't have teeth. LOL"));

        Scene scene = new Scene(textContainer);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
