package test2.a2observer;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:54
 */
public class WeatherForcast implements Observer{

    int lastTemp;

    @Override
    public void update(Subject subject, int temperature, int humiduty) {
        if (temperature > lastTemp) {
            System.out.println("Weather is getting hot, temperature rise from "+lastTemp+" to "+temperature+" degree centigrade!");
        } else if (temperature < lastTemp) {
            System.out.println("Weather is getting cold, temperature fall from " + lastTemp + " to " + temperature + " degree centigrade!");
        }else {
            System.out.println("Weather is stable");
        }
        lastTemp = temperature;
    }
}
