package test1.a4factory.method;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 上午12:57
 */
public class Pizza {

    String name;

    public void prepare() {
        System.out.println("preparing "+name+" pizza");
    }

    public void bake() {
        System.out.println("baking "+name+" pizza");
    }

    public void cut() {
        System.out.println("cutting "+name+" pizza");
    }

    public void box() {
        System.out.println("boxing "+name+" pizza");
    }


}
