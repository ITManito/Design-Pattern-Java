package demo.test.prototype.director;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 17:24
 */
public abstract class Builder {

    //产品新增部件
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
