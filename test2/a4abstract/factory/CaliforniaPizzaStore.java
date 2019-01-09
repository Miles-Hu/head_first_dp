package test2.a4abstract.factory;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午11:57
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        if ("CaliforniaPizza".equals(name)) {
            return new CaliforniaPizza("CaliforniaPizza",new CaliforniaIngredientFactory());
        }else {
            throw new UnsupportedOperationException(name + " is out of our products range!");
        }
    }
}
