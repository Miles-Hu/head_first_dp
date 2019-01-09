package test1.a5singleton;

import java.util.concurrent.TimeUnit;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午6:38
 */
public class LazySingletomUnsafe {

    private static LazySingletomUnsafe instance;
    private static int count = 1;
    private int id = count++;

    private LazySingletomUnsafe() {

    }

    public static LazySingletomUnsafe getInstance() {
        if (instance == null) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazySingletomUnsafe();
        }
        return instance;
    }

    public String toString() {
        return this.getClass().getSimpleName()+": "+id;
    }
}
