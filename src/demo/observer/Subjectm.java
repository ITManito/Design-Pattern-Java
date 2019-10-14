package demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 15:28
 */
abstract class Subjectm {
//    todo 多个观察者,所以list=
    private List<Observerm> observers = new ArrayList<Observerm>();

//    增加/删除观察者
    public void add(Observerm observer) {

        observers.add(observer);
    }

    public void remove(Observerm observer) {

        observers.remove(observer);
    }


    public  void notifym() {
        observers.forEach(observerm -> observerm.update());
    }
}
