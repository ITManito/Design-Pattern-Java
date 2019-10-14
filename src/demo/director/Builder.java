package demo.director;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/27 19:34
 */
public abstract class Builder {

    //有问题
    public abstract void buildPartA();
    public abstract void buildPartB();

    //获取结果方法,容易忘
    public abstract Product getResult();

}


