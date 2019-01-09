package test1.a5singleton;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午6:36
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){};

    public static HungrySingleton getInstance() {
        return instance;
    }

}
