package test1.a4factory.abstract1.fac;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午12:34
 */
public class NYIngredientFactory implements IngredientFacotry {

    @Override
    public Dough createDough() {
        return new CrispDough();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

}
