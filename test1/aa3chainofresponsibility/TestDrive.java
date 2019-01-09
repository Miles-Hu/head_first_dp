package test1.aa3chainofresponsibility;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-10 上午12:22
 */
public class TestDrive {

    private static AbstractLogger getLogger() {
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        WarnningLogger warnningLogger = new WarnningLogger(AbstractLogger.WARNING);
        InfoLogger infoLogger = new InfoLogger(AbstractLogger.INFO);

        errorLogger.setNext(warnningLogger);
        warnningLogger.setNext(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger logger = getLogger();

        logger.log(AbstractLogger.INFO,"you system works very well!");
        logger.log(AbstractLogger.WARNING,"this is a warnning!");
        logger.log(AbstractLogger.ERROR,"there is a exeption happened!");
    }
}
