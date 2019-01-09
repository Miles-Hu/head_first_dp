package test1.a4factory.abstract1;

import test1.a4factory.abstract1.fac.Cheese;
import test1.a4factory.abstract1.fac.Dough;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午12:36
 */
public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Cheese cheese;

    public abstract void prepare();

    public void bake() {
        System.out.println("baking "+name+" pizza");
    }
    public void cut() {
        System.out.println("cutting "+name+" pizza");
    }
    public void box() {
        System.out.println("boxing "+name+" pizza");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", cheese=" + cheese +
                '}';
    }
}
