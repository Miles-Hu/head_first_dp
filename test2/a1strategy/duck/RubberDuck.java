package test2.a1strategy.duck;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:44
 */
public class RubberDuck extends Duck {

    public RubberDuck(FlyAble fly, QuackAble quack) {
        super.flyStrategy = fly;
        super.quackStrategy = quack;
    }

    @Override
    public void fly() {
        flyStrategy.fly();
    }

    @Override
    public void quack() {
        quackStrategy.quack();
    }
}
