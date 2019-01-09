package test2.a5singleton;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 下午12:15
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton =  new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
