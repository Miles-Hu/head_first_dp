package test1.a4factory.abstract1.fac;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午12:32
 */
public class CaliforniaCheese extends Cheese {

    public CaliforniaCheese() {
        name = this.getClass().getName();
    }
}
