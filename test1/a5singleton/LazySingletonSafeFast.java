package test1.a5singleton;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午6:40
 */
public class LazySingletonSafeFast {

    private static LazySingletonSafeFast instance;

    private LazySingletonSafeFast(){}

    public static LazySingletonSafeFast getInstance() {
        if (instance == null) {
            synchronized (LazySingletonSafeFast.class) {
                if (instance == null) {
                    instance = new LazySingletonSafeFast();
                }
            }
        }
        return instance;
    }

}
