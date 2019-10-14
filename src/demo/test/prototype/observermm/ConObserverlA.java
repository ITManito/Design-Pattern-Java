package demo.test.prototype.observermm;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 16:13
 */
public class ConObserverlA extends Observerml {
    private String name;
    private ConSubA subState;
    private String objectSate;

    public String getObjectSate() {
        return objectSate;
    }

    public void setObjectSate(String objectSate) {
        this.objectSate = objectSate;
    }

    public ConObserverlA(String name, ConSubA subState) {

        this.name = name;
        this.subState = subState;
    }

    @Override
    public void update() {
       objectSate= subState.getSubjectment();
        System.out.println("观察者"+name+"状态"+objectSate);
    }
}
