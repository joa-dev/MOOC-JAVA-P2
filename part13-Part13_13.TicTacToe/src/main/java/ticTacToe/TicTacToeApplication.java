package ticTacToe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private Label turn;
    private Button[] buttons;

    public TicTacToeApplication() {
        this.turn = new Label("Turn: X");
        this.buttons = new Button[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = createButton();
        }
    }

    /*public static void buttonLogic() {
        zeroZero
    }*/
    @Override
    public void start(Stage window) {

        BorderPane layout = new BorderPane();

        //this.turn
        Label ended = new Label("");

        //Button grid
        GridPane game = new GridPane();
        game.setAlignment(Pos.CENTER);
        game.setHgap(10);
        game.setVgap(10);

        Button zeroZero = new Button(" ");
        Button zeroOne = new Button(" ");
        Button zeroTwo = new Button(" ");
        Button oneZero = new Button(" ");
        Button oneOne = new Button(" ");
        Button oneTwo = new Button(" ");
        Button twoZero = new Button(" ");
        Button twoOne = new Button(" ");
        Button twoTwo = new Button(" ");

        game.add(zeroZero, 0, 0);
        game.add(zeroOne, 0, 1);
        game.add(zeroTwo, 0, 2);
        game.add(oneZero, 1, 0);
        game.add(oneOne, 1, 1);
        game.add(oneTwo, 1, 2);
        game.add(twoZero, 2, 0);
        game.add(twoOne, 2, 1);
        game.add(twoTwo, 2, 2);

        //Styling
        turn.setFont(Font.font("Monospaced", 30));
        turn.setPadding(new Insets(10, 10, 10, 10));
        ended.setFont(Font.font("Monospaced", 30));
        ended.setPadding(new Insets(10, 10, 10, 10));

        //game.setPadding(new Insets(5, 5, 5, 5));
        zeroZero.setFont(Font.font("Monospaced", 40));
        zeroOne.setFont(Font.font("Monospaced", 40));
        zeroTwo.setFont(Font.font("Monospaced", 40));
        oneZero.setFont(Font.font("Monospaced", 40));
        oneOne.setFont(Font.font("Monospaced", 40));
        oneTwo.setFont(Font.font("Monospaced", 40));
        twoZero.setFont(Font.font("Monospaced", 40));
        twoOne.setFont(Font.font("Monospaced", 40));
        twoTwo.setFont(Font.font("Monospaced", 40));

        layout.setTop(turn);
        layout.setCenter(game);
        layout.setBottom(ended);

        for (int i = 1; i <= 9; i++) {
            if (game.isManaged()) {
                ActionEvent eventX = new ActionEvent();
                if (i % 2 != 0) {
                    try {
                        Button button = eventX.getSource();
                        button.setOnMouseClicked((event) -> button.setText("X"));
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }
                }
            }
        }
/*
                    
                    
*/

        window.setScene(new Scene(layout));
        window.show();

    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    private Button createButton() {
        Button btn = new Button("");
        btn.setFont(Font.font("Monospaced", 40));

        btn.setOnAction(event -> {
            
        });

    }

}
