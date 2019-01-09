package test1.a4factory.method;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 上午1:18
 */
public class NYPIzzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        if ("NYCheesePizza".equals(name)) {
            return new NYCheesePizza();
        }else{
            throw new RuntimeException(name + " is out of our products range!");
        }
    }
}
