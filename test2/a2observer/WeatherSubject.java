package test2.a2observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:58
 */
public class WeatherSubject implements Subject {

    List<Observer> observerList = new ArrayList<>();
    int temperature;
    int humidity;

    public WeatherSubject(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update(this,temperature,humidity);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }
}
