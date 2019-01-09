package test1.a5singleton;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午6:45
 */
public class LazySingletonSafeSlow {

    private static LazySingletonSafeSlow instance;

    private LazySingletonSafeSlow(){}

    public synchronized static LazySingletonSafeSlow getInstance() {
        if (instance == null) {
            instance = new LazySingletonSafeSlow();
        }
        return instance;
    }
}
