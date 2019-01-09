package test2.a4abstract.factory;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 下午12:06
 */
public class NYIngredientFactory implements IngredientFactory {
    @Override
    public Cheese createCheese() {
        return new Cheese("NY Cheese");
    }

    @Override
    public Dough createDough() {
        return new Dough("NY Dough");
    }
}
