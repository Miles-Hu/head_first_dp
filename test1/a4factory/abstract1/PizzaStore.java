package test1.a4factory.abstract1;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午12:48
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
