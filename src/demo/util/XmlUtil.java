package demo.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/3 10:51
 */
public class XmlUtil {
    //从xml文件中提取类名,返回xml对象
    public static Object getBean(String configPath,String className) throws IOException, SAXException, ClassNotFoundException, IllegalAccessException, InstantiationException {
//        建DOM对象
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
//            doc = builder.parse(new File("I:\\Sys\\DesignPatterns\\src\\demo\\config\\config.xml"));
            doc = builder.parse(new File(configPath));

//            获取包含类名的文本节点
            NodeList nodeList = doc.getElementsByTagName(className);
            Node classNode = nodeList.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            //       通过类名生成实例对象返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (ParserConfigurationException e) {
            return null;
        }
        }


}
