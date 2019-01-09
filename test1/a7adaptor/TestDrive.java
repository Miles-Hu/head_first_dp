package test1.a7adaptor;

import test1.a7adaptor.adaptee.Turkey;
import test1.a7adaptor.adaptor.TurkeyToDuckAdaptor;
import test1.a7adaptor.target.Duck;
import test1.a7adaptor.target.RealDuck;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 下午12:37
 */
public class TestDrive {

    public static void main(String[] args) {
        Duck duck = new RealDuck();
        Turkey turkey = new Turkey();
        Duck duckFromAdaptor = new TurkeyToDuckAdaptor(turkey);

        duck.fly();
        duck.quack();
        System.out.println();

        turkey.fly();
        turkey.gogle();
        System.out.println();

        duckFromAdaptor.fly();
        duckFromAdaptor.quack();
    }

}
