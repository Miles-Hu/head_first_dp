package test1.a1strategy.duck;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-3 下午7:43
 */
public class RealFlyStrategy implements FlyBehavior {

    @Override
    public void fly() {
        System.out.print("look i'm flying, ");
        System.out.println("I told you i can fly!");
    }
}
