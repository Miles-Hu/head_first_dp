package test1.a10state;

import java.util.Random;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午7:01
 */
public class HasQuaterState extends State {
    CandyDispenseMachine machine;
    Random random = new Random();
    private static final int WINNER = 0;

    public HasQuaterState(CandyDispenseMachine machine) {
        this.machine = machine;
    }

    @Override
    public void returnMoney() {
        machine.setCurrentState(machine.getNoQuaterState());
        System.out.println("you returned the quater!");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned the crank, just wating for the candy to be released! ^_^");
        int random = this.random.nextInt(4);
        System.out.println(random);
        if (random == WINNER && machine.getCount() > 1) {
            machine.setCurrentState(machine.getWinner());
        }else {
            machine.setCurrentState(machine.getSoldState());
        }
    }
}
