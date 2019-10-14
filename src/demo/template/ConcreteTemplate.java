package demo.template;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 14:35
 */
public class ConcreteTemplate extends Template {
    @Override
    public void pMethodA() {
        System.out.println("方法A");
    }

    @Override
    public void pMethodB() {
        System.out.println("方法B");
    }
}
