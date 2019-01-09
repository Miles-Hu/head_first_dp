package test1.aa3chainofresponsibility;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-10 上午12:19
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Info::message: "+message);
    }
}
