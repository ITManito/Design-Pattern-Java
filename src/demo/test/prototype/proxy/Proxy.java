package demo.test.prototype.proxy;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 10:04
 */
public class Proxy extends Subject {
    private RealSubject realSubject;
    @Override
    void request() {

        if (realSubject == null) {
           realSubject= new RealSubject();
        }
    }
}
