package demo.bridge;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 11:34
 */
public class Test {
    public static void main(String[] args) {

        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();
        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
