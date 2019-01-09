package test1.a6command;

import test1.a6command.command.*;
import test1.a6command.invoker.RemoteControl;
import test1.a6command.receiver.BedroomLight;
import test1.a6command.receiver.LivingRoomAC;
import test1.a6command.receiver.Stereo;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 上午12:44
 */
public class TestDriver {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        BedroomLight bedroomLight = new BedroomLight();
        BedroomLightOffCommand bedroomLightOffCommand = new BedroomLightOffCommand(bedroomLight);
        BedroomLightOnCommand bedroomLightOnCommand = new BedroomLightOnCommand(bedroomLight);
        remoteControl.setCommands(0,bedroomLightOnCommand,bedroomLightOffCommand);

        LivingRoomAC livingRoomAC = new LivingRoomAC();
        LivingRoomACOffCommand livingRoomACOffCommand = new LivingRoomACOffCommand(livingRoomAC);
        LivingRoomACOnCommand livingRoomACOnCommand = new LivingRoomACOnCommand(livingRoomAC);
        remoteControl.setCommands(1,livingRoomACOnCommand,livingRoomACOffCommand);

        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        remoteControl.setCommands(2,stereoOnCommand,stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonPressed(0);
        remoteControl.onButtonPressed(1);
        remoteControl.onButtonPressed(2);
        remoteControl.offButtonPredded(0);
        remoteControl.offButtonPredded(1);
        remoteControl.offButtonPredded(2);
        remoteControl.undoLastCommand();
    }

}
