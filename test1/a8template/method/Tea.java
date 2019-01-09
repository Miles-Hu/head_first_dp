package test1.a8template.method;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 下午6:59
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("steeping tea!");
    }

    @Override
    public void addCondiment() {
        System.out.println("adding lemon to tea!");
    }
}
