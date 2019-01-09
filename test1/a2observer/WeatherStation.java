package test1.a2observer;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-4 下午12:47
 */
public class WeatherStation {

    public static void main(String[] args) throws Exception{
        WeatherData weatherData = new WeatherData(20,15.5f,40.3f);
        weatherData.register(new CurrentWeather());
        weatherData.register(new WeatherForecast());
        weatherData.register(new WeatherStatistics());
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            weatherData.setHumidity(random.nextFloat()*50);
            System.out.println();
            TimeUnit.SECONDS.sleep(1);
            weatherData.setPressure(random.nextFloat()*100);
            System.out.println();
            TimeUnit.SECONDS.sleep(1);
            weatherData.setTemp(random.nextInt(40));
            System.out.println();
            TimeUnit.SECONDS.sleep(1);
        }
    }

}
