package application;

// END SOLUTION
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VocabularyPracticeApplication extends Application {

    private Dictionary dictionary;

    @Override
    public void init() throws Exception {
        // 1. Create the dictionary that the application uses
        this.dictionary = new Dictionary();
    }

    @Override
    public void start(Stage window) throws Exception {
        PracticeView practiceView = new PracticeView(dictionary);
        InputView inputView = new InputView(dictionary);

        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        Button newWords = new Button("Enter new words");
        Button practice = new Button("Practice");

        menu.getChildren().addAll(newWords, practice);
        layout.setTop(menu);

        newWords.setOnAction(event -> layout.setCenter(inputView.getView()));
        practice.setOnAction(event -> layout.setCenter(practiceView.getView()));

        layout.setCenter(inputView.getView());

        Scene view = new Scene(layout, 400, 300);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
