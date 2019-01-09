package test2.a1strategy.duck;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:40
 */
public class FakeFly implements FlyAble {
    @Override
    public void fly() {
        System.out.println("I cannot Fly!");
    }
}
