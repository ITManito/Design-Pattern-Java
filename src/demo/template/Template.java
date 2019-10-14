package demo.template;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 14:32
 */
public abstract class Template {
    public abstract void pMethodA();

    public abstract void pMethodB();

    public void templateMethod() {

        pMethodA();
        pMethodB();
    }
}
