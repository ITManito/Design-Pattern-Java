package demo.test.prototype.compositem;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 11:39
 */
public class TestC {
    public static void main(String[] args) {
        Compositem root = new Compositem("root");
        Componentm concreteComponentm = new ConcreteComponentm("LeafA");
        root.add(concreteComponentm);
        root.display(1);



    }
}
