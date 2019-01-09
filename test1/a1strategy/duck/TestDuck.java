package test1.a1strategy.duck;

import org.junit.Test;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-3 下午7:48
 */
public class TestDuck {

    @Test
    public void testDuck() {
        RealFlyStrategy realFlyStrategy = new RealFlyStrategy();
        Duck realDuck = new RealDuck(realFlyStrategy);
        realDuck.display();
        realDuck.fly();

        NotFlyStrategy notFlyStrategy = new NotFlyStrategy();
        Duck fakeDuck = new FakeDuck(notFlyStrategy);
        fakeDuck.display();
        fakeDuck.fly();
    }
}
