package test1.a4factory.method;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 上午1:15
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String name) {
        Pizza pizza = createPizza(name);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String name);

}
