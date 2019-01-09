package test1.a4factory.abstract1;

import test1.a4factory.abstract1.fac.IngredientFacotry;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午12:38
 */
public class NYPizza extends Pizza {

    IngredientFacotry NYFactory ;

    public NYPizza(IngredientFacotry NYFactory) {
        name = this.getClass().getName();
        this.NYFactory = NYFactory;
    }

    @Override
    public void prepare() {
        dough = NYFactory.createDough();
        cheese = NYFactory.createCheese();
    }
}
