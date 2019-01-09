package test2.a1strategy.duck;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:41
 */
public class FakeQuack implements QuackAble {
    @Override
    public void quack() {
        System.out.println("Zhi! Zhi! Zhi!");
    }
}
