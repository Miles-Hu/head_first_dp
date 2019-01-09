package test2.a3decorator;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午11:14
 */
public class Espresso implements Coffee{

    double price;

    public Espresso(double price) {
        this.price = price;
    }


    @Override
    public double price() {
        return price;
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "price=" + price +
                '}';
    }
}
