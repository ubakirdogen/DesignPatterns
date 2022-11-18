package com.headfirst.observer;

public class WeatherDataTestDrive {

    public static void main(String[] args) {
        WeatherDataImpl weatherData = new WeatherDataImpl(15.84, 83.21, 1.22);
        DisplayElement currentConditionDisplay = new CurrentConditionsDisplay((WeatherDataObservable) weatherData);
        DisplayElement forecastDisplay = new ForecastDisplay(weatherData);

        currentConditionDisplay.display();
        forecastDisplay.display();
        System.out.println("---");
        weatherData.setTemperature(24.52);
        System.out.println("---");
        currentConditionDisplay.display();
        forecastDisplay.display();

    }
}
