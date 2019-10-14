package demo.iterator;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 17:33
 */
public abstract class Iterator {
    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();
}
