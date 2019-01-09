package test2.a1strategy.duck;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:38
 */
public abstract class Duck {

    FlyAble flyStrategy;
    QuackAble quackStrategy;

    public abstract void fly();

    public abstract void quack();

}
