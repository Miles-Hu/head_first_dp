package test1.strategy;

import java.util.List;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-3 下午6:51
 */
public class NormalCalStrategy implements Calculator {

    @Override
    public int sum(List<Integer> nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }
}
