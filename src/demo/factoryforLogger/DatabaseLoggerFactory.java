package demo.factoryforLogger;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/3 10:35
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        DatabaseLogger databaseLogger = new DatabaseLogger();
        return databaseLogger;
    }
}
