package demo.state;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 15:12
 */
public class Client {
    public static void main(String[] args) {
//        开关状态变化,把开变成关,现在状态本来就是开了,不用再显示开了
        Context context = new Context(new ConcreteStateA());

        context.request();
        context.request();
    }
}
