/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author joa-dev
 */
public class PracticeView {

    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();
    }

    public Parent getView() {
        GridPane layout = new GridPane();

        Label wordInstruction = new Label("Translate the word '" + this.word + "'");
        TextField translationField = new TextField();
        Button check = new Button("Check");
        Label feedback = new Label("");

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        layout.add(wordInstruction, 0, 0);
        layout.add(translationField, 0, 1);
        layout.add(check, 0, 2);
        layout.add(feedback, 0, 3);

        check.setOnMouseClicked(event -> {
            String translation = translationField.getText();
            if (dictionary.get(word).equals(translation)) {
                feedback.setText("Correct!");
            } else {
                feedback.setText("Incorrect! The translation fo the word '" + word + "' is '" + dictionary.get(word) + "'.");
                return;
            }
            this.word = this.dictionary.getRandomWord();
            wordInstruction.setText("Translate the word '" + this.word + "'");
            translationField.clear();
            return;
        });
        return layout;
    }
}
