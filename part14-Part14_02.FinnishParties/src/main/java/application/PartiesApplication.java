package application;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
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

        //getting info from file
        ArrayList<String[]> rows = new ArrayList<>();
        try {
            Files.lines(Paths.get("partiesdata.tsv")).forEach(row -> {
                String[] pieces = row.split("\t");
                rows.add(pieces);
            });
            //System.out.println(rows.get(2)[0].toString());
            //ok, the info is in an ArrayList where every line is divided in Arrays
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        //loading info to XYChart
        rows.stream().forEach(row -> {
            XYChart.Series data = new XYChart.Series();
            //...
        });
        

        //.....................
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {

    }
}
