package test1.a3decorator.decorator;

import test1.a3decorator.Beverage;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-4 下午6:29
 */
public class Soy extends CoffeDeco {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }

    @Override
    public double cost() {
        return 0.19+beverage.cost();
    }
}
