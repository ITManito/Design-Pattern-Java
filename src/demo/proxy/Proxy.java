package demo.proxy;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 12:16
 */
public class Proxy extends Subject {
    RealSubject realSubject;

    @Override
    public void request() {

        if (realSubject == null) {
            realSubject = new RealSubject();

        }
        realSubject.request();
    }
}
