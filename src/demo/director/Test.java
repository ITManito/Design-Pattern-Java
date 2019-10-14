package demo.director;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/28 17:55
 */
public class Test {
    public static void main(String[] args) {

        Director director = new Director();
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        director.construct(concreteBuilder);
        Product product=concreteBuilder.getResult();
        product.show();
    }


}

