package demo.template;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 14:37
 */
public class Client {
    public static void main(String[] args) {
        Template template = new ConcreteTemplate();
        template.pMethodA();
        template.pMethodB();
    }
}
