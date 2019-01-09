package test1.a6command.command;


import test1.a6command.receiver.Stereo;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 上午12:38
 */
public class StereoOnCommand implements Command {

    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.stereoOn();
        stereo.putCD();
        stereo.play();
    }

    @Override
    public void undo() {
        stereo.stereoOff();
    }
}
