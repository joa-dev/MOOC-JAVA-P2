package application;

import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");

        /*idk why but this solution doesn't render the line between points
        HashMap<Integer, Integer> data = new HashMap<>();
        data.put(2007, 73);
        data.put(2008, 68);
        data.put(2009, 72);
        data.put(2010, 72);
        data.put(2011, 74);
        data.put(2012, 73);
        data.put(2013, 76);
        data.put(2014, 73);
        data.put(2015, 67);
        data.put(2016, 56);
        data.put(2017, 56);

        data.keySet().stream().forEach(key -> {
            XYChart.Series dataChart = new XYChart.Series();
            dataChart.getData().add(new XYChart.Data(key, data.get(key)));
            lineChart.getData().add(dataChart);
        });
         */
        
        XYChart.Series dataChart = new XYChart.Series();

        dataChart.getData().add(new XYChart.Data(2007, 73));
        dataChart.getData().add(new XYChart.Data(2008, 68));
        dataChart.getData().add(new XYChart.Data(2009, 72));
        dataChart.getData().add(new XYChart.Data(2010, 72));
        dataChart.getData().add(new XYChart.Data(2011, 74));
        dataChart.getData().add(new XYChart.Data(2012, 73));
        dataChart.getData().add(new XYChart.Data(2013, 76));
        dataChart.getData().add(new XYChart.Data(2014, 73));
        dataChart.getData().add(new XYChart.Data(2015, 67));
        dataChart.getData().add(new XYChart.Data(2016, 56));
        dataChart.getData().add(new XYChart.Data(2017, 56));

        lineChart.getData().add(dataChart);

        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
