package test2.a5singleton;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 下午12:17
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
