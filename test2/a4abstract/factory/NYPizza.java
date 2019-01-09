package test2.a4abstract.factory;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午11:53
 */
public class NYPizza extends Pizza {

    IngredientFactory factory;

    public NYPizza(String name,IngredientFactory factory) {
        super.name = name;
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing "+super.name+" pizza!");
        System.out.println("the dough is "+factory.createDough());
        System.out.println("we add "+factory.createCheese()+" to the pizza!");
    }
}
