package test1.a6command.command;

import test1.a6command.receiver.Stereo;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 上午12:40
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.stereoOff();
    }

    @Override
    public void undo() {
        stereo.stereoOn();
        stereo.putCD();
        stereo.play();
    }
}
