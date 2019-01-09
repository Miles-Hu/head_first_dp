package test1.a4factory.method;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 上午1:22
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        if ("CaliforniaCheesePizza".equals(name)) {
            return new CaliforniaCheesePizza();
        }else {
            throw new RuntimeException(name + " is out of our range!");
        }
    }
}
