package test1.aa2builder;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-9 下午11:16
 */
public class TestDrive {

    public static void main(String[] args) {
        Meal meal = Meal.builder().burger("ChickenBurger").
                drinks("Coca Cola").
                snacks("Chicken wings").
                pizza("VeggiePizza").dessert("CheeseCake").build();

        System.out.println(meal);
    }

}
