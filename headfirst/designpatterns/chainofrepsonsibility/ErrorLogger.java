package headfirst.designpatterns.chainofrepsonsibility;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-9 下午11:44
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
