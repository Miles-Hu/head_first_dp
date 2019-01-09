package test1.a4factory.simple;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 上午12:55
 */
public class SimpleFactory {

    public Pizza createPizza(String name) {
        if ("CheesePizza".equals(name)) {
            return new CheesePizza();
        } else if ("VeggiePizza".equals(name)) {
            return new VeggiePizza();
        } else {
            throw new RuntimeException(name + " is not in our products range!");
        }
    }
}
