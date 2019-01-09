package test2.a4abstract.factory;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 下午12:04
 */
public class Dough implements Ingredient {

    String name;

    public Dough(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dough{" +
                "name='" + name + '\'' +
                '}';
    }
}
