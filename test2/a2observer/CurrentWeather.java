package test2.a2observer;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:52
 */
public class CurrentWeather implements Observer {
    @Override
    public void update(Subject subject, int temperature, int humiduty) {
        System.out.println("current temperature is: "+temperature+" degree centigrade!");
        System.out.println("current humidity is: "+humiduty);
    }
}
