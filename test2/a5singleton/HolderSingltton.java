package test2.a5singleton;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 下午12:19
 */
public class HolderSingltton {

    private static class Holder{
        public static HolderSingltton holderSingltton= new HolderSingltton();
    }

    private HolderSingltton(){}

    public static HolderSingltton getInstance() {
        return Holder.holderSingltton;
    }

}
