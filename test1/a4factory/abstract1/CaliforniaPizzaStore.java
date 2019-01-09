package test1.a4factory.abstract1;

import test1.a4factory.abstract1.fac.CaliforniaIngredientFactory;
import test1.a4factory.abstract1.fac.IngredientFacotry;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午12:53
 */
public class CaliforniaPizzaStore extends PizzaStore {

    IngredientFacotry facotry = new CaliforniaIngredientFactory();

    @Override
    public Pizza createPizza(String name) {
        if ("CaliforniaPizza".equals(name)) {
            return new CaliforniaPizza(facotry);
        }else{
            throw new RuntimeException(name+" is out of our products range");
        }
    }
}
