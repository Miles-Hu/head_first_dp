package test1.a4factory.method;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 上午1:24
 */
public class TestDrive {

    public static void main(String[] args) {
        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
        System.out.println("we are going to order CaliforniaCheesePizza");
        californiaPizzaStore.orderPizza("CaliforniaCheesePizza");

        PizzaStore nypIzzaStore = new NYPIzzaStore();
        System.out.println("we are going to order NYCheesePizza");
        nypIzzaStore.orderPizza("NYCheesePizza");

        System.out.println("we are going to order CaliforniaClamPizza");
        californiaPizzaStore.orderPizza("CaliforniaClamPizza");
    }

}
