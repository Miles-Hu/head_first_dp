package test1.aa3chainofresponsibility;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-10 上午12:21
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.err.printf("ErrorLogger::message: %s\n", message);
    }
}
