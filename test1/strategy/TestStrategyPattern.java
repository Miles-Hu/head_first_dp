package test1.strategy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-3 下午7:07
 */
public class TestStrategyPattern {

    @Test
    public void testCalculator() {
        int[] num = IntStream.rangeClosed(0, 10000000).toArray();
        List<Integer> nums = new ArrayList<>();
        for (int i : num) {
            nums.add(i);
        }
        Calculator cal = new NormalCalStrategy();
        long start1 = System.currentTimeMillis();
        int sum1 = cal.sum(nums);
        System.out.println("sum1 = "+sum1+"; 总共耗时： "+(System.currentTimeMillis()-start1));


    }

    @Test
    public void testCalculator2() {
        int[] num = IntStream.rangeClosed(0, 10000000).toArray();
        List<Integer> nums = new ArrayList<>();
        for (int i : num) {
            nums.add(i);
        }
        ForkJoinCalStrategy cal2 = new ForkJoinCalStrategy();
        long start2 = System.currentTimeMillis();
        int sum2 = cal2.sum(nums);
        System.out.println("sum2 = "+sum2+"; 总共耗时： "+(System.currentTimeMillis()-start2));
    }

}
