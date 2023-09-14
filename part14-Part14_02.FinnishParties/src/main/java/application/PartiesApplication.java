package application;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        XYChart.Series test = new XYChart.Series();

        //getting info from file
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get("partiesdata.tsv")).forEach(row -> rows.add(row));
            rows.forEach(row -> row.split("\t"));
            System.out.println(rows);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        //.....................
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {
        List<String> rows = new ArrayList<>();

        try {
            String texto = Files.lines(Paths.get("partiesdata.tsv")).toString();
            
            
            /*List<String> pieces = Arrays.asList(row.split("\t"));
            List<String> party = Arrays.asList(rows.forEach(row -> row.split("\t")));
            rows.forEach(row -> party.add(row.split("\t")));
            for (int i = 0; i < party.size(); i++) {
                System.out.println(i + ": " + party.get(i));
            }*/
            System.out.println(texto);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
