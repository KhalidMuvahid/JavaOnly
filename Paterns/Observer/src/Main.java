import screens.CurrentConditionsDisplay;
import screens.ForecastDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData =new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(22,34,55);


    }
}