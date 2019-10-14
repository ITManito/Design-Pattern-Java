package demo.test.prototype.decrator;

import demo.decorator.ConcreteComponent;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 10:46
 */
public abstract class Director implements Componentd {
    private Componentd componentd;

    public void set(Componentd concreteComponent) {
        this.componentd = concreteComponent;
    }

    @Override
    public void operation() {
        if (componentd != null) {

            componentd.operation();
        }
    }
}
