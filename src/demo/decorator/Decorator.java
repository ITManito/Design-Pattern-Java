package demo.decorator;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 11:52
 */
public abstract class Decorator implements Componentd{
    protected Componentd component;

    public void setComponent(Componentd component) {
        this.component = component;
    }
    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }

    }
}
