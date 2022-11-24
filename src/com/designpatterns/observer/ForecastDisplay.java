package com.designpatterns.observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private double specialWeatherMetric;
    private WeatherDataObservable weatherData;


    public ForecastDisplay(WeatherDataObservable weatherData) {
        double temperature = weatherData.getTemperature();
        double pressure = weatherData.getPressure();
        calcSpecialMetric(temperature, pressure);
        this.weatherData = weatherData;
        this.weatherData.registerObservers(this);
    }

    private void calcSpecialMetric(double temperature, double pressure) {
        specialWeatherMetric = temperature * pressure / 2;
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder("The weather will be ");
        if (specialWeatherMetric < 10) {
            sb.append("SUNNY");
        } else {
            sb.append("RAINY");
        }
        sb.append(" tomorrow.");
        System.out.println(sb.toString());
    }

    @Override
    public void update() {
        double temperature = weatherData.getTemperature();
        double pressure = weatherData.getPressure();
        calcSpecialMetric(temperature, pressure);
        display();
    }
}
