package test1.a1strategy;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-3 下午6:52
 */
public class ForkJoinCalStrategy implements Calculator {


    @Override
    public int sum(List<Integer> nums) {
        ForkJoinPool executorService = (ForkJoinPool)Executors.newWorkStealingPool(Runtime.getRuntime().availableProcessors());
        return executorService.invoke(new SumTask(nums));
    }

    private class SumTask extends RecursiveTask<Integer>{

        List<Integer> nums;
        int left = 0;
        int right = 0;
        int sum = 0;

        public SumTask(List<Integer> nums){
            this(nums, 0, nums.size() - 1);
        }

        public SumTask(List<Integer> nums, int left, int right) {
            this.nums = nums;
            this.left = left;
            this.right = right;
        }

        @Override
        protected Integer compute() {

            if (right - left >= 100) {
                for (int i = left; i <= right; i++) {
                    sum += nums.get(i);
                }
                return sum;
            }else{
                int middle = (right+left)/2;
                SumTask leftTask = new SumTask(nums, left, middle);
                SumTask rightTask = new SumTask(nums, middle + 1, this.right);
                leftTask.fork();
                rightTask.fork();
                return leftTask.join()+rightTask.join();

            }
        }
    }
}
