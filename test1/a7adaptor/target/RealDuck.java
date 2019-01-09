package test1.a7adaptor.target;

import test1.a7adaptor.target.Duck;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 下午12:33
 */
public class RealDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("i can fly longer distance!");
    }

    @Override
    public void quack() {
        System.out.println("Quack! Quack! Quack!");
    }
}
