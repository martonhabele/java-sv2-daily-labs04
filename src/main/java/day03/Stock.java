package day03;

import java.util.List;

public class Stock {
    private List<Double> values;

    public Stock(List<Double> values) {
        this.values = values;
    }

    public double maxProfit() {
        double maximum = 0;

        for (int i = 0; i < values.size(); i++) {
            maximum = dailyDiffs(maximum, i);
        }
        return maximum;
    }

    public double dailyDiffs(double maximum, int i) {
        for (int j = i + 1; j < values.size(); j++) {
            if (maximum < values.get(j) - values.get(i)) {
                maximum = values.get(j) - values.get(i);
            }
        }
        return maximum;
    }
}