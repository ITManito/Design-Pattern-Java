package demo.test.prototype.director;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 17:25
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A ");
    }

    @Override
    public void buildPartB() {

        product.add("部件B ");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
