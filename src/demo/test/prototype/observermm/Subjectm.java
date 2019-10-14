package demo.test.prototype.observermm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 16:12
 */
public abstract class Subjectm {
    protected List<Observerml> observers = new ArrayList<>();
    public void add(Observerml o){

        observers.add(o);
    }
    public void remove(Observerml o){
        observers.remove(o);
    }

    public void notifyml() {
        observers.forEach(observerml -> observerml.update());
    }
}
