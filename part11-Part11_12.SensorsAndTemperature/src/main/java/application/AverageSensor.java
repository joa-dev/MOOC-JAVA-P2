/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joa-dev
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        if (sensors.isEmpty()) {
            throw new IllegalStateException("IllegalStateException");
        } else {
            return sensors.get(0).isOn();
        }
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (this.isOn() == false || sensors.isEmpty()) {
            throw new IllegalStateException("IllegalStateException");
        } else {
            int sum = sensors.stream().mapToInt(sensor -> sensor.read()).sum();
            int average = sum / sensors.size();
            readings.add(average);
            return average;
        }
    }
    
    public List<Integer> readings() {
        return readings;
    }
    
}
