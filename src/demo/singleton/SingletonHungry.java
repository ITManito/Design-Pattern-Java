package demo.singleton;

/**
 * 饿汉式单例
 *
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/28 10:49
 */
public class SingletonHungry {
    private static SingletonHungry instanceHungry = new SingletonHungry();
//    私有构造方法
    private SingletonHungry() {

    }

//    静态无参方法
    public static SingletonHungry getInstanceHungry() {
        return instanceHungry;
    }

    public static void main(String[] args) {
        SingletonHungry singletonHungry1 = SingletonHungry.getInstanceHungry();
        SingletonHungry singletonHungry2 = SingletonHungry.getInstanceHungry();
        if (singletonHungry1 == singletonHungry2) {
            System.out.println("俩对象是相同实例");
        }
    }

}
