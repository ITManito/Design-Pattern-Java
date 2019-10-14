package demo.test.prototype.director;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 17:25
 */
public class Product {
    List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\n产品 创建--");
        parts.forEach(part -> System.out.println(part));
    }
}
