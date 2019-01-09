package test1.aa3chainofresponsibility;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-10 上午12:16
 */
public abstract class AbstractLogger {

    public static final int INFO = 1;
    public static final int WARNING = 2;
    public static final int ERROR = 3;

    protected int level;

    protected AbstractLogger next;

    public AbstractLogger(int level) {
        this.level = level;
    }
    public void setNext(AbstractLogger next) {
        this.next = next;
    }

    public void log(int level, String message){
        if (this.level <= level) {
            write(message);
        }
        if (next != null) {
            next.log(level,message);
        }
    }

    public abstract void write(String message);
}
