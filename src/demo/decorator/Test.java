package demo.decorator;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 12:01
 */
public class Test {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();

        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorB.operation();
    }
}
