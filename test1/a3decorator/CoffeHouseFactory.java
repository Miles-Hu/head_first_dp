package test1.a3decorator;

import test1.a3decorator.coffe.DarkRoster;
import test1.a3decorator.coffe.Espresso;
import test1.a3decorator.coffe.HouseBlend;
import test1.a3decorator.decorator.Moca;
import test1.a3decorator.decorator.Soy;
import test1.a3decorator.decorator.Whip;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 上午1:07
 */
public class CoffeHouseFactory {

    public static Beverage createCoffe(String name) {
        Beverage beverage;
        if ("DarkRoster".equals(name)) {
            beverage = new DarkRoster();
        } else if ("Espresso".equals(name)) {
            beverage = new Espresso();
        } else if ("HouseBlend".equals(name)) {
            beverage = new HouseBlend();
        }else{
            throw new RuntimeException(name+" is out of our products range!");
        }
        return beverage;
    }

    public static Beverage createDeco(String name, Beverage beverage) {
        if ("Moca".equals(name)) {
            beverage = new Moca(beverage);
        } else if ("Soy".equals(name)) {
            beverage = new Soy(beverage);
        } else if ("Whip".equals(name)) {
            beverage = new Whip(beverage);
        }else{
            throw new RuntimeException(name+" is out of our products range!");
        }
        return beverage;
    }

}
