package com.headfirst.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private double temperature;
    private double humidity;
    private double pressure;
    private WeatherDataObservable weatherData;


    public CurrentConditionsDisplay(WeatherDataObservable weatherData) {
        temperature = weatherData.getTemperature();
        pressure = weatherData.getPressure();
        humidity = weatherData.getHumidity();
        this.weatherData = weatherData;
        this.weatherData.registerObservers(this);
    }

    @Override
    public void display() {
        System.out.println("Current weather conditions: " +
                "\nTemperature: " + temperature + " °C" +
                "\nPressure: " + pressure + " bar" +
                "\nHumidity:  " + humidity + " %");
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        pressure = weatherData.getPressure();
        humidity = weatherData.getHumidity();
        display();
    }
}
