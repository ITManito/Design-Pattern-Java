package demo.test.prototype.director;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 17:24
 */
public class Director {
   public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
