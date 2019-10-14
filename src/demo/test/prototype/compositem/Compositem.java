package demo.test.prototype.compositem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 11:30
 */
public class Compositem extends Componentm {
    private List<Componentm>  componentm=new ArrayList<>();

    public Compositem(String name) {
        super(name);
    }


    @Override
    void add(Componentm concreteComponentm) {
        if (componentm != null) {

        componentm.add(concreteComponentm);
        }
    }

    @Override
    void remove(Componentm concreteComponentm) {

        componentm.remove(concreteComponentm);
    }

    @Override
    void display(int depth) {
        System.out.println("层次"+ depth +"名称"+ super.name);
        componentm.forEach(component-> System.out.println(depth+2));
    }
}
