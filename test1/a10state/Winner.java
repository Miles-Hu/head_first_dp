package test1.a10state;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午7:16
 */
public class Winner extends State {

    CandyDispenseMachine machine;

    public Winner(CandyDispenseMachine machine) {
        this.machine = machine;
    }

    @Override
    public void dispense() {
        System.out.println("Congratulations! You are the winner, and you will get a extra candy!");
        if (machine.getCount() > 0) {
            machine.releaseCandy();
            if (machine.getCount() > 0) {
                machine.releaseCandy();
                if (machine.getCount() > 0) {
                    machine.setCurrentState(machine.getNoQuaterState());
                } else {
                    machine.setCurrentState(machine.getSoldOutState());
                }
            }
        }
    }
}
