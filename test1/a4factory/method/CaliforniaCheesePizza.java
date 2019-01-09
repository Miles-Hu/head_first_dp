package test1.a4factory.method;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 上午1:22
 */
public class CaliforniaCheesePizza extends Pizza {
    public CaliforniaCheesePizza() {
        name = this.getClass().getName();
    }
}
