package demo.facade;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/30 8:40
 */
public class Facade {
    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }

    public void methodA() {
        System.out.println("\n 方法组A() ---");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
    }

    public void methodB() {

        System.out.println("\n 方法组B() ---");
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }
}

