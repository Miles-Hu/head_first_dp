package test1.a4factory.abstract1;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午12:55
 */
public class TestDrive {

    public static void main(String[] args) {
        CaliforniaPizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
        Pizza californiaPizza = californiaPizzaStore.orderPizza("CaliforniaPizza");
        System.out.println("i ordered "+californiaPizza);

        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPizza = nyPizzaStore.orderPizza("NYPizza");
        System.out.println("i ordered "+nyPizza);

        californiaPizzaStore.orderPizza("NYPizza");
    }

}
