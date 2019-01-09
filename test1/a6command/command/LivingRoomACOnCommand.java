package test1.a6command.command;

import test1.a6command.receiver.LivingRoomAC;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 上午12:37
 */
public class LivingRoomACOnCommand implements Command {

    LivingRoomAC ac;

    public LivingRoomACOnCommand(LivingRoomAC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.acOn();
    }

    @Override
    public void undo() {
        ac.acOff();
    }
}
