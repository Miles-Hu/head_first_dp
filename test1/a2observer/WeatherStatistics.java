package test1.a2observer;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-4 下午12:35
 */
public class WeatherStatistics implements Observer,DisplayElement {

    private int maxTemp;
    private int minTemp;
    private int sumTemp;
    private int changedTimes;

    @Override
    public void display() {
        System.out.printf("max/min/avg temperature is %d/%d/%d \n",maxTemp,minTemp,(sumTemp/changedTimes));
    }

    @Override
    public void update(int temp, float humidity, float pressure) {
        changedTimes++;
        if (temp > maxTemp) {
            maxTemp = temp;
        }
        if (temp < minTemp) {
            minTemp = temp;
        }
        sumTemp += temp;
        display();
    }
}
