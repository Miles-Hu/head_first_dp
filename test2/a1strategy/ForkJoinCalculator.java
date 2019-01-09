package test2.a1strategy;

import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午10:12
 */
public class ForkJoinCalculator implements Calculator {

    long[] numbers;

    public ForkJoinCalculator(long[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public long sumUp() {
        ForkJoinPool pool = (ForkJoinPool)Executors.newWorkStealingPool(Runtime.getRuntime().availableProcessors() + 1);
        return pool.invoke(new CalAction(numbers, 0, numbers.length - 1));
    }

    private class CalAction extends RecursiveTask<Long>{

        long[] nums;
        int left;
        int right;

        public CalAction(long[] nums, int left, int right) {
            this.nums = nums;
            this.left = left;
            this.right = right;
        }

        @Override
        protected Long compute() {

            if (right - left < 20000000) {
                long sum = 0;
                for (int i = left; i <= right; i++) {
                    sum += nums[i];
                }
                return sum;
            }else{
                int middle = (left+right)/2;
                CalAction leftAction = new CalAction(nums, left, middle);
                CalAction rightAction = new CalAction(nums, middle + 1, right);
                leftAction.fork();
                rightAction.fork();
                return leftAction.join()+rightAction.join();
            }
        }
    }
}
