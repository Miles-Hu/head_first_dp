package test1.a1strategy.duck;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-3 下午7:46
 */
public class RealDuck extends Duck {

    public RealDuck(FlyBehavior flyBehavior) {
        super.flyBehavior = flyBehavior;
    }

    @Override
    void display() {
        System.out.println("I am a real duck");
    }
}
