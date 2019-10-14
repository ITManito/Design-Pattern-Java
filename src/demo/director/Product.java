package demo.director;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/27 19:35
 */
public class Product {
    List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品 创建---");
        parts.forEach(part -> System.out.println(part));
    }
}
