package demo.bridge;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 11:24
 */
public abstract class Abstraction {
    //    public Implementor getImplementor() {
//        return implementor;
//    }
//
//    private Implementor implementor;
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
