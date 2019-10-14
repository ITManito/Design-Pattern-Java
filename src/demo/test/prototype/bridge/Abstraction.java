package demo.test.prototype.bridge;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 10:07
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor concreteImplementor) {
        this.implementor = concreteImplementor;
    }
    void getResult() {
        implementor.operation();
    }
}
