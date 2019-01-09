package test1.a4factory.abstract1.fac;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午12:35
 */
public class CaliforniaIngredientFactory implements IngredientFacotry {
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Cheese createCheese() {
        return new CaliforniaCheese();
    }
}
