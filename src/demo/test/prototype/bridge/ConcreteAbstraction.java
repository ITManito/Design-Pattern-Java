package demo.test.prototype.bridge;

import demo.bridge.RefinedAbstraction;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 10:08
 */
public class ConcreteAbstraction extends Abstraction {

    @Override
    void getResult() {
        super.getResult();
        System.out.println("手机的品牌华为");
    }
}
