package test1.aa3chainofresponsibility;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-10 上午12:20
 */
public class WarnningLogger extends AbstractLogger {

    public WarnningLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("WarnningLogger::message: "+message);
    }
}
