package test1.strategy.duck;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-3 下午7:47
 */
public class FakeDuck extends Duck {

    public FakeDuck(FlyBehavior flyBehavior) {
        super.flyBehavior = flyBehavior;
    }

    @Override
    void display() {
        System.out.println("I am a fake Duck!");
    }
}
