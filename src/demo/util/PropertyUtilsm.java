package demo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/3 16:32
 */
public class PropertyUtilsm {
    private static Properties props = new Properties();

    static {
        try {
            loadProp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadProp() throws IOException {
//        props=new Properties();
        InputStream in = null;
        in = PropertyUtilsm.class.getResourceAsStream("jdbc.properties");

        props.load(in);
        if (null != in) {
            in.close();
        }
    }

    public static String getProperty(String key) throws IOException {
        if (null == props) {
            loadProp();
        }
        return props.getProperty(key);
    }

    public static String getProperty(String key, String value) throws IOException {
        if (null == props) {
            loadProp();
        }
        return props.getProperty(key, value);
    }

    public static void main(String[] args) throws IOException {
        String key = "jdbc.username";
        System.out.println(PropertyUtilsm.getProperty(key));
    }
}
