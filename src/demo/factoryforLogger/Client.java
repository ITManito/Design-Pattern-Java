package demo.factoryforLogger;

import demo.util.XmlUtil;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * @author 任蒙蒙
 * @description 工厂方法+配置文件实现日志例子
 * @version 1.0.0
 * @since 2019/10/3 10:40
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, SAXException, InstantiationException, IllegalAccessException, IOException {
        LoggerFactory fileLoggerFactory = (LoggerFactory) XmlUtil.getBean("I:\\Sys\\DesignPatterns\\src\\demo\\config\\config.xml", "config");

        Logger filelogger = fileLoggerFactory.createLogger();
        filelogger.writeLogger();

        DatabaseLoggerFactory databaseLoggerFactory = new DatabaseLoggerFactory();
        Logger databaseLogger = databaseLoggerFactory.createLogger();
        databaseLogger.writeLogger();
    }
}
