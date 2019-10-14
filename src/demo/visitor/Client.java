package demo.visitor;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 9:46
 */
public class Client {
    public static void main(String[] args) {
        Visitor visitorA = new ConVisitorEA();
        Visitor visitorB = new ConVisitorEB();

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConElementA());
        objectStructure.add(new ConElementB());
        objectStructure.accept(visitorA);
        objectStructure.accept(visitorB);
    }
}
