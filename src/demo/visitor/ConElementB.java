package demo.visitor;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 9:45
 */
public class ConElementB extends Element{

    @Override
//    todo ??
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }
//    public void operationB(){
//
//    }
}
