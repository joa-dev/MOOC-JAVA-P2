package application;

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
        
        
        
        
        
        //.....................
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
        
        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
