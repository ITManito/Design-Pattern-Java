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
 * @since 2019/10/3 11:41
 */
public class XmlUtilm {
    private XmlUtilm() {
    }

    public static Object getBean(String configPath, String className) throws ParserConfigurationException, IOException, SAXException, IllegalAccessException, InstantiationException, ClassNotFoundException {
//        获取DOM
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File(configPath));
//        读
        NodeList nodeList = document.getElementsByTagName(className);
        String node = nodeList.item(0).getFirstChild().getNodeValue();
//        返回类
        Class o = Class.forName(node);
        Object c = o.newInstance();
        return c;
    }
}
