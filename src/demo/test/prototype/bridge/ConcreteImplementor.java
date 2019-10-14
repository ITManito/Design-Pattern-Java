package demo.test.prototype.bridge;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 10:09
 */
public class ConcreteImplementor extends Implementor {
    @Override
    void operation() {
        System.out.println("华为通讯录");
    }
}
