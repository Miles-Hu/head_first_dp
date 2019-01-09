package test1.a7adaptor.adaptor;

import test1.a7adaptor.adaptee.Turkey;
import test1.a7adaptor.target.Duck;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 下午12:36
 */
public class TurkeyToDuckAdaptor implements Duck {

    Turkey turkey;

    public TurkeyToDuckAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }

    }

    @Override
    public void quack() {
        turkey.gogle();
    }
}
