package demo.decorator;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 11:58
 */
public class ConcreteDecoratorA extends Decorator {
    private String addState;
    @Override
    public void operation() {
        super.operation();
        addState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
