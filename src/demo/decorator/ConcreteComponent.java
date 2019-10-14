package demo.decorator;


/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 11:51
 */
public class ConcreteComponent implements Componentd {
    @Override
    public void operation() {

        System.out.println("具体的对象操作");
    }
}
