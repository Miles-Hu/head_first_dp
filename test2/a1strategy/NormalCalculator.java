package test2.a1strategy;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:11
 */
public class NormalCalculator implements Calculator {

    long[] numbers;

    public NormalCalculator(long[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public long sumUp() {

        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
