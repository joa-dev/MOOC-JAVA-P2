package textstatistics;

import java.util.Arrays;
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

        TextArea inputText = new TextArea();

        layout.setCenter(inputText);
        
        //Labels without input
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is: ");

        inputText.textProperty().addListener((observable, oldValue, newValue) -> {
            
            //Letters: [number]
            String newValueNoSpaces = newValue;//.replace(" ", "");
            //Test counts a space as a letter (?)
            int chars = newValueNoSpaces.length();
            letters.setText("Letters: " + chars);
            
            //Words: [number]
            String[] parts = newValue.split(" ");
            words.setText("Words: " + parts.length);
            
            //The longest word is: [word]
            String longestS = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            longest.setText("The longest word is: " + longestS);
            
        });

        HBox bottomText = new HBox();
        bottomText.setSpacing(20);
        //Updated labels
        bottomText.getChildren().add(letters);
        bottomText.getChildren().add(words);
        bottomText.getChildren().add(longest);

        layout.setBottom(bottomText);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}
