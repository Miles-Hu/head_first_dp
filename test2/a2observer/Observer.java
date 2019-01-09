package test2.a2observer;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:49
 */
public interface Observer {

    void update(Subject subject, int temperature, int humiduty);

}
