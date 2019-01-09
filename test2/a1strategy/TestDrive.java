package test2.a1strategy;

import org.junit.Test;

import java.util.stream.LongStream;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:23
 */
public class TestDrive {

    @Test
    public void testCal() {
        for (int j = 0; j < 10; j++) {
            long[] longs = LongStream.rangeClosed(1, 100000000).toArray();
            NormalCalculator normalCalculator = new NormalCalculator(longs);
            long start1 = System.currentTimeMillis();
            long l = 0;
            for (int i = 0; i < 10; i++) {
                l = normalCalculator.sumUp();
            }
            System.out.println(l);
            System.out.println("Normal Cal 耗时："+(System.currentTimeMillis()-start1)+" 毫秒！");

            ForkJoinCalculator forkJoinCalculator = new ForkJoinCalculator(longs);
            long start2 = System.currentTimeMillis();
            long l1 = 0;
            for (int i = 0; i < 10; i++) {
                l1 = forkJoinCalculator.sumUp();
            }
            System.out.println(l1);
            System.out.println("ForkJoin Cal耗时："+(System.currentTimeMillis()-start2)+" 毫秒！");
            System.out.println("--------------------------------------------------------");
        }

    }

}
