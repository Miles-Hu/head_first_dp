package test1.a4factory.abstract1;

import test1.a4factory.abstract1.fac.IngredientFacotry;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午12:43
 */
public class CaliforniaPizza extends Pizza {

    IngredientFacotry calFactory;

    public CaliforniaPizza(IngredientFacotry calFactory) {
        name = this.getClass().getName();
        this.calFactory = calFactory;
    }

    @Override
    public void prepare() {
        dough = calFactory.createDough();
        cheese = calFactory.createCheese();
    }
}
