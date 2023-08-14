
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joa-dev
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        } else {
            double maxValue = history.get(0);
            for (double value : history) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }
            return maxValue;
        }
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        } else {
            double minValue = history.get(0);
            for (double value : history) {
                if (value < minValue) {
                    minValue = value;
                }
            }
            return minValue;
        }
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        } else {
            double sum = 0;
            for (double i : history) {
                sum += i;
            }
            return sum / history.size();
        }
    }

}
