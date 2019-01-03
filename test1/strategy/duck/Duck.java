package test1.strategy.duck;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-3 下午7:39
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    public void fly() {
        flyBehavior.fly();
    }

    abstract void display();

    public void swim() {
        System.out.println("look i am swimming!");
    }

}
