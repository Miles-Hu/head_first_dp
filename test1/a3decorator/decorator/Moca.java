package test1.a3decorator.decorator;

import test1.a3decorator.Beverage;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-4 下午6:24
 */
public class Moca extends CoffeDeco {

    private Beverage beverage;

    public Moca(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Moca";
    }

    @Override
    public double cost() {
        return 0.22+beverage.cost();
    }
}
