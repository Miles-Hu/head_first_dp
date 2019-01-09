package test1.a6command.command;

import test1.a6command.receiver.BedroomLight;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 上午12:33
 */
public class BedroomLightOnCommand implements Command{

    BedroomLight light;

    public BedroomLightOnCommand(BedroomLight light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.lightOn();
    }

    @Override
    public void undo() {
        light.lightOff();
    }
}
