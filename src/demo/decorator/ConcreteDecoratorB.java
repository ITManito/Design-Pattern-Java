package demo.decorator;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 11:58
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("具体装饰对象B的操作");
    }
    private void addBehavior() {

    }
}
