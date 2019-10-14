package demo.test.prototype.compositem;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 11:20
 */
public class ConcreteComponentm extends Componentm {



    private String name;

    public ConcreteComponentm(String name) {
        super(name);
    }

    @Override
    void add(Componentm concreteComponentm) {
        System.out.println("不能加");
    }

    @Override
    void remove(Componentm concreteComponentm) {
        System.out.println("不能移除部件");
    }

    @Override
    void display(int depth) {

        System.out.println("层次"+ depth +"名称"+ super.name);
    }
}
