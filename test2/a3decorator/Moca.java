package test2.a3decorator;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午11:17
 */
public class Moca implements CoffeeDecorator {

    double price;
    Coffee coffee;

    public Moca(double price, Coffee coffee) {
        this.price = price;
        this.coffee = coffee;
    }

    @Override
    public double price() {
        return price+coffee.price();
    }

    @Override
    public String toString() {
        return "Moca{" +
                "price=" + price +
                ", coffee=" + coffee +
                '}';
    }
}
