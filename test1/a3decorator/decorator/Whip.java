package test1.a3decorator.decorator;

import test1.a3decorator.Beverage;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-4 下午6:26
 */
public class Whip extends CoffeDeco {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }

    @Override
    public double cost() {
        return .30+beverage.cost();
    }
}
