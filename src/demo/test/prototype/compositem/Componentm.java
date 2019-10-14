package demo.test.prototype.compositem;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 11:19
 */
public abstract class Componentm {
    protected String name;

    public Componentm(String name) {
        this.name = name;
    }

    abstract void add(Componentm concreteComponentm);
    abstract void remove(Componentm concreteComponentm);
    abstract void display(int depth);

}
