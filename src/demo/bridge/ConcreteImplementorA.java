package demo.bridge;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 11:25
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
