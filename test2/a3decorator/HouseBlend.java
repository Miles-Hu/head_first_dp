package test2.a3decorator;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午11:13
 */
public class HouseBlend implements Coffee {

    double price;

    public HouseBlend(double price) {
        this.price = price;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String toString() {
        return "HouseBlend{" +
                "price=" + price +
                '}';
    }
}
