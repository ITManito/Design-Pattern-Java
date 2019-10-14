package demo.visitor;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 9:44
 */
public class ConVisitorEB extends Visitor {

    @Override
    public void visitElementA(ConElementA conElementA) {
        System.out.println(conElementA.getClass().getName()+"被"+this.getClass().getName()+"访问");
    }

    @Override
    public void visitElementB(ConElementB conElementB) {
        System.out.println(conElementB.getClass().getName()+"被"+this.getClass().getName()+"访问");

    }
}
