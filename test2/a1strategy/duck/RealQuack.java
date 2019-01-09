package test2.a1strategy.duck;

import java.util.Queue;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:40
 */
public class RealQuack implements QuackAble {
    @Override
    public void quack() {
        System.out.println("Quack! Quack! Quack!");
    }
}
