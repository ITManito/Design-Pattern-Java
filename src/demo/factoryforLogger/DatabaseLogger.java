package demo.factoryforLogger;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/3 10:36
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLogger() {
        System.out.println("数据库日志记录");
    }
}
