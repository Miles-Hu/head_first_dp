package test1.a3decorator.coffe;

import test1.a3decorator.Beverage;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-4 下午6:14
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.88;
    }
}
