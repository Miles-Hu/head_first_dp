package test1.a3decorator;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-4 下午6:06
 */
public abstract class Beverage {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
