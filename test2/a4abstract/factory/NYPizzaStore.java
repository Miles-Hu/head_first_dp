package test2.a4abstract.factory;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午11:55
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        if ("NYPizza".equals(name)) {
            return new NYPizza("NYPizza",new NYIngredientFactory());
        }else {
            throw new UnsupportedOperationException(name+" is out of products range!");
        }
    }
}
