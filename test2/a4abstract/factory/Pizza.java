package test2.a4abstract.factory;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午11:47
 */
public abstract class Pizza {

    String name;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking "+name+" pizza!");
    }

    public void cut() {
        System.out.println("cutting "+name+" pizza!");
    }

    public void box() {
        System.out.println("boxing "+name+" pizza!");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
