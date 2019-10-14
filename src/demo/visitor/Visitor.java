package demo.visitor;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 9:44
 */
public abstract class Visitor {
    public abstract void visitElementA(ConElementA conElementA);
    public abstract void visitElementB(ConElementB conElementB);
}
