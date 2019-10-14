package demo.test.prototype.decrator;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 10:47
 */
public class ConcreteDirector extends Director {
    @Override
    public void operation() {
        super.operation();

        System.out.println("上衣");
    }
}
