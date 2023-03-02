package screens;

import abstr.DisplayElement;
import abstr.Observer;
import abstr.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private  float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("weather forecast");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
