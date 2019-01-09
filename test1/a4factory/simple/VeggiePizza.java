package test1.a4factory.simple;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 上午1:00
 */
public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        name = this.getClass().getName();
    }
}
