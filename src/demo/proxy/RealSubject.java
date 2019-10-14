package demo.proxy;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 12:15
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
