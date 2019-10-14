package demo.factoryforLogger;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/3 10:36
 */
public class FileLogger implements Logger {
    @Override
    public void writeLogger() {
        System.out.println("文件日志记录");
    }
}
