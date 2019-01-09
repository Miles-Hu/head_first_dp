package test1.a4factory.abstract1;

import test1.a4factory.abstract1.fac.IngredientFacotry;
import test1.a4factory.abstract1.fac.NYIngredientFactory;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午12:50
 */
public class NYPizzaStore extends PizzaStore {
    IngredientFacotry facotry = new NYIngredientFactory();
    @Override
    public Pizza createPizza(String name) {
        if ("NYPizza".equals(name)) {
            return new NYPizza(facotry);
        }else{
            throw new RuntimeException(name+"is out of our products range!");
        }
    }
}
