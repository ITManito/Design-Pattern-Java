package demo.util;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/3 14:58
 */
public class PropertyUtil {
    private static Properties props;

    static {
        try {
            loadProps();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    找文件
    synchronized static private void loadProps() throws IOException {
        props = new Properties();
        InputStream in = null;
        in = PropertyUtil.class.getResourceAsStream("jdbc.properties");
        props.load(in);
        if (null != in) {
            in.close();
        }

    }


    public static String getProperty(String key) throws IOException {
        if (null == props) {
            loadProps();
        }
        return props.getProperty(key);
    }

    public static String getProperty(String key, String def) throws IOException {
        if (null == props) {
            loadProps();
        }
        return props.getProperty(key, def);
    }

    public static void main(String[] args) throws IOException {
        String key = "jdbc.username";
        String result = PropertyUtil.getProperty(key);
        System.out.println(result);

    }
}
