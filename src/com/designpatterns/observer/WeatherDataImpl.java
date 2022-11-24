package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataImpl implements WeatherDataObservable {
    private double temperature;
    private double humidity;
    private double pressure;
    List<Observer> observers;

    public WeatherDataImpl(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObservers(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObservers(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public double getHumidity() {
        return humidity;
    }

    @Override
    public double getPressure() {
        return pressure;
    }

    public void setTemperature(double temperature) {
        System.out.println("Temperature has changed to " + temperature + " °C");
        this.temperature = temperature;
        notifyObservers();
    }

    public void setHumidity(double humidity) {
        System.out.println("Humidity has changed to " + humidity + " %");
        this.humidity = humidity;
        notifyObservers();
    }

    public void setPressure(double pressure) {
        System.out.println("Temperature has changed to " + pressure + " bar");
        this.pressure = pressure;
        notifyObservers();
    }
}
