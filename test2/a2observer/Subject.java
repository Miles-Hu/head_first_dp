package test2.a2observer;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:49
 */
public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyAllObservers();

}
