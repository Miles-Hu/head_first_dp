package test1.a4factory.simple;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 上午12:55
 */
public class PizzaStore {

    private SimpleFactory simpleFactory;

    public PizzaStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public Pizza orderPizza(String name) {
        Pizza pizza = simpleFactory.createPizza(name);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
