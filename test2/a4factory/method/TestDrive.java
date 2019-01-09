package test2.a4factory.method;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午11:58
 */
public class TestDrive {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPizza = nyPizzaStore.orderPizza("NYPizza");
        System.out.println(nyPizza);

        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
        Pizza californiaPizza = californiaPizzaStore.orderPizza("CaliforniaPizza");
        System.out.println(californiaPizza);

        nyPizzaStore.orderPizza("CaliforniaPizza");
    }

}
