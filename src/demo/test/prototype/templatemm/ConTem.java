package demo.test.prototype.templatemm;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 16:46
 */
public class ConTem extends Template {
    @Override
    void tm1() {
        System.out.println("模板一实现");
    }

    @Override
    void tm2() {
        System.out.println("模板二实现");
    }
@Override
    protected boolean isTmgz() {
    return true;
}


}
