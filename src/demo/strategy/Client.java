package demo.strategy;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 14:49
 */
public class Client {
    public static void main(String[] args) {
        Context context;
        //todo
         context = new Context(new ConcreteStrategy());
        context.contextInteface();
        context = new Context(new ConcreteStrategyAnother());
        context.contextInteface();
    }
}
