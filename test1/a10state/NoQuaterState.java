package test1.a10state;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午7:04
 */
public class NoQuaterState extends State{

    CandyDispenseMachine machine;

    public NoQuaterState(CandyDispenseMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuater() {
        machine.setCurrentState(machine.getHasQuaterState());
        System.out.println("you just inserted a quater!");
    }

}
