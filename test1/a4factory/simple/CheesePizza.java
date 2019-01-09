package test1.a4factory.simple;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 上午12:59
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = this.getClass().getName();
    }
}
