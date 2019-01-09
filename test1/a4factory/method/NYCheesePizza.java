package test1.a4factory.method;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 上午1:19
 */
public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        name = this.getClass().getName();
    }
}
