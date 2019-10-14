package demo.strategy;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 14:41
 */
public class ConcreteStrategy extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法实现");
    }
}
