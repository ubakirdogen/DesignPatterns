package com.designpatterns.observer;

public interface WeatherDataObservable {
    void registerObservers(Observer o);

    void removeObservers(Observer o);

    void notifyObservers();

    double getTemperature();

    double getHumidity();

    double getPressure();
}
