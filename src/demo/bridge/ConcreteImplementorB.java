package demo.bridge;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 11:25
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现B的方法执行");
    }
}
