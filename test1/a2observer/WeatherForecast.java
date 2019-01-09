package test1.a2observer;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-4 下午12:42
 */
public class WeatherForecast implements Observer,DisplayElement {

    private int oldTemp;
    private int currentTemp;

    @Override
    public void display() {
        if (oldTemp > currentTemp) {
            System.out.println("Weather is getting cold!");
        } else if (currentTemp > oldTemp) {
            System.out.println("Weather is getting hot!");
        } else {
            System.out.println("Weather is not getting hot or cold! i am a genius!");
        }
    }

    @Override
    public void update(int temp, float humidity, float pressure) {
        oldTemp = currentTemp;
        currentTemp = temp;
        display();
    }
}
