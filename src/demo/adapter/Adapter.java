package demo.adapter;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 9:30
 */
public class Adapter implements Target {
        private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.SpecificRequest();
    }
}
