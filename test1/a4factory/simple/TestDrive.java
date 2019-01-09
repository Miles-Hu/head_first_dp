package test1.a4factory.simple;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 上午1:04
 */
public class TestDrive {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        PizzaStore pizzaStore = new PizzaStore(simpleFactory);

        System.out.println("We are going to order CheesePizza");
        pizzaStore.orderPizza("CheesePizza");

        System.out.println("We are going to order VeggiePizza");
        pizzaStore.orderPizza("VeggiePizza");

        System.out.println("We are going to order ClamPizza");
        pizzaStore.orderPizza("ClamPizza");
    }

}
