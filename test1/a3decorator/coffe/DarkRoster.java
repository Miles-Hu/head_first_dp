package test1.a3decorator.coffe;

import test1.a3decorator.Beverage;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-4 下午6:19
 */
public class DarkRoster extends Beverage {


    public DarkRoster() {
        description = "DarkRoster";
    }

    @Override
    public double cost() {
        return 2.10;
    }
}
