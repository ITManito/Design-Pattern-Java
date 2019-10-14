package demo.test.prototype.director;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 17:32
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.construct(builder);

        Product product=   builder.getResult();
        product.show();


    }
}
