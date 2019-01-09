package test1.a6command.invoker;

import test1.a6command.command.Command;
import test1.a6command.command.NoCommand;

import java.util.Arrays;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 上午12:14
 */
public class RemoteControl {

    Command[] onCommands ;
    Command[] offCommands;
    Command lastCommand;

    public RemoteControl() {
        onCommands = new Command[4];
        offCommands = new Command[4];
        for (int i = 0; i < 4; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int slot,Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void offButtonPredded(int slot) {
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void undoLastCommand() {
        lastCommand.undo();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                ", lastCommand=" + lastCommand +
                '}';
    }
}
