package test2.a2observer;

import java.util.Random;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午11:02
 */
public class TestDrive {

    public static void main(String[] args) {
        Random random = new Random();
        Observer currentWeather = new CurrentWeather();
        Observer weatherForcast = new WeatherForcast();
        WeatherSubject weatherSubject = new WeatherSubject(20, 30);

        weatherSubject.register(currentWeather);
        weatherSubject.register(weatherForcast);

        weatherSubject.setHumidity(random.nextInt(50));
        weatherSubject.setTemperature(random.nextInt(40));
    }

}
