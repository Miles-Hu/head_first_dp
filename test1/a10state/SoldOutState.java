package test1.a10state;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午7:04
 */
public class SoldOutState extends State {

    CandyDispenseMachine machine;

    public SoldOutState(CandyDispenseMachine machine) {
        this.machine = machine;

    }
}
