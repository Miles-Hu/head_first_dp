package test1.a2observer;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-4 下午12:18
 */
public interface Subject {

    void register(Observer obs);

    void removeRegister(Observer obs);

    void notifyAllObs();

}
