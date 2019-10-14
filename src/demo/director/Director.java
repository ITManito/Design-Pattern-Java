package demo.director;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/27 19:33
 */
public class Director {

    //    无返回值, 指挥者指挥具体建造者 建造过程
    public void construct(ConcreteBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }

}
