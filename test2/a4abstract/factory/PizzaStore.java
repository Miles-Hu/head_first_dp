package test2.a4abstract.factory;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午11:46
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
