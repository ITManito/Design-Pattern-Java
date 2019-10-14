package demo.factory;

/**
 * @author 任蒙蒙
 * @description 用工厂方法实现加法运算例子
 * @version 1.0.0
 * @since 2019/9/27 16:10
 */
public class Test {
    public static void main(String[] args) {
        //实例化加法工厂
        IFactory factory = new AddFactory();
        Operation o = factory.createOperation();
        o.setNumberA(1);
        o.setNumberA(2);
        o.getResult();
        System.out.println("结果是:" + o.getResult());
    }


}
