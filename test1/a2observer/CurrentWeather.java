package test1.a2observer;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-4 下午12:31
 */
public class CurrentWeather implements Observer,DisplayElement {

    private int tmp;
    private float humidity;
    private float pressure;

    @Override
    public void update(int temp, float humidity, float pressure) {
        this.tmp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.printf("Current temperature is %d, humidity is %f, pressure is %f \n",tmp,humidity,pressure);
    }
}
