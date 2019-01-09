package test1.a10state;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午7:04
 */
public class SoldState extends State {

    CandyDispenseMachine machine;

    public SoldState(CandyDispenseMachine machine) {
        this.machine = machine;
    }

    @Override
    public void dispense() {
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
