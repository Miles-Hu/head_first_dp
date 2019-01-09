package headfirst.designpatterns.chainofrepsonsibility;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-9 下午11:45
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
