package test2.a1strategy.duck;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:45
 */
public class TestDrive {

    public static void main(String[] args) {
        FlyAble realFly = new RealFly();
        QuackAble realQuack = new RealQuack();
        Duck realDuck = new RealDuck(realFly, realQuack);
        realDuck.fly();
        realDuck.quack();

        FlyAble fakeFly = new FakeFly();
        QuackAble fakeQuack = new FakeQuack();
        Duck rubberDuck = new RubberDuck(fakeFly, fakeQuack);
        rubberDuck.fly();
        rubberDuck.quack();
    }

}
