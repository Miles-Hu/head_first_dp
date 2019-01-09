package test1.a5singleton;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午6:46
 */
public class SingletonHolder {

    private SingletonHolder() {}

    public static SingletonHolder getInstance() {
        return Holder.instance;
    }

    private static class Holder{
        //静态的变量，保证只会被初始化一次
        public static SingletonHolder instance = new SingletonHolder();
    }

}
