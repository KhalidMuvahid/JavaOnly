package screens;

import abstr.DisplayElement;
import abstr.Observer;

public class StatisticDisplay implements Observer, DisplayElement {
    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void display() {
        System.out.println("Statistic Screen");
    }
}
