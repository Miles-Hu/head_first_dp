package test1.a2observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-4 下午12:26
 */
public class WeatherData implements Subject {

    List<Observer> observerList = new ArrayList();
    int temp;
    float humidity;
    float pressure;

    public WeatherData(int temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void register(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void removeRegister(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyAllObs() {
        for (Observer obs : observerList) {
            obs.update(temp,humidity,pressure);
        }
    }

    private void measurementsChanged() {
        notifyAllObs();
    }

    public void setTemp(int temp) {
        this.temp = temp;
        measurementsChanged();
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        measurementsChanged();
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        measurementsChanged();
    }
}
