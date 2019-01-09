package test1.a10state;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午7:28
 */
public class TestDriver {

    public static void main(String[] args) {
        CandyDispenseMachine candyDispenseMachine = new CandyDispenseMachine(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(candyDispenseMachine);
            candyDispenseMachine.insertQuater();
            candyDispenseMachine.turnCrank();
        }
    }
}
