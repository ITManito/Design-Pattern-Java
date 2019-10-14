package demo.test.prototype.bridge;

import demo.bridge.RefinedAbstraction;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 10:16
 */
public class Test {
    public static void main(String[] args) {
        Abstraction abstraction = new ConcreteAbstraction();
        abstraction.setImplementor(new ConcreteImplementor());
        abstraction.getResult();

    }
}
